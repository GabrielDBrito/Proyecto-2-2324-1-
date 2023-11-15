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
    
    private MonticuloBinario<Impresion> monticulo;

    public ColaImpresion(int tamaño) {
        monticulo = new MonticuloBinario<>(tamaño);
    }
    //Este metodo crea una nueva impresión con los datos del documento y el id incrementado en 1. 
    //Luego, el método pasa la nueva impresión al método insertar() de la clase MonticuloBinario para mantener el orden de las impresiones en la cola por su id.
    public void insertar(Documento documento) {
        Impresion nuevaImpresion = new Impresion(documento, documento.getPrioridad());
        nuevaImpresion.setId(nuevaImpresion.getId() + 1);
        monticulo.insertar(nuevaImpresion, documento);
}

        //monticulo.insertar(impresion);
    public Documento eliminar() {
        
        return monticulo.eliminarMin().getDocumento();
}
    
        //return monticulo.eliminarMin();

    public boolean estaVacia() {
        return monticulo.cima == 0;
    }
    
}
