package br.com.letscode.introducao.base.tiposevariaveis.exercicios;

/**
 * Criar uma função que transforma o valor de uma temperatura em graus celsius em fahrenheit seguindo a fórmula abaixo:
 * <p>
 * fahrenheit = (celsius * fator1) + fator2
 * <p>
 * fator1 = 9/5
 * <p>
 * fator2 = 32
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        final double fator1 = 9.0 / 5; // O que acontece se fator1 = 9/5 ?
        final double fator2 = 32;
        double celsius = 2;

        double fahrenheit = (celsius * fator1) + fator2;

        System.out.printf("%f Celsius é igual a %f Fahrenheit%n", celsius, fahrenheit);
    }
}
