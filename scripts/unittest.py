#!/usr/bin/env python3
#######################################################################
# Copyright (c) 2017 ACID - Altran B.V.                               #
# All Rights Reserved                                                 #
#                                                                     #
# MDE-Skeleton is protected by copyright and distributed under       #
# licenses restricting copying, distribution and decompilation.       #
#######################################################################
import sys
from utility import execute


def main():
    """Run the unit tests."""
    test_command = ['mvn', '-e', '-Dskip.archive=true', 'integration-test']
    # we use the same for unix and windows
    exitcode = execute(test_command, test_command)
    sys.exit(exitcode)


if __name__ == "__main__":
    main()
