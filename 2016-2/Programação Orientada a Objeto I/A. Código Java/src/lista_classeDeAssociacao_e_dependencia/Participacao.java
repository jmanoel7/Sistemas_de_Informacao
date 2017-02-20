package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class Participacao here.
 *
 *
 * Created: Sun Feb 19 17:26:52 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class Participacao {

    private Funcionario funcionario;
    private Projeto projeto;
    private float verba;
    
    
    /**
     * Creates a new <code>Participacao</code> instance.
     * com os parametros:
     *   - funcionario
     *   - projeto
     *   - verba
     */
    public Participacao(Funcionario funcionario, Projeto projeto, float verba) {
        if (funcionario == null)
            throw new NullPointerException("A referência do Funcionario não pode ser nula!");
        if (projeto == null)
            throw new NullPointerException("A referência do Projeto não pode ser nula!");

        this.funcionario = funcionario;
        this.projeto = projeto;
        this.verba = verba;
    }

    /**
     * Creates a new <code>Participacao</code> instance.
     * com os parametros:
     *   - projeto
     *   - verba
     */
    public Participacao(Projeto projeto, float verba) {
        if (projeto == null)
            throw new NullPointerException("A referência do Projeto não pode ser nula!");

        this.projeto = projeto;
        this.verba = verba;
    }
    
    /**
     * Gets the value of funcionario
     *
     * @return the value of funcionario
     */
    public final Funcionario getFuncionario() {
        return this.funcionario;
    }

    /**
     * Sets the value of funcionario
     *
     * @param argFuncionario Value to assign to this.funcionario
     */
    public final void setFuncionario(final Funcionario argFuncionario) {
        this.funcionario = argFuncionario;
    }

    /**
     * Gets the value of projeto
     *
     * @return the value of projeto
     */
    public final Projeto getProjeto() {
        return this.projeto;
    }

    /**
     * Sets the value of projeto
     *
     * @param argProjeto Value to assign to this.projeto
     */
    public final void setProjeto(final Projeto argProjeto) {
        this.projeto = argProjeto;
    }

    /**
     * Gets the value of verba
     *
     * @return the value of verba
     */
    public final float getVerba() {
        return this.verba;
    }

    /**
     * Sets the value of verba
     *
     * @param argVerba Value to assign to this.verba
     */
    public final void setVerba(final float argVerba) {
        this.verba = argVerba;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 2000;
        final String variableSeparator = ", ";
        final StringBuffer sb = new StringBuffer(sbSize);
        
        sb.append("Participacao [");
        sb.append("projeto=").append(projeto);
        sb.append(variableSeparator);
        sb.append("verba=").append(verba);
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
        
        Participacao o = (Participacao) obj;
        
        return (funcionario == null ? o.funcionario == null : funcionario.equals(o.funcionario))
            && (projeto == null ? o.projeto == null : projeto.equals(o.projeto))
            && (verba == o.verba);
    }
    
}
