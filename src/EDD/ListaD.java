/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import MonticuloBinario.Documento;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 * version 17/11/23
 * Lista que almacena documentos
 */
public class ListaD {
    private NodoD head;
    private Integer length;
   
    public ListaD() {
        this.head = null;
        this.length = 0;
    }

    public NodoD getHead() {
        return head;
    }

    public void setHead(NodoD head) {
        this.head = head;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
    
    public void insertBegin(Documento documento) {
        NodoD nodod =new NodoD(documento);
        if (isEmpty()){
        setHead(nodod);
        }
        else{
        nodod.setNext(getHead());
        setHead(nodod);
        }
        length++;
    }

    public void insertFinal(Documento documento) {
        NodoD nodod =new NodoD(documento);
        if (isEmpty()){
            setHead(nodod);
        }
        else{
            NodoD pointer=getHead();
            while (pointer.getNext()!=null){
                pointer=pointer.getNext();
            }
            pointer.setNext(nodod);
        }
        length++;
    }

    
    public void insertAtIndex(Documento documento, int index){
        NodoD nodod =new NodoD(documento);
        if (isEmpty() || index==0){
        insertBegin(documento);
        }
        else {
            if (index<length){
                NodoD pointer=getHead();
                int cont=0;
                while (cont<index-1){
                    pointer=pointer.getNext();
                    cont++;
                }
                nodod.setNext(pointer.getNext());
                pointer.setNext(nodod);
                length++;
            } 
            else if (index==length){
                insertFinal(documento);
            } 
            else {
                System.out.println("Index not valid");
            }
        }
    }

    
    public NodoD deleteBegin() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            NodoD temp=getHead();
            setHead(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
        }
    }

   
    
    public NodoD deleteFinal() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            NodoD pointer=getHead();
            while(pointer.getNext().getNext()!=null){
                pointer=pointer.getNext();
            }
            NodoD temp=pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }

    
    public NodoD deleteAtIndex(int index) {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            if (index==0){
                return deleteBegin();
            }
            else{
                if (index<getLength()){
                    NodoD pointer=getHead();
                    int cont=0;
                    while(cont<index-1){
                        pointer=pointer.getNext();
                        cont++;
                    }
                    NodoD temp=pointer.getNext();
                    pointer.setNext(temp.getNext());
                    temp.setNext(null);
                    length--;
                    return temp;    
                }
                else{
                    if (index==getLength()-1){
                        return deleteFinal();
                    } 
                    else{
                        System.out.println("Index not valid");
                        return null;
                    }
                    
                }
            }
        }
    }

    public boolean isEmpty() {
            return getHead()==null;    
    }
    
    public void print() {
        NodoD pointer=getHead();
        while (pointer!=null){
            pointer.print();
            pointer=pointer.getNext();
        }
    }
    
    /*borrar nodo por nombre
    *@param nombre
    *@return
    */
   public NodoD borrarPorNombre(String nombre){
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista esta vacia");
            return null;     
        }else{
            NodoD pointer=getHead();
            int cont=0;
            NodoD temp=null;
            while(pointer!=null){
                if (pointer.getDocumento().getNombre().equalsIgnoreCase(nombre)){
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
                cont++;
            }
            if(temp!= null){
                deleteAtIndex(cont);
                JOptionPane.showMessageDialog(null, "El documento eliminado exitosamente");
                return temp;
            } else{
                JOptionPane.showMessageDialog(null, "El documento ha borrar no ha sido encontrado");
                return null;
                
            }
        }     
    }
}
