package lista_agregacao;

public class TestePC {

	public static void main(String[] args) {
		
		Teclado tc1 = new Teclado(105, "br-abnt2", "LG", "Usb", false);
		Teclado tc2 = new Teclado(105, "us-acentos", "exbom", "BK-A1100", true);
		Teclado tc3 = null;

		WebCam wc1 = new WebCam("Logitech", "C920", 1920, 1080, true);
		WebCam wc2 = new WebCam("Logitech", "C270", 1280, 720, true);
		WebCam wc3 = null;
		
		PC pc = null;
		
		try {
			pc = new PC("João Maoel", "Leadership", tc3);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		try {
			pc = new PC("João Maoel", "Leadership", tc1, wc3);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		try {
			pc = new PC("João Maoel", "Leadership", tc1, wc1);
		} catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}

		System.out.println(pc);
		
		pc.addWebCam(wc2);
		
		System.out.println(pc);
		
		pc.removeWebCam(wc1);

		System.out.println(pc);
		
		pc.addWebCam(wc2);
		
		System.out.println(pc);
		
		pc.trocaTeclado(tc2);
		
		System.out.println(pc);
		
		pc.trocaTeclado(tc3);
		
		System.out.println(pc);
		
	}

}
