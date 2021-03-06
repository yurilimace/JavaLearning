package com.cursojava.POO;
/**
 * Created by Yuri on 24/05/2017.
 */
public class Carro {

    // atributos da classe
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;




    //Criando construtor sem parametro
    public Carro(){
        System.out.println("classe foi instanciada");

    }

    //Criando construtor com parametro
    public Carro(String _marca,String _modelo,int _numPassageiros,double _capCombustivel,double _consumoCombustivel){
        marca=_marca;
        modelo=_modelo;
        numPassageiros=_numPassageiros;
        capCombustivel=_capCombustivel;
        consumoCombustivel=_consumoCombustivel;
    }


    //criando metodos sem retorno e sem parametro
    //nome do metodo sempre começa com verbo
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel*consumoCombustivel);
    }

    //metodo com retorno
    double obterAutonomia(){
        System.out.println("metodo obter autonomia foi chamado");
        return capCombustivel*consumoCombustivel;
    }
    //metodo com parametros(usado quando não temos alguma informação na classe)
    //Ex km não é atributo da classe carro
    double calculaCombustivel(double km){
        return km/consumoCombustivel;
    }
}

