/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import logica.*;
import controlador.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juand
 */
public class ConsultarFormula extends javax.swing.JFrame {

    Usuario usuarioActual;
    ControladorFormula controladorFormula;
    ControladorPaciente controladorPaciente;
    ControladorFormulaMedicamento controladorFormulaMedicamento;
    ControladorMedicamento controladorMedicamento;
    InterfazMedico ventanaMedico;
    InterfazEnfermera ventanaEnfermera;

    /**
     * Creates new form ConsultarFormula
     */
    public ConsultarFormula(Usuario usuario) {
        initComponents();
        usuarioActual = usuario;
        controladorFormula = new ControladorFormula();
        controladorPaciente = new ControladorPaciente();
        controladorFormulaMedicamento = new ControladorFormulaMedicamento();
        controladorMedicamento = new ControladorMedicamento();
    }

    public ConsultarFormula() {
        initComponents();
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
        atrasB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idPaciente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaF = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        idFormula = new javax.swing.JTextField();
        consultarMB = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaM = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Consultar formulas ");

        atrasB.setText("Atras");
        atrasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Identificacion paciente");

        idPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idPacienteActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar formulas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo formula", "Identificacion medico", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaF);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Codigo formula");

        consultarMB.setText("Consultar medicamentos");
        consultarMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarMBActionPerformed(evt);
            }
        });

        tablaM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo medicamento", "Nombre medicamento", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(atrasB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultarMB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atrasB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idFormula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarMB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idPacienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!idPaciente.getText().equals("")) {
            DefaultTableModel modelo = (DefaultTableModel) tablaF.getModel();
            modelo.setRowCount(0);
            String idePaciente = idPaciente.getText();
            ArrayList<Formula> formulas = controladorFormula.consultarFormulasPaciente(idePaciente);
            if (formulas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hubo un error al buscar el paciente", "", JOptionPane.INFORMATION_MESSAGE, null);

            } else {
                for (int i = 0; i < formulas.size(); i++) {

                    Vector u = new Vector();
                    Formula aux = formulas.get(i);

                    u.add(aux.getCodigoFormula());
                    u.add(aux.getIdentificacionEmpleado());
                    u.add(aux.getFecha());

                    modelo.addRow(u);
                    tablaF.setModel(modelo);
                    
                }
                idPaciente.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe insertar un paciente", "", JOptionPane.INFORMATION_MESSAGE, null);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atrasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBActionPerformed
        // TODO add your handling code here:
        if (usuarioActual.getTipo().equals("enfermera")) {
            ventanaEnfermera = new InterfazEnfermera(usuarioActual);
            ventanaEnfermera.setVisible(true);
            dispose();
        } else {
            ventanaMedico = new InterfazMedico(usuarioActual);
            ventanaMedico.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_atrasBActionPerformed

    private void consultarMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarMBActionPerformed
        // TODO add your handling code here:
        if (!idFormula.getText().equals("")) {
            DefaultTableModel modelo = (DefaultTableModel) tablaM.getModel();
            modelo.setRowCount(0);
            String ideFormula = idFormula.getText();
            ArrayList<FormulaMedicamento> medicamentos = controladorFormulaMedicamento.consultarFormulaMedicamento(ideFormula);
            if (medicamentos.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hubo un error al buscar la formula", "", JOptionPane.INFORMATION_MESSAGE, null);

            } else {
                for (int i = 0; i < medicamentos.size(); i++) {

                    Vector u = new Vector();
                    FormulaMedicamento aux = medicamentos.get(i);
                    Medicamento medicamento = controladorMedicamento.consultarMedicamento(aux.getCodigo_medicamento());
                    u.add(aux.getCodigo_medicamento());
                    u.add(medicamento.getNombre());
                    u.add(aux.getCantidad());

                    modelo.addRow(u);
                    tablaM.setModel(modelo);
                    idPaciente.setText("");
                }
                idFormula.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe insertar una formula", "", JOptionPane.INFORMATION_MESSAGE, null);

        }
    }//GEN-LAST:event_consultarMBActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultarFormula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarFormula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarFormula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarFormula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarFormula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atrasB;
    private javax.swing.JButton consultarMB;
    private javax.swing.JTextField idFormula;
    private javax.swing.JTextField idPaciente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaF;
    private javax.swing.JTable tablaM;
    // End of variables declaration//GEN-END:variables
}
