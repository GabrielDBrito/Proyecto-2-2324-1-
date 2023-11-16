/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import EDD.NodoG;
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
public class Menu extends javax.swing.JFrame {
    static private MonticuloBinario monticulo;
    /**
     * Creates new form Menu
     */
    public Menu(MonticuloBinario monticulo) {
        initComponents();
        this.setVisible(true);
        this.monticulo=monticulo;
        setLocationRelativeTo(null);
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
        jButton2 = new javax.swing.JButton();
        CargarArchivo = new javax.swing.JButton();
        ModificarCola = new javax.swing.JButton();
        MostrarCola = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        Usuarios = new javax.swing.JButton();
        Archivos = new javax.swing.JButton();
        MostrarUsuarios = new javax.swing.JButton();
        EliminarDocumentos = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        MostrarDocumentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/Pacific Blue Business Industry Logo  (1).png"))); // NOI18N
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 180, 180));

        CargarArchivo.setText("Cargar Archivo");
        CargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(CargarArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, -1));

        ModificarCola.setText("Modificar Cola");
        ModificarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarColaActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 180, -1));

        MostrarCola.setText("Cola de Impresion");
        MostrarCola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarColaActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarCola, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 180, -1));

        EXIT.setText("Salir");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        jPanel1.add(EXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 70, -1));

        Usuarios.setText("Usuarios");
        Usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(Usuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 180, -1));

        Archivos.setText("Crear Documento");
        Archivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivosActionPerformed(evt);
            }
        });
        jPanel1.add(Archivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 180, -1));

        MostrarUsuarios.setText("Mostrar Usuarios");
        MostrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 180, -1));

        EliminarDocumentos.setText("Eliminar Documentos");
        EliminarDocumentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarDocumentosActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 180, -1));

        jButton1.setText("Liberar Impresora");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 180, -1));

        MostrarDocumentos.setText("Mostrar Documentos");
        jPanel1.add(MostrarDocumentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void ModificarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarColaActionPerformed
        ModificarCola v3 = new ModificarCola(this, monticulo);
    }//GEN-LAST:event_ModificarColaActionPerformed


    private void UsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosActionPerformed
        Usuarios v5 = new Usuarios(this,monticulo);
    }//GEN-LAST:event_UsuariosActionPerformed

    private void CargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarArchivoActionPerformed
        try{
        monticulo.crearUsuariosArchivo();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Carga del archivo fallida");
        }
    }//GEN-LAST:event_CargarArchivoActionPerformed

    private void ArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivosActionPerformed
        if (monticulo.getUsuarios().getHead()==null){
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
        }else{
            Archivos v6 = new Archivos(this,monticulo);
        }
    }//GEN-LAST:event_ArchivosActionPerformed
    /*
    Muestra por pantalla a todos los usuarios junto a sus atributos 
    */
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
        //MostrarUsuarios v7 = new MostrarUsuarios(this);
        });
         }
    }//GEN-LAST:event_MostrarUsuariosActionPerformed

    private void MostrarColaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarColaActionPerformed
       //purebas de la cola no se asusten
       NodoG nodo=monticulo.buscarPorNombre("jperez");
       nodo.getUsuario().crearDocumento("excel", 22);
       nodo.getUsuario().crearDocumento("asdr", 22);
       nodo.getUsuario().crearDocumento("asdrasdasd", 222);
       monticulo.insertar(nodo.getUsuario().getDocumentos().getHead().getDocumento(),99999999);
       monticulo.insertar(nodo.getUsuario().getDocumentos().getHead().getNext().getDocumento(),10000);
       monticulo.insertar(nodo.getUsuario().getDocumentos().getHead().getNext().getNext().getDocumento(),99);
       
       monticulo.insertar(nodo.getUsuario().getDocumentos().getHead().getNext().getNext().getDocumento(),-99);
       monticulo.insertar(nodo.getUsuario().getDocumentos().getHead().getNext().getNext().getDocumento(),1);
       monticulo.getArreglo().delete();
       monticulo.imprimirTodos();
       
       
    }//GEN-LAST:event_MostrarColaActionPerformed

    private void EliminarDocumentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarDocumentosActionPerformed
        if(monticulo.getUsuarios().getLength()==0){
            JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
        }else{
            EliminarDocumentos v8 = new EliminarDocumentos(this,monticulo);
        }
    }//GEN-LAST:event_EliminarDocumentosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(monticulo).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Archivos;
    private javax.swing.JButton CargarArchivo;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton EliminarDocumentos;
    private javax.swing.JButton ModificarCola;
    private javax.swing.JButton MostrarCola;
    private javax.swing.JButton MostrarDocumentos;
    private javax.swing.JButton MostrarUsuarios;
    private javax.swing.JButton Usuarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
