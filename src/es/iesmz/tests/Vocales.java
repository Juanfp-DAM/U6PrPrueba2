package es.iesmz.tests;

public class Vocales {

    private String cadena;

    public static int contarVocales(String frase){
        int contador=0;
        for(int i = 0; i == frase.length(); i++){
            String letra= String.valueOf(frase.charAt(i));
            if(letra.equalsIgnoreCase("A")){
                contador++;
            }else if(letra.equalsIgnoreCase("E")){
                contador++;
            }else if(letra.equalsIgnoreCase("I")){
                contador++;
            }else if(letra.equalsIgnoreCase("O")){
                contador++;
            }else if(letra.equalsIgnoreCase("U")){
                contador++;
            }

        }
        return contador;
    }


}