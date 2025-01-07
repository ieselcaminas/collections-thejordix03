package Refuerzo2;

import java.util.Arrays;

public class Ejercicio5 {

    public static double mediana(int numeros[]) {
        Arrays.sort(numeros);

        int n = numeros.length;
        if (n % 2 == 1) {
            return numeros[n / 2];
        }
        else {
            int centro1 = numeros[(n / 2) - 1];
            int centro2 = numeros[n / 2];
            return (centro1 + centro2) / 2.0;
        }
    }

    public static void main(String[] args) {
        System.out.println(mediana(new int[]{3, 1, 4, 2, 5})); //3.0
        System.out.println(mediana(new int[]{3, 1, 4, 2, 5, 6})); //3.5
    }
}

