/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import MonticuloBinario.Documento;

/**
 *
 * @author Gabriel
 * version 17/11/23
 * Nodo que almacena un documento
 */
public class NodoD {
    private NodoD next;
    private Documento documento;

    public NodoD(Documento documento) {
        this.documento = documento;
        this.next=null;
    }

    public NodoD getNext() {
        return next;
    }

    public void setNext(NodoD next) {
        this.next = next;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
    
    public void print(){
        System.out.println(" ");
        System.out.println("Nombre: "+documento.getNombre()+"\nDimension: "+documento.getDimension()+"\nPrioridad: "+documento.getPrioridad());
        
    }
    
}

    
    