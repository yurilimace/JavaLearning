package com.cursojava.POO;

/**
 * Created by Yuri on 24/05/2017.
 */
public class testeCarro {
    public static void main(String[] args){
        Carro van = new Carro();
        van.marca="Fiat";
        van.modelo="Ducato";
        van.numPassageiros=10;
        van.capCombustivel=100;
        van.consumoCombustivel=0.2;

        Carro fusca = new Carro();
        fusca.marca="Wolks";
        fusca.modelo="Beatle";
        fusca.numPassageiros=4;
        fusca.capCombustivel=70;
        fusca.consumoCombustivel=0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    }
}
