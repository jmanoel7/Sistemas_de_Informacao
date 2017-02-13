#include <stdlib.h>
#include <stdio.h>
#include <string.h>

#define MAX_CARRO 10
#define MAX_STR   50

typedef struct
{
     char modelo[MAX_STR];
     char marca[MAX_STR];
     unsigned int ano_fab;
     char cor[MAX_STR];
     float valor_venda;
} tp_carro;

void cadastrar(tp_carro *carro);
void localizar(tp_carro *carro);
void excluir(tp_carro *carro);
void listar(tp_carro *carro);
void print_carro(tp_carro carro);
unsigned int total = 0;

int main(void)
{
     tp_carro carro[MAX_CARRO];
     int opcao=0;

     do
     {
          printf("\nEscolha uma opção do Menu Principal:\n\n");
          printf("\t1) Cadastrar\n");
          printf("\t2) Localizar\n");
          printf("\t3) Excluir\n");
          printf("\t4) Listar\n");
          printf("\t5) Sair\n");
          scanf("%d", &opcao);

          switch (opcao) {
          case 1: {
               cadastrar(carro);
               break;
          }
          case 2: {
               localizar(carro);
               break;
          }
          case 3: {
               excluir(carro);
               break;
          }
          case 4: {
               listar(carro);
               break;
          }
          case 5: {
                    break;
               }
          default:
               printf("\nA opção informada: \'%d\', é inválida!\n", opcao);
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

     printf("\tAno de Fabricação = ");
     scanf(" %u", &carro[total].ano_fab); 

     printf("\tCor = ");
     scanf(" %[^\n]s", carro[total].cor); 
     carro[total].cor[MAX_STR] = '\0';

     printf("\tValor de Venda = ");
     scanf(" %.2f", &carro[total].valor_venda); 

     total++;
     
     return;
}

void localizar(tp_carro *carro) {

     char modelo[MAX_STR];
     unsigned int ano_fab;
     float valor_venda;
     int opcao;
     unsigned int i;
     
     do
     {
          printf("\nEscolha uma opção do Submenu Localizar:\n\n");
          printf("\t1) Localizar por Modelo\n");
          printf("\t2) Localizar por Ano de Fabricação\n");
          printf("\t3) Localizar por Limite de Valor\n");
          scanf("%d", &opcao);

          switch (opcao) {
          case 1: {
               printf("\n\tModelo = ");
               scanf("%[^\n]s", modelo);
               modelo[MAX_STR] = '\0';
               for (i = 0; i < total; i++)
                    if (strcmp(carro[i].modelo, modelo) == 0)
                         print_carro(carro[i], i);
               break;
          }
          case 2: {
               printf("\tAno de Fabricação = ");
               scanf("%u", &ano_fab);
               for (i = 0; i < total; i++)
                    if (carro[i].ano_fab == ano_fab)
                         print_carro(carro[i], i);
               break;
          }
          case 3: {
               printf("\tLimite de Valor = ");
               scanf("%.2f", &valor_venda); 
               for (i = 0; i < total; i++)
                    if (carro[i].valor_venda <= valor_venda)
                         print_carro(carro[i], i);
               break;
          }
          default:
               printf("\nA opção informada: \'%d\', é inválida!\n", opcao);
               break;
          }
          
     } while (opcao < 1 || opcao > 3);
     
     return;
}

void excluir(tp_carro *carro) {
     
}

void listar(tp_carro *carro) {
     unsigned int i;

     if (total == 0) {
          
          return;
     }
     
     for (i = 0; i < total; i++)
          print_carro(carro[i], i);
     return;
}

void print_carro(tp_carro carro, unsigned int posicao) {
     
     printf("\nDescrição do Carro %u:\n\n", posicao);
     printf("\tModelo            = %s\n",   carro.modelo);
     printf("\tMarca             = %s\n",   carro.marca);
     printf("\tAno de Fabricação = %u\n",   carro.ano_fab);
     printf("\tCor               = %s\n",   carro.cor);
     printf("\tValor de Venda    = %.2f\n", carro.valor_venda);
     
     return;
}
