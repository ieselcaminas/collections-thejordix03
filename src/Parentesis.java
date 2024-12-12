import java.util.Stack;

public class Parentesis {

    public static boolean esBalanceado(String cadena) {
        char caracter;
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);

            if (caracter == '{' || caracter == '[' || caracter == '(') {
                pila.push(caracter);
            } else if (caracter == ')') {
                if (pila.isEmpty() || pila.pop() != '(') {
                    return false;
                }
            } else if (caracter == ']') {
                if (pila.isEmpty() || pila.pop() != '[') {
                    return false;
                }
            } else if (caracter == '}') {
                if (pila.isEmpty() || pila.pop() != '{') {
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(esBalanceado("{([()])}")); // true
        System.out.println(esBalanceado("{([]})")); // false
    }
}
