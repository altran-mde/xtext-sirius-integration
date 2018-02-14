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
from utility import read_updated_version


def main(config_file, build_number, branch_name, target_profile):
    """Create the version number and start the build."""
    # Update the version locally, so other scripts can read and use it
    version = read_updated_version(config_file, build_number,branch_name)
    print('Version: ' + version)
    print('Current directory: ' + os.getcwd())
    try:
     copy2('./settings.xml', '/root/.m2/settings.xml')
    except:
     os.makedirs('/root/.m2')
     copy2('./settings.xml', '/root/.m2/settings.xml')
    print('Copied settings.xml to .m2')

    mvn_target_profile='-P'+target_profile
    maven_command = ['mvn', '-e', '-DskipTests', '-DskipITs', '-Dskip.archive=true', mvn_target_profile,'clean', 'install']

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
    parser.add_argument('-bn', '--buildnumber', default='0', help='The build number to create a unique version')
    parser.add_argument('-br', '--branchname', default='0', help='The branch for the build')
    parser.add_argument('-tp', '--targetProfile', default='sirius4.mars', help='The target profile for the build')
    args = vars(parser.parse_args())

    config_file = args['config']
    print('Config file: ' + config_file)
    build_number = args['buildnumber']
    print('Build number: ' + build_number)
    branch_name = args['branchname']
    print('Branch Name: ' + branch_name)
    target_plateform = args['targetProfile']
    print('Target Profile: ' + target_profile)
    main(config_file, build_number, branch_name, target_profile)
