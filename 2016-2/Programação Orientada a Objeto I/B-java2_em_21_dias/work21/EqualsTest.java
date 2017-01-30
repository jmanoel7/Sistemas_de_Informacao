package work21;

public class EqualsTest {

    public String str1,str2;
    public boolean eq;

    public EqualsTest(int op) {
        str1 = "Free the bound periodicals.";

        if (op==1)
            str2 = str1;
        else if (op==2)
            str2 = new String (str1);
        else
            System.exit(-1);

        eq = (str1==str2);
    }

}
