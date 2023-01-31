package com.example.nina.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @RequestMapping(value = "/nina/imprimir", method = RequestMethod.GET)
    public String imprimir() {
     return "teste";
    }

    @RequestMapping(value = "/nina/soma/{num1}/{num2}", method = RequestMethod.GET)
    public Integer soma(@PathVariable(value = "num1") Integer num1,
                        @PathVariable(value = "num2") Integer num2){
        return num1 + num2;
    }

    @RequestMapping(value = "/nina/subtracao/{num1}/{num2}", method = RequestMethod.GET)
    public Integer subtracao(@PathVariable(value = "num1") Integer num1,
                             @PathVariable(value = "num2") Integer num2){
        return  num1 - num2;
    }

    @RequestMapping(value = "/nina/divisao/{num1}/{num2}", method = RequestMethod.GET)
    public Integer divisao(@PathVariable(value= "num1") Integer num1,
                           @PathVariable(value = "num2") Integer num2){
        return num1 / num2;
    }

    @RequestMapping(value = "/nina/multiplicacao/{num1}/{num2}", method = RequestMethod.GET)
    public Integer multiplicacao(@PathVariable(value = "num1") Integer num1,
                                 @PathVariable(value = "num2") Integer num2){
        return num1 * num2;
    }






}