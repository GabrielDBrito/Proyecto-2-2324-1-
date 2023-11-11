/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;
import EDD.NodoG;
import ManejoArchivo.ManejoArchivo;
import MonticuloBinario.MonticuloBinario;
/**
 *
 * @author Gabriel
 * version 
 */
public class App {

    public App() {
    }

    public void inicio(){
       MonticuloBinario monticulo=new MonticuloBinario(100);
       monticulo.crearUsuariosArchivo();
       NodoG nodo =monticulo.buscarPorNombre("jperez");
       nodo.getUsuario().crearDocumento("word", 10);
       nodo.getUsuario().crearDocumento("excel", 9999);
       nodo =monticulo.buscarPorNombre("yurdaneta_1");
       nodo.getUsuario().crearDocumento("registro", 5);
       nodo =monticulo.buscarPorNombre("santiago_Gonzalez");
       nodo.getUsuario().crearDocumento("documento3", 8);
       monticulo.getUsuarios().print();
       
       /*
       para acceder al documento
       NodoG nodo =monticulo.buscarPorNombre("nombre del usuario");
       Documento documento =nodo.getUsuario().buscarDocumento("nombre del documento");
       */
       
    }
}

