/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logica.Usuario;

/**
 *
 * @author jdtorres
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    ControladorUsuarios controladorUsuarios;
    InterfazAdministrador ventanaAdmin;
    InterfazEnfermera ventanaEnfermera;
    InterfazMedico ventanaMedico;
    Usuario usuarioActual;
    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
        usuarioActual = new Usuario();
        initComponents();
        controladorUsuarios = new ControladorUsuarios();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioL = new javax.swing.JLabel();
        contraseñaL = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        botonEntrar = new javax.swing.JButton();
        campoPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuarioL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        usuarioL.setText("Usuario");

        contraseñaL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        contraseñaL.setText("Contraseña");

        campoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });

        botonEntrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonEntrar.setText("Entrar");
        botonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrarActionPerformed(evt);
            }
        });

        campoPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(usuarioL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(contraseñaL)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(campoPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 202, Short.MAX_VALUE)
                .addComponent(botonEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoUsuario)
                    .addComponent(usuarioL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contraseñaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoPassword))
                .addGap(18, 18, 18)
                .addComponent(botonEntrar)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void botonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrarActionPerformed
        // TODO add your handling code here:

        entrar();

    }//GEN-LAST:event_botonEntrarActionPerformed

    private void campoPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            entrar();
        }
    }//GEN-LAST:event_campoPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPrincipal().setVisible(true);
                
            }
        });
    }

    private void entrar() {

        String nombre = campoUsuario.getText();
        String contraseña = new String(campoPassword.getText());

        

        usuarioActual = controladorUsuarios.consultarUsuario(nombre);

        String usuarioCorrecto = usuarioActual.getLogin();
        String contraseñaCorrecta = usuarioActual.getPassword();

        if (nombre.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) { //Valida que el usuario y contraseña sean correctos.

            if (usuarioActual.getEstado().equals("activo")) { //valida que el usuario ingresado se encuentra activo.
                if (usuarioActual.getTipo().equals("administrador")) {
                    ventanaAdmin = new InterfazAdministrador(usuarioActual);

                    ventanaAdmin.setVisible(true);

                } else if (usuarioActual.getTipo().equals("enfermera")) {
                    ventanaEnfermera = new InterfazEnfermera(usuarioActual);
                    ventanaEnfermera.setVisible(true);
                } else if (usuarioActual.getTipo().equals("medico")) {
                    ventanaMedico = new InterfazMedico(usuarioActual);
                    ventanaMedico.setVisible(true);
                }

                this.dispose();
            } else {

                //Icon p = new ImageIcon(getClass().getResource("/GUI/images/user (3).png"));


                JOptionPane.showMessageDialog(this, "El usuario no  esta activo", "No puede ingresar", JOptionPane.INFORMATION_MESSAGE, null);

                campoPassword.setText("");
                campoUsuario.setText(null);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
            campoUsuario.setText(null);
            campoPassword.setText(null);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JPasswordField campoPassword;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel contraseñaL;
    private javax.swing.JLabel usuarioL;
    // End of variables declaration//GEN-END:variables
}
