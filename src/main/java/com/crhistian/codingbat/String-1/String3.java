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


}