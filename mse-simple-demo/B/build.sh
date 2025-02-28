#!/bin/sh

cd "$(dirname "$0")"

docker build . -t ${REGISTRY}spring-cloud-b:1.1.0

if [ -n "${REGISTRY}" ]; then
    docker push ${REGISTRY}spring-cloud-b:1.1.0
fi
