package com.codurance;

public class RomanNumeralGenerator {

  public String convert(int arabic) {
    if (arabic == 4){
      return "IV";
    }else if (arabic == 5){
      return "V";
    }
    return "I".repeat(arabic);
  }
}
