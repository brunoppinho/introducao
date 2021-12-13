package br.com.letscode.introducao.base.operadores.exercicios;

public class TernarioPlusPlus {

    public static void main(String[] args) {

        int i = 0;

        System.out.println("0 == " + i);
        System.out.println(i++ == 1 ? "1 == " + i : "1 != " + i);
        System.out.println(++i == 2 ? "2 == " + i : "2 != " + i);

    }
}
