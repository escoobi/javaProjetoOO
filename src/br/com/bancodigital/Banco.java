package br.com.bancodigital;

public abstract class Banco{
    private static String nomeBanco;
    private final int agencia;
    private static final int agenciaPadrao = 1;

    public Banco() {
        nomeBanco = "Banco do Brasil";
        this.agencia = agenciaPadrao;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public int getAgencia() {
        return agencia;
    }

}
