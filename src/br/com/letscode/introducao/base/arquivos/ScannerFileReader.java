package br.com.letscode.introducao.base.arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerFileReader {

    public static void main(String[] args) throws FileNotFoundException {
        String arquivoCsv = "atual.txt";
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(new File(arquivoCsv));
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            Pessoa pessoa = ConversorLinhaPessoa.obtemPessoa(linha);
            pessoas.add(pessoa);
        }


        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }


}
