package br.com.letscode.introducao.base.repeticao.exercicios;

import java.util.Scanner;

/**
 * Calcule a média aritmética de n valores a serem digitados.
 * <p>
 * Seu programa deve pedir para que o usuário digite uma nota de 0 a 10.
 * <p>
 * Se o valor digitado for menor que 0, seu programa deve efetuar o cálculo da média e imprimir na tela,
 * com a quantidade de notas digitadas
 * <p>
 * Se for maior que 10, deve devolver uma mensagem avisando que a nota está inválida e não adicionar na soma.
 */
public class Media {

    public static void main(String[] args) {
        double media = 0;
        int quantidade = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da nota: ");
        double valorEntrada = entrada.nextDouble();

        while (valorEntrada >= 0) {
            if (valorEntrada <= 10) {
                media += valorEntrada;
                quantidade++;
            } else {
                System.err.println("Valor digitado deve ser menor que 10.");
            }
            System.out.println("Digite o valor da nota: ");
            valorEntrada = entrada.nextDouble();
        }

        if (quantidade == 0) {
            System.err.println("Nenhum valor digitado para fazer o cálculo de média.");
        } else {
            System.out.printf("O resultado da média das %d provas é de %.2f", quantidade, media / quantidade);
        }

        entrada.close();
    }
}
