import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParentesisTest {

    @Test
    void esBalanceado() {
        assertTrue(Parentesis.esBalanceado("[({hola} esto está )] bien"));
        assertTrue(Parentesis.esBalanceado("(esto) también [es{}tá]{(bien)}"));
    }
    @Test
    void noEsBalanceado() {
        assertFalse(Parentesis.esBalanceado("[({hola} esto NO está )] bien("));
        assertFalse(Parentesis.esBalanceado("(esto tampoco [es{}tá]{(bien)}"));
        assertFalse(Parentesis.esBalanceado("(esto tampoco [es{}tá{(bien)}"));
        assertFalse(Parentesis.esBalanceado("(y esto tampoco)("));
    }

}