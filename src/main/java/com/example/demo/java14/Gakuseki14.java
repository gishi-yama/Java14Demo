package com.example.demo.java14;

import java.util.Optional;
import java.util.regex.Pattern;

public record Gakuseki14(String value) {
  private static final String gakusekiRule = "^[bmd]\\d{6}0$";

  public Gakuseki14(String value) {
    this.value = Optional.ofNullable(value)
      .filter(v -> Pattern.matches(gakusekiRule, v))
      .orElseThrow(() -> new IllegalArgumentException("学籍番号のルールを守っていない"));
  }
}