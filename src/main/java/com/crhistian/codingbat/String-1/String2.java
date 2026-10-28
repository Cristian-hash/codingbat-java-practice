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











}