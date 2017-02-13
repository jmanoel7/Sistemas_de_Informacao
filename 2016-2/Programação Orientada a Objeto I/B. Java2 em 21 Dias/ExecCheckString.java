import work21.CheckString;

public class ExecCheckString {

    public static void main(final String[] args) {
        CheckString s = new CheckString();
        System.out.println("The string is: " + s.str);
        System.out.println("Length of this string: " + s.str.length());
        System.out.println("The character at position 5: " + s.str.charAt(5));
        System.out.println("The substring from 26 to 32: " + s.str.substring(26,32));
        System.out.println("The index of the character \'e\': " + s.str.indexOf('e'));
        System.out.println("The index of the beginning of the substring \"IBM\": " + s.str.indexOf("IBM"));
        System.out.println("The string in upper case: " + s.str.toUpperCase());

        System.exit(0);
    }

}
