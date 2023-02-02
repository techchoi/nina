package com.example.nina.controller;

import com.example.nina.controller.dto.RespostaDto;
import com.example.nina.controller.dto.ValoresDeEntradaDto;
import com.example.nina.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculadoraController {

    @Autowired
    CalculadoraService calculadoraService;

    @RequestMapping(value = "/nina/imprimir", method = RequestMethod.GET)
    public String imprimir() {
     return "teste";
    }

    @RequestMapping(value = "/nina/soma/{num1}/{num2}", method = RequestMethod.GET)
    public Integer soma(@PathVariable(value = "num1") Integer num1,
                        @PathVariable(value = "num2") Integer num2){
        return calculadoraService.soma(num1,num2);
    }

    @RequestMapping (value = "/nina/soma", method = RequestMethod.POST)
    public RespostaDto somaPost(@RequestBody ValoresDeEntradaDto dto){
        Integer resposta = calculadoraService.soma(dto.getNumero1(), dto.getNumero2());
        return criaRespostaDto(resposta);
    }

    @RequestMapping(value = "/nina/subtracao/{num1}/{num2}", method = RequestMethod.GET)
    public Integer subtracao(@PathVariable(value = "num1") Integer num1,
                             @PathVariable(value = "num2") Integer num2){
        return calculadoraService.subtração(num1,num2);
    }

    @RequestMapping (value = "/nina/subtracao", method = RequestMethod.POST)
    public RespostaDto subtracaoPost(@RequestBody ValoresDeEntradaDto dto){
        Integer resposta = calculadoraService.subtração(dto.getNumero1(), dto.getNumero2());
        return criaRespostaDto(resposta);
    }

    @RequestMapping(value = "/nina/divisao/{num1}/{num2}", method = RequestMethod.GET)
    public Integer divisao(@PathVariable(value= "num1") Integer num1,
                           @PathVariable(value = "num2") Integer num2){
        return calculadoraService.divissao(num1,num2);
    }

    @RequestMapping (value = "/nina/divisao", method = RequestMethod.POST)
    public RespostaDto divisaoPost(@RequestBody ValoresDeEntradaDto dto){
        Integer resposta = calculadoraService.divissao(dto.getNumero1(), dto.getNumero2());
        return criaRespostaDto(resposta);
    }

    @RequestMapping(value = "/nina/multiplicacao/{num1}/{num2}", method = RequestMethod.GET)
    public Integer multiplicacao(@PathVariable(value = "num1") Integer num1,
                                 @PathVariable(value = "num2") Integer num2){
        return calculadoraService.multiplicacao(num1, num2);
    }

    @RequestMapping (value = "/nina/multiplicacao", method = RequestMethod.POST)
    public RespostaDto multiplicacaoPost(@RequestBody ValoresDeEntradaDto dto){
        Integer resposta = calculadoraService.multiplicacao(dto.getNumero1(), dto.getNumero2());
        return criaRespostaDto(resposta);
    }

    public RespostaDto criaRespostaDto(Integer resposta){
        return new RespostaDto(resposta);
    }






}
