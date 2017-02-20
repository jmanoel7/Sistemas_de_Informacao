package lista_classeDeAssociacao_e_dependencia;

import java.util.List;
import java.util.ArrayList;

/**
 * Describe class Autor here.
 *
 *
 * Created: Sun Feb 19 21:49:16 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class Autor {

    private String nome;
    private List<Escreve> listaEscreve = new ArrayList<Escreve>();
        
    /**
     * Creates a new <code>Autor</code> instance.
     *
     */
    public Autor(String nome) {
        this.nome = nome;
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
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 4000;
        final String variableSeparator = ", ";
        final StringBuffer sb = new StringBuffer(sbSize);

        sb.append("Autor [");
        sb.append("nome=").append(nome);
        sb.append(variableSeparator);
        sb.append("listaEscreve=").append(listaEscreve);
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
        
        Autor o = (Autor) obj;
        
        return (nome == null ? o.nome == null : nome.equals(o.nome));
    }

    public boolean addEscreve(Escreve novaEscrita) {
        boolean sucesso = false;

        if (novaEscrita == null)
            throw new IllegalArgumentException("A referência a Escrita não pode ser nula!");
        
        if (novaEscrita.getAutor() == null)
            novaEscrita.setAutor(this);

        if (! this.equals(novaEscrita.getAutor()) )
            throw new IllegalArgumentException("O Autor não é válido!");

        if (! listaEscreve.contains(novaEscrita) ) {
            listaEscreve.add(novaEscrita);
            sucesso = true;
        } else
        	novaEscrita.setAutor(null);

        return sucesso;
    }

    public boolean removeEscreve(Escreve escreve) {
        boolean sucesso = false;

        if (escreve == null)
            throw new IllegalArgumentException("A referência à Escrita não pode ser nula!");
        
        if ( listaEscreve.size() > 1 && listaEscreve.contains(escreve) ) {
            listaEscreve.remove(escreve);
            escreve.setAutor(null);
            sucesso = true;
        }

        return sucesso;
    }

}
