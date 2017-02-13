#include <stdlib.h>
#include <stdio.h>

#define MAXPESSOA 3
#define MAXCPF 12
#define MAXSTR 50

typedef struct
{
    char nome[MAXSTR];
    char cpf[MAXCPF];
    char sexo;
    unsigned int idade;
} Pessoa;

int menu (void);
void cadastrar_pessoa(Pessoa *pessoa, int op);
void visualiza_pessoa(Pessoa *p, int op);

int main (void)
{
    Pessoa vendedor[MAXPESSOA], cliente[MAXPESSOA];
    int op=0, ncli=0, nven=0, cli=0, ven=0, exec = 1;
    
    do
    {
        op = menu();
        
        switch (op) {
            case 1:
                if (ncli < MAXPESSOA)
                    cadastrar_pessoa(&cliente[ncli++], op);
                else {
                    printf("\nJá foram preenchidos os %u clientes!\n", MAXPESSOA);
                    printf("\nFavor escolher outra opção.\n");
                }
                break;
            case 2:
                if (nven < MAXPESSOA)
                    cadastrar_pessoa(&vendedor[nven++], op);
                else {
                    printf("\nJá foram preenchidos os %u vendedores!\n", MAXPESSOA);
                    printf("\nFavor escolher outra opção.\n");
                }
                break;
            case 3:
                if (ncli == 0) {
                    printf("\nNenhum cliente cadastrado ainda!\n");
                    printf("\nFavor escolher outra opção.\n");
                    continue;
                }
                do {
                    printf("\nDigite o cliente que você deseja visualizar (1-%i):\n", ncli);
                    printf("\tcliente = "); scanf("%i", &cli);
                    if (cli < 1 || cli > ncli) {
                        printf("\nO cliente: %i, é inválido!\n", cli);
                        printf("\nFavor digitar novamente.\n");
                    } else
                        break;
                } while (1);
                visualiza_pessoa(&cliente[cli-1], op);
                break;
            case 4:
                if (nven == 0) {
                    printf("\nNenhum vendedor cadastrado ainda!\n");
                    printf("\nFavor escolher outra opção.\n");
                    continue;
                }
                do {
                    printf("\nDigite o vendedor que você deseja visualizar (1-%i):\n", nven);
                    printf("\tvendedor = "); scanf("%i", &ven);
                    if (ven < 1 || ven > nven) {
                        printf("\nO vendedor: %i, é inválido!\n", ven);
                        printf("\nFavor digitar novamente.\n");
                    } else
                        break;
                } while (1);
                visualiza_pessoa(&vendedor[ven-1], op);
                break;
            case 5:
                exec = 0;
                break;
            default:
                printf("\nA opção informada: %i, é inválida!!!\n", op);
                printf("\nFavor digitar novamente.\n");
                break;
        }

    } while (exec);

    return 0;
}

int menu(void) {
    int op=0;

    printf("\nMenu:\n\n");
    printf("\t1 -> Cadastrar  Cliente\n");
    printf("\t2 -> Cadastrar  Vendedor\n");
    printf("\t3 -> Visualizar Cliente\n");
    printf("\t4 -> Visualizar Vendedor\n");
    printf("\t5 -> Sair\n");
    scanf("%i", &op);
        
    return op;
}

void cadastrar_pessoa(Pessoa *pessoa, int op) {

    printf("\nCadastro do %s:\n\n", (op == 1) ? "Cliente" : "Vendedor" );
    printf("\tNome  = "); scanf(" %[^\n]",  pessoa->nome);
    printf("\tCPF   = "); scanf(" %s",      pessoa->cpf);
    printf("\tSexo  = "); scanf(" %c",      &pessoa->sexo);
    printf("\tIdade = "); scanf(" %u",      &pessoa->idade);
    //pessoa->nome[MAXPESSOA]='\0';
    return;
}

void visualiza_pessoa(Pessoa *pessoa, int op) {

    printf("\nDados do %s:\n\n", (op == 3) ? "Cliente" : "Vendedor" );
    printf("\tNome  =  %s\n", pessoa->nome);
    printf("\tCPF   =  %s\n", pessoa->cpf);
    printf("\tSexo  =  %c\n", pessoa->sexo);
    printf("\tIdade =  %u\n", pessoa->idade);

    return;
}


