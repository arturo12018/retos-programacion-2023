/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author artur
 */
public class SombreroSeleccionador {
    
    private static int GRYFFINDOR=0;
    private static int SLYTHERIN=0;
    private static int RAVENCLAW=0;
    private static int HUFFLEPUFF=0;
    
     
    
    public static void seleccionador(){
       
        
    /*
    * Crea un programa que simule el comportamiento del sombrero selccionador del
    * universo mágico de Harry Potter.
    * - De ser posible realizará 5 preguntas (como mínimo) a través de la terminal.
    * - Cada pregunta tendrá 4 respuestas posibles (también a selecciona una a través de terminal).
    * - En función de las respuestas a las 5 preguntas deberás diseñar un algoritmo que
    *   coloque al alumno en una de las 4 casas de Hogwarts (Gryffindor, Slytherin , Hufflepuff y Ravenclaw)
    * - Ten en cuenta los rasgos de cada casa para hacer las preguntas y crear el algoritmo seleccionador.
    *   Por ejemplo, en Slytherin se premia la ambición y la astucia.


    * Pregunstas utilizadas de https://mitsloanreview.mx/liderazgo/5-preguntas-para-saber-que-tipo-de-lider-eres-segun-tu-casa-de-hogwarts/
    */
        
        System.out.println("LA CLAVE DEL EXITO ES:"
                + "\nA. Ganar la confianza de los colaboradores para generar mejores proyectos."
                + "\nB. Dar ordenes claras."
                + "\nC. Identificar las habilidades de los trabajadores y entrenarlos."
                + "\nD. Dar la oportunidad a todos de participar en una decision.");
        contador();
        System.out.println("CUANDO SE TRATA DE ORDENAR ALGO:"
                + "\nA. No me gusta hacerlo, pero a veces es necesario."
                + "\nB. Es lo mejor para que crezca cualquier compania."
                + "\nC. No es necesario si cada colaborador reconoce sus habilidades."
                + "\nD. No es mi estilo, prefiero generar un ambiente de armonia.");
        contador();
        System.out.println("SI TENGO QUE CEDER EL CONTROL A OTRO MIEMBRO DEL GRUPO:"
                + "\nA. Me siento algo inseguro o insegura."
                + "\nB. Nunca lo haria."
                + "\nC. No podria confiar en el conocimiento de alguien mas."
                + "\nD. Lo hago con gusto.");
        contador();
        
        System.out.println("CUANDO TENGO QUE ASIGNAR LAS LABORES:"
                + "\nA. Lo hago sabiendo lo que le gusta a la otra persona."
                + "\nB. Yo se como gestionar otras labores, prefiero darles tareas menores a los demas."
                + "\nC. Me siento a gusto ya que los entrene para ser los mejores en su ramo."
                + "\nD. Prefiero que ellos elijan lo que quieran hacer conforme a sus gustos");
        contador();
        
        System.out.println("CUANDO ALGUIEN QUIERE APORTAR ALGO AL EQUIPO:"
                + "\nA. Los escucho atentamente y si ayuda a crecer al equipo lo acepto."
                + "\nB. No puedo escuchar a nadie mas, yo soy bueno con lo que hago, confio en mi mismo o misma."
                + "\nC. Escucho lo que quieren decirme, si puedo aprender de su comentario lo tomo."
                + "\nD. Me gusta saber que alguien quiere nutrir a la fuerza laboral.");
        contador();
        
        System.out.println("Tu casa es: "+casaSeleccionada());
        
        
       
    }
    
    
    private static void contador(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Respuesta: ");
        String entrada=scanner.next();
        entrada=entrada.toUpperCase();
        
        switch(entrada){
            case "A" -> GRYFFINDOR+=1;
                
            case "B" -> SLYTHERIN+=1;
                
            case "C" -> RAVENCLAW+=1;
                
            case "D" -> HUFFLEPUFF+=1;     
        }
        System.out.println("\n");
    }
    
    private static String casaSeleccionada(){
        if(GRYFFINDOR>SLYTHERIN & GRYFFINDOR>RAVENCLAW & GRYFFINDOR>HUFFLEPUFF){
            return "GRYFFINDOR";
        }
        else if(SLYTHERIN>GRYFFINDOR & SLYTHERIN>RAVENCLAW & SLYTHERIN>HUFFLEPUFF){
            return "SLYTHERIN";
        }
        else if(RAVENCLAW>GRYFFINDOR & RAVENCLAW>SLYTHERIN & RAVENCLAW>HUFFLEPUFF){
            return "RAVENCLAW";
        }
        else if(HUFFLEPUFF>GRYFFINDOR & HUFFLEPUFF>SLYTHERIN & HUFFLEPUFF>RAVENCLAW){
            return "HUFFLEPUFF";
        }
        else{
           String[] casas={"GRYFFINDOR","SLYTHERIN","RAVENCLAW","HUFFLEPUFF"};
           Random rand = new Random();
            return casas[rand.nextInt(4)]; 
        }
        
    }
}
