package com.codurance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RomanNumeralGeneratorShould {

  private RomanNumeralGenerator romanNumeral;

  @BeforeEach
  void setUp() {
    romanNumeral = new RomanNumeralGenerator();
  }

  @ParameterizedTest
  @CsvSource({
      "1, I",
      "2, II",
      "3, III"
  })
  void return_I_for_1(int arabic, String roman) {
    assertEquals(roman, romanNumeral.convert(arabic));
  }

  @Test
  void return_IV_for_4() {
    assertEquals("IV", romanNumeral.convert(4));
  }

  @Test
  void return_V_for_5() {
    assertEquals("V", romanNumeral.convert(5));
  }
}
