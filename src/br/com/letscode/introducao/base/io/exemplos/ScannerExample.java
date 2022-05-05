package br.com.letscode.introducao.base.io.exemplos;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = 0;
        String texto;

        System.out.println("Digite o texto: ");
//        texto = input.nextLine();
        texto = input.next();

        System.out.println("Digite um número: ");
        numero = input.nextInt();

        System.out.println("Texto: " + texto + " Número: " + numero);

        // Lembrar sempre de fechar o scanner
        input.close();

    }

}
