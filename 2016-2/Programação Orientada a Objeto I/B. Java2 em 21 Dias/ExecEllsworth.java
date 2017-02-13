import work21.Ellsworth;

public class ExecEllsworth {

    public static void main(final String[] args) {
        Ellsworth ells = new Ellsworth();

        System.out.println(ells.line1);
        System.out.println(ells.line2);
        System.out.println(ells.line3);
        System.out.println(ells.line4);
        System.out.println('\u0022' + ells.quote + '\u0022');
        System.out.println("\t" + ells.speaker);
        System.out.println("\t" + ells.title);
        System.out.println("\t" + ells.from);

        System.exit(0);
    }

}

