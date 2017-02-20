package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class TesteFuncionario here.
 *
 *
 * Created: Sun Feb 19 18:38:53 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class TesteFuncionario {

    public static void main(String[] args) {
        Funcionario fJoao = new Funcionario("João Manoel");
        Funcionario fThiago = new Funcionario("Thiago Fernandes");
        
        Projeto pIFGMobile = new Projeto("IFG Mobile", 10000f);
        Projeto pVisao = new Projeto("Visao", 25000f);
        Projeto pSUAP = new Projeto("SUAP", 1000000f);

        Participacao part1 = new Participacao(fJoao, pIFGMobile, 500f);
        Participacao part2 = new Participacao(pVisao, 750f);
        Participacao part3 = new Participacao(pSUAP, 1500f);
        Participacao part4 = new Participacao(pVisao, 750f);

        // Testes com o Funcionario fJoao
        
        // adiciona a participacao nos projetos IFGMobile e Visao para o funcionario João
        fJoao.addParticipacao(part1);
        fJoao.addParticipacao(part2);
        fJoao.addParticipacao(part4); // não adiciona repetido
        System.out.println(fJoao);

        // adiciona a participacao no projeto SUAP para o funcionario João
        fJoao.addParticipacao(part3);
        System.out.println(fJoao);

        // remove a participacao no projeto SUAP para o funcionario João
        fJoao.removeParticipacao(part3);
        System.out.println(fJoao);


        // Testes com o Funcionario fThiago

        // adiciona a participacao no projeto SUAP para o funcionario Thiago
        fThiago.addParticipacao(part3);
        System.out.println(fThiago);

        // não dá para adicionar projetos de outros funcionarios
        // no caso do funcionario João
        //fThiago.addParticipacao(part1);
        //System.out.println(fThiago);

        // adiciona a participacao no projeto Visao para o funcionario Thiago
        fThiago.addParticipacao(part4);
        System.out.println(fThiago);

        // remove a participacao no projeto Visao para o funcionario Thiago
        fThiago.removeParticipacao(part4);
        System.out.println(fThiago);
        
    }
    
}
