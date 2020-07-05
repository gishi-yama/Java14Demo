package com.example.demo.java14;

public record Gakusei14(Gakuseki14 gakuseki, FullName14 fullName) {
  public Gakusei14(String gakuseki, String shi, String mei) {
    this(new Gakuseki14(gakuseki), new FullName14(shi, mei));
  }

  public String toPrintableText() {
    return String.format("学籍番号は %s 、氏名は %s %s", gakuseki.value(), fullName.shi(), fullName.mei());
  }
}
