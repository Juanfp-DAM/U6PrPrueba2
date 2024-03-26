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

}