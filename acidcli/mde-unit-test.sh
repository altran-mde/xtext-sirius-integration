#!/usr/bin/env bash

# Ignore for acidcli, only used by script
SCRIPT_DIR=$(dirname $0)

# ACIDCLI variables should be configurable via .acidcli.yml
ACIDCLI_MAVEN_POM="${SCRIPT_DIR}/../pom.xml"
ACIDCLI_MAVEN_SETTINGS="${SCRIPT_DIR}/../releng/settings.xml"

# It would be better if Xvfb is running as a service in the docker container
# In that case a display would just be available, which reduces complexity 
# in the build scripts and is better regarding separartion-of-concerns
XVFB_PID=""

if which Xvfb > /dev/null 2>&1; then
    export DISPLAY=:99
    Xvfb ${DISPLAY} -screen 0 1280x1024x16 -nolisten tcp &
    XVFB_PID=$!
    echo "Started X virtual framebuffer (Xvfb ${DISPLAY}) => PID ${XVFB_PID}"
else
    echo "X virtual framebuffer (Xvfb) not installed, please ensure that a display is available."
fi

# Start the build.
# -e Produce execution error messages
# -U Forces a check for missing releases and updated snapshots on remote repositories
# -B Run in non-interactive (batch) mode (disables output color; supresses download progress)
# -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer=warn Supresses download INFO messages
mvn verify -s ${ACIDCLI_MAVEN_SETTINGS} -f ${ACIDCLI_MAVEN_POM} -e -U -fae -B -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer=warn

# Get build status, can be removed if XVfb is service
BUILD_SUCCESS=$?

if [ ! -z "${XVFB_PID}" ]; then
    echo "Terminate X virtual framebuffer (Xvfb)."
    kill ${XVFB_PID}
fi

exit ${BUILD_SUCCESS}
