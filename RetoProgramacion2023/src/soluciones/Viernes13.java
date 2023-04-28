/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

import java.util.Calendar;

/**
 *
 * @author artur
 */


/*
 * Crea una función que sea capaz de detectar si existe un viernes 13 en el mes y el año indicados.
 * - La función recibirá el mes y el año y retornará verdadero o falso.
 */


public class Viernes13 {
    
    
    public static boolean verificar(int year,int month){
        Calendar calendario=Calendar.getInstance();
        calendario.set(Calendar.YEAR,year);
        calendario.set(Calendar.MONTH,(month-1));
        calendario.set(Calendar.DAY_OF_MONTH,13);
        
        
      
        return calendario.get(Calendar.DAY_OF_WEEK)==6;
    }
    
    
 
}
