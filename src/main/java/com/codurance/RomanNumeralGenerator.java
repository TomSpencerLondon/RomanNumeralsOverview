package com.codurance;

public class RomanNumeralGenerator {

  public static String romanFor(int decimal) {
    String roman = "";

    for (int i = 0; i < decimal; ++i){
      roman += "I";
    }

    return roman;
  }
}
