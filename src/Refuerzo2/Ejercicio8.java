import java.util.Arrays;

public class Ejercicio8 {

    public static int cualFalta(int[] numeros) {
        if (numeros == null || numeros.length < 2) {
            return -1;
        }
        Arrays.sort(numeros);
        int sumaEsperada = (numeros[numeros.length - 1] * (numeros[numeros.length - 1] + 1)) / 2;
        int sumaReal = 0;
        for (int num : numeros) {
            sumaReal += num;
        }
        if (sumaReal == sumaEsperada) {
            return -1;
        }
        return sumaEsperada - sumaReal;
    }

    public static void main(String[] args) {
        int[] numeros = {4, 3, 6, 2};
        System.out.println(cualFalta(numeros));  // Imprime 5
    }
}
