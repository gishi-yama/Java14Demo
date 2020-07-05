package com.example.demo.java14;

import java.util.Optional;

public record FullName14(String shi, String mei) {
  private static final int MAX_LENGTH = 4;

  public FullName14(String shi, String mei) {
    this.shi = Optional.ofNullable(shi)
      .filter(this::checkLength)
      .orElseThrow(() -> new IllegalArgumentException("学籍番号のルールを守っていない"));
    this.mei = Optional.ofNullable(mei)
      .filter(this::checkLength)
      .orElseThrow(() -> new IllegalArgumentException("学籍番号のルールを守っていない"));
  }

  boolean checkLength(String arg) {
    return arg.length() <= MAX_LENGTH;
  }

}
