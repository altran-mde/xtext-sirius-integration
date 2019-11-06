#!/usr/bin/env bash

targetBranch="$1"
tag="$2"
updateSite="develop"
profiles="acceptance-test"

if [ -n "$2" ]; then
	profiles+=",publish"
	baselineTag=$2
	dots=${baselineTag//[^.]}
	if [ ${#dots} == 2 ]; then
		updateSite=${baselineTag%.*}
	else
		updateSite=${baselineTag}
	fi
else if [ "$targetBranch" == "develop" ]; then
	profiles+=",publish"
fi fi

if [[ $profiles == *"publish"* ]]; then
	if curl --output /dev/null --silent --head --fail "https://nexus-p2.manatree.io/nexus/content/sites/MDEAssets/xtext-sirius-integration/$updateSite/content.jar"; then
	    profiles+=",merge-existing-repository"
fi fi

echo Building branch $targetBranch with profiles $profiles and update site $updateSite

mvn clean install -P$profiles \
	-f ./pom.xml \
	-s releng/settings.xml \
	-Dmde.reactor.maven.debug=false \
	-Dmde.updatesite=$updateSite \
	-Dmaven.test.failure.ignore=true \
	-e \
	-U
	
build_success=$?

exit $build_success


