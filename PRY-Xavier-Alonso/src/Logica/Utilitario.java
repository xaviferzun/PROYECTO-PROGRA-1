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
        artista = new Artista("Don Diablo", "Países Bajos", 1995, "dondiablo.com");
        artista.agregarAlbum(new Album(3, "Future"));
        listaArtistas.add(artista);
        //listaArtistas.add(new Artista("Don Diablo", "Países Bajos", 1995, "dondiablo.com"));
        
        
        listaArtistas.add(new Artista("Michael Jackson", "Estados Unidos", 1964, "michaeljackson.com"));
        listaArtistas.add(new Artista("Coldplay", "Inglaterra", 1997, "coldplay.com"));
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
      
    
   

