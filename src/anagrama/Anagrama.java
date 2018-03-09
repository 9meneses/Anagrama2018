/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

/**
 *
 * @author xp
 */
public class Anagrama {
    public boolean ejercicio1(String p1, String p2){
     
       char[] frase1 = p1.toCharArray(); //lo convierto en array
       java.util.Arrays.sort(frase1);    //
       String cadena1 = new String (frase1);
       
       char[] frase2 = p2.toCharArray();
       java.util.Arrays.sort(frase2);
       String cadena2 = new String (frase2);
       
       if(cadena2.equals(cadena1)){
           return true;
       }
       else{
           return false;
       }
    
    }
    public static void main(String[] args) {
        Anagrama ejercicio = new Anagrama();
        String anagrama1 = "amor";
        String anagrama2 = "mora";
        String anagrama3 = "roma";
        System.out.println(ejercicio.ejercicio1(anagrama1, anagrama2));
        System.out.println(ejercicio.ejercicio1(anagrama1, anagrama3));
        // TODO code application logic here
    }
    
}
