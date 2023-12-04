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
    private int tipo; // 1=Estudio, 2=En Vivo, 3=EP, 4=Recopilatorio, 5=Sencillo
    private String publicacion;
    private Genero genero;
    private String discografica;
    private int cantidadCanciones;
    private ArrayList<Cancion> listaCanciones = new ArrayList<>();
    private Map<Album, Artista> mapaAlbumArtista = new HashMap<>();

    
    // Método Constructor
    public Album(int numero, String nombre, int tipo, String publicacion, String discografica) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipo = tipo;
        this.publicacion = publicacion;
        this.discografica = discografica;
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

    public String getTipo() {
        switch (this.tipo){ //1=Estudio, 2=En Vivo, 3=EP, 4=Recopilatorio, 5=Sencillo
            case 1:
                return "Estudio";
            case 2: 
                return "En Vivo";
            case 3:
                return "EP";
            case 4: 
                return "Recopilatorio";
            case 5:
                return "Sencillo";
            default:
                return "Desconocido";
        }
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
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

    