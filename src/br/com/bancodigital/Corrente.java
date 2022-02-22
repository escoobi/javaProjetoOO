package br.com.bancodigital;

public class Corrente extends Conta implements Conta_ {

    Cliente cliente = new Cliente();

    public Corrente(String nome, double saldo) {
        super(saldo);
        cliente.cadastrarNome(nome);
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void transferir(double valor, Conta_ contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente: ");
        cliente.imprimirNome();
        imprimirInformacoes();
    }


}
