package br.com.letscode.introducao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Rascunho {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.printf("Digite um número: ");
            int numero = input.nextInt();
            System.out.println("Seu número é " + (numero % 2 == 0 ? "par" : "ímpar"));
            System.out.println("1 / " + numero + " = " + 1 / numero);
        } catch (InputMismatchException e) {
            System.out.println("Você deveria ter digitado um número...");
            e.printStackTrace();
        }

        System.out.println("Fim");
    }


}
