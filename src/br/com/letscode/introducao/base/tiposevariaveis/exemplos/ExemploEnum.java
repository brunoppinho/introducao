package br.com.letscode.introducao.base.tiposevariaveis.exemplos;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

public class ExemploEnum {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("Hoje é " + DayOfWeek.WEDNESDAY.getDisplayName(TextStyle.FULL_STANDALONE, new Locale("pt", "BR")));
        System.out.println("Hoje é " + DayOfWeek.of(3));
        System.out.println("Hoje é " + DayOfWeek.WEDNESDAY.getValue());

    }
}
