package com.vedruna;

public class Main {
    public static void main(String[] args) {

        CalculoImc calc = new CalculoImc();
        double imc = calc.calculo();
        calc.clasificacion(imc);

    }
}