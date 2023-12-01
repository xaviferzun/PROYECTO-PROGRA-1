/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Album {
    private int numero;
    private String nombre;
    private String tipo;
    private String publicacion;
    private Genero genero;
    private String discografica;
    private int cantidadCanciones;
    private static ArrayList<Cancion> listaCanciones = new ArrayList<>();
    private static Map<String, String> mapaCancionAlbum = new HashMap<>();

    
    public Album(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public static Map<String, String> getMapaCancionAlbum() {
        return mapaCancionAlbum;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void agregarCancion(Cancion cancion){
        this.listaCanciones.add(cancion);
        this.mapaCancionAlbum.put(cancion.getTitulo(),this.nombre);
        this.cantidadCanciones++;
    }
    
      public void eliminarCancion(Cancion cancion){
        this.listaCanciones.remove(cancion);        
        this.cantidadCanciones--;
    }
    
    //Crear lista de Strings con nombres de las Canciones
    public static LinkedList<String> generarListaCanciones(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Cancion item : listaCanciones) {
            resultado.add(item.getTitulo());     
        }
        return resultado;
    }
  
    
}

    