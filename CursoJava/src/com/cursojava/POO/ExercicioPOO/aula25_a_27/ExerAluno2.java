package com.cursojava.POO.ExercicioPOO.aula25_a_27;

import java.util.Scanner;
/**
 * Created by Yuri on 25/05/2017.
 */


public class ExerAluno2 {
    public static void main(String[] args){
        Aluno alu = new Aluno();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        alu.nome = scan.next();
        System.out.println("Digite matricula do aluno");
        alu.matricula = scan.next();
        alu.disciplinas = new String[3];
        alu.notas = new double [3];

        for(int i =0 ; i<alu.disciplinas.length;i++)
        {
            System.out.println("Digite o nome da " + (i+1) + "ª"+" Disciplina" );
            alu.disciplinas[i] = scan.next();
            System.out.println("Digite a nota na " + alu.disciplinas[i]  );
            alu.notas[i] = scan.nextDouble();
        }

        for(int i = 0 ; i < alu.disciplinas.length;i++)
        {
            alu.estaAprovado(i);
        }
    }
}
