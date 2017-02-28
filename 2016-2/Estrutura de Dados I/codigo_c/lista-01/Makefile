############################# Makefile ##########################


## DEFINICOES DO COMPILADOR

CC := gcc
CFLAGS := -W -Wall -ansi -pedantic -I./include


## DEFINICOES DOS CODIGOS

bin := bin/lista1.out
object := src/main.o
source := src/main.c
includes := include/ex_01.h


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

