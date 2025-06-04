package com.vedruna;

import java.util.Scanner;

public class CalculoImc {

    public double calculo() {
        Scanner scanner = new Scanner(System.in);

        // El usuario introduce su peso y su altura
        System.out.print("Ingrese su peso en kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Formula para calcular el Indice de masa corporal
        double imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);

        return imc;

    }

    public void clasificacion(double imc) {

        // Diferentes clasificaciones para saber si el peso esta por encima, por debajo o en lo normal.

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
