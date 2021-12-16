package br.com.letscode.introducao.oo.banco.model;

public class ClienteEmpresa extends Empresa implements Cliente {

    private Conta conta;

    public ClienteEmpresa(String nomeFantasia, String cnpj) {
        super(nomeFantasia, cnpj);
        conta = new Conta();
    }

    @Override
    public Conta getConta() {
        return conta;
    }
}
