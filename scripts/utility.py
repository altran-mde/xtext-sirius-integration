#!/usr/bin/env python3
#######################################################################
# Copyright (c) 2017 ACID - Altran B.V.                               #
# All Rights Reserved                                                 #
#                                                                     #
# MDE-Skeleton is protected by copyright and distributed under       #
# licenses restricting copying, distribution and decompilation.       #
#######################################################################
import configparser
import importlib
import os
import sys
import time
import subprocess
from datetime import datetime


def execute(command_unix, command_windows, out_file=""):
    """Run a console line command, optionally pipe the output to the console and out_file."""
    command = None
    process = None
    if sys.platform == 'win32':
        if not command_windows:
            print('You must provide a command for windows when running on windows')
            sys.exit(3)
        command = command_windows
    else:
        if not command_unix:
            print('You must provide a command for unix when running on unix')
            sys.exit(4)
        command = command_unix

    process = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.STDOUT)

    if (out_file):
      fout=open(out_file,'w')

    for line in iter(process.stdout.readline, ''):
      line = line.decode("utf-8")
      if line == '':
        break
      sys.stdout.write(line)
      if (out_file):
        fout.write(line)

    if (out_file):
      fout.close()
    
    # Wait until process terminates
    while process.poll() is None:
      time.sleep(0.5)
    
    return process.returncode

def install_and_import(package):
    """Install or import a specified package."""
    try:
        importlib.import_module(f'{package}')
    except ImportError:
        install(package)
    finally:
        return importlib.import_module(f'{package}')


def install(package):
    """Install the specified package."""
    import pip
    pip.main(['install', package])


def read_updated_version(version_file, build_number, branch_name):
    """Read the version and saved the build number locally so it can be used in other scripts."""
    config = __read_config_file(version_file)
    buildtime = datetime.utcnow().strftime('%Y%m%d%H%M%S%f')
    
    # Save the build numer so we can use it later
    config.set('VERSION', 'build', build_number)
    config.set('VERSION', 'branch', branch_name)
    config.set('VERSION', 'buildtime', buildtime)
    with open(version_file, 'w+') as configfile:
        config.write(configfile)
    
    version = __create_version(config, True, True)
    
    return version


def read_version(version_file, addTimestamp):
    """Read the version file and return the version number."""
    config = __read_config_file(version_file)
    return __create_version(config, True, addTimestamp)


def read_config(config_file, config_to_read):
    """Read the config specified."""
    config = __read_config_file(config_file)
    config_value = config['CONFIG'][f'{config_to_read}']
    return config_value


def __create_version(config, buildnumber, addTimestamp):
    """Create the version based on the values in the config."""
    major = config['VERSION']['major']
    minor = config['VERSION']['minor']
    patch = config['VERSION']['patch']
    build = config['VERSION']['build']
    branch = config['VERSION']['branch']
    buildtime = config['VERSION']['buildtime']
        
    version = None
    if buildnumber:
        if (branch != 'develop' and branch != 'master'):
            version = major + '.' + minor + '.' + patch + '.' + branch + '.' + build 
        else:
            version = major + '.' + minor + '.' + patch + '.' + build 
    else:
        version = major + '.' + minor + '.' + patch

    if addTimestamp:
        version += '.' + buildtime
        
    return version


def __read_config_file(file):
    """Read the file and load the values."""
    if os.path.isfile(file):
        config = configparser.ConfigParser()
        config.read(file)
        config.sections()
        return config
    else:
        print('File could not be found!')
        sys.exit(2)

def makedir(path):
    """Create a system folder."""
    try:
        os.makedirs(path)
    except OSError as exception:
        if exception.errno != errno.EEXIST:
            raise
    return

    
def read_test_artifact(version_file, test_artifact_name, test_artifact_extention):
    """Read the version and saved the build number locally so it can be used in other scripts."""
    config = __read_config_file(version_file)
    buildtime = datetime.utcnow().strftime('%Y%m%d%H%M%S%f')
    
    # Save the build numer so we can use it later
    config.set('CONFIG', 'test_file_location', test_artifact_name)
    config.set('CONFIG', 'test_file_extension', test_artifact_extention)
    with open(version_file, 'w+') as configfile:
        config.write(configfile)
    
    artifact_name = str(test_artifact_name) + str(test_artifact_extention)
    
    return artifact_name