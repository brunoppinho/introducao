package br.com.letscode.introducao.oo.banco.model;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private int idade;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Pessoa(String nome, String sobreNome, int idade) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.err.println("Idade não pode ser negativa.");
        } else {
            this.idade = idade;
        }
    }
}
