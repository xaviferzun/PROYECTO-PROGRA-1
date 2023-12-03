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
    private String discografica;
    private int cantidadCanciones;
    private ArrayList<Cancion> listaCanciones = new ArrayList<>();
    private Map<Album, Artista> mapaAlbumArtista = new HashMap<>();

    
    // Método Constructor
    public Album(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    
    // Métodos Getter y Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getCantidadCanciones() {
        return cantidadCanciones;
    }
        
    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public Map<Album, Artista> getMapaAlbumArtista() {
        return mapaAlbumArtista;
    }
     
    // Métodos de Clase
    public void agregarCancion(Cancion cancion){
        this.listaCanciones.add(cancion);
        cancion.getMapaCancionAlbum().put(cancion, this);
        this.cantidadCanciones++;
    }
    
      public void eliminarCancion(Cancion cancion){
        this.listaCanciones.remove(cancion);    
        cancion.getMapaCancionAlbum().remove(cancion);
        this.cantidadCanciones--;
    }
    
    //Crear lista de Strings con nombres de las Canciones
    public LinkedList<String> generarListaCanciones(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Cancion item : listaCanciones) {
            resultado.add(item.getTitulo());     
        }
        return resultado;
    }
  
    
}

    