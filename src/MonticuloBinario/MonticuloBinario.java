/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;
/**
 *
 * @author Gabriel
 * versio: 09/11/23
 */
public class MonticuloBinario {
    private Nodo root;

    public MonticuloBinario() {
        root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    /**
     * Realiza rotación hacia la derecha
     * @param y
     * @return
     */
    private Nodo RotarDerecha(Nodo y) {
        Nodo x = y.getLeft();
        Nodo T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2) ;

        return x;
    }
    
    /**
     * Realiza rotación hacia la izquierda
     * @param x 
     * @return 
     */
    private Nodo RotarIzquierda(Nodo x) {
        Nodo y = x.getRight();
        Nodo T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        return y;
    }
    
    /**
     * Funcion que ordena el monticulo para que se mantenga correctamente como un montículo por mínimos
     * @param root 
     */
    private void ordenar(Nodo root) {
        if (root == null)
            return;

        if (root.getLeft() != null && root.getLeft().getNumero() < root.getNumero())
            root = RotarDerecha(root);

        if (root.getRight() != null && root.getRight().getNumero() < root.getNumero())
            root = RotarIzquierda(root);

        ordenar(root.getLeft());
        ordenar(root.getRight());
    }
    
    /**
     * Función para insertar un nuevo elemento en el monticulo
     * @param numero 
     * @param usuario
     */
    public void insertar(int numero, String usuario) {
        Nodo newNode = new Nodo (numero, usuario);

        if (root == null) {
            root = newNode;
            return;
        }

        Nodo currentNode = root;
        Nodo parentNode = null;

        while (true) {
            parentNode = currentNode;

            if (newNode.getNumero() > currentNode.getNumero()) {
                currentNode = currentNode.getLeft();
                if (currentNode == null) {
                    parentNode.setLeft(newNode);
                    break;
                }
            } else {
                currentNode = currentNode.getRight();
                if (currentNode == null) {
                    parentNode.setRight(newNode);
                    break;
                }
            }
        }

        ordenar(root);
    }
    
    public Nodo searchByUser(String usuario) {
        Nodo currentNode = root;

    

        return null;
}
