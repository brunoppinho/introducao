package br.com.letscode.introducao.base.io.exercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Exercício: Criar um programa que utilizando a data e hora atual ( LocalDateTime.now() ) que imprima:
 * Numero do dia, com 2 caracteres sempre, ex: 01, o nome sem abreviação do mês e o ano com apenas 2 digitos
 * <p>
 * Ex: 03-dezembro-21
 * <p>
 * Também deve imprimir a hora com hora, minuto e segundo em qualquer formatação escolhida;
 */
public class FormatDate {

    public static void main(String[] args) {
        System.out.printf("%1$td/%1$tb/%1$tC %1$tH:%1$tM:%1$tS\n", LocalDateTime.now());

        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MMM/YY HH:mm:ss")));
    }
}
