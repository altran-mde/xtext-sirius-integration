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
import glob
from utility import install_and_import
from utility import execute
from utility import read_version
from utility import read_config
from utility import read_test_artifact


def main(config_file,artifact_store_user,artifact_store_password):
    """Publish the artifact to an artifact repository."""
    versionFolderPath = read_version(config_file,False)
    versionAppName = read_version(config_file,True)
    print('Version: ' + versionAppName)
    url = read_config(config_file, 'artifact_repo_url')
    publish_file = read_config(config_file, 'project_name')

    ArtifactoryPath = getattr(install_and_import('artifactory'), 'ArtifactoryPath')
    
    if not 'ArtifactStoreUserName' in os.environ:
        ArtifactoryUserName = artifact_store_user
    else: 
        ArtifactoryUserName = os.environ.get('ArtifactStoreUserName')
        
    if not 'ArtifactStorePassword' in os.environ:
        ArtifactoryPassword = artifact_store_password
    else: 
        ArtifactoryPassword = os.environ.get('ArtifactStorePassword')
            
    path = ArtifactoryPath(
        url + f'/{versionFolderPath}',
        auth=(ArtifactoryUserName, ArtifactoryPassword)
    )
    try:
        path.mkdir()
    except OSError:
        pass    
    print('Publishing ....')
    
    for file in glob.glob('releng/**/target/products/*.zip', recursive=True):
     path.deploy_file(file)
     if sys.platform in file:
        filename, file_extension = os.path.splitext(os.path.basename(file))
        test_artifact_name=read_test_artifact(config_file,filename,file_extension)
        print('Update project config with test artifact: ' + test_artifact_name)
     print('Published ' + file + ' to Artifactory!')

    print('Published to Artifact Repository: ' + url + f'/{versionFolderPath}')
       
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

