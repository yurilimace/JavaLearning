package com.cursojava.POO.Aula30;

/**
 * Created by Yuri on 26/05/2017.
 */
public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    //construtores

    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    //chmando construto dentro de oonstrutor

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("Chamando construtor com 2 parâmetros");
    }

    public Carro(String marca, String modelo) {
        this("Fiat","Ducato",10);
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Chamando construtor com 3 parâmetros");
    }

    //construtor vazio boas praticas
    public Carro(){}

    double obterAutonomia(){
        System.out.println("metodo obter autonomia foi chamado");
        return this.capCombustivel*this.consumoCombustivel;
    }

    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + this.capCombustivel*this.consumoCombustivel);
    }
}
