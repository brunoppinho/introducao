package br.com.letscode.introducao.oo.banco.model;


public class Gerente extends Funcionario {

    public Gerente(String nome, String sobreNome, int idade) {
        super(nome, sobreNome, idade);
    }

    @Override
    public void trabalhar() {
        System.out.println("Atualizando planilhas e aprovando empréstimos.");
    }

    public Cliente abrirConta(Pessoa pessoa) {
        System.out.println("Abrindo conta para " + pessoa);
        return new ClientePessoa(pessoa.getNome(), pessoa.getSobreNome(), pessoa.getIdade());
    }

    public Cliente abrirConta(Empresa empresa) {
        System.out.println("Abrindo conta para " + empresa);
        return new ClienteEmpresa(empresa.getNomeFantasia(), empresa.getCnpj());
    }

    public void executarOperacao(Cliente cliente) {
        System.out.println("Executando operação na conta " + cliente.getConta().getNumeroConta());
    }

}
