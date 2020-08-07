package com.codurance;

import java.util.Map;

public class RomanNumeralGenerator {

  public String convert(int arabic) {
    StringBuilder result = new StringBuilder();

    Map<Integer, String> numerals = Map.of(5, "V", 4, "IV", 1, "I");

    for (Integer number : numerals.keySet()){
      while(arabic >= number){
        result.append(numerals.get(number));
        arabic -= number;
      }
    }
    return result.toString();
  }
}
