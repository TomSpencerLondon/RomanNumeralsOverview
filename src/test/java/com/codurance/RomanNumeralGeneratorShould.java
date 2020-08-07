package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanNumeralGeneratorShould {

  @Test
  void return_I_for_1() {
    RomanNumeralGenerator romanNumeral = new RomanNumeralGenerator();
    assertEquals("I", romanNumeral.convert(1));
  }
}
