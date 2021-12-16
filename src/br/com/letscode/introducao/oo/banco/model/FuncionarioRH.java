package br.com.letscode.introducao.oo.banco.model;

public class FuncionarioRH extends Funcionario {

    public FuncionarioRH(String nome, String sobreNome, int idade) {
        super(nome, sobreNome, idade);
    }

    @Override
    public void trabalhar() {
        System.out.println("Olhando o relógio de ponto de todos os funcionários.");
    }

    public void darAumento(Gerente gerente) {
        System.out.println("O funcionário " + gerente + " ganhou um aumento!");
    }

    public void darAumento(FuncionarioRH funcionarioRH) {
        System.out.println("O funcionário " + funcionarioRH + " ganhou um aumento!");
    }

    public void darAumento(Funcionario funcionario) {
        System.out.println("O funcionário " + funcionario + " ganhou um aumento!");
    }
}
