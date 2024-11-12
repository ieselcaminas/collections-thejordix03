import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CountCountriesTest {

    @Test
    void countCountriesFrancia() throws IOException {
        assertEquals(94, CountCountries.countCountries().get("España"));
    }

    @Test
    void countCountriesEspanya() throws IOException {
        assertEquals(161, CountCountries.countCountries().get("Francia"));
    }

    @Test
    void countCountriesSpain() throws IOException {
        assertEquals(-1, CountCountries.countCountries().getOrDefault("Spain", -1));
    }

}