package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RomanNumeralGeneratorShould {

  private RomanNumeralGenerator romanNumeral;

  @BeforeEach
  void setUp() {
    romanNumeral = new RomanNumeralGenerator();
  }

  @Test
  void return_I_for_1() {
    assertEquals("I", romanNumeral.convert(1));
  }

  @Test
  void return_II_for_2() {
    assertEquals("II", romanNumeral.convert(2));
  }

  @Test
  void return_III_for_3() {
    assertEquals("III", romanNumeral.convert(3));
  }

  @Test
  void return_IV_for_4() {
    assertEquals("IV", romanNumeral.convert(4));
  }
}
