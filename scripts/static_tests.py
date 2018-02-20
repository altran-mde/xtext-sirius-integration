#!/usr/bin/env python3
#######################################################################
# Copyright (c) 2017 ACID - Altran B.V.                               #
# All Rights Reserved                                                 #
#                                                                     #
# MDE-Skeleton is protected by copyright and distributed under       #
# licenses restricting copying, distribution and decompilation.       #
#######################################################################
"""This module will execute a static analysis tool for the JAVA skeleton"""
import sys
import os
import errno
import argparse
from utility import execute
from utility import makedir

def findbugs(params, output_file):
    """Execute the findbugs tool."""
    print('---------- Running findbugs ----------')
    defaults = ['-xml','-output', 'reports/findbugs/findbugs.xml', 'build/classes']
    return run(['findbugs'], defaults, params, output_file)

def checkstyle(params, output_file):
    """Execute the checkstyle tool."""
    print('----------Running checkstyle ----------')
    defaults = ['-c', 'config/checkstyle/checkstyleRuleSet.xml', '-f', 'xml', '-o', 'reports/checkstyle/checkstyle.xml', 'src/main/java/']
    return run(['checkstyle'], defaults, params, output_file)

def pmd(params, output_file):
    """Execute the pwd tool."""
    print('---------- Running pmd ----------')
    defaults = ['-dir', 'src', '-f','xml', '-r', 'reports/pmd/pmd.xml', '-failOnViolation', 'false', '-rulesets', 'config/pmd/pmdRuleSet.xml']
    return run(['pmd'], defaults, params, output_file)

def cpd(params, output_file):
    """Execute the cpd tool."""
    print('---------- Running cpd ----------')
    if (not output_file):
        output_file = 'reports/cpd/cpd_java.xml'
    defaults = ['--minimum-tokens', '30', '--files', 'src', '--language', 'java', '--format', 'xml', '--failOnViolation', 'false']
    return run(['cpd'], defaults, params, output_file)

def cloc(params, output_file):
    """Execute the cloc tool."""
    print('---------- Running cloc ----------')
    defaults = ['src/main/java/altran/acid/stringcalculator', 'src/test/java/altran/acid/stringcalculator', 'src/cucumber', '--xml', '--by-file', '--report-file=reports/cloc/cloc.xml']
    return run(['cloc'], defaults, params, output_file)

def main(result_directory, command, param, output_file):
    """Main entry point."""

    # Create the result directory
    if result_directory == 'reports':
        result_directory = 'reports/' + command
    print('Result directory: ', result_directory, '\n')
    makedir(result_directory)

    params = ""
    if (param) :
        params = param.split(" ")

    print('All the params from main function ', params, '\n')

    # Map the options to the function blocks
    options = {'findbugs'   : findbugs,
               'checkstyle' : checkstyle,
               'pmd'        : pmd,
               'cpd'        : cpd,
               'cloc'       : cloc
    }

    # Try to execute the command
    if command in options.keys():
        return options[command](params, output_file)
    else:
        print('Not supported command ', command, ' only supporting ', options.keys() )
        return

def run(cmd, defaults, params, output_file):
    """Execute the [cmd] with default or overruled parameters."""
    if (params):
        command = cmd + params
    else:
        command = cmd + defaults

    return execute(command, command, output_file)

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument('-c', '--command', help='The name of the test to run; findbugs/checkstyle/cmd/pmd/cloc', required=True)
    parser.add_argument('-p', '--param', help='The options the feature test needs to run')
    parser.add_argument('-o', '--out', help='The name of the output file to which the results are copied.')
    parser.add_argument('-rd', '--result_directory', default='reports/' + vars(parser.parse_args())['command'], help='Set the result directory, default[reports/command]')

    # get the argument values
    args = vars(parser.parse_args())
    result_directory = args['result_directory']
    command = args['command']
    param = args['param']
    output_file = args['out']

    print('Result_directory is ', result_directory, '\n')
    print('Command is ', command, '\n')
    print('Param is ', param, '\n')
    print('Output file is ', output_file, '\n')

    main(result_directory, command, param, output_file)
