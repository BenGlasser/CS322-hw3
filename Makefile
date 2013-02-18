.SUFFIXES: .mini .c .s .o

all:
	javac compiler/*.java mini/*.java

%:	%.o runtime.o
	gcc -m32 -o $@ $^

%.o:	%.c
	gcc -m32 -c $<

%.o:	%.s
	gcc -m32 -c $<

%.s:	%.mini
	java mini.Compiler $< $@
