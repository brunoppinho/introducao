package br.com.letscode.introducao.base.arquivos;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private int id;
    private String nome;

    private String sobreNome;

    private List<Telefone> telefones = new ArrayList<>();

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

    public List<Telefone> getTelefones() {
        return telefones;
    }

}
