package Refuerzo2;

public class Ejercicio3 {

    public static String sumadigitos(String digitos) {
        int suma = 0;
        String resultado = ""; // Cadena para construir los sumandos

        for (int i = 0; i < digitos.length(); i++) {
            int num = Integer.parseInt("" + digitos.charAt(i)); // Convierte cada dígito en entero
            suma += num;

            if (i > 0) {
                resultado += " + ";
            }
            resultado += num;
        }

        resultado += " = " + suma;

        return resultado;
    }

    public static void main(String[] args) {
        String digitos = "3433";
        System.out.println(sumadigitos(digitos));
    }
}
