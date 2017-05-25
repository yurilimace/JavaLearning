package com.cursojava.POO.ExercicioPOO.aula25_a_27;

/**
 * Created by Yuri on 25/05/2017.
 */
public class Aluno {
    String nome;
    String matricula;
    String[] disciplinas;
    double[] notas;

    void estaAprovado(int i){
        if(notas[i]>=7)
        {
            System.out.println("Disciplina : " + disciplinas[i] + " nota " + notas[i] + "  aprovado ");
        }

        else
        {
            System.out.println("Disciplina : " + disciplinas[i] + " nota  " + notas[i] + "  reprovado ");
        }
    }
}
