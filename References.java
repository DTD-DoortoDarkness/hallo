package de.hhu.edu;

public class References {

    private static void swap(int number1, int number2) {
        int oldNumber1 = number1;
        number1 = number2;
        number2 = oldNumber1;
    }

    private static void swap(int[] array) {
        int oldFirstElement = array[0];
        array[0] = array[1];
        array[1] = oldFirstElement;
    }

    private static void swap(int[] array1, int[] array2) {
        int[] oldArray1 = array1;
        array1 = array2;
        array2 = oldArray1;
    }

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        swap(n1, n2);

        System.out.println(n1); // Ausgabe:
        System.out.println(n2); // Ausgabe:
        /*
        Begründung:


         */

        int[] v1 = {1, 2};

        swap(v1);

        System.out.println(v1[0]); // Ausgabe:
        /*
        Begründung:


         */

        int[] v2 = {1, 2};
        int[] v3 = {3, 4};

        swap(v2, v3);

        System.out.println(v2[0]); // Ausgabe:
        System.out.println(v3[0]); // Ausgabe:
        /*
        Begründung:


         */
    }
}
