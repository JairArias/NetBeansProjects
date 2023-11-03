/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


/**
 *
 * @author Ryzen
 */
public class Pelicula {
    
    private String pelicula;
    private String director;
    private Double duracion;

    
    //constructor

    public Pelicula() {
    }

    public Pelicula(String pelicula, String director, Double duracion) {
        this.pelicula = pelicula;
        this.director = director;
        this.duracion = duracion;
     
    }

  
    
    //gett & setter

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }


    @Override
    public String toString() {
        return "Pelicula{" + "Nombre Pelicula: " + pelicula + ", Nombre Director: " + director + ", tiempo duracion: " + duracion + '}';
    }

    
}

   
  
    
    
