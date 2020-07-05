package com.example.demo.java11;

public class FullName {

  private static final int MAX_LENGTH = 4;

  private final String shi;
  private final String mei;

  public FullName(String shi, String mei) {
    if (checkSize(shi)) {
      throw new IllegalArgumentException("氏が空、もしくは4文字より大きい");
    }
    if (checkSize(mei)) {
      throw new IllegalArgumentException("名が空、もしくは4文字より大きい");
    }
    this.shi = shi;
    this.mei = mei;
  }

  private boolean checkSize(String str) {
    return str != null && str.length() <= MAX_LENGTH;
  }


  public String getShi() {
    return shi;
  }

  public String getMei() {
    return mei;
  }
}
