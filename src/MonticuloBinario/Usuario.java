/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;

import EDD.ListaD;
import EDD.NodoD;
import javax.swing.JOptionPane;

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
    
    /*
    Busca un documento por el nombre en la lista de documentos del usuario
    */
    public Documento buscarDocumento(String nombre){
        
        NodoD pointer=documentos.getHead();
        NodoD encontrado=null;
        while (pointer!=null){
            if (pointer.getDocumento().getNombre().equalsIgnoreCase(nombre)){
                encontrado=pointer;}
            pointer=pointer.getNext();
        }
        return encontrado.getDocumento();
    }
    
    
    /*
    Crea un documento y lo agrega a la lista de documentos del usuario
    */
    public void crearDocumento(String nombre, int dimension){
        Documento documento=new Documento(nombre, dimension, getTipo());
        getDocumentos().insertFinal(documento);
        JOptionPane.showMessageDialog(null, "Documento creado con exito");
    }   
}
