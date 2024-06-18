package br.com.letscode.introducao.base.arraysematrizes.exercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NomeNota {
    private static int[] popula_array(int tamanho) {
        Random random = new Random();
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    private static void mostra_array(int[] array, boolean ordenado) {
        String ordenacao = ordenado ? "ordenado" : "desordenado";
        System.out.println("Array " + ordenacao + ":");
        for (int j : array) {
            System.out.print("[" + j + "]");
        }
        System.out.println("\n");
    }

    private static int[] ordena_array(int[] array) {
        int num_maior;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    num_maior = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = num_maior;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Digite o tamanho do array");
        int tam_array = scanner.nextInt();
        int[] array = popula_array(tam_array);
        mostra_array(array, false);
        int[] array_ordenado = ordena_array(array);
        mostra_array(array_ordenado, true);
    }
}
