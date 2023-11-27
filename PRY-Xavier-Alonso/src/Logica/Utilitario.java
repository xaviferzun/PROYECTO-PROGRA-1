/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Modelos.Album;
import Modelos.Artista;
import java.util.ArrayList;
import java.util.LinkedList;


public class Utilitario {
    public static ArrayList<Artista> listaArtistas = new ArrayList<>();
    
    //Inicializar datos de Artistas predefinidos
    public static void cargarDatosArtistas(){
        Artista artista;
        artista = new Artista("Guns N' Roses", 2, "Estados Unidos", 3, 1985, "gunsnroses.com");
        artista.agregarAlbum(new Album(1, "Appetite for Destruction"));
        artista.agregarAlbum(new Album(3, "Use Your Illusion I"));
        listaArtistas.add(artista);
        
        artista = new Artista("Queen", 2, "Inglaterra", 2, 1970, "queenonline.com");
        artista.agregarAlbum(new Album(4, "A Night at the Opera"));
        listaArtistas.add(artista);
        
        artista = new Artista("Dua Lipa", 1, "Inglaterra", 1, 2013, "dualipa.com");
        artista.agregarAlbum(new Album(2, "Future Nostalgia"));
        listaArtistas.add(artista);        
    }
    
    //Crear lista de Strings con nombres de Artistas
    public static LinkedList<String> generarListaArtistas(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Artista artista : listaArtistas) {
            resultado.add(artista.getNombre());     
        }
        return resultado;
    }
       
}
      
    
   

