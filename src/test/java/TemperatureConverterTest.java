import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter tempConv = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0, tempConv.fahrenheitToCelsius(32), 0.01);
        assertEquals(100, tempConv.fahrenheitToCelsius(212), 0.01);
        assertEquals(-40, tempConv.fahrenheitToCelsius(-40), 0.01);
        assertEquals(37, tempConv.fahrenheitToCelsius(98.6), 0.01);
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32, tempConv.celsiusToFahrenheit(0), 0.01);
        assertEquals(212, tempConv.celsiusToFahrenheit(100), 0.01);
        assertEquals(-40, tempConv.celsiusToFahrenheit(-40), 0.01);
        assertEquals(98.6, tempConv.celsiusToFahrenheit(37), 0.01);
    }

    @Test
    void kelvinToCelsius() {
        assertEquals(26.85, tempConv.kelvinToCelsius(300), 0.01);
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(tempConv.isExtremeTemperature(-41));
        assertTrue(tempConv.isExtremeTemperature(51));
        assertFalse(tempConv.isExtremeTemperature(-40));
        assertFalse(tempConv.isExtremeTemperature(50));
        assertFalse(tempConv.isExtremeTemperature(20));
    }
}