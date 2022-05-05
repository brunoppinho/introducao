package br.com.letscode.introducao.base.operadores.exemplos;

/**
 * negação (!), E (&&), OU (||)
 */
public class Logicos {

    public static void main(String[] args) {

        System.out.println("Operações com AND (&&)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("Operações com OR (||)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("Negação !");
        System.out.println(!true);
        System.out.println(!false);

    }
}
