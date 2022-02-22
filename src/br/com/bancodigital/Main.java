package br.com.bancodigital;

public class Main {
    public static void main(String[] args) {


        Conta cc = new Corrente("Gustavo O. Cardozo", 100.56);
        Conta cp = new Poupanca("Emanuela Bonfá",120.56);
        cc.depositar(500.89);
        cc.imprimirExtrato();
        cc.transferir(100, cp);
        cp.imprimirExtrato();
    }
}
