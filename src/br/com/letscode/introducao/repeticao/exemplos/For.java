package br.com.letscode.introducao.repeticao.exemplos;

/**
 * Exemplos de diferentes usos de laço usando FOR
 * 1 Declaração da variável de controle
 * 2 Expressão com retorno boolean
 * 3 Passo para controle do for — Altera a variável de controle
 */
public class For {

    public static void main(String[] args) {

        System.out.println("Números pares de 0 a 10");
        for (int i = 0; i < 10; i += 2) {
            System.out.printf("%d ", i);
        }

        // Variavel i acima só existe no escopo do for, tanto é que podemos declarar ela logo abaixo
        System.out.printf("%nNúmeros impares de 0 a 10%n");
        int i = 1;
        for (; i < 10; ) {
            System.out.printf("%d ", i);
            i += 2;
        }

        // Loop infinito
        System.out.println("Números inteiros");
        int multiplosDeTres = 0;
        for (; ; ) {
            System.out.printf("%d ", multiplosDeTres++);
        }

    }
}
