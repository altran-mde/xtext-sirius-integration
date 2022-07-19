import argparse
import json
import logging
import os
import pathlib
import re

import requests

_LOGFORMAT = '%(asctime)s %(filename)18s:%(lineno)4s %(levelname)8s %(message)s'
logging.basicConfig(format=_LOGFORMAT, level=logging.INFO)
LOG = logging.getLogger(__name__)


def download_artifacts(source_url, download_path, download_pattern, download_location, username, password):
    """Download from Nexus mirror."""
    LOG.info("Start Nexus download")

    fetch_results = True
    continuation_token = None
    requests_data = None

    while fetch_results:
        if continuation_token is not None:
            requests_data = {"continuationToken": continuation_token}

        items = json.loads(
            requests.get(source_url, auth=(username, password),
                         params=requests_data).content
        )

        if items["continuationToken"] is None:
            fetch_results = False
        else:
            continuation_token = items["continuationToken"]

        for item in items["items"]:
            itemPath = item["path"]
            if itemPath.startswith(download_path):
                itemPath = itemPath[len(download_path):]
                if re.match(download_pattern, itemPath):
                    path = os.path.join(download_location, itemPath)
                    try:
                        os.makedirs(pathlib.Path(path).parent)
                    except FileExistsError:
                        LOG.debug("Cannot create directory: %s, already exists",
                                  pathlib.Path(path).parent)
    
                    with open(path, "wb") as output_file:
                        download_file = requests.get(item["downloadUrl"],
                                                     auth=(username, password))
                        output_file.write(download_file.content)

    LOG.info("Finished Nexus download")


def main():
    """main.

    main
    """
    parser = argparse.ArgumentParser()
    parser.add_argument('--source-url', help='Source URL', type=str, required=True)
    parser.add_argument('--download-path', help='Download Path', type=str, default="")
    parser.add_argument('--download-pattern', help='Download Pattern', type=str, default=".*")
    parser.add_argument('--download-location', help='Download Location', type=str, required=True)
    args = parser.parse_args()

    username = os.environ["TECHNICAL_USER"]
    password = os.environ["TECHNICAL_PASSWORD"]

    download_artifacts(args.source_url, args.download_path, args.download_pattern, args.download_location,
                       username, password)


if __name__ == "__main__":
    main()
