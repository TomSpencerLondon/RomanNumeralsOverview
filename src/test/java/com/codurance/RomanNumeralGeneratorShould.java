package com.codurance;

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
}
