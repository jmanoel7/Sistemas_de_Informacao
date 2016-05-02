/*
  Atividade Avaliativa Processual: como parte da 2a nota
  de Estruturas de Dados I do Curso de Bacharel em Sistemas de Informacao
  do Campus Goiania do Instituto Federal Goias
  Prof.: Sirlon Diniz De Carvalho
  Aluno: Joao Manoel Leite Ribeiro Nogueira <joaomanoel7@gmail.com>
  Matricula: 20131011090230
  Programa: Jogo de Hanoi com 5 discos, usando ncurses como recurso grafico
  em terminais e estruturas de dados do tipo pilha
  Licenca: estilo BSD de 3 termos, como segue-se abaixo

  Copyright (c) 2016, Joao Manoel Leite Ribeiro Nogueira <joaomanoel7@gmail.com>
  All rights reserved.

  Redistribution and use in source and binary forms, with or
  without modification, are permitted provided that the following
  conditions are met:

  1. Redistributions of source code must retain the above copyright notice,
  this list of conditions and the following disclaimer.

  2. Redistributions in binary form must reproduce the above copyright notice,
  this list of conditions and the following disclaimer in the documentation
  and/or other materials provided with the distribution.

  3. Neither the name of the copyright holder nor the names of its contributors
  may be used to endorse or promote products derived from this software without
  specific prior written permission.

  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
  FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
  DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
  CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
  OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
  OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <ncurses.h>

#define BACK_KEY    KEY_F(1) // <F1> Cancela a Jogada
#define RESET_KEY   KEY_F(2) // <F2> Reinicia o Jogo
#define EXIT_KEY    27       // <ESC> Sai do Jogo
#define SLEEP_MOVE  100000   // Espera no movimento dos discos
#define NUM_DISCOS  5        // Numero de Discos
#define MAX_JOGADAS 50       // Maximo de Jogadas

struct torre {
    int disco;
    struct torre *prox;
};

typedef struct torre Torre;

void inicia_jogo(Torre *ptorre1) {
    Torre *novo, *aux;
    int i;
    novo = ptorre1;
    for (i = NUM_DISCOS - 1; i >= 0; --i) {
        novo->disco = i;
        aux = novo;
        novo = (Torre *) malloc( sizeof(Torre) );
        novo->disco = -1;
        novo->prox = NULL;
        aux->prox = novo;
    }
    return;
}

void imprime_torre(Torre *ptorre, int l, int c) {
    int i;
    Torre *aux;
    aux = ptorre;
    while (aux->prox != NULL) {
        move(l, c);
        printw("%d", aux->disco);
        for (i = 1; i <= aux->disco; ++i) {
            move(l, c - i);
            printw("-");
            move(l, c + i);
            printw("-");
        }
        move(l, c - i);
        printw("<");
        move(l, c + i);
        printw(">");
        --l;
        aux = aux->prox;
    }
    while (l >= 3) {
        move(l, c);
        printw("|");
        --l;
    }
}

void imprime_tela(Torre *ptorre1, Torre *ptorre2, Torre *ptorre3) {
    //Torre *aux1 = ptorre1, *aux2 = ptorre2, *aux3 = ptorre3;
    move(9,0);
    printw("=====================================================");
    imprime_torre(ptorre1, 8, 10);
    imprime_torre(ptorre2, 8, 26);
    imprime_torre(ptorre3, 8, 42);
    refresh();
    return;
}

void imprime_menu(void) {
    move(11,6);
    printw("Torre (1)");
    move(11,22);
    printw("Torre (2)");
    move(11,38);
    printw("Torre (3)");
    move(13,0);
    printw("F1 -> Cancelar Jogada    F2 -> Reiniciar Jogo    ESC -> Sair");
    refresh();
    return;
}

void imprime_erro(int torre1, int torre2, int tipo) {
    attron( COLOR_PAIR(4) );
    switch (tipo) {
    case 1:
        move(18,0); printw("Jogada ilegal:                             ");
        move(19,0); printw("Torre (%d) esta vazia!                     ", torre1);
        move(20,0); printw("Pressione qualquer tecla para continuar ...");
        refresh();
        getch();
        move(18,0); printw("                                           ");
        move(19,0); printw("                                           ");
        move(20,0); printw("                                           ");
        refresh();
        break;
    case 2:
        move(18,0); printw("Jogada ilegal:                                             ");
        move(19,0); printw("Disco no topo da Torre (%d) > Disco no topo da Torre (%d) !", torre1, torre2);
        move(20,0); printw("Pressione qualquer tecla para continuar ...                ");
        refresh();
        getch();
        move(18,0); printw("                                                           ");
        move(19,0); printw("                                                           ");
        move(20,0); printw("                                                           ");
        refresh();
        break;
    }
    attroff( COLOR_PAIR(4) );
    return;
}

void poe_disco (Torre *ptorre, int disco) {
    Torre *aux = NULL;
    aux = ptorre;
    while (aux->prox != NULL)
        aux = aux->prox;
    aux->disco = disco;
    aux->prox = (Torre *) malloc( sizeof(Torre) );
    aux = aux->prox;
    aux->disco = -1;
    aux->prox = NULL;
    return;
}

int valor_disco (Torre *ptorre) {
    Torre *aux = NULL;
    int disco = ptorre->disco;
    aux = ptorre;
    while (aux->prox != NULL) {
        disco = aux->disco;
        aux = aux->prox;
    }
    return disco;
}

void retira_disco (Torre *ptorre) {
    Torre *aux = NULL, *ultimo = NULL;
    int disco = ptorre->disco;
    aux = ptorre;
    while (aux->prox != NULL) {
        ultimo = aux;
        disco = ultimo->disco;
        aux = aux->prox;
    }
    if (disco == -1)
        return;
    free(aux);
    aux = NULL;
    ultimo->disco = -1;
    ultimo->prox = NULL;
    return;
}

void imprime_movimento(int torre1, int torre2, int altura1, int altura2, int disco) {

    const int col1 = 10 + (torre1 -1) * 16;
    const int col2 = 10 + (torre2 -1) * 16;
    const int lin1 = 8 -altura1;
    const int lin2 = 9 -altura2;
    int i=0, j=lin1, k=0, dir=0;

    // imprime a retirada do disco da torre1
    while (j >= 3) {
        for (i = 1; i <= disco; ++i) {
            move(j, col1 -i);
            printw(" ");
            move(j, col1 +i);
            printw(" ");
        }
        move(j, col1 -i);
        printw(" ");
        move(j, col1 +i);
        printw(" ");
        move(j, col1);
        printw("|");
        --j;
        attron( COLOR_PAIR(2) );
        for (i = 1; i <= disco; ++i) {
            move(j, col1 -i);
            printw("-");
            move(j, col1 +i);
            printw("-");
        }
        move(j, col1 -i);
        printw("<");
        move(j, col1 +i);
        printw(">");
        move(j, col1);
        printw("%d", disco);
        move(j, col1);
        attroff( COLOR_PAIR(2) );
        refresh();
        usleep(SLEEP_MOVE);
    }

    // imprime a movimentacao para a torre2
    if (torre2 > torre1)
        dir = 1;
    else
        dir = -1;
    i = 0;
    while (i * dir < (col2 - col1) * dir) {
        for (k = 1; k <= disco; ++k) {
            move(j, col1 + i -k);
            printw(" ");
            move(j, col1 + i +k);
            printw(" ");
        }
        move(j, col1 +i -k);
        printw(" ");
        move(j, col1 +i +k);
        printw(" ");
        move(j, col1 +i);
        printw(" ");
        i += dir;
        attron( COLOR_PAIR(2) );
        for (k = 1; k <= disco; ++k) {
            move(j, col1 +i -k);
            printw("-");
            move(j, col1 +i +k);
            printw("-");
        }
        move(j, col1 +i -k);
        printw("<");
        move(j, col1 +i +k);
        printw(">");
        move(j, col1 +i);
        printw("%d", disco);
        move(j, col1 +i);
        attroff( COLOR_PAIR(2) );
        refresh();
        usleep(SLEEP_MOVE);
    }

    // imprime a entrada do disco na torre2
    while (j < lin2) {
        for (i = 1; i <= disco; ++i) {
            move(j, col2 -i);
            printw(" ");
            move(j, col2 +i);
            printw(" ");
        }
        move(j, col2 -i);
        printw(" ");
        move(j, col2 +i);
        printw(" ");
        move(j, col2);
        if (j == 2)
            printw(" ");
        else
            printw("|");
        ++j;
        if (j < lin2)
            attron( COLOR_PAIR(2) );
        for (i = 1; i <= disco; ++i) {
            move(j, col2 -i);
            printw("-");
            move(j, col2 +i);
            printw("-");
        }
        move(j, col2 -i);
        printw("<");
        move(j, col2 +i);
        printw(">");
        move(j, col2);
        printw("%d", disco);
        move(j, col2);
        if (j < lin2)
            attroff( COLOR_PAIR(2) );
        refresh();
        usleep(SLEEP_MOVE);
    }

    return;
}

int altura_disco(Torre *ptorre) {
    Torre *aux = ptorre;
    int altura=0;
    while (aux->prox != NULL) {
        ++altura;
        aux = aux->prox;
    }
    return altura;
}

int movimentar_discos(Torre *ptorre1, Torre *ptorre2, Torre *ptorre3, int torre1, int torre2) {
    int disco1, disco2, altura1, altura2;
    switch (torre1) {
    case 1:
        disco1 = valor_disco(ptorre1);
        if (disco1 == -1) {
            imprime_erro(torre1, torre2, 1);
            return 0;
        }
        if (torre2 == 2) {
            disco2 = valor_disco(ptorre2);
            if (disco1 > disco2 && disco2 != -1) {
                imprime_erro(torre1, torre2, 2);
                return 0;
            }
            retira_disco(ptorre1);
            poe_disco(ptorre2, disco1);
            altura1 = altura_disco( ptorre1 );
            altura2 = altura_disco( ptorre2 );
            imprime_movimento(torre1, torre2, altura1, altura2, disco1);
        }
        else if (torre2 == 3) {
            disco2 = valor_disco(ptorre3);
            if (disco1 > disco2 && disco2 != -1) {
                imprime_erro(torre1, torre2, 2);
                return 0;
            }
            retira_disco(ptorre1);
            poe_disco(ptorre3, disco1);
            altura1 = altura_disco( ptorre1 );
            altura2 = altura_disco( ptorre3 );
            imprime_movimento(torre1, torre2, altura1, altura2, disco1);
        }
        break;
    case 2:
        disco1 = valor_disco(ptorre2);
        if (disco1 == -1) {
            imprime_erro(torre1, torre2, 1);
            return 0;
        }
        if (torre2 == 1) {
            disco2 = valor_disco(ptorre1);
            if (disco1 > disco2 && disco2 != -1) {
                imprime_erro(torre1, torre2, 2);
                return 0;
            }
            retira_disco(ptorre2);
            poe_disco(ptorre1, disco1);
            altura1 = altura_disco( ptorre2 );
            altura2 = altura_disco( ptorre1 );
            imprime_movimento(torre1, torre2, altura1, altura2, disco1);
        }
        else if (torre2 == 3) {
            disco2 = valor_disco(ptorre3);
            if (disco1 > disco2 && disco2 != -1) {
                imprime_erro(torre1, torre2, 2);
                return 0;
            }
            retira_disco(ptorre2);
            poe_disco(ptorre3, disco1);
            altura1 = altura_disco( ptorre2 );
            altura2 = altura_disco( ptorre3 );
            imprime_movimento(torre1, torre2, altura1, altura2, disco1);
        }
        break;
    case 3:
        disco1 = valor_disco(ptorre3);
        if (disco1 == -1) {
            imprime_erro(torre1, torre2, 1);
            return 0;
        }
        if (torre2 == 1) {
            disco2 = valor_disco(ptorre1);
            if (disco1 > disco2 && disco2 != -1) {
                imprime_erro(torre1, torre2, 2);
                return 0;
            }
            retira_disco(ptorre3);
            poe_disco(ptorre1, disco1);
            altura1 = altura_disco( ptorre3 );
            altura2 = altura_disco( ptorre1 );
            imprime_movimento(torre1, torre2, altura1, altura2, disco1);
        }
        else if (torre2 == 2) {
            disco2 = valor_disco(ptorre2);
            if (disco1 > disco2 && disco2 != -1) {
                imprime_erro(torre1, torre2, 2);
                return 0;
            }
            retira_disco(ptorre3);
            poe_disco(ptorre2, disco1);
            altura1 = altura_disco( ptorre3 );
            altura2 = altura_disco( ptorre2 );
            imprime_movimento(torre1, torre2, altura1, altura2, disco1);
        }
        break;
    }
    return 1;
}

int main(void) {

    Torre *ptorre1, *ptorre2, *ptorre3;
    int torre1, torre2, continuar = 0, sair = 0, resetar = 0, jl = 0, ji = 0;

    initscr();                  /* Iniciar a Tela */
    raw();		                /* Buffer de linha desativada */
    keypad(stdscr, TRUE);	    /* Obtemos F1, F2 etc.. */
    noecho();		            /* Nao executa echo() enquanto fazemos getch() */
    start_color();              /* Para o uso das cores */

    //Abaixo estamos definindo os pares de cores que serão utilizados no programa
    init_pair(1, COLOR_WHITE,  COLOR_BLACK);  //Texto(Branco)   | Fundo(Preto)
    init_pair(2, COLOR_CYAN,   COLOR_BLACK);  //Texto(Ciano)    | Fundo(Preto)
    init_pair(3, COLOR_GREEN,  COLOR_BLACK);  //Texto(Verde)    | Fundo(Preto)
    init_pair(4, COLOR_RED,    COLOR_BLACK);  //Texto(Vermelho) | Fundo(Preto)
    init_pair(5, COLOR_YELLOW, COLOR_BLACK); //Texto(Amarelo)   | Fundo(Preto)

    bkgd(COLOR_PAIR(1));  /* Aqui nao definiremos que a cor de fundo do nosso
                             programa sera preto e a cor dos textos sera branca */

    ptorre1 = (Torre *) malloc( sizeof(Torre) );
    ptorre1->disco = -1;
    ptorre1->prox = NULL;
    ptorre2 = (Torre *) malloc( sizeof(Torre) );
    ptorre2->disco = -1;
    ptorre2->prox = NULL;
    ptorre3 = (Torre *) malloc( sizeof(Torre) );
    ptorre3->disco = -1;
    ptorre3->prox = NULL;
    inicia_jogo(ptorre1);

    while (1) {

        attroff( COLOR_PAIR(3) );

        if (resetar) {

            free( ptorre1 );
            ptorre1 = NULL;
            ptorre1 = (Torre *) malloc( sizeof(Torre) );
            ptorre1->disco = -1;
            ptorre1->prox = NULL;
            inicia_jogo(ptorre1);

            free( ptorre2 );
            ptorre2 = NULL;
            ptorre2 = (Torre *) malloc( sizeof(Torre) );
            ptorre2->disco = -1;
            ptorre2->prox = NULL;

            free( ptorre3 );
            ptorre3 = NULL;
            ptorre3 = (Torre *) malloc( sizeof(Torre) );
            ptorre3->disco = -1;
            ptorre3->prox = NULL;

            jl = 0;
            ji = 0;

            attron( COLOR_PAIR(5) );
            move(0,0); printw("Jogada(s): 0 legal(is), 0 ilegal(is), %d restante(s) ", MAX_JOGADAS);
            attroff( COLOR_PAIR(5) );
            move(3,0); printw("          |               |               |          ");
            move(4,0); printw("         <0>              |               |          ");
            move(5,0); printw("        <-1->             |               |          ");
            move(6,0); printw("       <--2-->            |               |          ");
            move(7,0); printw("      <---3--->           |               |          ");
            move(8,0); printw("     <----4---->          |               |          ");
            move(9,0); printw("=====================================================");

            resetar = 0;

        } else {

            attron( COLOR_PAIR(5) );
            move(0,0);
            printw("Jogada(s): %d legal(is), %d ilegal(is), %d restante(s)", jl, ji, MAX_JOGADAS - (jl + ji));
            attroff( COLOR_PAIR(5) );
            imprime_tela(ptorre1, ptorre2, ptorre3);

        }
        attron( COLOR_PAIR(3) );
        imprime_menu();

        // ler torre1 -> origem do movimento
        do {

            move(15,0);
            printw("                                                     ");

            move(15,0);
            printw("Pressione de 1 a 3 para setar a Torre de origem");

            refresh();
            torre1 = getch();

            if (torre1 == RESET_KEY) { // reinicia o jogo: renova os ponteiros das torres

                resetar = 1;
                continuar = 1;
                break;

            } else if (torre1 == EXIT_KEY) { // sair do jogo

                sair = 1;
                break;

            }

        } while (torre1 < 49 || torre1 > 51);

        if (continuar) {
            move(15,0);
            printw("                                                     ");
            refresh();
            continuar = 0;
            continue;
        }

        if (sair)
            break;

        move(15,0);
        printw("Torre de origem  = %c                                    ", torre1);
        refresh();
        torre1 -= 48;

        // ler torre2 -> destino do movimento
        do {

            move(16,0);
            printw("                                               ");

            move(16,0);
            switch (torre1) {
            case 1:
                printw("Pressione 2 ou 3 para setar a Torre de destino");
                break;
            case 2:
                printw("Pressione de 1 ou 3 para setar a Torre de destino");
                break;
            case 3:
                printw("Pressione de 1 ou 2 para setar a Torre de destino");
                break;
            }

            refresh();
            torre2 = getch();

            if (torre2 == RESET_KEY) { // reinicia o jogo: renova os ponteiros das torres

                resetar = 1;
                continuar = 1;
                break;

            } else if (torre2 == BACK_KEY) { // cancela a jogada

                continuar = 1;
                break;

            } else if (torre2 == EXIT_KEY) { // sair do jogo

                sair = 1;
                break;

            }

        } while (torre2 < 49 || torre2 > 51 || torre2-48 == torre1);

        if (continuar) {
            move(16,0);
            printw("                                                 ");
            refresh();
            continuar = 0;
            continue;
        }

        if (sair)
            break;

        move(16,0);
        printw("Torre de destino = %c                                    ", torre2);
        refresh();
        torre2 -= 48;

        // movimenta os discos, aqui esta a funcao mais divertida de todas
        attroff( COLOR_PAIR(3) );
        if ( movimentar_discos(ptorre1, ptorre2, ptorre3, torre1, torre2) )
            ++jl;
        else
            ++ji;

        if ( ptorre1->disco == -1 && ( ptorre2->disco == -1 || ptorre3->disco == -1 ) ) {
            attron( COLOR_PAIR(2) );
            move(18,0); printw("Fim de jogo! Parabens, voce venceu!          ");
            move(19,0); printw("Pressione qualquer tecla para continuar ...  ");
            refresh();
            attroff( COLOR_PAIR(2) );
            getch();
            move(18,0); printw("                                             ");
            move(19,0); printw("                                             ");
            refresh();
            resetar = 1;
        }

        if ( jl + ji == MAX_JOGADAS ) {
            attron( COLOR_PAIR(4) );
            move(18,0); printw("Fim de jogo! Infelizmente, voce perdeu!                ");
            move(19,0); printw("Voce atingiu o numero maximo permitido de jogadas = %d!", MAX_JOGADAS);
            move(20,0); printw("Pressione qualquer tecla para continuar ...            ");
            refresh();
            attroff( COLOR_PAIR(4) );
            getch();
            move(18,0); printw("                                                       ");
            move(19,0); printw("                                                       ");
            move(20,0); printw("                                                       ");
            refresh();
            resetar = 1;
        }

        // limpa parte da tela
        move(15,0);
        printw("                                               ");
        refresh();
        move(16,0);
        printw("                                               ");
        refresh();
    }

    free(ptorre1);
    free(ptorre2);
    free(ptorre3);

    ptorre1 = NULL;
    ptorre2 = NULL;
    ptorre3 = NULL;

    endwin();
    exit(0);
}
