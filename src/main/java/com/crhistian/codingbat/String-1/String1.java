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
    public String twoChar(String str, int index) {
        int tamanio = str.length();
        if ( 0<index && index<tamanio-1 ){
            return str.substring(index,index+2);
        }else if( index <= tamanio ){
            return str.substring(0,2);
        }else{
            return str.substring(0,2);
        }
    }
    public String middleThree(String str) {
        int tamanio = str.length();
        int inicio= (tamanio/2)-1;
        if(tamanio > 2){
            return str.substring(inicio,inicio+3);
        }else{
            return str;
        }
    }

    public boolean hasBad(String str) {
        int tamanio = str.length();
        if(tamanio <3){
            return false;

        }else if(tamanio==3){
            if(str =="bad" ){
                return true;
            }else{
                return false;
            }
        }else{
            String cadenaUno = str.substring(0,3);
            String cadenaDos = str.substring(1,4);

            if((cadenaUno.equals("bad") || cadenaDos.equals("bad"))){
                return true;
            }else{
                return false;
            }
        }
    }
    public String lastChars(String a, String b) {
        int tamanioPrimera = a.length();
        int tamanioSegunda = b.length();
        String primera ="";
        String segunda ="";
        if ( tamanioPrimera == 0  ){
            primera = "@";
        }else{
            primera= a.substring(0,1);
        }

        if ( tamanioSegunda == 0  ){
            segunda = "@";
        }else{
            segunda= b.substring(tamanioSegunda-1);
        }

        return primera + segunda;
    }

    public String conCat(String a, String b) {
        int tamanioA=a.length();
        int tamanioB=b.length();

        if(tamanioA>0&&tamanioB>0){
            String ultimaLetra=a.substring(tamanioA-1);
            String primeraLetra=b.substring(0,1);
            if(ultimaLetra.equals(primeraLetra)){
                return a+(b.substring(1,tamanioB));
            }else{
                return a+b;
            }
        }else{
            return a+b;
        }

    }

    public String lastTwo(String str) {
        int tamanio = str.length();
        if (tamanio<2){
            return str;
        }else{
            String inicio = str.substring(0,tamanio-2);
            String primera = str.substring(tamanio-1);
            String segunda = str.substring(tamanio-2,tamanio-1);
            String palabra;
            palabra = inicio+primera+segunda;
            return palabra;
        }
    }

    public String seeColor(String str) {

        int tamanio = str.length();

        if( str.startsWith( "red" )  ){
            return "red";
        }else if( str.startsWith("blue")){
            return "blue";
        }else {
            return "";
        }
    }

    /*
      int tamanio = str.length();
      if( tamanio < 4  ){
       return "";
      }else if( str.substring(0,3).equals("red") || str.substring(0,4).equals("blue") ){

        if(str.substring(0,3).equals("red")){
          return "red";
        }else{
        return "blue";
        }
      }else{

       return "";

      }


    */

    public boolean frontAgain(String str) {
        int tamanio = str.length();
        if(tamanio<2){
            return false;
        }else{

            String primeras = str.substring(0,2);
            String ultimas = str.substring(tamanio-2,tamanio);

            if(primeras.equals(ultimas)){
                return true;
            }else{
                return false;
            }
        }
    }

    public String minCat(String a, String b) {
        int tamanioA = a.length();
        int tamanioB = b.length();

        if( tamanioA < tamanioB ){

            String cadenaUno = a.substring(0);
            String cadenaDos = b.substring(tamanioB-tamanioA);

            return cadenaUno+cadenaDos;

        }else{
            String cadenaUno = a.substring(tamanioA-tamanioB);
            String cadenaDos = b.substring(0);

            return cadenaUno+cadenaDos;

        }
    }

    public String extraFront(String str) {
        int tamanio = str.length();
        if(tamanio < 2){
            return str+str+str;
        }else{
            String palabra = str.substring(0,2);
            return palabra+palabra+palabra;
        }
    }
    public String without2(String str) {
        int tamanio = str.length();
        if( tamanio < 2 ){
            return str;
        }else{

            String inicio = str.substring(0,2);
            String fin    = str.substring(tamanio-2,tamanio);

            if( inicio.equals( fin ) ){
                return  str.substring(2) ;
            }else{
                return str;
            }
        }
    }

    public String deFront(String str) {
        String primera = str.substring(0,1);
        String segunda = str.substring(1,2);
        if(primera.equals("a")||segunda.equals("b")){

            if( primera.equals("a") && segunda.equals("b") ){
                return "ab"+str.substring(2);
            }else if(primera.equals("a")){
                return "a"+str.substring(2);
            }else{
                return "b"+str.substring(2);
            }
        } else {
            return str.substring(2);
        }
    }

}
