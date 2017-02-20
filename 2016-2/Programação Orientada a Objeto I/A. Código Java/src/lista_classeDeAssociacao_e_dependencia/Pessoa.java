package lista_classeDeAssociacao_e_dependencia;

import java.util.List;
import java.util.ArrayList;

/**
 * Describe class Pessoa here.
 *
 *
 * Created: Sun Feb 19 20:00:38 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br">Joao Manoel <joaomanoel7@gmail.com></a>
 * @version 1.0
 */
public class Pessoa {

    private String nome;
    private List<Matricula> listaMatricula = new ArrayList<Matricula>();
    
    /**
     * Creates a new <code>Pessoa</code> instance.
     *
     */
    public Pessoa(String nome) {
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
     * Gets the value of listaMatricula
     *
     * @return the value of listaMatricula
     */
    public final List<Matricula> getListaMatricula() {
        List<Matricula> listaRetorno = new ArrayList<Matricula>();

        listaRetorno.addAll(listaMatricula);

        return listaRetorno;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 4000;
        final String variableSeparator = ", ";
        final StringBuffer sb = new StringBuffer(sbSize);

        sb.append("Pessoa [");
        sb.append("nome=").append(nome);
        sb.append(variableSeparator);
        sb.append("listaMatricula=").append(listaMatricula);
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
        
        Pessoa o = (Pessoa) obj;
        
        return (nome == null ? o.nome == null : nome.equals(o.nome));
    }

    public boolean addMatricula(Matricula novaMatricula) {
        boolean sucesso = false;

        if (novaMatricula == null)
            throw new IllegalArgumentException("A referência à Matricula não pode ser nula!");
        
        if (novaMatricula.getPessoa() == null)
            novaMatricula.setPessoa(this);

        if (! this.equals(novaMatricula.getPessoa()) )
            throw new IllegalArgumentException("A Pessoa não é válido!");

        if ( listaMatricula.size() < 5 && ! listaMatricula.contains(novaMatricula) ) {
            listaMatricula.add(novaMatricula);
            sucesso = true;
        } else
        	novaMatricula.setPessoa(null);

        return sucesso;
    }

    public boolean removeMatricula(Matricula matricula) {
        boolean sucesso = false;

        if (matricula == null)
            throw new IllegalArgumentException("A referência à Matricula não pode ser nula!");
        
        if ( listaMatricula.size() > 0 && listaMatricula.contains(matricula) ) {
            listaMatricula.remove(matricula);
            matricula.setPessoa(null);
            sucesso = true;
        }

        return sucesso;
    }

}
