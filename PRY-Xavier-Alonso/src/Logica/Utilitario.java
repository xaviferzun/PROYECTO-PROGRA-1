/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Modelos.Artistas;
import java.util.ArrayList;
import java.util.LinkedList;


public class Utilitario {
    public static ArrayList<Artistas> listaArtistas = new ArrayList<>();
    
    public static void cargarDatosArtistas(){
        Artistas artista;
        artista = new Artistas("Don Diablo", "Países Bajos", 1995, "dondiablo.com");
        listaArtistas.add(artista);
        
        artista = new Artistas("Michael Jackson", "Estados Unidos", 1964, "michaeljackson.com");
        listaArtistas.add(artista);
        artista = new Artistas("Coldplay", "Inglaterra", 1997, "coldplay.com");
        listaArtistas.add(artista);
        
    }
    
    public static LinkedList<String> generarListaArtistas(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Artistas artista : listaArtistas) {
            resultado.add(artista.getNombre());     
        }
        return resultado;
    }
       
}
      
    
   

