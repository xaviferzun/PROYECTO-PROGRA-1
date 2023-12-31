/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Artista {
    private String nombre;
    private int tipo; // 1=Solista, 2=Banda
    private int anioFormacion;
    private String origen;
    private String sitioWeb;
    private ArrayList<Album> listaAlbumes = new ArrayList<>();
    private ArrayList<Genero> listaGeneros = new ArrayList<>();
    private int cantidadAlbumes = 0;
    private int cantidadCanciones = 0;
    private int estado; // 1 = Activo, 2 = Inactivo, 3 = Pausa

    // Método Constructor
    public Artista(String nombre, int tipo, String origen, int estado, int anioFormacion, String sitioWeb) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.origen = origen;
        this.estado = estado;
        this.anioFormacion = anioFormacion;
        this.sitioWeb = sitioWeb;
    }
    
    // Métodos Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        switch (this.tipo){
            case 1:
                return "Solista";
            case 2: 
                return "Banda";
            default:
                return "Desconocido";
        }
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
       
    public int getAnioFormacion() {
        return anioFormacion;
    }
    
    public void setAnioFormacion(int anioFormacion) {
        this.anioFormacion = anioFormacion;
    }
    
    public String getOrigen() {
        return origen;
    }
    
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }
    
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public ArrayList<Album> getListaAlbumes() {
        return listaAlbumes;
    }

    public ArrayList<Genero> getListaGeneros() {
        return listaGeneros;
    }
    
    public int getCantidadAlbumes() {
        return cantidadAlbumes;
    }

    public int getCantidadCanciones() {    
        cantidadCanciones = 0;
        for (Album album : this.listaAlbumes) {
            cantidadCanciones += album.getCantidadCanciones();
        }       
        return cantidadCanciones;
    }
    
    public String getEstado() {
        switch (this.estado){
            case 1:
                return "Activo";
            case 2: 
                return "Inactivo";
            case 3: 
                return "Pausa";
            default:
                return "Desconocido";
        }
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    
    // Métodos de Clase
    
    /**
    * Agrega un álbum al artista.
    *
    * @param album el álbum a agregar
    */
    public void agregarAlbum(Album album){
        this.listaAlbumes.add(album);
        album.getMapaAlbumArtista().put(album, this);
        this.cantidadAlbumes++;
    }
    
    /**
    * Elimina un álbum del artista.
    *
    * @param album el álbum a eliminar
    */
    public void eliminarAlbum(Album album){
        this.listaAlbumes.remove(album);  
        album.getMapaAlbumArtista().remove(album);
        this.cantidadAlbumes--;
    }

    
    /**
    * Genera una lista de los nombres de los álbumes del artista.
    *
    * @return una lista de los nombres de los álbumes
    */
    public LinkedList<String> generarListaAlbumes(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Album album : listaAlbumes) {
            resultado.add(album.getNombre());     
        }
        return resultado;
    }
    
}
