/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;
import EDD.Nodo;
/**
 *
 * @author luis
 */
public class MonticuloBinario< T extends Comparable<T>>{
    private T[] arreglo;
    private int cima;

    public MonticuloBinario(int tamaño) {
        arreglo = new T[tamaño];
        cima = 0;
    }

    //insertar()agrega una nueva impresion al monticulo binario. Se inserta la impresion al final del arreglo
    public void insertar(Impresion impresion) {
        arreglo[cima++] = impresion;
        burbujaArriba(cima - 1);
    }

    //eliminarMin()elimina la impresion con el identificador mas pequeño del monticulo binario. 
    //Se intercambia la impresion de la cima del monticulo con la impresion del ultimo elemento del arreglo
    public T eliminarMin() {
        if (cima == 0) {
            return null;
        }
        T impresion = arreglo[0];
        arreglo[0] = arreglo[--cima];
        burbujaAbajo(0);
        return impresion;
    }

    //burbujaArriba se utiliza para mantener las propiedades del monticulo despues de insertar una nueva inpresion
    private void burbujaArriba(int nodo) {
        while (nodo > 0 && arreglo[nodo].compareTo(arreglo[(nodo - 1) / 2]) < 0) {
            intercambiar(nodo, (nodo - 1) / 2);
            nodo = (nodo - 1) / 2;
        }
    }

    //burbujaAbajo se utiliza para mantener las propiedades del monticulo despues de eliminar la impresion con el identificador mas pequeño
    private void burbujaAbajo(int nodo) {
        while (2 * nodo + 1 < cima) {
            int leftSon = 2 * nodo + 1;
            int rightSon = 2 * nodo + 2;

            if (rightSon < cima && arreglo[rightSon].compareTo(arreglo[leftSon]) < 0) {
                leftSon = rightSon;
            }
            if (arreglo[nodo].compareTo(arreglo[leftSon]) > 0) {
                intercambiar(nodo, leftSon);
                nodo = leftSon;
            } else {
                return;
            }
        }
    }

    private void intercambiar(int nodo1, int nodo2) {
        T temp = arreglo[nodo1];
        arreglo[nodo1] = arreglo[nodo2];
        arreglo[nodo2] = temp;
    }
}