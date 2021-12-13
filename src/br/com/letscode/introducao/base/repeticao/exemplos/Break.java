package br.com.letscode.introducao.base.repeticao.exemplos;

public class Break {

    public static void main(String[] args) {

        System.out.println("Matriz");
        externo: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("(%d, %d) ", i, j);
                if (j == 2) {
                    break;
                } else if (j == 3) {
                    break externo;
                }
            }
            System.out.printf("%n");
        }

    }
}
