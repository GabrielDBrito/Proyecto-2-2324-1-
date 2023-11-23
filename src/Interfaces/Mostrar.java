/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import static Interfaces.ModificarCola.monticulo;
import static Interfaces.ModificarCola.v1;
import MonticuloBinario.MonticuloBinario;

/**
 *
 * @author cesar
 */
public class Mostrar extends javax.swing.JFrame {
    public static Menu v1;
    static MonticuloBinario monticulo;

    /**
     * Creates new form MostrarCola
     */
    public Mostrar(Menu v1, MonticuloBinario monticulo) {
        initComponents();
        this.v1=v1;
        this.monticulo=monticulo;
        v1.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        MostrarArbol = new javax.swing.JButton();
        MostrarCola = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarArbol.setForeground(new java.awt.Color(0, 51, 255));
        MostrarArbol.setText("Mostrar Arbol");
        MostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarArbolActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 180, 30));

        MostrarCola.setForeground(new java.awt.Color(0, 51, 255));
        MostrarCola.setText("Mostrar Cola");
        MostrarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarColaActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 180, 30));

        Menu.setForeground(new java.awt.Color(0, 51, 255));
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarArbolActionPerformed
        MostrarArbol v13 = new MostrarArbol(this,monticulo);
    }//GEN-LAST:event_MostrarArbolActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        Menu menu = new Menu(monticulo);
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

    private void MostrarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarColaActionPerformed
        //MostrarCola v12 = new MostrarCola(this,monticulo);
        monticulo.getArreglo().mostrar(monticulo);
    }//GEN-LAST:event_MostrarColaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar(v1, monticulo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Menu;
    private javax.swing.JButton MostrarArbol;
    private javax.swing.JButton MostrarCola;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
