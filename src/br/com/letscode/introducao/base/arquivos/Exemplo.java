package br.com.letscode.introducao.base.arquivos;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

    public static void main(String[] args) {
        String[] nomes = new String[2];
        nomes[0] = "Bruno";
        nomes[1] = "Ana";

        List<String> listaDeNomes = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bruno");
        pessoa.setSobreNome("Pinho");

        pessoa.getTelefones().add(new Telefone());



        pessoas.add(pessoa);

        pessoas.get(0).setSobreNome("T");
        System.out.println(listaDeNomes.size());
        System.out.println(nomes.length);
    }
}
