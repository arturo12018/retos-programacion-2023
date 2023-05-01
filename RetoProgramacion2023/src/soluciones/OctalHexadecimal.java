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
 * Crea una función que reciba un número decimal y lo trasforme a Octal
 * y Hexadecimal.
 * - No está permitido usar funciones propias del lenguaje de programación que
 * realicen esas operaciones directamente.
 */



public class OctalHexadecimal {
    
    //Genera la cadena de salida
    public static void valores(int numero){
        System.out.println("El "+numero+" en Octal es: "+octal(numero)+" En Hexadecimal es: "+hexadecimal(numero));
    }
    
    
    //Genera el numero Octal
    private static String octal(int numero){
        String numeroFinal="";
        int numeroAux=numero;
        Boolean bandera=true;
        
        while(bandera){
            if(8>numeroAux){
                 numeroFinal+=""+numeroAux;
                bandera=false;
            }
            else{
                numeroFinal+=""+numeroAux%8;
                numeroAux=numeroAux/8;
            }
        }
       StringBuilder numeroFinalAlreves= new StringBuilder(numeroFinal).reverse();
       return numeroFinalAlreves.toString();
    }
    
    
    
    //Genera el numero hexadecimal
    private static String hexadecimal(int numero){
        String numeroFinal="";
        int numeroAux=numero;
        Boolean bandera=true;
        
        while(bandera){
            if(16>numeroAux){
                switch(numeroAux%16){
                    case 10->numeroFinal+="A";
                    case 11->numeroFinal+="B";
                    case 12->numeroFinal+="C";
                    case 13->numeroFinal+="D";
                    case 14->numeroFinal+="E";
                    case 15->numeroFinal+="F";
                    default->numeroFinal+=""+numeroAux;       
                }
                
                
                
                bandera=false;
            }
            else{
                switch(numeroAux%16){
                    case 10->numeroFinal+="A";
                    case 11->numeroFinal+="B";
                    case 12->numeroFinal+="C";
                    case 13->numeroFinal+="D";
                    case 14->numeroFinal+="E";
                    case 15->numeroFinal+="F";
                    default->numeroFinal+=""+numeroAux%16;       
                }
                
                
                numeroAux=numeroAux/16;
                 
                 
            }
            
        }
       StringBuilder numeroFinalAlreves= new StringBuilder(numeroFinal).reverse();
       return numeroFinalAlreves.toString();
    }
    
   
}
