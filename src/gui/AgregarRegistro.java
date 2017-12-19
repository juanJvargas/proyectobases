/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.*;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.*;

/**
 *
 * @author jdtorres
 */
public class AgregarRegistro extends javax.swing.JFrame {

    ControladorCausa controladorCausa;
    ControladorRegistro controladorRegistro;
    ControladorEmpleado controladorEmpleado;
    Usuario usuarioActual;
    InterfazMedico ventanaMedico;

    /**
     * Creates new form AgregarRegistro
     */
    public AgregarRegistro() {
        initComponents();
        controladorCausa = new ControladorCausa();
        controladorRegistro = new ControladorRegistro();
        controladorEmpleado = new ControladorEmpleado();
        causasCB.removeAllItems();
    }
    public AgregarRegistro(Usuario usuario) {
        initComponents();
        controladorCausa = new ControladorCausa();
        controladorRegistro = new ControladorRegistro();
        controladorEmpleado = new ControladorEmpleado();
        causasCB.removeAllItems();
        usuarioActual = usuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idPaciente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        observaciones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        causasCB = new javax.swing.JComboBox<>();
        causasB = new javax.swing.JButton();
        agregarB = new javax.swing.JButton();
        atrasB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Agregar registro consulta paciente");

        jLabel2.setText("Identificacion paciente");

        idPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPacienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Observaciones consulta");

        jLabel5.setText("Causa de la consulta");

        causasCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        causasB.setText("Causas");
        causasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                causasBActionPerformed(evt);
            }
        });

        agregarB.setText("Agregar");
        agregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBActionPerformed(evt);
            }
        });

        atrasB.setText("Atras");
        atrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(idPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addComponent(observaciones))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(causasCB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(causasB)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(agregarB)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(atrasB))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrasB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(causasCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(causasB)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(observaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregarB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPacienteActionPerformed

    private void causasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_causasBActionPerformed
        // TODO add your handling code here:
        causasCB.removeAllItems();
        ArrayList<Causa> ca = new ArrayList<Causa>();
        ca = controladorCausa.consultarCausas();
        causasCB.addItem("");

        for (int i = 0; i < ca.size(); i++) {

            String item;
            item = String.valueOf(ca.get(i).getCodigo_causa()) + "-" + ca.get(i).getNombre();
            causasCB.addItem(item);

        }
    }//GEN-LAST:event_causasBActionPerformed

    private void agregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBActionPerformed
        // TODO add your handling code here:
        if (validar()) {
            Registro registro = new Registro();
            registro.setIdentificacion_paciente(Integer.valueOf(idPaciente.getText()));
            
            registro.setIdentificacion_empleado(Integer.valueOf(usuarioActual.getLogin()));
          
            String aux = causasCB.getSelectedItem().toString();
            String[] aux2 = aux.split("-");
            registro.setCodigo_causa(Integer.valueOf(aux2[0]));
            registro.setObservaciones(observaciones.getText());
            System.out.println(registro.getIdentificacion_empleado() + " " + registro.getIdentificacion_paciente() + " " + registro.getCodigo_causa() + " " + registro.getObservaciones());
            boolean resultado = controladorRegistro.insertarRegistro(registro);
            if (resultado) {
                
                JOptionPane.showMessageDialog(this, "Se agrego el registro a la historia clinica del paciente", "Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
                limpiar();
            } else {
               
                JOptionPane.showMessageDialog(this, "Hubo un error al agregar el registro ", "", JOptionPane.INFORMATION_MESSAGE, null);
            }
        }


    }//GEN-LAST:event_agregarBActionPerformed

    private void atrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBActionPerformed
        // TODO add your handling code here:
        ventanaMedico = new InterfazMedico(usuarioActual);
        ventanaMedico.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasBActionPerformed

    public boolean validar() { //Falta validar que exista un paciente manualmente, no dejarselo a la BD
        boolean resultado = true;
        if (idPaciente.getText().equals("") || observaciones.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Verifique los campos", "", JOptionPane.INFORMATION_MESSAGE, null);
            resultado = false;
            return resultado;
        }
        if (causasCB.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una causa", "", JOptionPane.INFORMATION_MESSAGE, null);
            resultado = false;
            return resultado;
        }
        if (!isNumeric(idPaciente.getText())) {

        }
        /*
        if (controladorEmpleado.consultarEmpleado(Integer.valueOf(idEmpleado.getText())) == null) { //Esto se debe adecuar para paciente
            JOptionPane.showMessageDialog(this, "El empleado no existe", "", JOptionPane.INFORMATION_MESSAGE, null);
            resultado = false;
            return resultado;
        }
        */
        return resultado;
    }

    private boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    public void limpiar(){
        idPaciente.setText("");
        
        observaciones.setText("");
        causasCB.removeAllItems();
    }

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
            java.util.logging.Logger.getLogger(AgregarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarB;
    private javax.swing.JButton atrasB;
    private javax.swing.JButton causasB;
    private javax.swing.JComboBox<String> causasCB;
    private javax.swing.JTextField idPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField observaciones;
    // End of variables declaration//GEN-END:variables
}
