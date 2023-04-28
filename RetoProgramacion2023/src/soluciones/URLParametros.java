/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author artur
 */


/*
 * Dada una URL con parámetros, crea una función que obtenga sus valores.
 * No se pueden usar operaciones del lenguaje que realicen esta tarea directamente.
 *
 * Ejemplo: En la url https://retosdeprogramacion.com?year=2023&challenge=0
 * los parámetros serían ["2023", "0"]
 */

public class URLParametros {
    public static void datos(String url){
        
        
        ArrayList<String> valoresFinales=new ArrayList();
        for(String palabra:url.split("&"))
        {
            
            int contador=0;
            for(String parametroFinal:palabra.split("=")){
                if(contador==0){
                    contador++;
                }else{
                    valoresFinales.add(parametroFinal);
                    // System.out.println(parametroFinal);
                }
               
            }
        }
        
        System.out.println(valoresFinales);
    }
}
