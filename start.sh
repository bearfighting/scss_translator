#!/bin/bash

rm -rf src/main/java/scss
java -jar ./sablecc.jar -d src/main/java grammar/scss.sablecc
#javac -cp src -d bin src/interpreter/Main.java
#java -cp bin interpreter.Main