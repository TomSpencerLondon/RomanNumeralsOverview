package com.codurance;

public class RomanNumeralGenerator {

  public String convert(int arabic) {
    if (arabic == 4){
      return "IV";
    }
    return "I".repeat(arabic);
  }
}
