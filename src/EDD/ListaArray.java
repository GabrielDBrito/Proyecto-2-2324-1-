/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

import MonticuloBinario.Documento;
import MonticuloBinario.Impresion;
import MonticuloBinario.MonticuloBinario;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Gabriel
 * version 17/11/23
 * Esta clase es una lista enlazada implementada como arreglo que almacena Objetos de tipo Impresion
 */

public class ListaArray {
    private Impresion[] array;
    private int size;

    public ListaArray(int MaxSize) {
        array = new Impresion[MaxSize];
        size = 0;
    }

    public Impresion[] getArray() {
        return array;
    }

    public void setArray(Impresion[] array) {
        this.array = array;
    }
    
    
    /*
    Este metodo retorna el nodo en la posicion indicada
    @param index
    */
    public Impresion get(int index) {
        return array[index];
    }
    
    /*
    Este metodo establece el valor el nodo en la posicion indicada
    @param index, newValue
    */
    public void set(int index, Impresion newValue) {
    if (index >= size) {
        throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }
    array[index] = newValue;
    }
    
    public int getSize() {
        return size;
    }
    
    public Impresion getLast() {
        if (size == 0) {
            return null;
        }
        return array[size - 1];
    }
    
     /*inserta una impresion al final y reordena todo el arreglo, colocando el menor en la primer posicion
      @param obj
    */
    public void add(Impresion obj) {
        obj.getDocumento().setEncolado(true);
        if (size == array.length) {
            throw new IllegalStateException("Heap is full.");
        }
        array[size] = obj;
        size++;
        ajustehaciaarriba(size - 1);//ordena el monticulo
        }
    
    /*borra el primer nodo (siempre es el menor) y reordena todo el arreglo, colocando el menor en la primer posicion
    */
    public void delete() {
        if (size == 0) {
            throw new IllegalStateException("La lista está vacía.");
        }
        Impresion borrado=array[0];
        array[0].getDocumento().setEncolado(false);
        Impresion[] newArray = new Impresion[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        array = newArray;
        size--;
        ajustehaciaabajo(0);
        JOptionPane.showMessageDialog(null, "Documento impreso:\n"+borrado.getDocumento().getNombre());
    }
    
    //Este es el que hay q usar para borrar la impresion de la cola, el otro es para liberar o eliminar min
    public void delete2() {
        if (size == 0) {
            throw new IllegalStateException("La lista está vacía.");
        }
        Impresion borrado=array[0];
        array[0].getDocumento().setEncolado(false);
        Impresion[] newArray = new Impresion[array.length - 1];
        System.arraycopy(array, 1, newArray, 0, array.length - 1);
        array = newArray;
        size--;
        ajustehaciaabajo(0);
    }
    
    /*
    Muestra por consola el id de tdoos los documentos del arreglo en orden
    */
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i].getId());
            }
        System.out.println();
    }
    
    /*
    Intercambia dos nodos de posicion
    @param i,j
    */
    public void intercambiar(int i, int j) {
        Impresion temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    /*
    Reordena el monticulo para mantener sus propiedades (colocando el nodo con id mas bajo de primero)
    @param indice
    */
    public void ajustehaciaarriba(int indice) {
        while (indice > 0) {
        int indicePadre = (indice - 1) / 2;
        if (array[indice].compareTo(array[indicePadre]) >= 0) {
            break;
        }
        intercambiar(indice, indicePadre);
        indice = indicePadre;
        }
    }
    
    /*
    Reordena el monticulo para mantener sus propiedades (colocando el nodo con id mas bajo de primero)
    @param indice
    */
    public void ajustehaciaabajo(int indice) {
         while (true) {
            int indiceHijoIzquierdo = 2 * indice + 1;
            int indiceHijoDerecho = 2 * indice + 2;
            int indiceMenor = indice;
            if (indiceHijoIzquierdo < size && array[indiceHijoIzquierdo].compareTo(array[indiceMenor]) < 0) {
                indiceMenor = indiceHijoIzquierdo;
            }
            if (indiceHijoDerecho < size && array[indiceHijoDerecho].compareTo(array[indiceMenor]) < 0) {
                indiceMenor = indiceHijoDerecho;
            }
            if (indiceMenor == indice) {
                break;
            }
            intercambiar(indice, indiceMenor);
            indice = indiceMenor;
        }
    }
    /*
    Abre una pestaña nueva y muestra por pantalla la lista
    @param monticulo
    */
    public void mostrar(MonticuloBinario monticulo) {
            SwingUtilities.invokeLater(() -> {
                JFrame frame = new JFrame("Cola de impresion");
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.setSize(600, 100);
                String string="\n   [";
                ListaArray lista=monticulo.getArreglo();
                int i=0;
                while(lista.array[i]!=null){
                    if(i!=0){
                        string+="|";}
                        string+=" "+lista.array[i].getDocumento().getNombre()+" ";
                        i++;
                    }
                string+="]";


                JTextArea textArea = new JTextArea();
                textArea.setText(string);
                textArea.setEditable(false);
                textArea.setAlignmentX(Component.CENTER_ALIGNMENT);
                textArea.setAlignmentY(Component.CENTER_ALIGNMENT);

                JScrollPane scrollPane = new JScrollPane(textArea);
                frame.add(scrollPane, BorderLayout.CENTER);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            });
        
   } 
}



































/*/public class ListaArray{
    private Integer head;
    private int maxSize;
    private int size;
    private NodoArray[] array;

    public ListaArray(int maxSize) {
        this.head = null;
        this.maxSize = maxSize;
        this.size = 0;
        this.array = new NodoArray[0];
    }

    public Integer getHead() {
        return head;
    }

    public void setHead(Integer head) {
        this.head = head;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodoArray[] getArray() {
        return array;
    }

    public void setArray(NodoArray[] array) {
        this.array = array;
    }

    public void insertBegin(Impresion element) {
        NodoArray nodo = new NodoArray(element);
        if (isEmpty()) {
            if(getArray().length == 0) {
                setArray(new NodoArray[1]);
                getArray()[0] = nodo;
                setHead(0);
                size++;
            }
        } else {
            if(getSize() == getMaxSize()) {
                System.out.println("El maximo tamaño ya fue alcanzado");
            } else {
                int position = searchSpace();
                if (position != -1) {
                    nodo.setNext(getHead());
                    getArray()[position] = nodo;
                    setHead(position);
                } else {
                    NodoArray[] newArray = new NodoArray[getSize() + 1];
                    for (int i = 0; i < getSize(); i++) {
                        newArray[i] = getArray()[i];
                    }
                    nodo.setNext(getHead());
                    setHead(newArray.length - 1);
                    newArray[newArray.length - 1] = nodo;
                    setArray(newArray);
                    size++;
                }
            }
            
        }
    }
    
    private int searchSpace() {
        for (int i = 0; i < getArray().length; i++) {
            if(getArray()[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void insertFinal(Impresion element) {
        insertAtIndex(element,getArray().length);
    }

    public void insertAtIndex(Impresion element, int index) {
        NodoArray nodo = new NodoArray(element);
        if (isEmpty()) {
            insertBegin(element);
        } else {
            if(getSize() == getMaxSize()) {
                System.out.println("El maximo tamaño ya fue alcanzado");
            } else {
                if(index==0){
                    insertBegin(element);
                }else{
                    if(index <= getArray().length) {
                        int position = searchSpace();
                        if (position != -1) {
                            getArray()[position] = nodo;
                            int cont = 0;
                            int pointer = getHead();
                            while (cont < index -1) {
                                pointer = getArray()[pointer].getNext();
                                cont++;
                            }
                            int temp = getArray()[pointer].getNext();
                            getArray()[pointer].setNext(position);
                            getArray()[position].setNext(temp);
                        } else {
                            NodoArray[] newArray = new NodoArray[getSize() + 1];
                            for (int i = 0; i < getSize(); i++) {
                                newArray[i] = getArray()[i];
                            }
                            newArray[newArray.length - 1] = nodo;
                            setArray(newArray);
                            int cont = 0;
                            int pointer = getHead();
                            while (cont < index -1) {
                                pointer = getArray()[pointer].getNext();
                                cont++;
                            }
                            int temp = getArray()[pointer].getNext();
                            getArray()[pointer].setNext(newArray.length - 1);
                            getArray()[newArray.length - 1].setNext(temp);
                            size++;
                        }
                    } else {
                        System.out.println("Invalid index");
                    }
                }
            }
            
        }
        
    }
    
    public NodoArray deleteBegin() {
        if(isEmpty()) {
            System.out.println("The list is empty");
        } else {
            NodoArray pointer = getArray()[getHead()];
            Integer temp = pointer.getNext();
            getArray()[getHead()] = null;
            setHead(temp);
            pointer.setNext(null);
            size--; 
            return pointer;
        }
        return null;
    }


    public NodoArray deleteFinal() {
        return null;
    }


    public NodoArray deleteAtIndex(int index) {
        return null;
    }


    public boolean isEmpty() {
        return getHead() == null;
    }
    
    public void print() {
        Integer pointer = getHead();
        while (pointer != null) {
            System.out.print(" [ " + getArray()[pointer].getElement().getId() + " ] ");
            pointer = getArray()[pointer].getNext();
        }
    }
    
    public void printInMemory() {
        for (int i = 0; i < getSize(); i++) {
            System.out.print(" [ " + getArray()[i].getElement() + " ] ");
        }
        
    }
    
    
}
*/


