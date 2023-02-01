package com.example.nina.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public Integer soma(Integer num1, Integer num2){
        return num1 + num2;
    }

    public Integer subtração(Integer num1, Integer num2){
        return num1 - num2;
    }

    public Integer divissao(Integer num1, Integer num2){
        return num1 / num2;
    }

    public Integer multiplicacao(Integer num1, Integer num2){
        return num1 * num2;
    }

}
