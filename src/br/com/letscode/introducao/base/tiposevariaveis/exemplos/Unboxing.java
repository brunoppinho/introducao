package br.com.letscode.introducao.base.tiposevariaveis.exemplos;

public class Unboxing {

    public static void main(String[] args) {

        // Autoboxing
        Integer integer = 9;
        System.out.println(integer);

        // Unboxing
        int in = 0;
        System.out.println(in);
        in = new Integer(9);
        System.out.println(in);

        Integer fistInt = new Integer(1);
        Integer secondInt = new Integer(1);

        System.out.println(fistInt == secondInt);
        System.out.println(fistInt.compareTo(secondInt) == 0);
        System.out.println(fistInt.compareTo(1) == 0);
        System.out.println(fistInt.compareTo(2) == 0);

        // toString é redundante, pois ele é sempre chamado nesse caso
        System.out.println(fistInt.toString());
    }
}
