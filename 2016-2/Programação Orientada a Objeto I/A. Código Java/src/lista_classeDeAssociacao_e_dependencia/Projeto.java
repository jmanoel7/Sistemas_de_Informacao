package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class Projeto here.
 *
 *
 * Created: Sun Feb 19 17:17:38 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class Projeto {

    private String nomeProjeto;
    private float verbaProjeto;
    
    /**
     * Creates a new <code>Projeto</code> instance.
     *
     */
    public Projeto(String nomeProjeto, float verbaProjeto) {
        this.nomeProjeto = nomeProjeto;
        this.verbaProjeto  = verbaProjeto;
    }

    /**
     * Gets the value of nomeProjeto
     *
     * @return the value of nomeProjeto
     */
    public final String getNomeProjeto() {
        return this.nomeProjeto;
    }

    /**
     * Sets the value of nomeProjeto
     *
     * @param argNomeProjeto Value to assign to this.nomeProjeto
     */
    public final void setNomeProjeto(final String argNomeProjeto) {
        this.nomeProjeto = argNomeProjeto;
    }

    /**
     * Gets the value of verbaProjeto
     *
     * @return the value of verbaProjeto
     */
    public final float getVerbaProjeto() {
        return this.verbaProjeto;
    }

    /**
     * Sets the value of verbaProjeto
     *
     * @param argVerbaProjeto Value to assign to this.verbaProjeto
     */
    public final void setVerbaProjeto(final float argVerbaProjeto) {
        this.verbaProjeto = argVerbaProjeto;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 2000;
        final String variableSeparator = ", ";
        final StringBuffer sb = new StringBuffer(sbSize);

        sb.append("Projeto [");
        sb.append("nomeProjeto=").append(nomeProjeto);
        sb.append(variableSeparator);
        sb.append("verbaProjeto=").append(verbaProjeto);
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
        
        Projeto o = (Projeto) obj;
        
        return (nomeProjeto == null ? o.nomeProjeto == null : nomeProjeto.equals(o.nomeProjeto))
            && (verbaProjeto == o.verbaProjeto);
    }
   
}
