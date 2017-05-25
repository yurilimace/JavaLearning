package com.cursojava.POO.ExercicioPOO.aula25_a_27;

import java.util.Scanner;
/**
 * Created by Yuri on 25/05/2017.
 */
public class ExerAluno {
    public static void main(String[] args){
        Aluno alu = new Aluno();
        Aluno alu2 = new Aluno();
        Scanner scan = new Scanner(System.in);


        alu.nome = "José";
        alu.matricula = "123456";
        alu.disciplinas = new String[3];
        alu.disciplinas[0] = "Matematica";
        alu.disciplinas[1] = "Portugues";
        alu.disciplinas[2] = "Historia";
        alu.notas = new double[3];
        alu.notas[0] = 8;
        alu.notas[1] = 6;
        alu.notas[2] = 7.5;

        alu2.nome = "Maria";
        alu2.matricula = "654321";
        alu2.disciplinas = new String[3];
        alu2.disciplinas[0] = "Matematica";
        alu2.disciplinas[1] = "Portugues";
        alu2.disciplinas[2] = "Historia";
        alu2.notas = new double[3];
        alu2.notas[0] = 8;
        alu2.notas[1] = 10;
        alu2.notas[2] = 8.5;

        System.out.println("Digite o nome ou a matricula do aluno: ");
        String Verificacao = scan.nextLine();
        if(Verificacao.equals(alu.nome)||Verificacao.equals(alu.matricula))
        {
            for(int i=0 ; i<alu.disciplinas.length;i++)
            {
                alu.estaAprovado(i);
            }
        }
        else if(Verificacao.equals(alu2.nome)||Verificacao.equals(alu2.matricula))
        {
            for(int i=0 ; i<alu2.disciplinas.length;i++)
            {
                alu2.estaAprovado(i);
            }
        }
        else
        {
            System.out.println("Aluno nao consta no sistema");
        }
    }



}
