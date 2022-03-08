package com.Banco;

public abstract class Conta implements IConta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    private static final int AGENCIA_PADRAO = 1;


    private static int Sequencial = 1;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Sequencial++;
        this.cliente = cliente;



    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo +=valor;
    }

    @Override
    public void transferir(double valor, Conta ContaDestino) {
        this.sacar(valor);
        ContaDestino.depositar(valor);
    }

    protected void extracted() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

}
