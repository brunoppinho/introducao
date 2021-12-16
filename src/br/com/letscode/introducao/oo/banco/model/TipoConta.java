package br.com.letscode.introducao.oo.banco.model;

public enum TipoConta {

    CC("Conta corrente"),
    CP("Conta poupança");

    private final String nome;

    TipoConta(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
