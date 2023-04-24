/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;
import java.util.Arrays;

/**
 *
 * @author artur
 */


/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */


public class PiedraPapelTijeraLagartoSpock {
    public static void juegos(String[][] juegos){
        
        
        //String[] valores={"piedra","lagarto","tijera","papel","spock"};
        
        int puntuacionJ1=0,puntuacionJ2=0;
        
        for(String[] juego:juegos){
            //System.out.println(partida(juego[0],juego[1]));
            switch (partida(juego[0],juego[1])) {
                case 1:
                    puntuacionJ1+=1;
                    break;
                case 2:
                    puntuacionJ2+=1;
                    break;
                default:
                    break;
            }
            }
        
        if(puntuacionJ1==puntuacionJ2){
            System.out.println("Tie");
        }
        else if(puntuacionJ1<puntuacionJ2){
            System.out.println("Player 2");
        }
        else if(puntuacionJ1>puntuacionJ2){
            System.out.println("Player 1");
        }
        
        
    }
    
    
    private static int partida(String j1,String j2){
        //Si devuelve 2 significa que gano j2
        //Si devuelve 1 significa que gano j1
        //Si devuelve 0 significa que empate
        
        switch(j1){
            case "piedra":
                if(j2.contentEquals("lagarto") || j2.contentEquals("tijera")){
                   return 1;
                }
                else if(j2.contentEquals("papel") || j2.contentEquals("spock")){
                    return 2;
                }
                else if(j2.contentEquals("piedra")){
                   return 0;
                }
                
            case "papel":
                if(j2.contentEquals("tijera") || j2.contentEquals("spock")){
                    return 2;
                }
                else if(j2.contentEquals("piedra") || j2.contentEquals("lagarto")){
                    return 1;
                }
                else if(j2.contentEquals("papel")){
                    return 0;
                } 
            
            case "tijera":
                if(j2.contentEquals("spock") || j2.contentEquals("piedra")){
                    return 2;
                }
                else if(j2.contentEquals("papel") || j2.contentEquals("lagarto")){
                    return 1;
                }
                else if(j2.contentEquals("tijera")){
                    return 0;
                } 
                
                
            case "spock":
                if(j2.contentEquals("papel") || j2.contentEquals("lagarto")){
                    return 2;
                }
                else if(j2.contentEquals("tijera") || j2.contentEquals("piedra")){
                    return 1;
                }
                else if(j2.contentEquals("spock")){
                    return 0;
                }
                
            case "lagarto":
                if(j2.contentEquals("piedra") || j2.contentEquals("tijera")){
                    return 2;
                }
                else if(j2.contentEquals("spock") || j2.contentEquals("papel")){
                    return 1;
                }
                else if(j2.contentEquals("lagarto")){
                   return 0;
                }
            
            default:
                return 0;
            
                
                
        }
    }
}
