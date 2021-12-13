package br.com.letscode.introducao.base.repeticao.exemplos;

/**
 * Exemplos de diferentes usos de laço usando while de forma determinada.
 * Sabendo o contexto final.
 */
public class WhileDeterminado {

    public static void main(String[] args) {

        System.out.printf("%nNúmeros impares de 0 a 10%n");
        int i = 1;
        while (i < 10) {
            System.out.printf("%d ", i);
            i += 2;
        }

        System.out.println("Números inteiros");
        i = 0;
        while (true) {
            System.out.printf("%d ", i++);
        }
    }
}
