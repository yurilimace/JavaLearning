package com.cursojava.POO.ExercicioPOO.aula25_a_27;

/**
 * Created by Yuri on 25/05/2017.
 */
public class ExerContaCorrente {
    public static void main(String[] args){
        ContaCorrente cliente1 = new ContaCorrente();
        ContaCorrente cliente2 = new ContaCorrente();

        cliente1.numeroConta="123456";
        cliente1.saldo = 1000;
        cliente1.limite = 2000;
        cliente1.StatusEspecial = true;

        System.out.println("operações do cliente 1");
        cliente1.ConsultarSaldo();
        cliente1.realizarSaque(500);
        cliente1.ConsultarSaldo();
        cliente1.realizarDeposito(1000);
        cliente1.ConsultarSaldo();
        cliente1.ConsultarChequeEspecial(true);


        cliente2.numeroConta = "654123";
        cliente2.saldo = 500;
        cliente2.limite = 1500;
        cliente2.StatusEspecial = false;

        System.out.println("operações do cliente 2");
        cliente2.ConsultarSaldo();
        cliente2.realizarSaque(500);
        cliente2.ConsultarSaldo();
        cliente2.realizarDeposito(1000);
        cliente2.ConsultarSaldo();
        cliente2.ConsultarChequeEspecial(false);
    }
}
