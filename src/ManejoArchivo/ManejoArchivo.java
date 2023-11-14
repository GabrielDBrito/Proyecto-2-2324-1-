/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoArchivo;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import EDD.ListaG;
import MonticuloBinario.Usuario;
import java.awt.HeadlessException;
     
/**
 *
 * @author Gabriel
 * version 08/11/23
 */
public class ManejoArchivo {
    
    private BufferedReader lector;
    private String linea;
    private String partes[]=null;

    public ManejoArchivo() {
    }
    
    /*
    Metodo encargado de permitirle al usuario elegir el archivo que desea cargar
    luego, guardar la informacion de dicho archivo en una lista
    
    */
    public ListaG lecturaArchivo(){
        
        try{
            // Creamos el JFileChooser
            JFileChooser jfc = new JFileChooser();

            // Abrimos el cuadro de diálogo de selección de archivos
            int seleccion = jfc.showOpenDialog(null);

            // Si el usuario seleccionó un archivo
            if (seleccion == JFileChooser.APPROVE_OPTION) {

                // Obtenemos el archivo seleccionado
                File archivo = jfc.getSelectedFile();
                
                // Leemos los datos del archivo
                FileReader fr = new FileReader(archivo);
                lector = new BufferedReader(fr);
                partes =null;
                ListaG usuarios=new ListaG();
                while((linea=lector.readLine())!=null){
                    partes=linea.split(",");
                    Usuario usuario=new Usuario(partes[0],partes[1]);
                    usuarios.insertFinal(usuario); //se guarda la informacion en una lista
                    partes=null;
                }
                lector.close();
                linea=null;
                return usuarios;
                
        } else{
            
            }
            return null;
        }catch(HeadlessException | IOException e){
            
            return null;
        }
    }
}
