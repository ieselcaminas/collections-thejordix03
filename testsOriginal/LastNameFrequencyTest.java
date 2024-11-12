import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LastNameFrequencyTest {

    @Test
    void generate() throws IOException {
        assertEquals(723, LastNameFrequency.frequency().get("PONZ"));
        assertEquals(840420, LastNameFrequency.frequency().get("MARTINEZ"));
        assertEquals(199925, LastNameFrequency.frequency().get("ALONSO"));
    }
}