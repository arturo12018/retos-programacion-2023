/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soluciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author artur
 */
public class ConexionApi {
    public static void llamar(){
     try {
            URL url=new URL("http://www.omdbapi.com/?i=tt3896198&apikey=8ad774f2");
            HttpURLConnection conexion= (HttpURLConnection) url.openConnection();
            conexion.setRequestMethod("GET");
            
            
            
            System.out.println(new BufferedReader(new InputStreamReader(conexion.getInputStream())).readLine());
            
           
            
           
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

