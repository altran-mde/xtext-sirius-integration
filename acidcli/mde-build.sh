#!/usr/bin/env bash

# Ignore for acidcli, only used by script
SCRIPT_DIR=$(dirname $0)

# ACIDCLI variables should be configurable via .acidcli.yml
ACIDCLI_MAVEN_POM="${SCRIPT_DIR}/../pom.xml"
ACIDCLI_MAVEN_SETTINGS="${SCRIPT_DIR}/../releng/settings.xml"

# Start the build.
# -e Produce execution error messages
# -U Forces a check for missing releases and updated snapshots on remote repositories
# -B Run in non-interactive (batch) mode (disables output color; supresses download progress)
# -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer=warn Supresses download INFO messages
mvn package -s ${ACIDCLI_MAVEN_SETTINGS} -f ${ACIDCLI_MAVEN_POM} -DskipTests=true -e -U -B -Dorg.slf4j.simpleLogger.log.org.apache.maven.cli.transfer=warn
