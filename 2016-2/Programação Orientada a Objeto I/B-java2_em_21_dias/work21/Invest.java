package work21;

public class Invest {
    public float lucro;

    public Invest(float init) {
        lucro  = init;
        lucro += 0.4F * lucro;  // aumento de 40%
        lucro -= 1500F;         // perda de 1500
        lucro += 0.12F * lucro; // aumento de 12%
    }
}
