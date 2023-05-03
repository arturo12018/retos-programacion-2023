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
 * Crea una función que dibuje una escalera según su número de escalones.
 * - Si el número es positivo, será ascendente de izquiera a derecha.
 * - Si el número es negativo, será descendente de izquiera a derecha.
 * - Si el número es cero, se dibujarán dos guiones bajos (__).
 * 
 * Ejemplo: 4
 *         _
 *       _|       
 *     _|
 *   _|
 * _|
 * 
 */


public class LaEscalera {
    public static void mostrar(int numero){
       
        if(numero==0){
            System.out.println("__");
        }
        
        else if(numero>0){
            String cadeAuxilar="";
            numero-=1; 
        
        
            for(int y=0;y<=(numero*2);y++){
                if(y==numero*2)
                {
                    cadeAuxilar="  "+cadeAuxilar;
                    cadeAuxilar+="_";
                }
                else
                {
                    cadeAuxilar+=" ";
                }    
            }
            System.out.println(cadeAuxilar);



            for(int x=numero;x>=0;x--){
                cadeAuxilar="";

                for(int y=x;y>=0;y--){
                    if(y==0){
                        cadeAuxilar+=""+cadeAuxilar;
                        cadeAuxilar+="_|";
                    }
                    else{
                        cadeAuxilar+=" ";
                    }

                }
                System.out.println(cadeAuxilar);

                }

            }
        
        
        else if(numero<0){
                    String cadeAuxilar="";
                    numero=numero*-1;
                    
                    
                    
                    System.out.println("_");
                    
                    

                    for(int x=1;x<=numero;x++)
                        {
                          cadeAuxilar="";
                          for(int y=1;y<=x;y++){
                              if(y==x){
                                    cadeAuxilar+=" "+cadeAuxilar;
                                    cadeAuxilar+="|_";
                                }
                                else{
                                    cadeAuxilar+=" ";
                                }
                          }
                          System.out.println(cadeAuxilar);
                        }
                        
                    
                }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
}
        
    
    

