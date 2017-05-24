package com.cursojava.javabasico;

import java.util.Scanner;

/**
 * Created by Yuri on 24/05/2017.
 */
public class vetores {
    public static void main(String[] args){
        int [] notas = new int [10]; // criando vetores
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<notas.length;i++){
            notas[i] = scan.nextInt();
        }
        for(int i =0;i<notas.length;i++){
            System.out.println("imprimindo notas"+ notas[i]);
        }
    }
}
