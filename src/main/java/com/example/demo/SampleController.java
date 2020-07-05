package com.example.demo;

import com.example.demo.java11.Gakusei;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

  // デバッグモードの便利さを体験する為だけのfizzコード.
  // 今回、model引数は使っていないので無視して良い
  @GetMapping("fizz")
  @ResponseBody
  public String getFizz(Model model) {
    String ans = "";
    for (int i = 1; i < 20; i++) {
      if (i % 3 == 0) {
        ans = ans + "fizz, ";
      } else {
        ans = ans + i + ", ";
      }
    }
    return ans;
  }

  // ブラウザで http://localhost:8080/test にアクセスしたときの処理
  // 今回、model引数は使っていないので無視して良い
  @GetMapping("test")
  public String getTest(Model model) {
    return "testForm";
  }

  // ブラウザ画面で送信ボタンを押したときの処理
  // 今回、model引数は使っていないので無視して良い
  @PostMapping("test")
  @ResponseBody
  public String postTest(String gakuseki, String shi, String mei, Model model) {
    try {
      // ブラウザ画面から送信された 学籍番号 、氏 、名 を 学生 という構造で管理して（Gakuseki someOne = ...の部分）、
      // 管理した情報を画面で表示したい（ return someOne.toPrintable. ...の部分）
      // あなたならクラスをどのように構成し、インスタンス化するか？
      Gakusei someOne = new Gakusei();
      return someOne.toPrintableText();
    } catch (RuntimeException e) {
      return e.getMessage();
    }
  }
}
