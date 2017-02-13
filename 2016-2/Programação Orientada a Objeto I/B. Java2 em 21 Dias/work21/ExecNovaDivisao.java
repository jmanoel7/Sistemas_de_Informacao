package work21;

public class ExecNovaDivisao {

    public int exitStatus;

    public ExecNovaDivisao(int a, int b) {
        NovaDivisao div = new NovaDivisao(a,b);

        System.out.println("Divisao de " + a + " por " + b + ":");
        System.out.println("Resultado=" + div.resultado + "\tResto=" + div.resto);

        exitStatus=0;
    }

}
