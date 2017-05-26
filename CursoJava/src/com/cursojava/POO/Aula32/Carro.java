package com.cursojava.POO.Aula32;

/**
 * Created by Yuri on 26/05/2017.
 */
public class Carro {
    private  String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    //gerando os gets e sets
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    /*
    //metodos Get
    public String getMarca(){
        return this.marca;
    }

    //metodos set é sempre void pois não necessita retorno
    public void setMarca(String Marca){
        this.marca = Marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String Modelo){
        this.modelo = Modelo;
    }

    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros  ;
    }*/

}
