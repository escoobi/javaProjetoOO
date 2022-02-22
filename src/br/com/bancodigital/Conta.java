package br.com.bancodigital;

public abstract class Conta extends Banco implements Conta_ {
    private int conta;
    protected double saldo;
    private static int sequencial = 1;


    public Conta(double saldo) {
        this.conta = sequencial++;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta_ contaDestino) {

    }

    protected void imprimirInformacoes() {
        System.out.println(super.getNomeBanco());
        System.out.printf("Agência: %d\n", getAgencia());
        System.out.printf("Conta: %d\n", this.conta);
        System.out.printf("Extrato: R$ %.2f\n", getSaldo());
    }

}
