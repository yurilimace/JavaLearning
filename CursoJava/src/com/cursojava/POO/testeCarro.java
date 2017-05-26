package com.cursojava.POO;

/**
 * Created by Yuri on 24/05/2017.
 */
public class testeCarro {
    public static void main(String[] args){
        Carro van = new Carro();
        van.marca="Fiat";
        van.modelo="Ducato";
        //foi instanciado dentro do construtor sem parametro
        //van.numPassageiros=10;
        van.capCombustivel=100;
        van.consumoCombustivel=0.2;

        Carro fusca = new Carro();
        fusca.marca="Wolks";
        fusca.modelo="Beatle";
        fusca.numPassageiros=4;
        fusca.capCombustivel=70;
        fusca.consumoCombustivel=0.5;


        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();
        double autonomia = van.obterAutonomia();
        System.out.println("autonomia é " + autonomia);
        double qtdCombustivel = van.calculaCombustivel(10);
        System.out.println("qtdCombutivel10 " + qtdCombustivel);

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        fusca.exibirAutonomia();
        autonomia = fusca.obterAutonomia();
        System.out.println("autonomia é " + autonomia);
        qtdCombustivel = fusca.calculaCombustivel(10);
        System.out.println("qtdCombutivel10 " + qtdCombustivel);

        Carro van2 = new Carro("fiat","palio",5,70,0.8);
        System.out.println(van2.modelo);
    }
}
