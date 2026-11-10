package banco;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {return titular;}
    public void setTitular(String titular) {this.titular = titular;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public void depositar(double valor){this.saldo += valor;}

    public void sacar(double valorSaque){this.saldo -= valorSaque;}

    public void consultarSaldo(){
        System.out.println("Titular: " + this.titular + "| Saldo: R$ " + this.saldo);
    }
}