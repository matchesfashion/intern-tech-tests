docker build -t python-test .
docker run --rm -v ${PWD}/src:/src -v ${PWD}/test:/test python-test
