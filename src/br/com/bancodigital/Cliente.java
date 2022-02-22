package br.com.bancodigital;

public class Cliente extends Pessoa implements Pessoa_{
    protected String nomeCliente;

    public Cliente() {

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

}
