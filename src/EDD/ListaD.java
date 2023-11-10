/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import MonticuloBinario.Documento;

/**
 *
 * @author Gabriel
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
            setHead(nodoG);
        }
        else{
            NodoG pointer=getHead();
            while (pointer.getNext()!=null){
                pointer=pointer.getNext();
            }
            pointer.setNext(nodoG);
        }
        length++;
    }

    
    public void insertAtIndex(String usuario, String tipo, int index){
        NodoG nodoG =new NodoG(usuario, tipo);
        if (isEmpty() || index==0){
        insertBegin(usuario,tipo);
        }
        else {
            if (index<length){
                NodoG pointer=getHead();
                int cont=0;
                while (cont<index-1){
                    pointer=pointer.getNext();
                    cont++;
                }
                nodoG.setNext(pointer.getNext());
                pointer.setNext(nodoG);
                length++;
            } 
            else if (index==length){
                insertFinal(usuario, tipo);
            } 
            else {
                System.out.println("Index not valid");
            }
        }
    }

    
    public NodoG deleteBegin() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            NodoG temp=getHead();
            setHead(temp.getNext());
            temp.setNext(null);
            length--;
            return temp;
        }
    }

   
    
    public NodoG deleteFinal() {
        if (isEmpty()){
            System.out.println("La lista ya esta vacia");
            return null;
        }
        else{
            NodoG pointer=getHead();
            while(pointer.getNext().getNext()!=null){
                pointer=pointer.getNext();
            }
            NodoG temp=pointer.getNext();
            pointer.setNext(null);
            length--;
            return temp;
        }
    }

    
    public NodoG deleteAtIndex(int index) {
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
                    NodoG pointer=getHead();
                    int cont=0;
                    while(cont<index-1){
                        pointer=pointer.getNext();
                        cont++;
                    }
                    NodoG temp=pointer.getNext();
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
        NodoG pointer=getHead();
        while (pointer!=null){
            pointer.print();
            pointer=pointer.getNext();
        }
    }
    
    /*borrar nodo por id
    *@param id
    *@return
    */
   /* public NodoG deleteById(String id){
        if (isEmpty()){
            return null;     
        }else{
            NodoG pointer=getHead();
            int cont=0;
            NodoG temp=null;
            while(pointer!=null){
                if (pointer.getUsuario().getId().equalsIgnoreCase(id)){
                    temp=pointer;
                    break;
                }
                pointer=pointer.getNext();
                cont++;
            }
            if(temp!= null){
                deleteAtIndex(cont);
                return temp;
            } else{
                return null;
            }
        }     
    }/*/
}
