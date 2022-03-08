package com.Banco;

public class Main {

    public static void main(String[] args){



        Banco banco = new Banco();
        banco.setNome("Bai");
        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
        Conta cc = new ContaCorrente(cliente);

        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(1000);

        poupanca.depositar(1000);

        cc.transferir(200,poupanca );



        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
