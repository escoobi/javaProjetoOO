package br.com.bancodigital;

public interface Conta_ {

    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, Conta_ contaDestino);

    void imprimirExtrato();

}
