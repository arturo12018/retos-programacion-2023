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
 * Crea un generador de números pseudoaleatorios entre 0 y 100.
 * - No puedes usar ninguna función "random" (o semejante) del lenguaje de programación seleccionado.
 */


public class GeneradorPseudoalatorio {
    
    public static void numeroAleatorio(){
        Calendar ahorita=Calendar.getInstance();
        System.out.println(ahorita.get(Calendar.MILLISECOND)/10);
    }
    
}
