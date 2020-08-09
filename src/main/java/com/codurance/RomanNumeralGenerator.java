package com.codurance;

public class RomanNumeralGenerator {

  public static String romanFor(int decimal) {
    String roman = "";

    for (RomanToDecimal romanToDecimal : RomanToDecimal.values()) {
      while (decimal >= romanToDecimal.decimal) {
        roman += romanToDecimal.roman;
        decimal -= romanToDecimal.decimal;
      }
    }

    return roman;
  }

  enum RomanToDecimal {
    TEN("X", 10),
    FIVE("V", 5),
    ONE("I", 1);

    private final String roman;
    private final int decimal;

    RomanToDecimal(String roman, int decimal) {
      this.roman = roman;
      this.decimal = decimal;
    }
  }
}
