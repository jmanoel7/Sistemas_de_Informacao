package lista_classesAbstratas_e_interfaces;

public class TestePlayer {

	public static void main(String[] args) {
		
		CDPlayer cd = new CDPlayer("LG", "LGCDPLAYER", 10);
		System.out.println(cd);
		cd.play();
		cd.setFaixa(4);
		cd.pause();
		cd.reverse();
		System.out.println(cd);
		
		DVDPlayer dvd = new DVDPlayer("Sony", "Sony Dr434");
		System.out.println(dvd);
		dvd.play();
		System.out.println(dvd);
		dvd.pause();
		System.out.println(dvd);
		dvd.stop();
		System.out.println(dvd);
	}

}
