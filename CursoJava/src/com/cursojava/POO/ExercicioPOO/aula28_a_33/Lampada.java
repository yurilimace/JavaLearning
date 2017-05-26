package com.cursojava.POO.ExercicioPOO.aula28_a_33;

/**
 * Created by Yuri on 26/05/2017.
 */
public class Lampada {
    private int potencia;
    private String tensao;
    private String cor;
    private String tipo;

    //construtor
    public Lampada(int potencia, String tensao, String cor, String tipo){
        this.potencia = potencia;
        this.tensao = tensao;
        this.cor = cor;
        this.tipo = tipo;
    }

    //construtor vazio
    public Lampada(){}

    //gets
    public int getPotencia(){
        return this.potencia;
    }

    public String getTensao(){
        return this.tensao;
    }

    public String getCor(){
        return this.cor;
    }

    public String getTipo(){
        return this.tipo;
    }

    //sets

    public void setPotencia(int Potencia){
        this.potencia=Potencia;
    }

    public void setTensao(String tensao){
        this.tensao = tensao;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    //metodos

    public void LigarLampada(){
        System.out.println("Lampada ligada");
    }

    public void DesligarLampada(){
        System.out.println("Lampada desligada");
    }
}
