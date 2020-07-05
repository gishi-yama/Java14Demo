package com.example.demo;

import com.example.demo.java11.Gakusei;
import com.example.demo.java14.Gakusei14;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

  @GetMapping("test")
  public String getTest(Model model) {
    return "testForm";
  }

  @PostMapping("test")
  @ResponseBody
  public String postTest(String gakuseki, String shi, String mei, Model model) {
    try {
      Gakusei someOne = new Gakusei(gakuseki, shi, mei);
      return someOne.toPrintableText();
    } catch (RuntimeException e) {
      return e.getMessage();
    }
  }

  @PostMapping("test14")
  @ResponseBody
  public String postTest14(String gakuseki, String shi, String mei, Model model) {
    try {
      Gakusei14 someOne = new Gakusei14(gakuseki, shi, mei);
      return someOne.toPrintableText();
    } catch (RuntimeException e) {
      return e.getMessage();
    }
  }
}
