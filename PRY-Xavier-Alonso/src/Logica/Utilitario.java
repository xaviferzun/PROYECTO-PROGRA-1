/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Modelos.Album;
import Modelos.Artista;
import Modelos.Cancion;
import Modelos.Genero;
import java.util.ArrayList;
import java.util.LinkedList;


public class Utilitario {
    public static ArrayList<Artista> listaArtistas = new ArrayList<>();
    
    public static ArrayList<Genero> listaGeneros = new ArrayList<>();
    
    //Inicializar datos de Artistas predefinidos
    public static void cargarDatosArtistas(){
        Artista artista; 
        Album album;
        Genero genero;
        artista = new Artista("Guns N' Roses", 2, "Estados Unidos", 3, 1985, "gunsnroses.com");
        album = new Album(1, "Appetite for Destruction");
        artista.agregarAlbum(album); 
        album.agregarCancion(new Cancion(1, "Welcome to the Jungle"));
        album = new Album(3, "Use Your Illusion I"); 
        artista.agregarAlbum(album);
        genero = listaGeneros.get(0);
        artista.getMapaArtistaGenero().put(artista, genero);
        genero = listaGeneros.get(1);
        artista.getMapaArtistaGenero().put(artista, genero);
        listaArtistas.add(artista);
        
        artista = new Artista("Queen", 2, "Inglaterra", 2, 1970, "queenonline.com");
        artista.agregarAlbum(new Album(4, "A Night at the Opera"));
        listaArtistas.add(artista);
        
        artista = new Artista("Dua Lipa", 1, "Inglaterra", 1, 2013, "dualipa.com");
        album = new Album(2, "Future Nostalgia");
        artista.agregarAlbum(album);
        album.agregarCancion(new Cancion(2, "Don't Start Now"));
        album.agregarCancion(new Cancion(4, "Physical"));
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
    
    //Inicializar datos de Géneros predefinidos
    public static void cargarDatosGeneros(){
        Genero genero;
        genero = new Genero("Hard Rock", "Subgénero pesado de la música rock caracterizado por voces agresivas y guitarras eléctricas distorsionadas");
        listaGeneros.add(genero);
        
        genero = new Genero("Heavy Metal", "Se caracteriza principalmente por sus guitarras fuertes y distorsionadas, ritmos enfáticos, y los sonidos del bajo y la batería");
        listaGeneros.add(genero);
        
        genero = new Genero("Pop", "Mezcla de diferentes estilos, caracterizada por estribillos o ritmos pegadizos");
        listaGeneros.add(genero);
    }
    
     //Crear lista de Strings con nombres de Géneros
    public static LinkedList<String> generarListaGeneros(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Genero item : listaGeneros) {
            resultado.add(item.getNombre());     
        }
        return resultado;
    }
       
}
      
    
   

