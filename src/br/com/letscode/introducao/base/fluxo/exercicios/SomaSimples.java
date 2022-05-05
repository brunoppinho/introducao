package br.com.letscode.introducao.base.fluxo.exercicios;

import java.util.Scanner;

/**
 * Criar um programa que recebe 2 números e realiza a soma deles. Porém, nesse caso o programa deve observar quantos
 * parâmetros são enviados via terminal(args).
 * <p>
 * Se for nenhum, deve pedir via System.in que o usuário digite 2 números. No caso de vir apenas 1, deve pedir outro
 * parâmetro via System.in. Se for 2, deve realizar a soma dos dois.
 * <p>
 * No caso de qualquer outra quantidade. Deve apresentar uma mensagem de erro falando que a quantidade é inválida.
 */
public class SomaSimples {

    public static void main(String[] args) {

        int primeiro = 0;
        int segundo = 0;
        Scanner input = new Scanner(System.in);

        if (args.length < 1) {
            System.out.println("Digite o primeiro número: ");
            primeiro = input.nextInt();

            System.out.println("Digite o segundo número: ");
            segundo = input.nextInt();
        } else if (args.length < 2) {
            primeiro = Integer.parseInt(args[0]);

            System.out.println("Digite o segundo número: ");
            segundo = input.nextInt();
        } else if (args.length == 2) {
            primeiro = Integer.parseInt(args[0]);
            segundo = Integer.parseInt(args[1]);

            System.out.println("Todos os números foram passados via parâmetros");
        } else {
            System.err.println("Número de parâmetros maior que 2.");
        }

        if (args.length <= 2) {
            System.out.printf("O primeiro número foi %d e o segundo %d %n", primeiro, segundo);
            System.out.printf("Resultado da soma %d\n", (primeiro + segundo));
        }

        input.close();

    }
}
