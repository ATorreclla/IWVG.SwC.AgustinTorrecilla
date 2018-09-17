package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        this.fraction = new Fraction(625, 5);
    }

    @Test
    void testDecimal() {
        assertEquals(125, this.fraction.decimal(), 10e-5);
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, this.fraction.getNumerator());
        assertEquals(1, this.fraction.getDenominator());
    }

    @Test
    void testFractionIntInt() {
        assertEquals(625, this.fraction.getNumerator());
        assertEquals(5, this.fraction.getDenominator());
    }
}
