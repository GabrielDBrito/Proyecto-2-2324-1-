/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author cesar
 */
public class Usuarios extends javax.swing.JFrame {
    
    public static Menu v1;

    /**
     * Creates new form Usuarios
     */
    public Usuarios(Menu v1) {
        initComponents();
        this.v1=v1;
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
        AgregarUsuario = new javax.swing.JButton();
        EliminarUsuario = new javax.swing.JButton();
        Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AgregarUsuario.setText("Agregar Usuario");
        AgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 270, -1));

        EliminarUsuario.setText("Eliminar Usuario");
        EliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 270, -1));

        Menu.setText("Menu");
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 90, -1));

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

    private void AgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarUsuarioActionPerformed
        AgregarUsuario v4 = new AgregarUsuario(this);
    }//GEN-LAST:event_AgregarUsuarioActionPerformed

    private void EliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarUsuarioActionPerformed
        EliminarUsuarios v4 = new EliminarUsuarios(this);
    }//GEN-LAST:event_EliminarUsuarioActionPerformed

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
                new Usuarios(v1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarUsuario;
    private javax.swing.JButton EliminarUsuario;
    private javax.swing.JButton Menu;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}