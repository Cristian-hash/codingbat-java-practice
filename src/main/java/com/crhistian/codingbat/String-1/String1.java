package com.crhistian.codingbat.String-1;

public class String1 {
    public String middleTwo(String str) {
        int tamanio= str.length();
        int mitad = tamanio/2;
        return str.substring(mitad-1,mitad+1);
    }

    public boolean endsLy(String str) {
        int tamanio = str.length();
        if(tamanio>=2){
            String ultimasDosLetras = str.substring(tamanio-2,tamanio);
            if(ultimasDosLetras.equals("ly")){
                return true;
            }
        }else if (tamanio<2) {
            return false;
        }
        else{
            return false;
        }
        return false;
    }

    public String nTwice(String str, int n) {
        int tamanio = str.length();
        String inicio = str.substring(0,n);
        String fin = str.substring(tamanio-n,tamanio);
        return inicio+fin;
    }

}
