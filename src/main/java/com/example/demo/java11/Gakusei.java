package com.example.demo.java11;

public class Gakusei {

  private final Gakuseki gakuseki;
  private final FullName fullName;

  public Gakusei(String gakuseki, String shi, String mei) {
    this.gakuseki = new Gakuseki(gakuseki);
    this.fullName = new FullName(shi, mei);
  }

  public String toPrintableText() {
    return String.format("学籍番号は %s 、氏名は %s %s", gakuseki.getValue(), fullName.getShi(), fullName.getMei());
  }
}

