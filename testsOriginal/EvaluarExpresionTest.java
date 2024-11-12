import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluarExpresionTest {

    @Test
    void evaluarExpresionTest() {
        assertEquals("14", EvaluarExpresion.evaluarExpresion("5 1 2 + 4 * + 3 -"));
        assertEquals("6", EvaluarExpresion.evaluarExpresion("2 4 5 3 / * +"));
        assertEquals("6", EvaluarExpresion.evaluarExpresion("6"));
        assertEquals("27", EvaluarExpresion.evaluarExpresion("3 5 4 + *"));
        assertEquals("ERROR", EvaluarExpresion.evaluarExpresion("8 1 1 - /"));
        assertEquals("0", EvaluarExpresion.evaluarExpresion("1 1 - 8 /"));
    }
}