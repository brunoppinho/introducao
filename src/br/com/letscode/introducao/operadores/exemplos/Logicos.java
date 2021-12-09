package br.com.letscode.introducao.operadores.exemplos;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * negação (!), E (&&), OU (||)
 */
public class Logicos {

    public static void main(String[] args) {

        System.out.println(DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.FULL, Locale.CHINESE));
        System.out.println(DayOfWeek.of(1));

    }
}
