package br.com.letscode.introducao.tiposevariaveis.exemplos;

/**
 * Mostrar limite dos valores com compilador reclamando caso valor esteja acima ou errado
 * <p>
 * INTEIROS:
 * byte (1 byte): -128 a 127
 * short (2 bytes): -32.768 a 32.767
 * int (4 bytes): -2.147.483.648 a 2.147.483.647
 * long (8 bytes): -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
 * <p>
 * PONTO FLUTUANTE:
 * float (4 bytes): aprox. +- 3.40282347E+38F (6-7 dígitos decimais significativos)
 * double (8 bytes): aprox. +- 1.797691313486231570E+308 (15 dígitos decimais significativos)
 * <p>
 * NÃO NUMÉRICOS:
 * char (2bytes): '\u0000' a '\uffff'
 * boolean (1 bit): true or false
 */
public class ValoresPadraoPrimitivos {

    static byte varByte;
    static short varShort;
    static int varInt;
    static long varLong;
    static float varFloat;
    static double varDouble;
    static char varChar;
    static boolean varBoolean;

    public static void main(String[] args) {

        System.out.println(varByte);
        System.out.println(varShort);
        System.out.println(varInt);
        System.out.println(varLong);
        System.out.println(varFloat);
        System.out.println(varDouble);
        System.out.println(varChar);
        System.out.println(varBoolean);

    }
}
