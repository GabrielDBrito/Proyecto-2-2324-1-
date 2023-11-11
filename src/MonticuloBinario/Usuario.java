/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;

import EDD.ListaD;

/**
 *
 * @author Gabriel
 * version 10/11/23
 */
public class Usuario {
    private String nombre;
    private String tipo;
    private ListaD documentos;
    
    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo=tipo;
        this.documentos=new ListaD();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ListaD getDocumentos() {
        return documentos;
    }

    public void setDocumentos(ListaD documentos) {
        this.documentos = documentos;
    }
    
    
    
    
}
