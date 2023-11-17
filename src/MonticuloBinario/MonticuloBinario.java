/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;
import EDD.ListaArray;
import EDD.ListaG;
import EDD.NodoG;
import Helpers.Helpers;
import ManejoArchivo.ManejoArchivo;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 * version 17/11/23
 */
public class MonticuloBinario< T extends Comparable<T>>{
    private ListaArray arreglo;
    public int cima;
    private ListaG usuarios;
    private Reloj reloj;
    
    public MonticuloBinario(int tamaño) {
        //arreglo = new Impresion[tamaño];
        arreglo= new ListaArray(100);
        this.usuarios=new ListaG();
        this.reloj=new Reloj();
    }

    public ListaArray getArreglo() {
        return arreglo;
    }

    public void setArreglo(ListaArray arreglo) {
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

    public Reloj getReloj() {
        return reloj;
    }

    public void setReloj(Reloj reloj) {
        this.reloj = reloj;
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
        try{
        ManejoArchivo manejo =new ManejoArchivo();
        ListaG lista=manejo.lecturaArchivo();
        NodoG pointer=lista.getHead();
        while (pointer!=null){
            crearUsuario(pointer.getUsuario().getNombre(),pointer.getUsuario().getTipo());
            pointer=pointer.getNext();
        }
        JOptionPane.showMessageDialog(null, "Usuarios agregados con exito");
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Error cargando el archivo");
        }
    
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
            JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente");
        }
    }
    
    /*
    Elimina un usuario por su nombre
    @param nombre
    */
    public void eliminarUsuario(String nombre){
        NodoG nodo=buscarPorNombre(nombre);
        if (nodo==null){
            JOptionPane.showMessageDialog(null, "El usuario no ha sido encontrado");
        }
        else{
            getUsuarios().borrarPorNombre(nombre);
            JOptionPane.showMessageDialog(null, "Usuario borrado exitosamente");
            //no se si falta algo referente a los documentos, creo q si
        } 
    }
    
    /*
    Crea una impresion y la inserta en el arreglo de impresiones (cola de prioridad)
    @param documento
    */
    public void insertar(Documento documento) {
        if (documento.getPrioridad().equalsIgnoreCase("prioridad_alta")){
            int numero=reloj.getValor()-90000;
            Impresion impresion = new Impresion(documento,documento.getPrioridad(),numero);
            arreglo.add(impresion);
        }
        if (documento.getPrioridad().equalsIgnoreCase("prioridad_media")){
            int numero=reloj.getValor()-45000;
            Impresion impresion = new Impresion(documento,documento.getPrioridad(),numero);
            arreglo.add(impresion);
        }
        if (documento.getPrioridad().equalsIgnoreCase("prioridad_baja")){
            int numero=reloj.getValor();
            Impresion impresion = new Impresion(documento,documento.getPrioridad(),numero);
            arreglo.add(impresion);
        }
        documento.setEncolado(true);  
        JOptionPane.showMessageDialog(null, "Documento agregado a la cola exitosamente");
    }
    
    /*
    Metodo de prueba para ver si se insertan bien las impresiones en el arreglo
    imprime por consola los id de cadauna de las impresiones de la cola de prioridad
    */
    public void imprimirTodos() {
            arreglo.print();
        }
    
    /*
    Metodo que elimina la impresion de menor id del arreglo (cola de prioridad)
    */
    public void eliminar_min(){
        getArreglo().delete();
        
    }

}
    

                    