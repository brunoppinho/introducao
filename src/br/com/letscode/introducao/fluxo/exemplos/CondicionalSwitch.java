package br.com.letscode.introducao.fluxo.exemplos;

import java.time.DayOfWeek;
import java.util.Random;

public class CondicionalSwitch {

    public static void main(String[] args) {
        int b = new Random().nextInt(7) ;

        agenda(DayOfWeek.of(b));
//        agenda(b); // Se for passado um valor diferente de 1 a 7 o programa não vai funcionar corretamente

    }

    public static void agenda(DayOfWeek dia) {
        switch (dia) {
            case WEDNESDAY:
            case MONDAY:
            case FRIDAY:
                System.out.println("Aula");
                break;

            case TUESDAY:
            case THURSDAY:
                System.out.println("Estudar");
                break;

            default:
                System.out.println("Descansar");
                break;

        }
    }

    public static void agenda(int dia) {
        switch (dia) {
            case 1:
            case 2:
            case 3:
                System.out.println("Aula");
                break;

            case 4:
            case 5:
                System.out.println("Estudar");
                break;

            default:
                System.out.println("Descansar");
                break;
        }
    }
}
