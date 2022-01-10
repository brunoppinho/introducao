package br.com.letscode.introducao.base.exceptions.exemplos;

public class DesafioFinally {

    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Começando o programa");
            throw new RuntimeException();

        } catch (RuntimeException e) {
            System.out.println("Tratando a exceção");
            throw new Exception();

        } finally {
            System.out.println("Será?");

        }
    }
}
