############################# Makefile ##########################


## DEFINICOES DO COMPILADOR

CC := x86_64-w64-mingw32.static-gcc
CFLAGS := -W -Wall -ansi -pedantic


## DEFINICOES DOS CODIGOS

bin := lista1.exe
object := main.o
source := main.c
includes := ex_01.h


## REGRAS DO MAKEFILE

all: lista1

lista1: $(object)
	$(CC) -o $(bin) $(object) $(CFLAGS)

$(object): $(source) $(includes)
	$(CC) -o $(object) -c $(source) $(CFLAGS)

clean:
	rm -f $(object)

mrproper: clean
	rm -f $(bin)
