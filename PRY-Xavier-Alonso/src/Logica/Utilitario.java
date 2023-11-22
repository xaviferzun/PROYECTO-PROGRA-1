/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Modelos.Artistas;
import java.util.ArrayList;

public class Utilitario {
    public static ArrayList<Artistas> listaArtistas = new ArrayList<>();
    
    public static void cargarDatosArtista(){
        Artistas artista;
        artista = new Artistas("Misael", 1, 2023, "San Carlos", "misael.com", 0, 1);
        listaArtistas.add(artista);
        
        artista = new Artistas("Michael Jackson", 1, 1700, "Estados Unidos", "muertos.com", 0, 2);
        listaArtistas.add(artista);
    }
        
}
      
    
   

