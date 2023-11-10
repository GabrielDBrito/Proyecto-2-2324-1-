/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;

/**
 *
 * @author Gabriel
 */
public class Usuario {
    private String nombre;
    private String tipo;
    private Documento documentos[];
    
    public Usuario(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo=tipo;
    }

    public String getId() {
        return nombre;
    }

    public void setId(String id) {
        this.nombre = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
