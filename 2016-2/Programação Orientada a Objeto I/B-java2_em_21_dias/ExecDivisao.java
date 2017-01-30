import work21.Divisao;

public class ExecDivisao {

    public static void main(final String[] args) {
        Divisao div = new Divisao(9,5);

        System.out.println("Divisao de 9 por 5:");
        System.out.println("Resultado=" + div.resultado + "\tResto=" + div.resto);

        System.exit(0);
    }

}
