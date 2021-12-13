package br.com.letscode.introducao.base.tiposevariaveis.exemplos;

/**
 * Java continua fortemente tipada, pois a substituição do var pelo tipo correto ocorre em tempo de compilação
 * var foi inserido a partir do JAVA 10
 */
public class Inferencia {

    public static void main(String[] args) {
        var a = 1.0;
        System.out.println(a);

        double b = 1.0;
        System.out.println(b);

        System.out.println(a == b);

        var texto1 = "Texto qualquer";
        System.out.println(texto1);

        String texto2 = "Texto qualquer";
        System.out.println(texto2);

        System.out.println(texto1.equals(texto2));

//        texto1 = 1;
    }
}
