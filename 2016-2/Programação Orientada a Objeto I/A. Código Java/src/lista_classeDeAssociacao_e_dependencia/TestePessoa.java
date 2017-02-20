package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class TestePessoa here.
 *
 *
 * Created: Sun Feb 19 20:52:47 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class TestePessoa {

    public static void main(String[] args) {
        Pessoa pEmanuela = new Pessoa("Emanuela");
        Pessoa pJoao = new Pessoa("João");

        Turma tSextoAno        = new Turma("Ensino Fundamental",              2017, 1);
        Turma tQuartoPeriodo   = new Turma("Bach. em Sistemas de Informação", 2016, 2);
        Turma tQuintoPeriodo   = new Turma("Bach. em Sistemas de Informação", 2017, 1);
        Turma tSextoPeriodo    = new Turma("Bach. em Sistemas de Informação", 2017, 2);
        Turma tSetimoPeriodo   = new Turma("Bach. em Sistemas de Informação", 2018, 1);
        Turma tOitavoPeriodo   = new Turma("Bach. em Sistemas de Informação", 2018, 2);
        Turma tPrimeiroPeriodo = new Turma("Bach. em Sistemas de Informação", 2013, 1);
        
        Matricula m1 = new Matricula(tSextoAno, "EF01");
        Matricula m2 = new Matricula(tQuartoPeriodo, "BSI01");
        Matricula m3 = new Matricula(pJoao, tQuintoPeriodo, "BSI02");
        Matricula m4 = new Matricula(tQuintoPeriodo, "BSI02");
        Matricula m5 = new Matricula(pJoao, tSextoPeriodo,      "BSI03");
        Matricula m6 = new Matricula(pJoao, tSetimoPeriodo,     "BSI04");
        Matricula m7 = new Matricula(pJoao, tOitavoPeriodo,     "BSI05");
        Matricula m8 = new Matricula(pJoao, tPrimeiroPeriodo,   "BSI00");
        
        // Testes com a Pessoa pEmanuela

        // adiciona a Matricula m1 para a pessoa pEmanuela
        pEmanuela.addMatricula(m1);
        System.out.println(pEmanuela);

        // adiciona a Matricula m2 para a Pessoa pEmanuela
        pEmanuela.addMatricula(m2);
        System.out.println(pEmanuela);

        // remove a Matricula m2 da Pessoa pEmanuela
        pEmanuela.removeMatricula(m2);
        System.out.println(pEmanuela);


        // Testes com a Pessoa pJoao

        // adiciona a Matricula m2 para a pessoa pJoao
        pJoao.addMatricula(m2);
        System.out.println(pJoao);

        // adiciona a Matricula m3 para a pessoa pJoao
        pJoao.addMatricula(m3);
        System.out.println(pJoao);

        // não adiciona a Matricula m4 para a pessoa pJoao
        pJoao.addMatricula(m4);
        System.out.println(pJoao);

        // adiciona as Matriculas: m5, m6, m7 para a pessoa pJoao
        pJoao.addMatricula(m5);
        pJoao.addMatricula(m6);
        pJoao.addMatricula(m7);
        pJoao.addMatricula(m8); // não adiciona, ja tem 5 turmas matriculadas
        System.out.println(pJoao);
        
        // não adiciona a matricula de outra Pessoa (pEmanuela)
        pJoao.addMatricula(m1);
        System.out.println(pJoao);

    }
    
}
