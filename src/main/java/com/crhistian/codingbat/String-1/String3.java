package com.crhistian.codingbat.String2;

public class String3 {
    public int countYZ(String str) {
        int tamanioCadena = str.length();
        int count = 0;
        for( int i = 0 ; i< tamanioCadena;i++){
            if( Character.toLowerCase(str.charAt(i)) == 'y' || Character.toLowerCase(str.charAt(i)) == 'z' ){
                if( i == tamanioCadena -1 || !Character.isLetter(str.charAt(i+1))  ){
                    count ++;
                }
            }
        }
        return count;
    }
    public String withoutString(String base, String remove) {
        int tamanioBase=base.length();
        int tamanioRemove=remove.length();
        int limiteImpresion=tamanioBase-tamanioRemove;
        String respuesta="";
        String respuestaFinal="";
        for(int i = 0 ;i<=limiteImpresion;i++){
            String cadena = base.substring(i,i+tamanioRemove) ;
            if( !(cadena.equalsIgnoreCase(remove))   ){
                respuesta = respuesta+base.substring(i,i+1);
            }else{
                respuesta = respuesta+"" ;
                i=i+tamanioRemove-1;
            }
        }

        respuestaFinal=respuesta+base.substring(limiteImpresion+1);
        return respuestaFinal;
    }

    public String withoutString(String base, String remove) {
        int tamanioBase=base.length();
        int tamanioRemove=remove.length();
        String respuesta="";
        int i = 0;
        while (i < tamanioBase ){
            if( i +tamanioRemove<=tamanioBase ){
                String cadena = base.substring(i,i+tamanioRemove) ;
                if( !(cadena.equalsIgnoreCase(remove))   ){
                    respuesta = respuesta+base.substring(i,i+1);
                    i++;
                }else{
                    respuesta = respuesta+"" ;
                    i=i+tamanioRemove;
                }
            }else{
                respuesta = respuesta + base.substring(i);
                break;
            }
        }

        return respuesta;
    }

    public boolean equalIsNot(String str) {
        int tamanioStr=str.length();
        int contadorIs=0;
        int contadorNot=0;
        boolean respuesta=false;
        //1 contador de is
        for ( int i = 0;  i < tamanioStr-1; i++ ){
            if( str.charAt(i)=='i'){
                if( str.charAt(i+1)=='s'){
                    contadorIs++;
                }
            }
        }
        //2 contador de not
        for ( int i = 0;  i < tamanioStr-2; i++ ){
            if( str.charAt(i)=='n'){
                if( str.charAt(i+1)=='o'){
                    if( str.charAt(i+2)=='t'){
                        contadorNot++;
                    }
                }
            }
        }

        if(contadorIs==contadorNot){
            respuesta = true;
        }
        return respuesta;
    }

    public boolean gHappy(String str) {
        int tamanioStr = str.length();
        boolean respuesta = true;

        for( int i = 0 ; i < tamanioStr ; i++  ){
            if( str.charAt(i) =='g' ){
                if( !(i>0 && str.charAt( i - 1 )=='g' ||  i<tamanioStr-1 && str.charAt( i + 1 )=='g')  ){
                    respuesta = false;
                }
            }
        }

        return respuesta;
    }


}