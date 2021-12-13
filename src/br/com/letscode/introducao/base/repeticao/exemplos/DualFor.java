package br.com.letscode.introducao.base.repeticao.exemplos;

public class DualFor {

    public static void main(String[] args) {

        System.out.println("Matriz");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.printf("%n");
        }
    }
}
