package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class Artigo here.
 *
 *
 * Created: Sun Feb 19 21:43:22 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel</a>
 * @version 1.0
 */
public class Artigo {

    private String nome;
    private String tema;
    
    /**
     * Creates a new <code>Artigo</code> instance.
     *
     */
    public Artigo(String nome, String tema) {
        this.nome = nome;
        this.tema = tema;
    }

    
    /**
     * Gets the value of nome
     *
     * @return the value of nome
     */
    public final String getNome() {
        return this.nome;
    }

    /**
     * Sets the value of nome
     *
     * @param argNome Value to assign to this.nome
     */
    public final void setNome(final String argNome) {
        this.nome = argNome;
    }

    /**
     * Gets the value of tema
     *
     * @return the value of tema
     */
    public final String getTema() {
        return this.tema;
    }

    /**
     * Sets the value of tema
     *
     * @param argTema Value to assign to this.tema
     */
    public final void setTema(final String argTema) {
        this.tema = argTema;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 2000;
        final String variableSeparator = ", ";
        final StringBuffer sb = new StringBuffer(sbSize);

        sb.append("Artigo [");
        sb.append("nome=").append(nome);
        sb.append(variableSeparator);
        sb.append("tema=").append(tema);
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
        
        Artigo o = (Artigo) obj;
        
        return (nome == null ? o.nome == null : nome.equals(o.nome))
            && (tema == null ? o.tema == null : tema.equals(o.tema));
    }

}
