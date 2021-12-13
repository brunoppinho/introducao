package br.com.letscode.introducao.base.fluxo.exercicios;

import java.util.Scanner;

/**
 * Realizar uma operação matemática, que deve ser passada via System.in ( opções: + - / * ) entre dois números que
 * também devem ser solicitados via System.in
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado = 0;

        System.out.println("Digite o primeiro número");
        numero1 = input.nextDouble();

        System.out.println("Digite o segundo número");
        numero2 = input.nextDouble();

        System.out.println("Digite a operação matemática");
        String operacao = input.next();

        switch (operacao) {
            case "*":
                resultado = numero1 * numero2;
                break;

            case "/":
                resultado = numero1 / numero2;
                break;

            case "+":
                resultado = numero1 + numero2;
                break;

            case "-":
                resultado = numero1 - numero2;
                break;

            default:
                System.err.println("Operador matemático inválido.");
                return;
        }

        System.out.printf("%f %s %f = %f", numero1, operacao, numero2, resultado);

        input.close();
    }
}
