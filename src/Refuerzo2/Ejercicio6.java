package Refuerzo2;

public class Ejercicio6 {

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
    public static boolean esHyperpar(int num) {
        if (!esPar(num)) {
            return false;
        }
        while (num > 0) {
            int digito = num % 10; // Extraer el último dígito
            if (!esPar(digito)) {  // Si el dígito no es par
                return false;
            }
            num /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(esHyperpar(2408)); // true
        System.out.println(esHyperpar(4618)); // false
        System.out.println(esHyperpar(1357)); // false (el número completo es impar)
        System.out.println(esHyperpar(2222)); // true
    }
}
