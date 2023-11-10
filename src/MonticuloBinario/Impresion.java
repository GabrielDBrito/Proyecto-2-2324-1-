/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;

/**
 *
 * @author luis
 * esta clase representa  una impresion del identificador y el documento que se debe imprimir 
 * 9/11/2023
 */
public class Impresion  implements Comparable<Impresion> {
    private int id;
    private String documento;

    public Impresion(int id, String documento) {
        this.id = id;
        this.documento = documento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public String getDocumento() {
        return documento;
    }
    @Override
    public String toString(){
        return "Impresion{"+
                "id="+ id +
                ", documento='" + documento + '\'' +
                '}';
    }

    @Override
    public int compareTo(Impresion impresion) {
        return this.id - impresion.id;
    }
}
