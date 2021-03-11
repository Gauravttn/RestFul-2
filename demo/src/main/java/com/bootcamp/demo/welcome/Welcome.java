package com.bootcamp.demo.welcome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class Welcome {
    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/welcome")
    public String welcome1(){
        return "Welcome to spring boot";
    }

    @GetMapping(path = "welcome/i")
    public String welcome(@RequestHeader("Accept-Language") Locale locale){
        return messageSource.getMessage("welcome.message",null,locale);
    }

    
    @GetMapping(path = "welcomeUser")
    public String welcomeUser(@RequestHeader("Accept-Language") Locale locale, @RequestParam String userName){
        String string = messageSource.getMessage("welcome.message",null,locale)+" "+userName;
		return string;
    }
//    @GetMapping(path = "/welcome-bean")
//    public WelcomeBean welcomeBean(){
//        return new WelcomeBean("Welcome to spring boot");
//    }
//
//    @GetMapping(path = "/welcome-bean/{name}")
//    public WelcomeBean welcomeBeanpath(@PathVariable  String name){
//        return new WelcomeBean("Welcome to spring boot"+name);
//    }







}
