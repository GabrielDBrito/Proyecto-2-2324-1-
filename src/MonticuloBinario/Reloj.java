/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MonticuloBinario;
/**
 *
 * @author Gabriel
 * version 16/11/23
 * Clase reloj que se inicializa al inicio del programa con valor=0 y cada segundo de ejecucion aumenta su valor en 1
 */
public class Reloj {
    private int valor;
    private Thread thread;

    public Reloj() {
        this.valor = 0;
        this.thread = new Thread(this::incrementar);
        iniciar();
    }
    
    //Incrementa si valor en 1 cada 1000 milisegundos (1 seg)
    public void incrementar() {
        while (true) {
            this.valor += 1;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void iniciar() {
        this.thread.start();
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
