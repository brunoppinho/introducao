package br.com.letscode.introducao.oo.banco.model;

import java.time.LocalDateTime;

public abstract class Funcionario extends Pessoa {

    public Funcionario(String nome, String sobreNome, int idade) {
        super(nome, sobreNome, idade);
    }

    public abstract void trabalhar();

    public void baterPonto() {
        System.out.println("Horário de batida de ponto: " + LocalDateTime.now());
    }

}
