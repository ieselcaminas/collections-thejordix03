import java.util.*;

public class Aritmetica {
    public static String pila(String expresion) {
        return calcular(expresion);
    }

    public static String cola(String expresion) {
        return calcular(expresion);
    }

    private static boolean esNumero(String cadena) {
        return Character.isDigit(cadena.charAt(0));
    }
    private static String calcular(String expresion) {
        String terminos[] = expresion.split(" ");
        Integer numero;
        Stack<Integer> pila = new Stack<>();
        for (String termino : terminos) {
            if (esNumero(termino)) {
                pila.push(Integer.parseInt(termino));
            } else {
                if (pila.size() < 2) {
                    return "ERROR";
                }
                int b = pila.pop();
                int a = pila.pop();
                switch (termino) {
                    case "+":
                        pila.push(a + b);
                        break;
                    case "-":
                        pila.push(a - b);
                        break;
                    case "*":
                        pila.push(a * b);
                        break;
                    case "/":
                        if (b == 0) {
                            return "ERROR";
                        }
                        pila.push(a / b);
                        break;
                }
            }
        }
        return String.valueOf(pila.pop());
    }

    public static void main(String[] args) {
        System.out.println(pila("5 1 2 + 4 * + 3 -")); // "14"
        System.out.println(pila("2 4 5 3 / * +")); // "6"
        System.out.println(pila("6")); // "6"
        System.out.println(pila("3 5 4 + *")); // "27"
        System.out.println(pila("8 1 1 - /")); // "ERROR"
        System.out.println(pila("1 1 - 8 /")); // "0"
        System.out.println(pila("0 0 /")); // "ERROR"

        System.out.println(cola("2 4 5 3 / * +"));
        System.out.println(cola("0 0 /"));
    }
}