package br.com.letscode.introducao.arraysematrizes.exemplos;

import java.util.Random;

public class Array {

    public static void main(String[] args) {
        double[] soma = new double[3]; // Deixar para definir os valores depois
        double soma2[] = {8.0, 6.5, 9}; // Definindo os atributos no momento de criar o objeto

        for (int i = 0; i < soma.length - 1; i++) {
            soma[i] = new Random().nextDouble();
        }

        System.out.printf("O resultado da soma é %f%n", (soma[0] + soma[1] + soma[2]));

        System.out.printf("Valor quando não é inicializado é %f%n", soma[2]);

        int tamanho = soma.length; // Array é um objeto que armazena os valores e também contém métodos

        System.out.printf("O tamanho do array é %d%n", tamanho);

        soma[3] = 10; // java.lang.ArrayIndexOutOfBoundsException

    }
}
