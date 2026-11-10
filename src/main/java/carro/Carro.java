package carro;

class Carro {
    private String marca;
    private String modelo;
    private double velocidade;

    public Carro(String marca, String modelo, double velociade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public double getVelocidade() {return velocidade;}
    public void setVelocidade(double velocidade) {this.velocidade = velocidade;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public void acelerar(){
        this.velocidade += 10.0;
    }

    public void exibirDados(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velociade Atual: " + this.velocidade + "km/h");
    }
}

