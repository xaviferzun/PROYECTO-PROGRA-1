/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Modelos.Artistas;
import java.util.ArrayList;


public class Utilitario {
    public static ArrayList<Artistas> listaArtistas = new ArrayList<>();
    
    public static void cargarDatosArtistas(){
        Artistas artista;
        artista = new Artistas("Misael", "San Carlos", 2023, "misael.com");
        listaArtistas.add(artista);
        
        artista = new Artistas("Michael Jackson", "Estados Unidos", 1700, "muertos.com");
        listaArtistas.add(artista);
    }
    
        
}
      
    
   

