package veiculo;

import java.util.Locale;
import java.util.Scanner;

class Carro {
    public String marca;
    public String modelo;
    public double velocidade;

    public Carro(String marca, String modelo, double velociade){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public void acelerar(){
        this.velocidade += 10.0;
    }

    public void exibirDados(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velociade Atual: " + this.velocidade + "km/h");
    }
}


