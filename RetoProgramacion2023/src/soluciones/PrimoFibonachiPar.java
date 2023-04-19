/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

/**
 *
 * @author artur
 */
public class PrimoFibonachiPar {
    
    /*
    * Escribe un programa que, dado un número, compruebe y muestre si es primo, fibonacci y par.
    * Ejemplos:
    * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
    * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
    */
    
    public static void solucion(int valor){
        String valorPar=par(valor);
        String valorFibo=fibonacciCadena(valor);
        String valorPrimo=primo(valor);
                 
        System.out.println(valor+" "+ valorPrimo +", "+valorFibo+" y es "+valorPar);
    }
    
    private static String par(int numero){
        if(numero%2==0){
            return "par";
        }
        else{
            return "impar";
        }
    }
    
    private static String fibonacciCadena(int numero){
        boolean entrada=true;
        int x=0;
        
        while(entrada){
            if(fibonacci(x)==numero){
               return "fibonacci" ;
                //entrada=false;
            }
            else if(fibonacci(x)>numero){
                return "no es fibonacci ";
                //entrada=false;
            }
            else{
                x++;
            }
            
        }
        return null;
    }
    
    private static int fibonacci(int numero){
        if(numero==0){
            return 0;
        }
        else if(numero==1){
            return 1;
        }
        else{
            return fibonacci(numero-1)+fibonacci(numero-2);
        }
    }
    
    private static String primo(int numero){
         if (numero == 2) {
        return "es primo";
    }
    if (numero <= 1) {
        return "no es primo";
    }
    for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
            return "no es primo";
        }
    }
    return"primo";
    }
}
