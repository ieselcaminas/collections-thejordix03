import java.util.*;
public class Aritmetica {

    public static String pila(String expresion) {
        Stack<Integer> pila = new Stack<>();
        String[] tokens = expresion.split(" ");

        try {
            for (String token : tokens) {
                if (esOperador(token)) {
                    if (pila.size() < 2) return "ERROR";
                    int b = pila.pop(); // Segundo operando
                    int a = pila.pop(); // Primer operando

                    pila.push(calcular(a, b, token));
                } else {
                    pila.push(Integer.parseInt(token));
                }
            }
            if (pila.size() != 1) return "ERROR";

            return String.valueOf(pila.pop());
        } catch (ArithmeticException e) {
            return "ERROR";
        }
    }
    public static String cola(String expresion) {

        Queue<Integer> cola = new LinkedList<>();
        String[] tokens = expresion.split(" ");

        try {
            for (String token : tokens) {
                if (esOperador(token)) {
                    if (cola.size() < 2) return "ERROR";
                    int a = cola.poll();
                    int b = cola.poll();
                    cola.offer(calcular(a, b, token));
                } else {
                    cola.offer(Integer.parseInt(token));
                }
            }
            if (cola.size() != 1) return "ERROR";
            return String.valueOf(cola.poll());
        } catch (ArithmeticException e) {
            return "ERROR";
        }
    }

    private static boolean esOperador(String token) {
        return "+-*/".contains(token);
    }

    private static int calcular(int a, int b, String operador) {
        switch (operador) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }

    public static void main(String[] args) {
        System.out.println(pila("5 1 2 + 4 * + 3 -")); // "14"
        System.out.println(pila("2 4 5 3 / * +")); // "6"
        System.out.println(pila("6")); // "6"
        System.out.println(pila("3 5 4 + *")); // "27"
        System.out.println(pila("8 1 1 - /")); // "ERROR"
        System.out.println(pila("1 1 - 8 /")); // "0"
        System.out.println(pila("0 0 /")); // "ERROR"
        System.out.println(cola("2 4 5 3 / * +")); // "17"
        System.out.println(cola("6")); // "6"
        System.out.println(cola("8 1 1 - /")); // "-7"
        System.out.println(cola("1 1 - 8 /")); // "ERROR"
        System.out.println(cola("0 0 /")); // "ERROR"
    }
}
