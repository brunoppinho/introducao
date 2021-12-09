package br.com.letscode.introducao.repeticao.exemplos;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String texto = "n";

        while (!texto.equalsIgnoreCase("S")) {
            System.out.println("Deseja finalizar o programa? (s/n)");
            texto = entrada.next();
        }

        entrada.close();

    }
}
