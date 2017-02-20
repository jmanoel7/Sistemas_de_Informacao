package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class TesteAutor here.
 *
 *
 * Created: Sun Feb 19 23:03:15 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class TesteAutor {

    public static void main(String[] args) {
        Autor autor1 = new Autor("Hernandes Dias Lopes");
        Autor autor2 = new Autor("João Manoel");

        Artigo artigo1 = new Artigo("O homem a quem Deus usa", "Fé Cristã");
        Artigo artigo2 = new Artigo("Amor, o maior de todos os argumentos", "Fé Cristã");
        Artigo artigo3 = new Artigo("O encontro da salvação", "Fé Cristã");
        Artigo artigo4 = new Artigo("A morte de Cristo, crime horrendo ou plano de Deus?", "Fé Cristã");
        Artigo artigo5 = new Artigo("Programando em Java com Emacs (JDEE)", "T.I.");
        Artigo artigo6 = new Artigo("Programando em C/C++ com Emacs", "T.I.");
        Artigo artigo7 = new Artigo("Programando em Python com Emacs (elpy)", "T.I.");
        
        Escreve escreve1 = new Escreve(autor1, artigo1, "07/11/2013");
        Escreve escreve2 = new Escreve(autor1, artigo2, "10/10/2013");
        Escreve escreve3 = new Escreve(autor1, artigo3, "23/08/2013");
        Escreve escreve4 = new Escreve(autor1, artigo4, "02/08/2013");
        Escreve escreve5 = new Escreve(autor1, artigo4, "02/08/2013");
        Escreve escreve6 = new Escreve(artigo5, "19/02/2017");
        Escreve escreve7 = new Escreve(artigo6, "19/02/2017");
        Escreve escreve8 = new Escreve(artigo7, "19/02/2017");
        
        System.out.println(autor1);

        autor1.addEscreve(escreve1);
        System.out.println(autor1);

        autor1.removeEscreve(escreve1); // nao remove, tem apenas 1
        System.out.println(autor1);
        
        autor1.addEscreve(escreve2);
        autor1.addEscreve(escreve3);
        autor1.addEscreve(escreve4);
        autor1.addEscreve(escreve5); // nao adiciona repetido
        System.out.println(autor1);
        
        System.out.println(autor2);
        
        autor2.addEscreve(escreve6);
        autor2.addEscreve(escreve7);
        autor2.addEscreve(escreve8);
        autor2.addEscreve(escreve8); // nao adiciona repetido
        System.out.println(autor2);
        
        autor2.removeEscreve(escreve7);
        System.out.println(autor2);

        autor2.addEscreve(escreve1); // da erro por nao poder adicionar artigo de outro autor

    }
    
}
