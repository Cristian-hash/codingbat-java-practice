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

}