package br.com.letscode.introducao.arraysematrizes.exercicios;

import java.util.Scanner;

public class CalculoMediaTurmas {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int quantidadeTurmas;
        int quantidadeAlunos;
        double[][] notas;
        double mediaTotal = 0;
        double mediaTurma;

        System.out.println("Digite a quantidade de turmas: ");
        quantidadeTurmas = input.nextInt();

        System.out.println("Digite a quantidade de alunos por turma: ");
        quantidadeAlunos = input.nextInt();

        notas = new double[quantidadeTurmas][quantidadeAlunos];

        for (int i = 0; i < quantidadeTurmas; i++) {
            System.out.println("Digite as notas da turma " + i);
            for (int j = 0; j < quantidadeAlunos; j++) {
                System.out.printf("Digite a nota do aluno %d da turma %d: ", i, j);
                notas[i][j] = input.nextDouble();
            }
        }

        int n = 0;
        for (double[] turma : notas) {
            mediaTurma = 0;
            for (double nota : turma) {
                mediaTurma += nota;
            }
            System.out.println("Média da turma " + n++ + " " + (mediaTurma / quantidadeAlunos));
            mediaTotal += mediaTurma;
        }

        System.out.printf("A media de notas dos alunos de todas as turmas é %f",
                (mediaTotal / (quantidadeAlunos * quantidadeTurmas)));
        input.close();
    }
}
