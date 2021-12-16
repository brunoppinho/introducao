package br.com.letscode.introducao.oo.banco.model;

public class ClientePessoa extends Pessoa implements Cliente {

    private final Conta conta;

    public ClientePessoa(String nome, String sobreNome, int idade) {
        super(nome, sobreNome, idade);
        conta = new Conta();
    }

    @Override
    public Conta getConta() {
        return conta;
    }
}
