.DEFAULT_GOAL := build-run

setup:
	./gradlew wrapper --gradle-version 8.5

clean:
	./gradlew clean

build:
	./gradlew clean build

install:
	./gradlew clean install

run-dist:
	./build/install/App/bin/App

run:
	./gradlew run

lint:
	./gradlew checkstyleMain

build-run:
	build run
