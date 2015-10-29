package com.sample.web;

import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Date;


@SpringBootApplication
@Controller
public class Example {

    @RequestMapping
    public String home() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String form(@ModelAttribute("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result.toString()); // prints 1 error
        }
        System.out.println(date); // prints correctly parsed date

        return "home";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}