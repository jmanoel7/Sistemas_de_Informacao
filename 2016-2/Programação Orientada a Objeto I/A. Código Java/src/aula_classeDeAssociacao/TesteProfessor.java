package aula_classeDeAssociacao;

public class TesteProfessor {

	public static void main(String[] args) {
		
		Professor p1 = new Professor("Renan");	
		Professor p2 = new Professor("Sirlon");	
		
		Aluno a1 = new Aluno("111", "Carla");
		Aluno a2 = new Aluno("222", "Pedro");
		Aluno a3 = new Aluno("333", "Maria");	
		
		Orientacao o1 = new Orientacao(p1, a1, "Aaaa");
		p1.addOrientacao(o1);
		
		Orientacao o2 = new Orientacao(a2, "Bbbb");
		p1.addOrientacao(o2);
		
		Orientacao o3 = new Orientacao(a2, "Bbbb");
		p1.addOrientacao(o3);
		
		System.out.println(p1);		
		
		p1.removerOrientacao(o1);
		System.out.println(p1);
		
		Orientacao o4 = new Orientacao(a3, "Ccccc");
		p2.addOrientacao(o4);
		
		p2.addOrientacao(o4);				
		System.out.println(p2);
		
		try {
			p1.addOrientacao(o4);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}	
}


