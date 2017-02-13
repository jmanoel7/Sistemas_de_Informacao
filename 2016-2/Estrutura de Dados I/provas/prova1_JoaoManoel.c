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
void print_carro(tp_carro carro, unsigned int posicao);
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

     printf("\nCadastro do carro %u:\n\n", total + 1);

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

     if (total == 0) {
          printf("\nNão há carros cadastrados ainda!");
          printf("\nVolte aqui depois de cadastrar pelo menos 1 carro!\n");
          return;
     }
     
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

     tp_carro *a_carro, *z_carro;
     unsigned int posicao, i;
     char resp;
     
     if (total == 0) {
          printf("\nNão há carros cadastrados ainda!");
          printf("\nVolte aqui depois de cadastrar pelo menos 1 carro!\n");
          return;
     }     

     if (total == 1) {
          do {
               printf("%Deseja o excluir o carro da posição 1 (S/N)?\n");
               scanf("%c", &resp);
               if (resp == 'n' || resp == 'N')
                    return;
               if (resp == 's' || resp == 'S')
                    break;
          } while(1);
          carro[--total] = (tp_carro) NULL;
          return;
               
     }
     
     do {
          printf("\nInforme a posição do carro que deseja excluir (1-%u):\n", total);
          printf("\tposição = ");
          scanf("%u", &posicao);
          
          if (posicao == 0 || posicao > total) {
               printf("\nA posição informada: %u, é inválida!\n", posicao);
               continue;
          }

          break;
     } while (1);

     if (posicao == total) {
          //carro[--total] = (tp_carro) NULL;
          return;
     }
     
     //carro[posicao-1] = (tp_carro) NULL;
     a_carro = &carro[posicao-1];
     z_carro = &carro[posicao];

     for (i = posicao; i < total; i++)
          *(a_carro++) = *(z_carro++);
     
     //carro[--total] = (tp_carro) NULL;
     
     return;
}

void listar(tp_carro *carro) {
     unsigned int i;

     if (total == 0) {
          printf("\nNão há carros cadastrados ainda!");
          printf("\nVolte aqui depois de cadastrar pelo menos 1 carro!\n");
          return;
     }
     
     for (i = 0; i < total; i++)
          print_carro(carro[i], i);

     return;
}

void print_carro(tp_carro carro, unsigned int posicao) {
     
     printf("\nDescrição do Carro %u:\n\n", posicao + 1);
     printf("\tModelo            = %s\n",   carro.modelo);
     printf("\tMarca             = %s\n",   carro.marca);
     printf("\tAno de Fabricação = %u\n",   carro.ano_fab);
     printf("\tCor               = %s\n",   carro.cor);
     printf("\tValor de Venda    = %.2f\n", carro.valor_venda);
     
     return;
}
