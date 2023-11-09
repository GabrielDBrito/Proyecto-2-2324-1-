/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;

/**
 *
 * @author luis
 */
public class ColaImpresion<T> {
    
    private  MonticuloBinario<T> monticulo;

    public ColaImpresion(int tamaño) {
        monticulo = new MonticuloBinario<>(tamaño);
    }

    public void insertar(T impresion) {
        monticulo.insertar(impresion);
    }

    public Impresion eliminar() {
        return monticulo.eliminarMin();
    }

    public boolean estaVacia() {
        return monticulo.cima == 0;
    }
    
}
