package com.codurance;

import static com.codurance.RomanNumeralGenerator.arabicFor;
import static com.codurance.RomanNumeralGenerator.romanFor;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralGeneratorShould {

  @Test
  void generate_a_roman_numeral_for_a_given_decimal_number() {
    assertEquals("I", romanFor(1));
    assertEquals("II", romanFor(2));
    assertEquals("III", romanFor(3));
    assertEquals("IV", romanFor(4));
    assertEquals("V", romanFor(5));
    assertEquals("VII", romanFor(7));
    assertEquals("IX", romanFor(9));
    assertEquals("X", romanFor(10));
    assertEquals("XVIII", romanFor(18));
    assertEquals("XXX", romanFor(30));
    assertEquals("MCMXCIV", romanFor(1994));
    assertEquals("MMMCDXCIX", romanFor(3499));
  }

  @Test
  void generate_arabic_for_a_given_roman_numeral() {
    assertEquals(1, arabicFor("I"));
    assertEquals(2, arabicFor("II"));
    assertEquals(3, arabicFor("III"));
    assertEquals(4, arabicFor("IV"));
    assertEquals(5, arabicFor("V"));
    assertEquals(7, arabicFor("VII"));
    assertEquals(9, arabicFor("IX"));
    assertEquals(10, arabicFor("X"));
    assertEquals(18, arabicFor("XVIII"));
    assertEquals(30, arabicFor("XXX"));
    assertEquals(1994, arabicFor("MCMXCIV"));
    assertEquals(3499, arabicFor("MMMCDXCIX"));
  }
}
