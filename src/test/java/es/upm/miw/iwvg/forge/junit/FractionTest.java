package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FractionTest {

    private Fraction fraction;
    private Fraction fractionTwo;
    private Fraction fractionThree;

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

    @Test
    void testRestarFraction() {
        this.fraction = new Fraction(5, 5);
        this.fractionTwo = new Fraction(2, 5);
        fractionThree = fraction.restarFraction(fraction, fractionTwo);
        assertEquals(15, fractionThree.getNumerator());
        assertEquals(25, fractionThree.getDenominator());
    }

    @Test
    void testEquivalenFraction(){
        this.fractionTwo = new Fraction(5,625);
        assertEquals(true,fraction.equivalenFractions(fraction, fraction));
        assertEquals(false,fraction.equivalenFractions(fractionTwo, fraction));
    }
}
