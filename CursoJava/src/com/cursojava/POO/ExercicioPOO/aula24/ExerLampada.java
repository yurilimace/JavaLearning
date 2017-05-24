package com.cursojava.POO.ExercicioPOO.aula24;

/**
 * Created by Yuri on 24/05/2017.
 */
public class ExerLampada {
    public static void main(String[] args)
    {
        Lampada lamp = new Lampada();
        lamp.cor = "Branca";
        lamp.potencia=6;
        lamp.preco=5.50;
        lamp.tensao = "Bivolt";

        //como tipo é um array precisa criar um array de string
        lamp.tipo = new String[5];
        lamp.tipo[0] = "Abajur";
        lamp.tipo[1] = "Incadescente";
        lamp.tipo[2] = "LED";
    }

}
