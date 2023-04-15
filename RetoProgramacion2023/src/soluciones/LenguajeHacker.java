package soluciones;
import java.util.Hashtable;
/**
 *
 * @author artur
 */
public class LenguajeHacker {
    
    public static String palabraHacker(String cadena){
        
    //Reto #1: EL "LENGUAJE HACKER"
    
    /*
    * Escribe un programa que reciba un texto y transforme lenguaje natural a
    * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
    *  se caracteriza por sustituir caracteres alfanuméricos.
    * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
    *   con el alfabeto y los números en "leet".
    *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
    */
          
    /* {"A": "4", "B": "I3", "C": "[", "D": ")", "E": "3", "F": "|=", "G": "&", "H": "#", "I": "1",
                "J": ",_|", "K": ">|", "L": "1", "M": "/\/\\", "N": " ^/", "O": "0", "P": " |*", "Q": "(_,)",
                "R": "I2", "S": "5", "T": "7", "U": "(_)", "V": "\/", "W": "\/\/", "X": "><", "Y": "j", "Z": "2",
                "1": "L", "2": "R", "3": "E", "4": "A", "5": "S", "6": "b", "7": "T", "8": "B", "9": "g", "0": "o"}*/


         //String cadena="Hola mundo";
        //String cadena="Aquí está un texto de prueba para ver si funciona el reto!";

        Hashtable diccionario= new Hashtable();

        diccionario.put("A", "4");
        diccionario.put("B", "I3");
        diccionario.put("C", "[");
        diccionario.put("D", ")");
        diccionario.put("E", "3");
        diccionario.put("F", "|=");
        diccionario.put("G", "&");
        diccionario.put("H", "#");
        diccionario.put("I", "1");
        diccionario.put("J", ",_|");
        diccionario.put("K", ">|");
        diccionario.put("L", "1");
        diccionario.put("M", "/\\/\\");
        diccionario.put("N", " ^/");
        diccionario.put("O", "0");
        diccionario.put("P", " |*");
        diccionario.put("Q", "(_,)");
        diccionario.put("R", "I2");
        diccionario.put("S", "5");
        diccionario.put("T", "7");
        diccionario.put("U", "(_)");
        diccionario.put("V", "\\/");
        diccionario.put("W", "\\/\\/");
        diccionario.put("X", "><");
        diccionario.put("Y", "j");
        diccionario.put("Z", "2");
        diccionario.put("1", "L");
        diccionario.put("2", "R");
        diccionario.put("3", "E");
        diccionario.put("4", "A");
        diccionario.put("5", "S");
        diccionario.put("6", "b");
        diccionario.put("7", "T");
        diccionario.put("8", "B");
        diccionario.put("9", "g");
        diccionario.put("0", "o");

        cadena=cadena.toUpperCase();
        String[] cadenaEnString=cadena.split(""),
        arregloConCadenas=new String[(cadena.length())];


        for(int x=0; x<cadenaEnString.length; x++){
            if(diccionario.containsKey(cadenaEnString[x])){
                arregloConCadenas[x]=(String)diccionario.get(cadenaEnString[x]);
            }
            else {
                arregloConCadenas[x]=cadenaEnString[x];
            }
        }

        cadena=String.join("",arregloConCadenas);
        
        return cadena;

        
        
    }  
  
       
    
}

