package com.codurance;

import java.util.Map;
import org.junit.jupiter.params.ParameterizedTest;

public class RomanNumeralGenerator {
  private static Map<Character, Integer> romans = Map.of(
      'I', 1,
      'V', 5,
      'X', 10,
      'L', 50,
      'C', 100,
      'D', 500,
      'M', 1000
  );


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

  public static int arabicFor(String roman){
    int arabic = romans.get(roman.charAt(roman.length() - 1));

    for (int i = roman.length() - 2; i >= 0; i--){
      if (romans.get(roman.charAt(i)) < romans.get(roman.charAt(i + 1))){
        arabic -= romans.get(roman.charAt(i));
      }else {
        arabic += romans.get(roman.charAt(i));
      }
    }

    return arabic;
  }

  enum RomanToDecimal {
    THOUSAND("M", 1000),
    NINE_HUNDRED("CM", 900),
    FIVE_HUNDRED("D", 500),
    FOUR_HUNDRED("CD", 400),
    HUNDRED("C", 100),
    NINETY("XC", 90),
    FIFTY("L", 50),
    FORTY("XL", 40),
    TEN("X", 10),
    NINE("IX", 9),
    FIVE("V", 5),
    FOUR("IV", 4),
    ONE("I", 1);

    private final String roman;
    private final int decimal;

    RomanToDecimal(String roman, int decimal) {
      this.roman = roman;
      this.decimal = decimal;
    }
  }
}
