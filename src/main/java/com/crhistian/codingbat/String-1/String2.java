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

    public boolean catDog(String str) {
        String claveA = "cat";
        String claveB = "dog";
        int tamanio = str.length();
        int contadorA=0;
        int contadorB=0;

        for( int i = 0 ; i < tamanio-2 ; i++ ){
            String palabra = str.substring(i,i+3);
            if( palabra.equals(claveA) ){
                contadorA=contadorA + 1;
            }

            if( palabra.equals(claveB) ){
                contadorB= contadorB + 1;
            }
        }

        if( contadorA==contadorB ){
            return true;
        }else{
            return false;
        }
    }

    public int countCode(String str) {
        String cadena = "co.e" ;
        int contador = 0 ;

        for( int i = 0 ; i < str.length()-3; i++ ){
            String c = str.substring(i,i+4);
            if( c.matches(cadena) ){
                contador = contador +1;
            }
        }
        return contador;
    }
}