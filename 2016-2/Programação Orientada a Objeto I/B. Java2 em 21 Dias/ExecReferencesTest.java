import work21.ReferencesTest;

public class ExeReferencesTest {

    public static void main(final String[] args) {
        ReferencesTest t = new ReferencesTest(100,100);

        System.out.println("Point1: " + t.pt1.x + ", " + t.pt1.y);
        System.out.println("Point2: " + t.pt2.x + ", " + t.pt2.y);

        t.pt1.x = 200;
        t.pt1.y = 300;

        System.out.println("\nPoint1: " + t.pt1.x + ", " + t.pt1.y);
        System.out.println("Point2: " + t.pt2.x + ", " + t.pt2.y);

        System.exit(0);
    }

}
