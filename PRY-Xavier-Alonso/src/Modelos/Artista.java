/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import static Logica.Utilitario.listaArtistas;
import java.util.ArrayList;
import java.util.LinkedList;

public class Artista {
    private String nombre;
    private int tipo;
    private Genero generos;
    private int anioFormacion;
    private String origen;
    private String sitioWeb;
    private ArrayList<Album> albumes = new ArrayList<>();
    private int cantidadAlbumes = 0;
    private int cantidadCanciones = 0;
    private int estado;

    public Artista(String nombre, String origen, int anioFormacion, String sitioWeb) {
        this.nombre = nombre;
        this.origen = origen;
        this.anioFormacion = anioFormacion;
        this.sitioWeb = sitioWeb;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void agregarAlbum(Album album){
        this.albumes.add(album);
        this.cantidadAlbumes++;
    }
    
    public void eliminarAlbum(Album album){
        this.albumes.remove(album);
        this.cantidadAlbumes--;
    }

    public int getCantidadAlbumes() {
        return cantidadAlbumes;
    }
    
    //Crear lista de Strings con nombres de Albumes
    public LinkedList<String> generarListaAlbumes(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Album album : albumes) {
            resultado.add(album.getNombre());     
        }
        return resultado;
    }
    
}
