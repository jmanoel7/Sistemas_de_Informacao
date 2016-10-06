package agregacao;

import java.util.List;

public class TesteEquipe {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta("Renan", "Goleiro");
		Atleta a2 = new Atleta("Rafael Foster", "Zagueiro");
		Atleta a3 = new Atleta("Renan", "Goleiro");
		Atleta a4 = null;
		Atleta a5 = new Atleta("Felipe Menezes", "Meia");
		
		Equipe t = new Equipe("Goi�s");
		
		t.addAtleta(a1);
		t.addAtleta(a2);
		t.addAtleta(a3);
		t.addAtleta(a4);		
		System.out.println(t);
		
		t.addAtleta(a5);		
		System.out.println(t);		
				
		t.removerAtleta(a2);
		System.out.println(t);	
		
		List<Atleta> lista = t.getListaAtleta();
		
		lista.clear();
		lista.add(new Atleta("aa", "bb"));
		System.out.println(lista);
		
		System.out.println(t);
		
		
	}	
}






