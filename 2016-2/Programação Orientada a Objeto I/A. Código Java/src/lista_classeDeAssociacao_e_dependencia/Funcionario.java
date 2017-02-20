package lista_classeDeAssociacao_e_dependencia;

import java.util.ArrayList;
import java.util.List;

/**
 * Describe class Funcionario here.
 *
 *
 * Created: Mon Feb 13 21:36:59 2017
 *
 * @author <a href="mailto:joao.manoel@academico.ifg.edu.br"></a>
 * @version 1.0
 */
public class Funcionario {

    private String nome;
    private List<Participacao> listaParticipacao = new ArrayList<Participacao>();
    
    /**
     * Creates a new <code>Funcionario</code> instance.
     *
     */
    public Funcionario(String nome) {
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
     * Gets the value of listaParticipacao
     *
     * @return the value of listaParticipacao
     */
    public final List<Participacao> getListaParticipacao() {
        List<Participacao> listaRetorno = new ArrayList<Participacao>();

        listaRetorno.addAll(listaParticipacao);

        return listaRetorno;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        final int sbSize = 4000;
        final String variableSeparator = ", ";
        final String strListaParticipacao = listaParticipacao.toString();
        final StringBuffer sb = new StringBuffer(sbSize);
        
        sb.append("Funcionario [");
        sb.append("nome=").append(nome);
        sb.append(variableSeparator);
        sb.append("listaParticipacao=").append(strListaParticipacao);
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
        
        Funcionario o = (Funcionario) obj;
        
        return (nome == null ? o.nome == null : nome.equals(o.nome));
    }

    public boolean addParticipacao(Participacao novaParticipacao) {
        boolean sucesso = false;

        if (novaParticipacao == null)
            throw new IllegalArgumentException("A referência à Participacao não pode ser nula!");
        
        if (novaParticipacao.getFuncionario() == null)
            novaParticipacao.setFuncionario(this);

        if (! this.equals(novaParticipacao.getFuncionario()) )
            throw new IllegalArgumentException("O Funcionario não é válido!");

        if (! listaParticipacao.contains(novaParticipacao) ) {
            listaParticipacao.add(novaParticipacao);
            sucesso = true;
        } else
        	novaParticipacao.setFuncionario(null);

        return sucesso;
    }

    public boolean removeParticipacao(Participacao participacao) {
        boolean sucesso = false;

        if (participacao == null)
            throw new IllegalArgumentException("A referência à Participacao não pode ser nula!");
        
        if ( listaParticipacao.size() > 0 && listaParticipacao.contains(participacao) ) {
            listaParticipacao.remove(participacao);
            participacao.setFuncionario(null);
            sucesso = true;
        }

        return sucesso;
    }
        
}
