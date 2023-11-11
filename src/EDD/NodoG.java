package EDD;

import MonticuloBinario.Usuario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 * version 27/10/23
 * Nodo que almacena usuarios
 */
public class NodoG {
    private NodoG next;
    private Usuario usuario;

    public NodoG(Usuario usuario) {
        this.usuario = usuario;
        this.next = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }



    public NodoG getNext() {
        return next;
    }

    public void setNext(NodoG next) {
        this.next = next;
    }
    
    public void print(){
        System.out.println("-------------------------");
        System.out.println("Usuario: "+usuario.getNombre()+"\nTipo: "+usuario.getTipo()+"\nDocumentos: ");
        NodoD pointer=usuario.getDocumentos().getHead();
        while(pointer!=null){
            pointer.print();
            pointer=pointer.getNext();
        }
        System.out.println("-------------------------");
    }

}
