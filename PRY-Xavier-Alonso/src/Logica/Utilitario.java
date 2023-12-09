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
    
    /**
    * Carga los datos de los artistas en la lista de artistas.
    */
    public static void cargarDatosArtistas(){
        Artista artista; 
        Album album;
        Genero genero;
        artista = new Artista("Guns N' Roses", 2, "Estados Unidos", 3, 1985, "gunsnroses.com");
        genero = listaGeneros.get(1);
        asignarGenero(artista, genero);
        genero = listaGeneros.get(2);
        asignarGenero(artista, genero);
        album = new Album(1, "Appetite for Destruction", 1, "21-07-1987", "Geffen Records");
        artista.agregarAlbum(album); 
        asignarGeneroAlbum(artista, listaGeneros.get(1), album);
        album.agregarCancion(new Cancion(1, "Welcome to the Jungle", "4:33", 1987, "Axl Rose"));
        album.agregarCancion(new Cancion(6, "Paradise City", "6:48", 1987, "Axl Rose"));
        album.agregarCancion(new Cancion(9, "Sweet Child o' Mine", "5:56", 1987, "Axl Rose"));
        album = new Album(3, "Use Your Illusion I", 1, "17-09-1991", "Geffen Records"); 
        artista.agregarAlbum(album);
        asignarGeneroAlbum(artista, listaGeneros.get(1), album);
        album.agregarCancion(new Cancion(4, "Don't Cry", "4:45", 1990, "Axl Rose"));
        album.agregarCancion(new Cancion(10, "November Rain", "8:57", 1991, "Axl Rose"));
        listaArtistas.add(artista);
        
        artista = new Artista("Queen", 2, "Inglaterra", 2, 1970, "queenonline.com");
        genero = listaGeneros.get(0);
        asignarGenero(artista, genero);
        album = new Album(4, "A Night at the Opera", 1, "21-11-1975", "EMI");
        artista.agregarAlbum(album);
        asignarGeneroAlbum(artista, listaGeneros.get(0), album);
        album.agregarCancion(new Cancion(4, "Bohemian Rhapsody", "5:55", 1975, "Freddie Mercury"));
        album.agregarCancion(new Cancion(2, "Love of My Life", "3:39", 1975, "Freddie Mercury"));
        listaArtistas.add(artista);
        
        artista = new Artista("Dua Lipa", 1, "Inglaterra", 1, 2013, "dualipa.com");
        genero = listaGeneros.get(3);
        asignarGenero(artista, genero);
        genero = listaGeneros.get(4);
        asignarGenero(artista, genero);
        album = new Album(2, "Future Nostalgia", 1, "27-03-2020", "Warner Records");
        artista.agregarAlbum(album);
        asignarGeneroAlbum(artista, listaGeneros.get(4), album);
        album.agregarCancion(new Cancion(2, "Don't Start Now", "3:03", 2019, "Dua Lipa"));
        album.agregarCancion(new Cancion(4, "Physical", "3:13", 2019, "Dua Lipa"));
        listaArtistas.add(artista);        
    }
    
    /**
    * Genera una lista de los nombres de los artistas.
    *
    * @return una lista de los nombres de los artistas
    */
    public static LinkedList<String> generarListaArtistas(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Artista artista : listaArtistas) {
            resultado.add(artista.getNombre());     
        }
        return resultado;
    }
    
    /**
    * Carga los datos de los géneros en la lista de géneros.
    */
    public static void cargarDatosGeneros(){
        Genero genero;
        genero = new Genero("Rock", "Amplio género de música popular con raíces en el rock and roll, jazz y música clásica.");
        listaGeneros.add(genero);
        
        genero = new Genero("Hard Rock", "Subgénero pesado de la música rock caracterizado por voces agresivas y guitarras eléctricas distorsionadas");
        listaGeneros.add(genero);
        
        genero = new Genero("Heavy Metal", "Se caracteriza principalmente por sus guitarras fuertes y distorsionadas, ritmos enfáticos, y los sonidos del bajo y la batería");
        listaGeneros.add(genero);
        
        genero = new Genero("Pop", "Mezcla de diferentes estilos, caracterizada por estribillos o ritmos pegadizos");
        listaGeneros.add(genero);
        
        genero = new Genero("Dance-Pop", "Subgénero de la música pop desarrollado a partir del post-disco, new wave, synth pop​ y house");
        listaGeneros.add(genero);
    }
    
    /**
    * Genera una lista de los nombres de los géneros.
    *
    * @return una lista de los nombres de los géneros
    */
    public static LinkedList<String> generarListaGeneros(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Genero item : listaGeneros) {
            resultado.add(item.getNombre());     
        }
        return resultado;
    }
    
    /**
    * Asigna un género a un artista.
    *
    * @param artista el artista al que se asignará el género
    * @param genero el género que se asignará al artista
    */
    public static void asignarGenero(Artista artista, Genero genero) {
        if (!artista.getListaGeneros().contains(genero)) {
            artista.getListaGeneros().add(genero);
            genero.getListaArtistas().add(artista);
        }
    }
    
    /**
    * Asigna un género a un álbum de un artista.
    *
    * @param artista el artista que tiene el álbum
    * @param genero el género que se asignará al álbum
    * @param album el álbum al que se asignará el género
    */
    public static void asignarGeneroAlbum(Artista artista, Genero genero, Album album) {
        if (artista.getListaGeneros().contains(genero)) {
            album.setGenero(genero);
        }
    }
}
      
    
   

