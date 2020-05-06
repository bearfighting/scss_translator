#!/bin/bash

rm -rf src/main/java/scss/calculation/
java -jar ./sablecc.jar -d src/main/java grammar/calculation.sablecc

rm -rf src/main/java/scss/generator/
java -jar ./sablecc.jar -d src/main/java grammar/nest.sablecc
#javac -cp src -d bin src/interpreter/Main.java
#java -cp bin interpreter.Main