package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class DoctorController {

    @GetMapping("/doctor")
    //@RequestMapping(value = "/doctor", method = RequestMethod.POST)

    public String doctor(Model mydoctor,
    @RequestParam(defaultValue = "John Smith") String name,
    @RequestParam(defaultValue = "0") int number) {
      //if name or number are not provided in form, defaults are John Smith and zero
      String doctorname = name;
      mydoctor.addAttribute("name", doctorname);
      int doctornumber = number;
      mydoctor.addAttribute("number", doctornumber);
      return "doctor";
    }
}
