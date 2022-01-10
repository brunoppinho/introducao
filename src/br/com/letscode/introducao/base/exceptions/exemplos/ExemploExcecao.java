package br.com.letscode.introducao.base.exceptions.exemplos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExemploExcecao {

    public static void main(String[] args) throws IOException {
        FileInputStream stream;
        try {
            stream = getFileInputStream();

        } catch (FileNotFoundException e) {
            System.err.println("Não foi possível abrir o arquivo");
            e.printStackTrace();
            return;
        }
        try {
            readAllFile(stream);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo");
            e.printStackTrace();
        } finally {
            stream.close();

        }
    }

    private static void readAllFile(FileInputStream stream) throws IOException {
        int i = 0;
        while ((i = stream.read()) != -1) {
            System.out.print((char) i);
        }
    }

    private static FileInputStream getFileInputStream() throws FileNotFoundException {
        File file = new File("aulas/0 - Git.md");
        FileInputStream stream = new FileInputStream(file);
        return stream;
    }

}
