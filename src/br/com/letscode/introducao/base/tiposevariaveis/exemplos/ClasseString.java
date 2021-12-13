package br.com.letscode.introducao.base.tiposevariaveis.exemplos;

public class ClasseString {

    public static void main(String[] args) {
        String nome = "Elon";
        var sobrenome = "Musk";
        int fortuna = 288;
        String frase1 = "O " + nome + " " + sobrenome + " tem mais de " + fortuna + " bilhões de dólares.";
        System.out.println(frase1);

        String frase2 = String.format("O %s %s tem mais de %d bilhões de dólares.", nome, sobrenome, fortuna);
        System.out.println(frase2);
        System.out.println(frase1.equals(frase2));
        System.out.println(frase1.toUpperCase());
        System.out.println(frase1);
        System.out.println(frase1.indexOf("dó"));
        System.out.println(frase1.substring(frase1.indexOf("dó")));

    }
}
