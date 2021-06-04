#!/usr/bin/env bash

# Ignore for acidcli, only used by script
SCRIPT_DIR=$(dirname $0)

# ACIDCLI variables should be configurable via .acidcli.yml
ACIDCLI_MDE_REPOSITORY_REMOTE_NAME="xtext-sirius-integration"
# TODO: Default value should be empty
ACIDCLI_MDE_REPOSITORY_REMOTE_PREFIX=""
ACIDCLI_MDE_REPOSITORY_PROJECT="${SCRIPT_DIR}/../releng/com.altran.general.integration.xtextsirius.repository"

if [ ! -z "${CI_COMMIT_REF_NAME}" ]; then
    # TODO: Do we only want to support specific branch names for URL translation?
    echo "${CI_JOB_NAME} from branch ${CI_COMMIT_REF_NAME}"
    REMOTE_REPOSITORY_PATH="${ACIDCLI_MDE_REPOSITORY_REMOTE_PREFIX}${CI_COMMIT_REF_NAME}"
elif [ ! -z "${CI_COMMIT_TAG}" ]; then
    echo "${CI_JOB_NAME} from tag ${CI_COMMIT_TAG}"
    DOTS=${CI_COMMIT_TAG//[^.]}
    if [ ${#DOTS} == 2 ]; then
        REMOTE_REPOSITORY_PATH="${ACIDCLI_MDE_REPOSITORY_REMOTE_PREFIX}${CI_COMMIT_TAG%.*}"
    else
        REMOTE_REPOSITORY_PATH="${ACIDCLI_MDE_REPOSITORY_REMOTE_PREFIX}${CI_COMMIT_TAG}"
    fi
else
    echo "Local build"
    REMOTE_REPOSITORY_PATH="${ACIDCLI_MDE_REPOSITORY_REMOTE_PREFIX}${USERNAME}"
fi
REMOTE_REPOSITORY_URL="https://nexus.acidspace.nl/repository/${ACIDCLI_MDE_REPOSITORY_REMOTE_NAME}/${REMOTE_REPOSITORY_PATH}"

# Maven requires a full-path, hence realpath
LOCAL_REPOSITORY_DIR=$(realpath ${ACIDCLI_MDE_REPOSITORY_PROJECT}/target)
MAVEN_ARGS="-Dacidcli.repository.remoteUri=${REMOTE_REPOSITORY_URL} -Dacidcli.repository.localDir=${LOCAL_REPOSITORY_DIR}"

# TODO: If a P2 repository is already available at ${REMOTE_REPOSITORY_URL}/repository,
#       it should be downloaded to a temp directory and the location of this directory 
#       should be provided as acidcli.p2.mergeDir property
# TODO: Should we add a flag to acidcli to configure merge/overwrite?
DOWNLOAD_REPOSITORY_DIR="/tmp/acidcli-downloaded-repository"
REMOTE_P2_REPOSITORY_PATH="${REMOTE_REPOSITORY_PATH}/repository/"
python3 ${SCRIPT_DIR}/download_p2.py --download-location "${DOWNLOAD_REPOSITORY_DIR}" --download-path "${REMOTE_P2_REPOSITORY_PATH}" --source-url "https://nexus.acidspace.nl/service/rest/v1/assets?repository=${ACIDCLI_MDE_REPOSITORY_REMOTE_NAME}"
MAVEN_ARGS="${MAVEN_ARGS} -Dacidcli.repository.localUri=file://${LOCAL_REPOSITORY_DIR} -Dacidcli.p2.mergeDir=${DOWNLOAD_REPOSITORY_DIR}"

# Start the build.
# -e Produce execution error messages
# -U Forces a check for missing releases and updated snapshots on remote repositories
# -B Run in non-interactive (batch) mode (disables output color; supresses download progress)
# -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer=warn Supresses download INFO messages
mvn deploy -s ${SCRIPT_DIR}/mde-release-settings.xml -f ${SCRIPT_DIR}/mde-release-pom.xml ${MAVEN_ARGS} -e -U -B -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer=warn
