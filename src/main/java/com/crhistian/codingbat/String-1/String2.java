package com.crhistian.codingbat.String2;

public class String2 {

    public String doubleChar(String str) {
        String palabra="";
        for(int i=0;i<str.length();i++){
            String letra = str.substring( i, i+1 );
            palabra = palabra + letra + letra;
        }

        return palabra;
    }

    public int countHi(String str) {

        String clave = "hi";
        int tamanioPalabra = str.length();
        int conteo = 0 ;

        for( int i = 0 ; i < tamanioPalabra-1 ; i++ ){
            String cadenaAnalizar = str.substring(i,i+2);

            if(cadenaAnalizar.equals(clave)){
                conteo= conteo+1;
            }
        }

        return conteo;
    }











}