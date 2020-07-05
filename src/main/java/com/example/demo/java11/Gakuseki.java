package com.example.demo.java11;

import java.util.regex.Pattern;

public class Gakuseki {
  private static final String gakusekiRule = "^[bmd]\\d{6}0$";

  private final String value;

  public Gakuseki(String value) {
    if (value == null) {
      throw new IllegalArgumentException("学籍番号に値が渡されていない");
    }
    if (!Pattern.matches(gakusekiRule, value)) {
      throw new IllegalArgumentException("学籍番号のルールを守っていない");
    }
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
