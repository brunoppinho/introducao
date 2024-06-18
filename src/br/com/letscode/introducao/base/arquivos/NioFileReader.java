package br.com.letscode.introducao.base.arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NioFileReader {

    public static void main(String[] args) {
        String arquivoCsv = "asd.txt";
        List<Pessoa> pessoas = new ArrayList<>();

        try (Stream<String> linhas = Files.lines(Paths.get(arquivoCsv))) {
            linhas
                    .map(ConversorLinhaPessoa::obtemPessoa)
                    .forEach(pessoas::add);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

}
