package com.Banco;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Corrente ===");


        super.extracted();

    }


}
