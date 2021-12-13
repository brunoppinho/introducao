package br.com.letscode.introducao.base.tiposevariaveis.exercicios;

/**
 * Calcula a área de uma circunferência
 */
public class CalculoArea {

    public final static double PI = 3.141592653;

    public static void main(String[] args) {

        // Imprime o valor de PI da biblioteca Math
        System.out.println(Math.PI);

        // Imprime o valor de PI que foi criado como constante
        System.out.println(PI);

        // Math.PI = 5; // Não é possível alterar o valor de uma constante

        int raio = 1123111230;

        float floatArea = (float) (Math.PI * raio * raio);

        System.out.println(floatArea);

        double area = (Math.PI * raio * raio);

        System.out.println(area);

    }
}
