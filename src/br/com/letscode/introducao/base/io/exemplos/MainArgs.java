package br.com.letscode.introducao.base.io.exemplos;

import java.util.Arrays;

/**
 * Para executar passando argumentos utilize:
 * java src/br/com/letscode/introducao/base/io/exemplos/MainArgs.java Oi Tudo bem?
 */

public class MainArgs {

    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
    }
}