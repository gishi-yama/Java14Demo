package com.example.demo.java11;

public class Gakusei {

  public String toPrintableText() {
    // 学籍番号は b1992490 、氏名は 千歳 光 のように返したい。
    return String.format("学籍番号は %s 、氏名は %s %s", "不明", "不明", "不明");
  }
}

