package br.com.bancodigital;
public abstract class Pessoa implements Pessoa_{
    protected String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(){

    }

    @Override
    public void cadastrarNome(String nome) {
        setNome(nome);
    }

    @Override
    public void imprimirNome() {
        System.out.printf("Pessoa: %s \n", getNome());

    }
}
