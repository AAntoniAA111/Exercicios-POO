package lampada;

public class Main {
    public static void main(String[] args) {
        Lampada lampadaCozinha = new Lampada("Cozinha", false);

        lampadaCozinha.observar();
        lampadaCozinha.ligar();
        lampadaCozinha.observar();
    }
}
