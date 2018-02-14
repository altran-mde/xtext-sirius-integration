#!/usr/bin/env python3
#######################################################################
# Copyright (c) 2017 ACID - Altran B.V.                               #
# All Rights Reserved                                                 #
#                                                                     #
# MDE-Skeleton is protected by copyright and distributed under       #
# licenses restricting copying, distribution and decompilation.       #
#######################################################################
import os
import sys
from shutil import copy2
from utility import execute
from utility import install_and_import
from utility import read_version
from utility import read_config


def main(config_file,artifact_store_user,artifact_store_password):
    """Read the config and download/deploy the artifact."""
    url = read_config(config_file, 'artifact_repo_url')
    project_name = read_config(config_file, 'project_name')
    extension = read_config(config_file, 'test_file_extension')
    test_artifact = read_config(config_file, 'test_file_location')
    
    if not 'ArtifactStoreUserName' in os.environ:
        ArtifactoryUserName = artifact_store_user
    else: 
        ArtifactoryUserName = os.environ.get('ArtifactStoreUserName')
        
    if not 'ArtifactStorePassword' in os.environ:
        ArtifactoryPassword = artifact_store_password
    else: 
        ArtifactoryPassword = os.environ.get('ArtifactStorePassword')
        
    versionFolderPath = read_version(config_file,False)
    versionAppName = read_version(config_file,True)

    testFolderPath = '/tmp/' + str(versionAppName)
    
    artifact_filename = f'{test_artifact}{extension}'
    total_url = url + f'/{versionFolderPath}/{artifact_filename}'
    print('Downloading: ' + total_url)

    if not os.path.exists(testFolderPath):
        os.mkdir(testFolderPath)

    # Download from artifactory
    ArtifactoryPath = getattr(install_and_import('artifactory'), 'ArtifactoryPath')

    path = ArtifactoryPath(
        total_url,
        auth=(ArtifactoryUserName, ArtifactoryPassword)
    )
    
    artifact_name=f'{testFolderPath}/{artifact_filename}' 
    
    with path.open() as fd:
        with open(artifact_name, "wb") as out:
            out.write(fd.read())
   
    autArtifact=f'-DautPath={artifact_name}'
    
    # Copy .m2 settings for maven
    try:
     copy2('./settings.xml', '/root/.m2/settings.xml')
    except:
     os.makedirs('/root/.m2')
     copy2('./settings.xml', '/root/.m2/settings.xml')
    print('Copied settings.xml to .m2')
    
    """Package and execute RCPTT"""
    maven_command = ['xvfb-run', 'mvn', '-e',autArtifact,'package']
    exitcode = execute(maven_command, maven_command)
    
    print("Exit Code: " + str(exitcode))
    if exitcode is not None:
        sys.exit(exitcode)
    else:
        sys.exit(1)


if __name__ == "__main__":
    argparse = install_and_import('argparse')

    parser = argparse.ArgumentParser()
    parser.add_argument('-c', '--config', default='project.config', help='The config file for the projects')
    parser.add_argument('-au', '--artifactstoreuser', default='', help='The user for Artifact Store')
    parser.add_argument('-ap', '--artifactstorepassword', default='', help='The password for Artifact Store user')
    args = vars(parser.parse_args())

    config_file = args['config']
    print('Config file: ' + config_file)

    artifact_store_user = args['artifactstoreuser']
    artifact_store_password = args['artifactstorepassword']
    main(config_file,artifact_store_user,artifact_store_password)
    