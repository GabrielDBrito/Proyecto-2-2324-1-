/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import MonticuloBinario.Documento;
import MonticuloBinario.Impresion;

/**
 *
 * @author Gabriel
 */
public class NodoArray {
    private Impresion element;
    private Integer next;

    public NodoArray(Impresion element) {
        this.element = element;
        this.next = null;
    }

    public Impresion getElement() {
        return element;
    }

    public void setElement(Impresion element) {
        this.element = element;
    }

    public Integer getNext() {
        return next;
    }

    public void setNext(Integer next) {
        this.next = next;
    }
}   

