package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
// aqui esta 
import gt.edu.umes.proy.calculo.LogicaDelNegocio;

class CalculoSegundosTest {

    // Prueba 1: un parámetro con letras debe lanzar excepción
    @Test
    void detectaParametroQueNoEsEntero() {
        LogicaDelNegocio logica = new LogicaDelNegocio();
        String[] parametros = {"1", "3", "a", "20", "1"};
        assertThrows(IllegalArgumentException.class, () -> logica.calcular(parametros));
    }

    // Prueba 2: cálculo correcto para 1 3 6 20 1
    @Test
    void calculaBienLosSegundos() {
        LogicaDelNegocio logica = new LogicaDelNegocio();
        String[] parametros = {"1", "3", "6", "20", "1"};
        assertEquals(4996860L, logica.calcular(parametros));
    }
}