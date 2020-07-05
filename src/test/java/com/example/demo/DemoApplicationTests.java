package com.example.demo;

import com.example.demo.java11.FullName;
import com.example.demo.java11.Gakuseki;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
class DemoApplicationTests {

  @Test
  void 学部の学籍番号をセットできる() {
    var sut = new Gakuseki("b1992490");
    var actual = sut.getValue();
    assertEquals("b1992490", actual);
  }

  @Test
  void 修士の学籍番号をセットできる() {
    var sut = new Gakuseki("m1992490");
    var actual = sut.getValue();
    assertEquals("m1992490", actual);
  }

  @Test
  void 博士の学籍番号をセットできる() {
    var sut = new Gakuseki("d1992490");
    var actual = sut.getValue();
    assertEquals("d1992490", actual);
  }

  @Test
  void 引数がnullで例外スロー() {
    assertThrows(IllegalArgumentException.class, () -> new Gakuseki(null));
  }

  @Test
  void 頭のアルファベットが異なる学籍番号で例外スロー() {
    assertThrows(IllegalArgumentException.class, () -> new Gakuseki("a1992490"));
  }

  @Test
  void 尻の数字が異なる学籍番号で例外スロー() {
    assertThrows(IllegalArgumentException.class, () -> new Gakuseki("a1992491"));
  }

  @Test

  void 少ない文字数で例外スロー() {
    assertThrows(IllegalArgumentException.class, () -> new Gakuseki("b199249"));
  }

  @Test
  void 多い文字数で例外スロー() {
    assertThrows(IllegalArgumentException.class, () -> new Gakuseki("b19924900"));
  }

  @Test
  void 文字と数字の組合せが異常な場合に例外スロー() {
    assertThrows(IllegalArgumentException.class, () -> new Gakuseki("bb199240"));
  }

  @Test
  void ShiIsNull() {
    assertThrows(IllegalArgumentException.class, () ->new FullName(null, "光"));
  }

  @Test
  void MeiIsNull() {
    assertThrows(IllegalArgumentException.class, () ->new FullName("千歳", null));
  }

}
