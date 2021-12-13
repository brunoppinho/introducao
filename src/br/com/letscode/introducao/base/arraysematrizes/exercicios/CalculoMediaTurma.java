package br.com.letscode.introducao.base.arraysematrizes.exercicios;

import java.util.Scanner;

/**
 * Calcular a média de notas de uma turma com n alunos. O valor n deve ser solicitado via System.in.
 * <p>
 * Deve-se criar um vetor para armazenar a nota de todos os alunos.
 * <p>
 * Ao final o programa deve imprimir a nota média e também a quantidade de alunos.
 * <p>
 * Obs.: Utilize um for para obter as notas de cada aluno e um foreach para fazer o cálculo da média
 */
public class CalculoMediaTurma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantidade;
        double[] notas;
        double media = 0;

        System.out.println("Digite a quantidade de alunos: ");
        quantidade = input.nextInt();

        notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a nota do aluno " + i);
            notas[i] = input.nextDouble();
        }

        for (double nota : notas) {
            media += nota;
        }
        media /= quantidade;

        System.out.printf("A media da nota dos %d alunos é %f", quantidade, media);
        input.close();
    }
}
