package lista_agregacao;

public class Disciplina {

    private String nomeDisciplina;
    private int creditos;
    private int cargaHoraria;

    /**
     * @param nomeDisciplina
     * @param creditos
     * @param cargaHoraria
     */
    public Disciplina(String nomeDisciplina, int creditos, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.creditos = creditos;
        this.cargaHoraria = cargaHoraria;
    }

    /**
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * @return the creditos
     */
    public int getCreditos() {
        return creditos;
    }

    /**
     * @return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
