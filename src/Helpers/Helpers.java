/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;
import EDD.Lista;
import javax.swing.JOptionPane;
import EDD.NodoG;
import MonticuloBinario.MonticuloBinario;

/**
 *
 * @author Gabriel
 * version 10/11/2023
 */
public class Helpers {

    public Helpers() {
    }
    
   /**
     * Verifica si el parametro es un numero entero y los castea a int
     * 
     * @param numString
     * @return
     */
    public Integer valorNumero(String numString) {
        int numero;
        try {
            numero = Integer.parseInt(numString);
            if (numero > 0) {
                return numero;

            } else {
                JOptionPane.showMessageDialog(null, "Numnero invalido1. ");
                return null;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Numnero invalido1. ");
        }

        return null;
    }
 
    
    /**
     * verifica si el  nombre ingresado por parametro es valido (no esta repetido en el monticulo).
     * @param nombre, monticulo
     * @return
     */
    public boolean verificarNombre(String nombre, MonticuloBinario monticulo){
        NodoG temp=monticulo.buscarPorNombre(nombre);
        if (temp!=null){
            JOptionPane.showMessageDialog(null, "Nombre de usuario invalido. ");
            return false;
        }
        else {
            return true;
             }
        }
    

    public boolean verificarTipo(String tipo){
        int cont=0;
        if (tipo.equalsIgnoreCase("prioridad_alta")){
            cont=1;
        }
        if (tipo.equalsIgnoreCase("prioridad_media")){
            cont=1;
        }
        if (tipo.equalsIgnoreCase("prioridad_baja")){
            cont=1;
        }
        if (cont==1){
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Incumplimiento del formato del tipo. Este debe ser \n prioridad_alta, prioridad_media o prioridad_baja");
            return false;
        }
    }
}

    
    /**
     * verifica si el numero ingresado por parametro es valido (es realmente un numero y no esta siendo utilizado por otro usuario).
     * 
     * @param id, grafo
     * @return
     */
     /*public Integer verificarNumero(String numString, Grafo grafo){
         
            NodoG pointer=grafo.getNodos().getHead();
            Integer numero=Integer.parseInt(numString);
            int igual=0;
            while(pointer!=null){
                
                if (pointer.getUsuario().getNumero()==numero){
                    igual=1;
                }
                pointer=pointer.getNext();  
            }
                if (igual==0){
                return numero;
            }   
            else{
                return null;
            }
            
        }   
       /*/
    /*
     busca el menor numero disponible(que no este utilizado par algun otro usuario)
     
     @param grafo
     @return
     */
   /* public Integer buscarNumero(Grafo grafo){
        int contador =0;
        boolean valido=false;
        while(valido!=true){
            String strContador=Integer.toString(contador);
            Integer numero=verificarNumero(strContador,grafo);
            if (numero!=null){
                valido=true;
                return numero;
            } else{
                contador++;
            }
        }
        return null;
    }/*/

    
   

