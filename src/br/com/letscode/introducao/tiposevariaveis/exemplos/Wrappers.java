package br.com.letscode.introducao.tiposevariaveis.exemplos;

/**
 * Transformam os tipos primitivos em classes adicionando funcionalidades a elas, além de armazenar o valor primitivo
 *
 * Padrão de projeto decorator — Envolve a adiciona funcionalidade
 */
public class Wrappers {

    static Byte varByte;
    static Short varShort;
    static Integer varInt;
    static Long varLong;
    static Float varFloat;
    static Double varDouble;
    static String string;
    static Boolean varBoolean;

    public static void main(String[] args) {

        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(varFloat);
        System.out.println(varDouble);
        System.out.println(string);
        System.out.println(varBoolean);

        System.out.println("1" + "1");
        System.out.println(Double.parseDouble("1") + Double.parseDouble("1"));

    }
}
