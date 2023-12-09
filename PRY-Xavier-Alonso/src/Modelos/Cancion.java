/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.HashMap;
import java.util.Map;


public class Cancion {
    private int numero;
    private String titulo;
    private String duracion;
    private String autor;
    private int anioGrabacion;
    private Map<Cancion, Album> mapaCancionAlbum = new HashMap<>();

    
    // Método Constructor
    public Cancion(int numero, String titulo, String duracion, int anioGrabacion, String autor) {
        this.numero = numero;
        this.titulo = titulo;
        this.duracion = duracion;
        this.anioGrabacion = anioGrabacion;
        this.autor = autor;
    }    

    // Métodos Getter y Setter
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioGrabacion() {
        return anioGrabacion;
    }

    public void setAnioGrabacion(int anioGrabacion) {
        this.anioGrabacion = anioGrabacion;
    }

    public Map<Cancion, Album> getMapaCancionAlbum() {
        return mapaCancionAlbum;
    }
   
}
