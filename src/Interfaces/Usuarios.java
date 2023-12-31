/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import MonticuloBinario.MonticuloBinario;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author cesar
 */
public class Usuarios extends javax.swing.JFrame {
    
    public static Menu v1;
    static private MonticuloBinario monticulo;

    /**
     * Creates new form Usuarios
     */
    public Usuarios(Menu v1,MonticuloBinario monticulo) {
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
        MostrarUsuarios = new javax.swing.JButton();
        EliminarUsuario = new javax.swing.JButton();
        Menu = new javax.swing.JButton();
        AgregarUsuario1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarUsuarios.setForeground(new java.awt.Color(0, 51, 255));
        MostrarUsuarios.setText("Mostrar Usuarios");
        MostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 270, -1));

        EliminarUsuario.setForeground(new java.awt.Color(0, 51, 255));
        EliminarUsuario.setText("Eliminar Usuario");
        EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 270, -1));

        Menu.setForeground(new java.awt.Color(0, 51, 255));
        Menu.setText("Menu");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 90, -1));

        AgregarUsuario1.setForeground(new java.awt.Color(0, 51, 255));
        AgregarUsuario1.setText("Agregar Usuario");
        AgregarUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsuario1ActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarUsuariosActionPerformed
        if (monticulo.getUsuarios().getHead()==null){
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
        }else{
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Usuarios");
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setSize(300, 400);

            JTextArea textArea = new JTextArea();
            monticulo.getUsuarios().mostrarNombresUsuarios(textArea);
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            });
        }
    }//GEN-LAST:event_MostrarUsuariosActionPerformed

    private void EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioActionPerformed
        if (monticulo.getUsuarios().getHead()==null){
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
        }else{
        EliminarUsuarios v4 = new EliminarUsuarios(this, monticulo);
        }
    }//GEN-LAST:event_EliminarUsuarioActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        Menu menu = new Menu(monticulo);
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

    private void AgregarUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsuario1ActionPerformed
        AgregarUsuario v4 = new AgregarUsuario(this,monticulo);
    }//GEN-LAST:event_AgregarUsuario1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios(v1, monticulo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarUsuario1;
    private javax.swing.JButton EliminarUsuario;
    private javax.swing.JButton Menu;
    private javax.swing.JButton MostrarUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
