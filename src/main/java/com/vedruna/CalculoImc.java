package com.vedruna;

import java.util.Scanner;

public class CalculoImc {

    public void calculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        if (imc < 18.5) {
            System.out.println("Clasificación: Bajo peso");
        } else if (imc < 24.9) {
            System.out.println("Clasificación: Peso normal");
        } else if (imc < 29.9) {
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
    }


}
