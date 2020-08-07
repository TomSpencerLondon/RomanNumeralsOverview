package com.codurance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumeralGenerator {

  public String convert(int arabic) {
    StringBuilder result = new StringBuilder();

    SortedMap<Integer, String> numerals = new TreeMap<>();

    numerals.put(1, "I");
    numerals.put(4, "IV");
    numerals.put(5, "V");
    List<Integer> nums = new ArrayList<>(numerals.keySet());
    Collections.reverse(nums);

    for (Integer number : nums){
      while(arabic >= number){
        result.append(numerals.get(number));
        arabic -= number;
      }
    }
    return result.toString();
  }
}
