package es.iesmz.tests;

import static org.junit.jupiter.api.Assertions.*;

class VocalesTest {

    @org.junit.jupiter.api.Test
    void contarVocales() {
        //ARRANGE
        String hola="Hola Mundo";
        //ACT
        int contador=Vocales.contarVocales(hola);
        //ASSERT
        assertEquals(4,contador);
    }

    @org.junit.jupiter.api.Test
    void contarVocales2(){
        //ARRANGE
        String cadena = "Esto Es una cadenA";
        //ACT
        int contador=Vocales.contarVocales(cadena);
        //ASSERT
        assertEquals(8,contador);
    }

    @org.junit.jupiter.api.Test
    void contadorVocales3(){
        //ARRANGE
        String java = "Java mola MogollOn";
        //ACT
        int contador=Vocales.contarVocales(java);
        //ASSERT
        assertEquals(7,contador);
    }

    @org.junit.jupiter.api.Test
    void contadorVocales4(){
        //ARRANGE
        String numeros="4h0r4 s0n num3r0s";
        //ACT
        int contador=Vocales.contarVocales(numeros);
        //ASSERT
        assertEquals(1,contador);
    }

    @org.junit.jupiter.api.Test
    void contadorVocales5(){
        //ARRANGE
        String cadena="Cadena S1n Vocales";
        //ACT
        int contador=Vocales.contarVocales(cadena);
        //ASSERT
        assertEquals(6,contador);
    }

}