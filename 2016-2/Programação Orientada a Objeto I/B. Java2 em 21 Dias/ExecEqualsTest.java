import work21.EqualsTest;

public class ExecEqualsTest {

    public static void main(final String[] args) {
        EqualsTest et1 = new EqualsTest(1);
        System.out.println("String1: \"" + et1.str1 + "\"");
        System.out.println("String2: \"" + et1.str2 + "\"");
        System.out.println("Same Object? " + et1.eq);

        EqualsTest et2 = new EqualsTest(2);
        System.out.println("String1: \"" + et2.str1 + "\"");
        System.out.println("String2: \"" + et2.str2 + "\"");
        System.out.println("Same Object? " + et2.eq);

        System.exit(0);
    }

}
