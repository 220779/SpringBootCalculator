package com.example.springbootcalculator.controller;

import com.example.springbootcalculator.entity.Operations;
import com.example.springbootcalculator.service.CalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.swing.text.html.parser.Entity;

@Controller
public class CalculatorController {

    Operations operation = new Operations();

    @Autowired
    private CalculateService calculate;

    @RequestMapping("/calculator")
    public String getCalculatorPage(Model model) {
        model.addAttribute("operation", operation);
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operation") Operations operation, Model model) {
        model.addAttribute("result", calculate.adding(operation));
        return "calculator";
    }

    @RequestMapping(value = "/calculator", params = "subtrack", method = RequestMethod.POST)
    public String subtrack (@ModelAttribute("operation") Operations operation, Model model) {
        model.addAttribute("result", calculate.subtrack(operation));
        return "calculator";
    }

//
    @RequestMapping(value = "/calculator", params = "multiple", method = RequestMethod.POST)
    public String multiple(@ModelAttribute("operation") Operations operation, Model model) {
        model.addAttribute("result", calculate.multiple(operation));
        return "result";
    }

    @RequestMapping(value = "/calculator", params = "divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operation") Operations operation, Model model) {
        model.addAttribute("result", calculate.divide(operation));
        return "calculator";
    }

   @RequestMapping(value = "/calculator", params = "clear", method = RequestMethod.POST)
   public String clear(@ModelAttribute("operation") Operations operation, Model model) {
      model.addAttribute("operation", calculate.clear(operation));
      model.addAttribute("result", 0);
      return "calculator";
   }


}
