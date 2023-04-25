/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

/**
 *
 * @author artur
 */

/*
 * Crea 3 funciones, cada una encargada de detectar si una cadena de
 * texto es un heterograma, un isograma o un pangrama.
 * - Debes buscar la definición de cada uno de estos términos.
 */

public class HeterogramaIsogramaPangrama {
    
    public static boolean heterograma(String palabra){
        String[] separacion=palabra.split("");
        for(String letra:separacion){
            int contador=0;
            for(String comparar:separacion){
                if(letra.equals(comparar)){
                    contador++;
                }
                if(contador==2){
                    return false;
                }
            }  
        }
        return true;
    }
    
    
    public static boolean isograma(String palabra){
        String[] separacion=palabra.split("");
        int letrasRepetidas=0;
      
        for(String letra:separacion){
            int contador=0;
            
            for(String comparar:separacion){
                if(letra.equals(comparar)){
                    contador++;
                }
            }
            
            if(letrasRepetidas==0){
                    letrasRepetidas=contador;
                }
            if(contador!=letrasRepetidas){
                return false;
            }
            
            
                
            }
          return true;  
        }
        
    
    
    public static boolean pangrama(String cadena){
        boolean a=false,e=false,i=false,o=false,u=false;
        
        String[] separacion=cadena.split("");
        for(String letra:separacion){
            switch(letra){
                case "a" -> a=true;
                case "e" -> e=true;
                case "i" -> i=true;
                case "o" -> o=true;  
                    
                case "u" -> u=true;
            }      
        }
        return a&e&i&o&u;
    }
}
