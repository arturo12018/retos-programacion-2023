/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author artur
 */
public class GeneradorContrasenas {
    
    /*
    * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
    * Podrás configurar generar contraseñas con los siguientes parámetros:
    * - Longitud: Entre 8 y 16.
    * - Con o sin letras mayúsculas.
    * - Con o sin números.
    * - Con o sin símbolos.
    * (Pudiendo combinar todos estos parámetros entre ellos)
    */
    
    public static void contrasena(int tamano,boolean mayusculas,boolean numeros,boolean simbolos){
        
        //Tabla https://www.ascii-code.com/
        //97 a 122 minusculas
        //65 a 90 mayusculas
        //48 a 57 numeros
        //33 a 47 simbolos
        Random valoRandom=new Random();
        ArrayList<Character> lista=new ArrayList<Character>();
        
        for(int x=97;x<=122;x++){
            lista.add((char)x); 
        }
        
        if(mayusculas){
            for(int x=65;x<=90;x++){
             lista.add((char)x); 
            } 
        }
        
        if(numeros){
            for(int x=48;x<=57;x++){
             lista.add((char)x); 
            } 
        }
        
        if(simbolos){
            for(int x=33;x<=47;x++){
             lista.add((char)x); 
            } 
        }
        
        //System.out.print(valoRandom.nextInt(lista.size()-0+1));
        //System.out.print(lista.get(2));
        
        
        String password="";
        
        
        if(tamano>=8 && tamano<=16){
           for(int x=0;x<tamano;x++){
               
               password+=lista.get(valoRandom.nextInt(lista.size()-0));
           }
           
           System.out.println(password);
        }
        
        else{
            System.out.println("Error de tamaño");
        }
        
        
        
        
       
    }
}
