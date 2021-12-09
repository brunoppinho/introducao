package br.com.letscode.introducao.arraysematrizes.exemplos;

public class Matrizes {

    private static int TAMANHO = 8;

    public static void main(String[] args) {
        String tabuleiroXadrez[][] = new String[TAMANHO][TAMANHO];

        populaTabuleiroPeoes(tabuleiroXadrez);

        imprimeTabuleiro(tabuleiroXadrez);
    }

    private static void populaTabuleiroPeoes(String[][] tabuleiroXadrez) {
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                if (i == 1 || i == 6) {
                    tabuleiroXadrez[i][j] = "p";
                } else {
                    tabuleiroXadrez[i][j] = "_";
                }
            }
        }
    }

    private static void imprimeTabuleiro(String[][] tabuleiroXadrez) {
        for (String[] linhas : tabuleiroXadrez) {
            for (String celula : linhas) {
                System.out.printf("%s ", celula);
            }
            System.out.println("");
        }
    }
}
