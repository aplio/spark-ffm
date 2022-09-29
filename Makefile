help:
	@cat $(firstword $(MAKEFILE_LIST))

build:
	sbt clean package

ts:
	./scripts/testrun.sh
