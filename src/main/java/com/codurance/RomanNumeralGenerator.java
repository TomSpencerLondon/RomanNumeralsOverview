package com.codurance;

public class RomanNumeralGenerator {

  public String convert(int arabic) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < arabic; i++){
      if ( arabic == 4){
        return "IV";
      }else if (arabic == 5){
        return "V";
      }else {
        result.append("I");
      }
    }
    return result.toString();
  }
}
