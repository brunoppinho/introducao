package br.com.letscode.introducao.io.exemplos;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Locale;

public class OutputExample {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println(); // sout
        System.out.println("args = " + Arrays.deepToString(args)); // soutp
        System.out.println("OutputExample.main"); //soutm
        System.out.println("args = " + args); // soutv

        System.err.println("Deu ruim");
        System.out.printf(""); // souf

        System.out.printf(" %b \n", false); // imprime um boolean  String.valueOf(arg)
        System.out.printf(" %b %n", "a"); // imprime um hexadecimal  Integer.toHexString(arg.hashCode())
        System.out.printf(" %s \n", "String"); // imprime args.toString()

        System.out.printf(" %c %n", 123); // imprime caractere

        var data = LocalDateTime.now();
        System.out.printf("%tB", data);

    }
}
