# advent of code
Solution advent of code

[![Build Status](https://app.travis-ci.com/DamCarduner/aoc.svg?branch=main)](https://app.travis-ci.com/DamCarduner/aoc)

# usage

## build
```
.\mvnw clean jacoco:prepare-agent install jacoco:report pitest:mutationCoverage
```

## build with JaCoCo rapport generation
```
.\mvnw clean jacoco:prepare-agent install jacoco:report
```
JaCoCo Report is generated here : target\site\jacoco\index.html

## build with JaCoCo rapport generation and pitest rapport generation
```
.\mvnw clean jacoco:prepare-agent install jacoco:report pitest:mutationCoverage
```
JaCoCo Report is generated here : target\pit-reports\jacoco\<date>\index.html
