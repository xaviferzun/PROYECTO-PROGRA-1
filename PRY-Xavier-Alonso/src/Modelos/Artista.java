/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Artista {
    private String nombre;
    private int tipo; // 1 = Solista, 2 = Banda
    private int anioFormacion;
    private String origen;
    private String sitioWeb;
    private ArrayList<Album> albumes = new ArrayList<>();
    private int cantidadAlbumes = 0;
    private int cantidadCanciones = 0;
    private int estado; // 1 = Activo, 2 = Inactivo, 3 = Pausa

    public Artista(String nombre, int tipo, String origen, int estado, int anioFormacion, String sitioWeb) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.origen = origen;
        this.estado = estado;
        this.anioFormacion = anioFormacion;
        this.sitioWeb = sitioWeb;
    }
    
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

    public int getCantidadCanciones() {
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
    
    
    //Crear lista de Strings con nombres de Albumes
    public LinkedList<String> generarListaAlbumes(){
        LinkedList<String> resultado = new LinkedList<>();
        for (Album album : albumes) {
            resultado.add(album.getNombre());     
        }
        return resultado;
    }
    
}
