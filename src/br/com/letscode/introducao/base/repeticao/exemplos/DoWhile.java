package br.com.letscode.introducao.base.repeticao.exemplos;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto;

        do {
            System.out.println("Deseja finalizar o programa? (s/n)");
            texto = entrada.next();
        } while (!texto.equalsIgnoreCase("S"));

        entrada.close();
    }
}
