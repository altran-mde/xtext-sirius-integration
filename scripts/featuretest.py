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
    """Run the feature tests."""
    gradle_command = ['gradle', 'cucumber']
    exitcode = execute(gradle_command, gradle_command)
    sys.exit(exitcode)


if __name__ == "__main__":
    main()
