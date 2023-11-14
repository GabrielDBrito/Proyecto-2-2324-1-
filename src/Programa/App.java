/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programa;
import EDD.NodoG;
import Interfaces.Menu;
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
       Menu ventana = new Menu(monticulo);
       ventana.setVisible(true);
       
       /*
       para acceder al documento
       NodoG nodo =monticulo.buscarPorNombre("nombre del usuario");
       Documento documento =nodo.getUsuario().buscarDocumento("nombre del documento");
       */
       
    }
}

