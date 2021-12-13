package br.com.letscode.introducao.base.io.exercicios;

/**
 * Criar uma classe com uma função main que vai receber um número via args e dizer se esse número é par ou impar
 */
public class ParOuImpar {

    public static void main(String[] args) {

        System.out.println(Integer.parseInt(args[0]) % 2 == 0 ? "Par" : "Impar");
    }
}
