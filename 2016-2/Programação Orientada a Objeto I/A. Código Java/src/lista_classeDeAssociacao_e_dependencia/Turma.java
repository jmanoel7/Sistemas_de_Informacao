package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class Turma here.
 *
 *
 * Created: Sun Feb 19 20:07:03 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class Turma {

    private String curso;
    private int ano;
    private int periodo;    
    
    /**
     * Creates a new <code>Turma</code> instance.
     *
     */
    public Turma(String curso, int ano, int periodo) {
        this.curso = curso;
        this.ano = ano;
        this.periodo = periodo;
    }

    /**
     * Gets the value of curso
     *
     * @return the value of curso
     */
    public final String getCurso() {
        return this.curso;
    }

    /**
     * Sets the value of curso
     *
     * @param argCurso Value to assign to this.curso
     */
    public final void setCurso(final String argCurso) {
        this.curso = argCurso;
    }

    /**
     * Gets the value of ano
     *
     * @return the value of ano
     */
    public final int getAno() {
        return this.ano;
    }

    /**
     * Sets the value of ano
     *
     * @param argAno Value to assign to this.ano
     */
    public final void setAno(final int argAno) {
        this.ano = argAno;
    }

    /**
     * Gets the value of periodo
     *
     * @return the value of periodo
     */
    public final int getPeriodo() {
        return this.periodo;
    }

    /**
     * Sets the value of periodo
     *
     * @param argPeriodo Value to assign to this.periodo
     */
    public final void setPeriodo(final int argPeriodo) {
        this.periodo = argPeriodo;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 2000;
        final String variableSeparator = ", ";
        final StringBuffer sb = new StringBuffer(sbSize);

        sb.append("Turma [");
        sb.append("curso=").append(curso);
        sb.append(variableSeparator);
        sb.append("ano=").append(ano);
        sb.append(variableSeparator);
        sb.append("periodo=").append(periodo);
        sb.append("]");

        return sb.toString();
    }

    /**
     * Check if this object is equal (equivalent) to another object.
     */
    @Override
    public final boolean equals(final Object obj) {
        if (obj == this) return true;
        if ((obj == null) || !getClass().equals(obj.getClass())) return false;
        
        Turma o = (Turma) obj;
        
        return (ano == o.ano)
            && (periodo == o.periodo)
            && (curso == null ? o.curso == null : curso.equals(o.curso));
    }
    
}
