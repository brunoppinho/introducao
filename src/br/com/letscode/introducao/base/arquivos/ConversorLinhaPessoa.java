package br.com.letscode.introducao.base.arquivos;

import java.util.ArrayList;

public class ConversorLinhaPessoa {

    public static Pessoa obtemPessoa(String linha) {
        String[] objetos = linha.split("/");

        Pessoa pessoa = new Pessoa();

        for (int i = 0; i < objetos.length; i++) {
            String[] valores = objetos[i].split(";");
            if (i == 0) {
                pessoa.setNome(valores[0]);
                pessoa.setSobreNome(valores[1]);
            } else {
                Telefone telefone = new Telefone();
                telefone.setDdd(valores[0]);
                telefone.setTelefone(valores[1]);
                pessoa.getTelefones().add(telefone);
            }
        }
        return pessoa;
    }
}
