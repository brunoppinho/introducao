package br.com.letscode.introducao.repeticao.exemplos;

public class Continue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.printf("i = %d%n", i);
        }

        System.out.println("Números pares");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.printf("i = %d%n", i);
        }
    }
}
