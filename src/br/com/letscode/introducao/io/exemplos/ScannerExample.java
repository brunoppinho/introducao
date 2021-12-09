package br.com.letscode.introducao.io.exemplos;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        int primeiro;
        int segundo;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        primeiro = input.nextInt();

        System.out.println("Digite o segundo número: ");
        segundo = input.nextInt();

        System.out.printf("O primeiro número foi %d e o segundo %d %n", primeiro, segundo);
        System.out.printf("Resultado da soma %d", (primeiro + segundo));

        input.close();
    }

}
