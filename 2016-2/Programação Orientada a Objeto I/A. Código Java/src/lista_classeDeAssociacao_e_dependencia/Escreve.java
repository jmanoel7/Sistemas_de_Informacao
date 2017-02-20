package lista_classeDeAssociacao_e_dependencia;

/**
 * Describe class Escreve here.
 *
 *
 * Created: Sun Feb 19 22:39:55 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class Escreve {

    private Autor autor;
    private Artigo artigo;
    private String data;

    /**
     * Creates a new <code>Escreve</code> instance.
     *
     */
    public Escreve(Autor autor, Artigo artigo, String data) {
        if (autor == null)
            throw new NullPointerException("A referência do Autor não pode ser nula!");
        if (artigo == null)
            throw new NullPointerException("A referência do Artigo não pode ser nula!");

        this.autor = autor;
        this.artigo = artigo;
        this.data = data;
    }

    /**
     * Creates a new <code>Escreve</code> instance.
     *
     */
    public Escreve(Artigo artigo, String data) {
        if (artigo == null)
            throw new NullPointerException("A referência do Artigo não pode ser nula!");

        this.artigo = artigo;
        this.data = data;
    }

    /**
     * Gets the value of autor
     *
     * @return the value of autor
     */
    public final Autor getAutor() {
        return this.autor;
    }

    /**
     * Sets the value of autor
     *
     * @param argAutor Value to assign to this.autor
     */
    public final void setAutor(final Autor argAutor) {
        this.autor = argAutor;
    }

    /**
     * Gets the value of artigo
     *
     * @return the value of artigo
     */
    public final Artigo getArtigo() {
        return this.artigo;
    }

    /**
     * Sets the value of artigo
     *
     * @param argArtigo Value to assign to this.artigo
     */
    public final void setArtigo(final Artigo argArtigo) {
        this.artigo = argArtigo;
    }

    /**
     * Gets the value of data
     *
     * @return the value of data
     */
    public final String getData() {
        return this.data;
    }

    /**
     * Sets the value of data
     *
     * @param argData Value to assign to this.data
     */
    public final void setData(final String argData) {
        this.data = argData;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 2000;
        final String variableSeparator = ", ";
        final StringBuffer sb = new StringBuffer(sbSize);

        sb.append("Escreve [");
        sb.append("artigo=").append(artigo);
        sb.append(variableSeparator);
        sb.append("data=").append(data);
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
        
        Escreve o = (Escreve) obj;
        
        return (autor == null ? o.autor == null : autor.equals(o.autor))
            && (artigo == null ? o.artigo == null : artigo.equals(o.artigo))
            && (data == null ? o.data == null : data.equals(o.data));
    }

}
