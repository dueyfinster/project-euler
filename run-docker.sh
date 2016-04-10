#!/bin/bash
CONTAINER="dueyfinster/java:latest"
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
#docker pull $CONTAINER
docker run --rm=true -ti -v $DIR:/data --name java $CONTAINER
