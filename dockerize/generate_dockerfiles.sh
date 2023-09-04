#!/bin/sh

var_error="false"

if [ -z "$DOCKER_REGISTRY" ]; then
    echo "ERROR: Must provide DOCKER_REGISTRY in environment" 1>&2
    var_error="true"
fi
if [ -z "$BASE_IMAGE" ]; then
    echo "ERROR: Must provide BASE_IMAGE in environment" 1>&2
    var_error="true"
fi
if [ -z "$BASE_TAG" ]; then
    echo "ERROR: Must provide BASE_TAG in environment" 1>&2
    var_error="true"
fi

# Si hay error no procesar y salir con error
if [ $var_error = "true" ]; then
    echo "ERROR: Cannot generate Dockerfiles" 1>&2
    exit 1
else
    sed -i "s/DOCKER_REGISTRY/${DOCKER_REGISTRY}/g" ./Dockerfile.dondeqa
    sed -i "s/BASE_IMAGE/${BASE_IMAGE}/g" ./Dockerfile.dondeqa
    sed -i "s/BASE_TAG/${BASE_TAG}/g" ./Dockerfile.dondeqa
fi
