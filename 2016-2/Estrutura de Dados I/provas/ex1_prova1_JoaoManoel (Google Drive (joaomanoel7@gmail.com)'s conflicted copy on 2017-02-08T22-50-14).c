#include <stdlib.h>
#include <stdio.h>

#define MAX_CARRO 10
#define MAX_STR   50

typedef struct
{
     char modelo[MAX_STR];
     char marca[MAX_STR];
     int ano_fab;
     char cor[MAX_STR];
     float valor_venda;
} tp_carro;

void cadastrar(tp_carro *carro);
void localizar(tp_carro *carro);
void excluir(tp_carro *carro);
void listar(tp_carro *carro);
unsigned int total = 0;

int main(void)
{
     tp_carro carro[MAX_CARRO];
     int opcao=0;

     do
     {
          do
          {
               printf("\nEscolha uma opção do menu:\n\n");
               printf("\t1) Cadastrar\n");
               printf("\t2) Localizar\n");
               printf("\t3) Excluir\n");
               printf("\t4) Listar\n");
               printf("\t5) Sair\n");
               scanf("%d", &opcao);
               
               if (opcao < 1 || opcao > 5) {
                    printf("\nA opção informada: \'%d\', é inválida!\n", opcao);
                    continue;
               }
               
               break;
          } while (1);
          
          switch (opcao) {
          case 1: {
               cadastrar(carro);
               break;
          }
          case 2: {
               localizar(carro);
               break;
          }
          case 1: {
               excluir(carro);
               break;
          }
          case 1: {
               listar(carro);
               break;
          }
          default:
               break;
          }
          
     } while (opcao != 5);

     return 0;
}

void cadastrar(tp_carro *carro) {

     if (total == MAX_CARRO) {
          printf("\nJá temos um total de: '%u' carros cadastrados, não é possível cadastrar mais carros!\n", MAX_CARRO);
          return;
     }

     printf("\nCadastro do carro %u:\n\n", total+1);

     printf("\tModelo = ");
     scanf(" %[^\n]s", carro[total].modelo); 
     carro[total].modelo[MAX_STR] = '\0';
     
     printf("\tMarca = ");
     scanf(" %[^\n]s", carro[total].marca); 
     carro[total].marca[MAX_STR] = '\0';

     printf("\tCor = ");
     scanf(" %[^\n]s", carro[total].cor); 
     carro[total].cor[MAX_STR] = '\0';

     
     return;
}
