package com.cursojava.POO.Aula31;

/**
 * Created by Yuri on 26/05/2017.
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    //private metodo ou atributo só observado dentro da própria classe

    //construtores

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public Carro(){}

    private double divideKMPorConsumoCombustivel(double km){
        return km/this.consumoCombustivel;

    }

    public double obterAutonomia(){
        System.out.println("metodo obter autonomia foi chamado");
        return this.capCombustivel*this.consumoCombustivel;
    }

    public void exibirAutonomia(double km){
        System.out.println("A autonomia do carro é: " + this.divideKMPorConsumoCombustivel(km));
    }
}
