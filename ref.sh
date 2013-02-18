#!/bin/bash

javac compiler/*.java mini/*.java

#java mini.Compiler life.mini life.s
#gcc -m32 -o life life.s runtime.c
#./life

#java mini.Compiler funs.mini funs.s
#gcc -m32 -o life funs.s runtime.c
#./funs

java mini.Compiler byref.mini byref.s
gcc -m32 -o byref byref.s runtime.c
./byref
