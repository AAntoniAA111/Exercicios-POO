package banco;

public class Main {
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria("Carlos", 100.00);

        conta.depositar(50.00);

        conta.sacar(30.00);

        conta.consultarSaldo();
    }
}
