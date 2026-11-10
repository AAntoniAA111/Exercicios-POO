package carro;

public class Main {
    public static void main (String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 0.0);

        carro.acelerar();
        carro.acelerar();

        carro.exibirDados();
    }
}
