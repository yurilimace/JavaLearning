package com.cursojava.POO.ExercicioPOO.aula25_a_27;

/**
 * Created by Yuri on 25/05/2017.
 */
public class ExerLampada {
    public static void main(String[] args){
        Lampada lamp = new Lampada();
        lamp.tipo = "led";
        lamp.potencia = 6;

        lamp.LigarLampada();
        lamp.DesligarLampada();
    }
}
