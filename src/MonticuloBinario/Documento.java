/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;

/**
 *
 * @author Gabriel
 * version 17/11/23
 */
public class Documento {
    private String nombre;
    private int dimension;
    private String prioridad;
    private boolean encolado;

    public Documento(String nombre, int dimension, String prioridad) {
        this.nombre = nombre;
        this.dimension = dimension;
        this.prioridad = prioridad;
        this.encolado=false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isEncolado() {
        return encolado;
    }

    public void setEncolado(boolean encolado) {
        this.encolado = encolado;
    }
    
   
}
