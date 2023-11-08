package EDD;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gabriel
 * version 27/10/23
 */
public class NodoG {
    private NodoG next;
    private String usuario;
    private String tipo;

    public NodoG(String usuario, String tipo) {
        this.usuario = usuario;
        this.tipo = tipo;
        this.next = null;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NodoG getNext() {
        return next;
    }

    public void setNext(NodoG next) {
        this.next = next;
    }
    
    public void print(){
        System.out.println("-------------------------");
        System.out.println("Usuario: "+usuario+"\nTipo: "+tipo);
        System.out.println("-------------------------");
    }

}
