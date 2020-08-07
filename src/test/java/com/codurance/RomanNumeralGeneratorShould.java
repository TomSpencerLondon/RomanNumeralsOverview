package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralGeneratorShould {

  @Test
  void return_I_for_1() {
    RomanNumeralGenerator romanNumeral = new RomanNumeralGenerator();
    assertEquals("I", romanNumeral.convert(1));
  }

  @Test
  void return_II_for_2() {
    RomanNumeralGenerator romanNumeral = new RomanNumeralGenerator();
    assertEquals("II", romanNumeral.convert(2));
  }
}
