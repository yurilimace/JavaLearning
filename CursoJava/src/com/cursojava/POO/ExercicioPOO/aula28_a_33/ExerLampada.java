package com.cursojava.POO.ExercicioPOO.aula28_a_33;

/**
 * Created by Yuri on 26/05/2017.
 */
public class ExerLampada {
    public static void main(String [] args){
        Lampada lamp = new Lampada(6,"220v","Branca","Led");
        System.out.println("Especificações da lampada");
        System.out.println(lamp.getTipo());
        System.out.println(lamp.getCor());
        System.out.println(lamp.getTensao());
        System.out.println(lamp.getPotencia());

        lamp.setTipo("Fluorescente");
        lamp.setTensao("110v");

        System.out.println("Especificações da lampada");
        System.out.println(lamp.getTipo());
        System.out.println(lamp.getCor());
        System.out.println(lamp.getTensao());
        System.out.println(lamp.getPotencia());

        lamp.LigarLampada();
        lamp.DesligarLampada();
    }
}
