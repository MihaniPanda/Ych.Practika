package com.example.calculator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//test commit
@Controller
public class CalcController {
    @GetMapping("/")
    public String greeting(Model model) {
        return "Main";
    }
    @PostMapping("/res")
    public String PostRes(@RequestParam(value = "Pervoe",  required = false, defaultValue = "1")String a
            ,@RequestParam(value = "Znak",  required = false, defaultValue = "2") String b
            ,@RequestParam(value = "Vtoroe",  required = false, defaultValue = "3") String c, Model model) {
        double itog;
        String Resault = "Что-то сделали не так";
        try {
            if (b.equals("+")) {
                itog = Double.parseDouble(a) + Double.parseDouble(c);
                model.addAttribute("itogi", itog);
            }
            if (b.equals("-")) {
                itog = Double.parseDouble(a) - Double.parseDouble(c);
                model.addAttribute("itogi", itog);
            }
            if (b.equals("*")) {
                itog = Double.parseDouble(a) * Double.parseDouble(c);
                model.addAttribute("itogi", itog);
            }
            if (b.equals("/") && !c.equals("0")) {
                itog = Double.parseDouble(a) / Double.parseDouble(c);
                model.addAttribute("itogi", itog);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("itogi", Resault);
        }
        return "Result";
    }
    @GetMapping("/Mainn")
    public String GetRes(@RequestParam(value = "Pervoe",  required = false, defaultValue = "1")
                             String a,@RequestParam(value = "Znak",  required = false, defaultValue = "2")
    String b,@RequestParam(value = "Vtoroe",  required = false, defaultValue = "3")
    String c, Model model) {
        double itog;
        String Resault = "Что-то сделали не так";
        try {
            if (b.equals("+")) {
                itog = Double.parseDouble(a) + Double.parseDouble(c);
                model.addAttribute("itogi", itog);
            }
            if (b.equals("-")) {
                itog = Double.parseDouble(a) - Double.parseDouble(c);
                model.addAttribute("itogi", itog);
            }
            if (b.equals("*")) {
                itog = Double.parseDouble(a) * Double.parseDouble(c);
                model.addAttribute("itogi", itog);
            }
            if (b.equals("/") && !c.equals("0")) {
                itog = Double.parseDouble(a) / Double.parseDouble(c);
                model.addAttribute("itogi", itog);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("itogi", Resault);
        }
        return "Mainn";
    }
}


