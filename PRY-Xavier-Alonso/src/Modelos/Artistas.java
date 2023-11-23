/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;


public class Artistas {
    private String nombre;
    private int tipo;
    private Generos generos;
    private int anioFormacion;
    private String origen;
    private String sitioWeb;
    private Albumes albumes;
    private int cantidadCanciones;
    private int estado;

    public Artistas(String nombre, int tipo, int anioFormacion, String origen, String sitioWeb, int cantidadCanciones, int estado) {
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Generos getGeneros() {
        return generos;
    }

    public void setGeneros(Generos generos) {
        this.generos = generos;
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

    public Albumes getAlbumes() {
        return albumes;
    }

    public void setAlbumes(Albumes albumes) {
        this.albumes = albumes;
    }

    public int getCantidadCanciones() {
        return cantidadCanciones;
    }

    public void setCantidadCanciones(int cantidadCanciones) {
        this.cantidadCanciones = cantidadCanciones;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
        
    
}
