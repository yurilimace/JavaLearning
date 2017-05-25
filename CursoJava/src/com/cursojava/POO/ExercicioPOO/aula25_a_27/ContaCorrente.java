package com.cursojava.POO.ExercicioPOO.aula25_a_27;

/**
 * Created by Yuri on 25/05/2017.
 */
public class ContaCorrente {
    String numeroConta;
    double saldo;
    boolean StatusEspecial;
    double limite;

    void realizarSaque(double valorSacado){
        if(saldo < 1)
        {
            System.out.println("Saldo insuficiente para saque");
        }

        else
        {
            saldo = saldo - valorSacado;
        }
    }

    void realizarDeposito(double valorDeposito){
        saldo+=valorDeposito;
    }

    void ConsultarSaldo(){
        System.out.println("Seu saldo é : " + saldo);
    }

    void ConsultarChequeEspecial(boolean chequeEspecial){
        if (chequeEspecial == true)
        {
            System.out.println("Esta usando cheque especial");
        }

        else
        {
            System.out.println("não esta usando cheque especial");
        }
    }
}
