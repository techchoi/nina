package com.example.nina.controller.dto;

import java.io.Serializable;

public class ValoresDeEntradaDto implements Serializable {
    Integer numero1;
    Integer numero2;

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }
}
