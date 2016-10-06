/**
 * Pacote lista2 => Pacote com a resolução dos exercícios da Lista 2.
 */
package lista2;

/**
 * Classe Pessoa => registra os dados de uma pessoa
 * - nome;
 * - sexo;
 * - numIdentidade;
 * - anoNascimento.
 * 
 * @author João Manoel <joao.manoel@academico.ifg.edu.br> 
 * @version 2016.09.20.01
 */
public class Pessoa {

    private String nome;
    private char sexo;
    private int numIdentidade;
    private int anoNascimento;

    /**
     * Construtor para objetos da classe Pessoa
     * Inicializa todas os atributos da classe Pessoa
     */
	public Pessoa(String nome, char sexo, int numIdentidade, int anoNascimento) {
		// Inicializa os atributos de Pessoa
        this.nome = nome;
        this.sexo = sexo;
        this.numIdentidade = numIdentidade;
        this.anoNascimento = anoNascimento;
	}
    /**
     * getNome => metodo publico para acessar o nome da pessoa
     *
     * @return     nome da pessoa
     */
    public String getNome()
    {
        return nome;
    }

    /**
     * getSexo => metodo publico para acessar o sexo da pessoa
     *
     * @return     sexo da pessoa
     */
    public char getSexo()
    {
        return sexo;
    }

    /**
     * getNumIdentidade => metodo publico para acessar o numero de identidade da pessoa
     *
     * @return     numero de identidade da pessoa
     */
    public int getNumIdentidade()
    {
        return numIdentidade;
    }

    /**
     * getAnoNascimento => metodo publico para acessar o ano de nascimento da pessoa
     *
     * @return     ano de nascimento da pessoa
     */
    public int getAnoNascimento()
    {
        return anoNascimento;
    }

    /**
     * idade => calcula a idade da pessoa.
     * 
     * @param       ano => ano para calculo da idade.
     * @return      (ano - anoNascimento), ou (-1) se (ano < anoNascimento).
     */
    public int idade(int ano)
    {
    	int idade = -1;
    	
        if (ano >= anoNascimento)
        	idade = ano - anoNascimento;

        return idade;
    }

}
