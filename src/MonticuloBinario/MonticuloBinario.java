/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;
import EDD.ListaG;
import EDD.NodoG;
import Helpers.Helpers;
import ManejoArchivo.ManejoArchivo;
import javax.swing.JOptionPane;
/**
 *
 * @author luis, gabriel
 * version 10/11/23
 */
public class MonticuloBinario< T extends Comparable<T>>{
    private Impresion[] arreglo;
    public int cima;
    private ListaG usuarios;
    
    public MonticuloBinario(int tamaño) {
        arreglo = new Impresion[tamaño];
        cima = 0;
        this.usuarios=new ListaG();
    }

    public Impresion[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(Impresion[] arreglo) {
        this.arreglo = arreglo;
    }

    public int getCima() {
        return cima;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

    public ListaG getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ListaG usuarios) {
        this.usuarios = usuarios;
    }
    
    
    /*
    Este metodo crea un nuevo usuario
    @param nombre, tipo
    */
    private void crearUsuario(String nombre, String tipo){
        
        Usuario usuario=new Usuario(nombre, tipo);
        getUsuarios().insertFinal(usuario);
        
    }
    /*
    Este metodo le permite al usuario seleccionar un archivo CSV, para crear los usuarios automaticamente
    */
    public void crearUsuariosArchivo(){
        ManejoArchivo manejo =new ManejoArchivo();
        ListaG lista=manejo.lecturaArchivo();
        NodoG pointer=lista.getHead();
        while (pointer!=null){
            crearUsuario(pointer.getUsuario().getNombre(),pointer.getUsuario().getTipo());
            pointer=pointer.getNext();
        }
        JOptionPane.showMessageDialog(null, "Usuarios agregados con exito");
    
    }
    
    /*
    Busca en la lista de usuarios por el nombre
    @param nombre
    @return
    */
    public NodoG buscarPorNombre(String nombre){
        NodoG pointer=usuarios.getHead();
        NodoG encontrado=null;
        while (pointer!=null){
            if (pointer.getUsuario().getNombre().equalsIgnoreCase(nombre)){
                encontrado=pointer;}
            pointer=pointer.getNext();
        }
        return encontrado;
    }
    /*
    Agrega un usuario a la lista de usuarios luego de verificar que este es valido
    @param nombre, tipo
    */
    public void agregarUsuario(String nombre, String tipo){
        Helpers helpers=new Helpers();
        boolean verificacion1=helpers.verificarNombre(nombre, this);
        boolean verificacion2=helpers.verificarTipo(tipo);
        if (verificacion1 && verificacion2){
            crearUsuario(nombre,tipo);
            JOptionPane.showMessageDialog(null, "Usuarios agregado exitosamente");
        }
    }
    /*
    Elimina un usuario por su nombre
    @param nombre
    */
    public void eliminarUsuario(String nombre){
        NodoG nodo=buscarPorNombre(nombre);
        if (nodo==null){
            JOptionPane.showMessageDialog(null, "El usuario que se quiere borrar no ha sido encontrado");
        }
        else{
            getUsuarios().borrarPorNombre(nombre);
            JOptionPane.showMessageDialog(null, "Usuarios borrado exitosamente");
            //no se si falta algo referente a los documentos, creo q si
        }
        
    }

    //insertar()agrega una nueva impresion al monticulo binario. Se inserta la impresion al final del arreglo
    public void insertar(Impresion impresion, Documento documento) {
        arreglo[cima] = impresion;
        burbujaArriba(cima - 1);
    }

    //eliminarMin()elimina la impresion con el identificador mas pequeño del monticulo binario. 
    //Se intercambia la impresion de la cima del monticulo con la impresion del ultimo elemento del arreglo
    public Impresion eliminarMin() {
        if (cima == 0) {
            return null;
        }
        Impresion impresion = arreglo[0];
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
        Impresion temp = arreglo[nodo1];
        arreglo[nodo1] = arreglo[nodo2];
        arreglo[nodo2] = temp;
    }
}