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
public class Paises {
private String pais;
  
    
    //constructor

    
    public Paises() {
    }

    public Paises(String pais) {
        this.pais = pais;
    }
    

   

  // gett & setter

     public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
    
    @Override
    public String toString() {
        return "Paises{" + "Pais: " + pais + '}';
    }

      
       
    
}