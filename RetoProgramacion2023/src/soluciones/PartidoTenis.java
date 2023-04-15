
package soluciones;

/**
 *
 * @author artur
 */
public class PartidoTenis {
    //Reto #2: EL PARTIDO DE TENIS
    
    /*
    * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
    * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
    * gane cada punto del juego.
    * 
    * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
    * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
    *   15 - Love
    *   30 - Love
    *   30 - 15
    *   30 - 30
    *   40 - 30
    *   Deuce
    *   Ventaja P1
    *   Ha ganado el P1
    * - Si quieres, puedes controlar errores en la entrada de datos.   
    * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
    */
    
    
    public static void partido(String[] puntos){
        int puntaje_p1=0,puntaje_p2=0;
        //String puntaje_p1_mostar="",puntaje_p2_mostar="";
        
        
        for(String jugador:puntos){
            if("P1".equals(jugador)){
              puntaje_p1=puntuaicon(puntaje_p1);
              if(puntaje_p2==41 && puntaje_p1==41){
                  puntaje_p2--;
              }
              
            }
            else if("P2".equals(jugador)){
              puntaje_p2=puntuaicon(puntaje_p2);
              if(puntaje_p2==41 && puntaje_p1==41){
                  puntaje_p1--;
              }
            }
            
            
            System.out.println(marcador(puntaje_p1,puntaje_p2));
            
            
        }
        
    }
    
    public static int puntuaicon(int puntaje){
            if(puntaje==0 || puntaje==15){
                return puntaje+15;
            }
            else if(puntaje==30){
                return puntaje+10;
            }
            else if(puntaje==40 || puntaje==41){
                return puntaje+1;
            }  
            return puntaje;
        }
    
    public static String marcador(int puntaje_p1,int puntaje_p2){
        if(puntaje_p1==0 && puntaje_p2>0){
             return "Love - "+puntaje_p2;
        }
        else if(puntaje_p2==0 && puntaje_p1>0){
            return puntaje_p2+" - Love";
        }
        else if(puntaje_p1==41 && puntaje_p2<puntaje_p1){
            return "Ventaja P1";
        }
        else if(puntaje_p2==41 && puntaje_p1<puntaje_p2){
            return "Ventaja P2";
        }
        else if(puntaje_p1==42){
            return "Ha ganado el P1";
        }
        else if(puntaje_p2==42){
            return "Ha ganado el P2";
        }
        else if(puntaje_p1==puntaje_p2){
            return"Deuce";
        }
        else{
            return (puntaje_p1+" - "+puntaje_p2);
        }
    } 
    
}
