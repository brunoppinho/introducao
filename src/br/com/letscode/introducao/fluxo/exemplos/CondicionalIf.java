package br.com.letscode.introducao.fluxo.exemplos;

/**
 * Exemplo de utilização de IF - Else
 */
public class CondicionalIf {

    public static void main(String[] args) {

        int a = args.length;

        double b = Math.random() * 10;

        if (b < 3) {
            System.out.println("mínimo");
        } else if (b > 6) {
            System.out.println("máximo");
        } else {
            System.out.println("mediano");
        }

    }
}
