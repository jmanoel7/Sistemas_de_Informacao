package lista_agregacao;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nomeDisciplina;
    private int creditos;
    private int cargaHoraria;
    private List<Professor> listaProfessor = new ArrayList<Professor>();

	public Disciplina(String nomeDisciplina, int creditos, int cargaHoraria,
			Professor professor) {
		this.nomeDisciplina = nomeDisciplina;
		this.creditos = creditos;
		this.cargaHoraria = cargaHoraria;
		this.listaProfessor.add(professor);
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public List<Professor> getListaProfessor() {
		return listaProfessor;
	}

	public boolean addProfessor(Professor professor) {
		boolean sucesso = false;
		if (
			professor != null &&
			listaProfessor.size() < 10 &&
			!listaProfessor.contains(professor)
		) {
			listaProfessor.add(professor);
			sucesso = true;
		}
		return sucesso;
	}

	public boolean removeProfessor(Professor professor) {
		boolean sucesso = false;
		if (
			professor != null &&
			listaProfessor.size() > 1 &&
			listaProfessor.contains(professor)
		) {
			listaProfessor.remove(professor);
			sucesso = true;
		}
		return sucesso;
	}

	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", creditos="
				+ creditos + ", cargaHoraria=" + cargaHoraria
				+ ", listaProfessor=" + listaProfessor + "]";
	}
}
