package br.com.letscode.introducao.base.arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class BufferReader {

    public static void main(String[] args) {
        String arquivoCsv = "asd.txt";
        List<Pessoa> pessoas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCsv))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                Pessoa pessoa = ConversorLinhaPessoa.obtemPessoa(linha);
                pessoas.add(pessoa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }    }

}
