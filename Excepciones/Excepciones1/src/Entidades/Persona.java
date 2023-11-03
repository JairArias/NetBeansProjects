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
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private Double peso;
    private Double altura;
    private int sMayorEdad;
    private int sImc;

    //constructor
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Double peso, Double altura, int sMayorEdad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;

    }

    // sett & getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getsMayorEdad() {
        return sMayorEdad;
    }

    public void setsMayorEdad(int sMayorEdad) {
        this.sMayorEdad = sMayorEdad;
    }

    public int getsImc() {
        return sImc;
    }

    public void setsImc(int sImc) {
        this.sImc = sImc;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", sMayorEdad=" + sMayorEdad + ", sImc=" + sImc + '}';
    }
}
