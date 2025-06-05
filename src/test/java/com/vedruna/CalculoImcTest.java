package com.vedruna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoImcTest {

    public void testClasificacionBajoPeso() {
        CalculoImc imc = new CalculoImc();
        imc.clasificacion(17.0); // imprime "Clasificación: Bajo peso"
    }

    @Test
    public void testClasificacionPesoNormal() {
        CalculoImc imc = new CalculoImc();
        imc.clasificacion(22.0); // imprime "Clasificación: Peso normal"
    }

    @Test
    public void testClasificacionSobrepeso() {
        CalculoImc imc = new CalculoImc();
        imc.clasificacion(27.0); // imprime "Clasificación: Sobrepeso"
    }

    @Test
    public void testClasificacionObesidad() {
        CalculoImc imc = new CalculoImc();
        imc.clasificacion(32.0); // imprime "Clasificación: Obesidad"
    }

}