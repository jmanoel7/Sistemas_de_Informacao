package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class Matricula here.
 *
 *
 * Created: Sun Feb 19 20:14:31 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class Matricula {

    private Pessoa pessoa;
    private Turma turma;
    private String codigo;
    
    /**
     * Creates a new <code>Matricula</code> instance.
     *
     */
    public Matricula(Pessoa pessoa, Turma turma, String codigo) {
        if (pessoa == null)
            throw new NullPointerException("A referência da Pessoa não pode ser nula!");
        if (turma == null)
            throw new NullPointerException("A referência da Turma não pode ser nula!");

        this.pessoa = pessoa;
        this.turma = turma;
        this.codigo = turma.getAno() + "" + turma.getPeriodo() + codigo;
    }

    /**
     * Creates a new <code>Matricula</code> instance.
     *
     */
    public Matricula(Turma turma, String codigo) {
        if (turma == null)
            throw new NullPointerException("A referência da Turma não pode ser nula!");

        this.turma = turma;
        this.codigo = turma.getAno() + "" + turma.getPeriodo() + codigo;
    }

    /**
     * Gets the value of codigo
     *
     * @return the value of codigo
     */
    public final String getCodigo() {
        return this.codigo;
    }

    /**
     * Sets the value of codigo
     *
     * @param argCodigo Value to assign to this.codigo
     */
    public final void setCodigo(final String argCodigo) {
        this.codigo = argCodigo;
    }

    
    /**
     * Gets the value of pessoa
     *
     * @return the value of pessoa
     */
    public final Pessoa getPessoa() {
        return this.pessoa;
    }

    /**
     * Sets the value of pessoa
     *
     * @param argPessoa Value to assign to this.pessoa
     */
    public final void setPessoa(final Pessoa argPessoa) {
        this.pessoa = argPessoa;
    }

    /**
     * Gets the value of turma
     *
     * @return the value of turma
     */
    public final Turma getTurma() {
        return this.turma;
    }

    /**
     * Sets the value of turma
     *
     * @param argTurma Value to assign to this.turma
     */
    public final void setTurma(final Turma argTurma) {
        this.turma = argTurma;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 2000;
        final String variableSeparator = ", ";
        final StringBuffer sb = new StringBuffer(sbSize);

        sb.append("Matricula [");
        sb.append("turma=").append(turma);
        sb.append(variableSeparator);
        sb.append("codigo=").append(codigo);
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
        
        Matricula o = (Matricula) obj;
        
        return (pessoa == null ? o.pessoa == null : pessoa.equals(o.pessoa))
            && (turma == null ? o.turma == null : turma.equals(o.turma))
            && (codigo == null ? o.codigo == null : codigo.equals(o.codigo));
    }
    
}
