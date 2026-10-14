package com.crhistian.codingbat.String-1;

public class middleTwo {
    public String middleTwo(String str) {
        int tamanio= str.length();
        int mitad = tamanio/2;
        return str.substring(mitad-1,mitad+1);
    }
}
