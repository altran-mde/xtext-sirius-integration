#!/usr/bin/env bash

updateSite="develop"

mvn clean install --fail-at-end \
	-f pom.xml \
	-s releng/settings.xml \
	-Dmde.reactor.maven.debug=false \
	-Dmde.updatesite=$updateSite \
	-e \
	-U
	
build_success=$?

exit $build_success
