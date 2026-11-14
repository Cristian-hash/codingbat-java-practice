package com.crhistian.codingbat.String2;

public class String2 {

    public String doubleChar(String str) {
        String palabra="";
        for(int i = 0;i<str.length();i++){
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

    public boolean endOther(String a, String b) {
        String palabraPrimera = a.toLowerCase();
        String palabraSegunda = b.toLowerCase();

        int tamanioPrimera = a.length();
        int tamanioSegunda = b.length();

        if(tamanioPrimera>tamanioSegunda){
            String parteFinal = palabraPrimera.substring( tamanioPrimera-tamanioSegunda );
            if( palabraSegunda.equals(parteFinal) ){
                return true;
            }else{
                return false;
            }
        }else{
            String parteFinalDos = palabraSegunda.substring( tamanioSegunda-tamanioPrimera );
            if( palabraPrimera.equals(parteFinalDos) ){
                return true;
            }else{
                return false;
            }
        }
    }


    public boolean xyzThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {

            String palabra = str.substring(i, i + 3);

            if (palabra.equals("xyz")) {

                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }

            }
        }

        return false;
    }

    public boolean bobThere(String str) {
        int tamanio = str.length();

        if ( tamanio >= 3 ){
            boolean respuesta = false;
            for(int i = 0 ;i< tamanio - 2 ; i++ ){
                String cadena = str.substring(i,i+3);
                if( cadena.matches("b.b") ){
                    respuesta = true;
                }
            }

            return respuesta;
        }else{
            return false;
        }
    }

    public boolean xyBalance(String str) {
        int tamanio = str.length();

        int posicionUltimaX = str.lastIndexOf( "x" );
        int posicionUltimaY = str.lastIndexOf( "y" );

        if( posicionUltimaY > posicionUltimaX || (posicionUltimaX==-1) ){
            return true;
        }else{
            return false;
        }

    }

    public String mixString(String a, String b) {
        int tamanioA = a.length();
        int tamanioB = b.length();
        int menor;
        int mayor;
        String cadenaMayor;
        String cadenaMenor;
        String resto="";

        String palabraParcial = "";
        String palabraRetornar  = "";

        if( tamanioA <= tamanioB ){
            menor = tamanioA ;
            mayor = tamanioB ;
            cadenaMenor = a;
            cadenaMayor = b;
        }else{
            menor = tamanioB ;
            mayor = tamanioA ;
            cadenaMenor = b;
            cadenaMayor = a;

        }
        resto = cadenaMayor.substring( menor);

        for(int i =0 ;i< menor;i++){
            String primerCaracter = a.substring(i,i+1);
            String segundoCaracter =b.substring(i,i+1);

            palabraParcial=palabraParcial+primerCaracter+segundoCaracter;

        }

        palabraRetornar = palabraParcial+resto;

        return palabraRetornar;
    }

    public String repeatEnd(String str, int n) {
        int tamanio = str.length();
        int inicioRespuesta = tamanio - n;

        String palabra ="";
        String respuestaFinal="";
        palabra = str.substring(inicioRespuesta);

        for( int i= 0 ; i<n;i++ ){
            respuestaFinal=respuestaFinal+palabra;
        }

        return respuestaFinal;

    }

    public String repeatFront(String str, int n) {
        String respuesta = "";
        while( n > 0 ){
            respuesta = respuesta + str.substring(0,n);
            n--;
        }
        return respuesta;
    }

    public String repeatSeparator(String word, String sep, int count) {

        String respuesta = "";
        String previo="";

        int tamanioSep= sep.length();
        int finCadena;


        while( count >0){

            previo = previo+word+sep;

            count--;
        }

        int tamanioPrev = previo.length();
        finCadena = tamanioPrev-tamanioSep;

        respuesta = previo.substring(0,finCadena);

        return respuesta;

    }

    public boolean prefixAgain(String str, int n) {
        String prefijo = str.substring( 0, n);
        int tamanio = str.length();

        boolean respuesta = false;

        for(  int i = n ; i <=  (tamanio-n) ; i++ ){
            String parteCadenaAnalizar = str.substring( i,i+n );
            if ( prefijo.equals(parteCadenaAnalizar) ){
                respuesta = true;
            }
        }
        return respuesta;
    }

    public boolean xyzMiddle(String str) {
//1 cadena xyz esta?
        String cadenaVerificar = "xyz";
        boolean respuesta = false ;
        int cadenaLeer = str.length()-3;

        for ( int i = 0 ; i <= cadenaLeer ; i++){
            String palabra = str.substring(i,i+3);
            if(palabra.equals(cadenaVerificar) ){
                //calculo de caracteres de ambos lados
                int caracteresIzq = (str.substring(0,i)).length();
                int caracteresDer = (str.substring(i+3)).length();

                int valor = Math.abs(caracteresIzq-caracteresDer);

                if(valor>=0 && valor <=1){
                    respuesta = true;
                }
            }
        }
        return respuesta;
    }

    public String getSandwich(String str) {
        int primero = str.indexOf("bread");
        int ultimo = str.lastIndexOf("bread");
        String jam ="";
        if(primero != -1 && ultimo !=-1 && primero != ultimo){
            jam = str.substring(primero+5,ultimo);
        }
        return jam;
    }

    public boolean sameStarChar(String str) {

        boolean respuesta = true;
        int indice = 1;
        int tamanio = str.length();

        while( indice < tamanio-1 ){
            // 1. ¿Es un asterisco?
            if( str.charAt(indice)=='*' ){
                // 2. Si es asterisco, ¿tiene vecinos?
                // 3. ¿Los vecinos son iguales?
                if( str.charAt(indice-1) != str.charAt(indice +1) ){
                    respuesta = false;
                }

            }
            indice++;
        }

        return respuesta;
    }


}