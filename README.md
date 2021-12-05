# advent of code
Solution advent of code

[![Build Status](https://app.travis-ci.com/DamCarduner/aoc.svg?branch=main)](https://app.travis-ci.com/DamCarduner/aoc)
[![Coverage Status](https://coveralls.io/repos/github/DamCarduner/aoc/badge.svg?branch=main)](https://coveralls.io/github/DamCarduner/aoc?branch=main)

# usage

## build
```
.\mvnw clean jacoco:prepare-agent install jacoco:report pitest:mutationCoverage
```

## build with JaCoCo rapport generation
```
.\mvnw clean jacoco:prepare-agent install jacoco:report
```
JaCoCo report is generated here : target\site\jacoco\index.html

## build with JaCoCo rapport generation and pitest rapport generation
```
.\mvnw clean jacoco:prepare-agent install jacoco:report pitest:mutationCoverage
```
pitest report is generated here : target\pit-reports\jacoco\<date>\index.html
