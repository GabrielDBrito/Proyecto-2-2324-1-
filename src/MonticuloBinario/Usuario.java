/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;

import EDD.ListaD;
import EDD.NodoD;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

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
        if (encontrado!=null){
            return encontrado.getDocumento();
        }else{
            return null;
        }
    }
    
    
    /*
    Crea un documento y lo agrega a la lista de documentos del usuario
    @param nombre, dimension
    */
    public void crearDocumento(String nombre, int dimension){
        Documento documento=new Documento(nombre, dimension, getTipo());
        getDocumentos().insertFinal(documento);
        JOptionPane.showMessageDialog(null, "Documento creado con exito");
    } 
    
    /*
    Busca un documento por su nombre y lo elimina si este no esta en la cola
    @param nombre
    */
    public void eliminarDocumento(String nombre){
        Documento documento=buscarDocumento(nombre);
        if (documento.isEncolado()){
            JOptionPane.showMessageDialog(null, "El documento se encuentra en la cola de impresion\nPor esta razon, no puede ser eliminado");
        }
        else{
            documentos.borrarPorNombre(nombre);
        }
    }
    
    /*
    Muestra por pantalla todos los documentos del usuario
    @param textArea
    */
    public void mostrarDocumentos(JTextArea textArea) {
        NodoD temp = documentos.getHead();
        String documentos = "";

        while (temp != null) {   
            documentos+= " Nombre: "+temp.getDocumento().getNombre()+"\n";
            documentos+= " Tamaño: "+temp.getDocumento().getDimension()+"\n";
            documentos+= " Prioridad: "+temp.getDocumento().getPrioridad()+"\n";
            if(temp.getDocumento().isEncolado()){
                documentos+= " En cola: SI\n";
            }else{
                documentos+= " En cola: NO\n";
            }
            documentos+="------------------------------------------------------------------------\n";
            temp = temp.getNext();
        }

        textArea.setText(documentos);
    }
   
}
