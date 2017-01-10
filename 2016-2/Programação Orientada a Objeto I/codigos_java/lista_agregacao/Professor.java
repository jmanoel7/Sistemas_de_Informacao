package lista_agregacao;

public class Professor {

    private String nome;
    private String cpf;

    /**
     * @param nome
     * @param cpf
     */
    public Professor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    /* @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    } */
}
