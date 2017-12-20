/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.*;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
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
    ControladorPaciente controladorPaciente;

    //formular
    ControladorMedicamento controladorMedicamento;
    ControladorFormula controladorFormula;
    ControladorFormulaMedicamento controladorFormulaMedicamento;
    ArrayList<FormulaMedicamento> medicamentosS;
    TableRowSorter<TableModel> sorter1;
    DefaultTableModel modelo;
    
    //citas
    Cita citaActual;

    public AgregarRegistro(Usuario usuario, Cita cita) {
        
        initComponents();
        
        citaActual = cita;
        
        controladorCausa = new ControladorCausa();
        controladorRegistro = new ControladorRegistro();
        controladorEmpleado = new ControladorEmpleado();
        controladorPaciente = new ControladorPaciente();
        causasCB.removeAllItems();
        usuarioActual = usuario;

        //formular
        controladorFormulaMedicamento = new ControladorFormulaMedicamento();

        controladorFormula = new ControladorFormula();
        controladorMedicamento = new ControladorMedicamento();
        medicamentosS = new ArrayList<FormulaMedicamento>();

        modelo = (DefaultTableModel) tableM.getModel();
        modelo.setRowCount(0);

        medicamentoCB.removeAllItems();
        ArrayList<Medicamento> me = new ArrayList<Medicamento>();
        me = controladorMedicamento.consultarMedicamentos();
        medicamentoCB.addItem("");
        for (int i = 0; i < me.size(); i++) {

            String item;
            item = String.valueOf(me.get(i).getCodigo_medicamento()) + "-" + me.get(i).getNombre();
            medicamentoCB.addItem(item);

        }
        //fin formular
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
        jLabel3 = new javax.swing.JLabel();
        medicamentoCB = new javax.swing.JComboBox<>();
        agregarMB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableM = new javax.swing.JTable();
        cantidadM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        costoCita = new javax.swing.JTextField();

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Formular medicamentos");

        medicamentoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        agregarMB.setText("Agregar");
        agregarMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMBActionPerformed(evt);
            }
        });

        tableM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo medicamento", "Nombre", "Descripcion", "Costo", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableM);

        jLabel6.setText("Costo cita:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 222, Short.MAX_VALUE)
                                .addComponent(medicamentoCB, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agregarMB))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(70, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(76, 76, 76)))
                        .addGap(12, 12, 12)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregarB, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(causasCB, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(causasB))
                            .addComponent(observaciones)
                            .addComponent(idPaciente)
                            .addComponent(costoCita))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atrasB))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(atrasB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(costoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(medicamentoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarMB)
                            .addComponent(cantidadM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(agregarB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            Formula fo = new Formula();
            fo.setIdentificacionEmpleado(Integer.valueOf(usuarioActual.getLogin()));
            fo.setIdentificacionPaciente(Integer.valueOf(idPaciente.getText()));

            Registro registro = new Registro();
            registro.setIdentificacion_paciente(Integer.valueOf(idPaciente.getText()));
            registro.setIdentificacion_empleado(Integer.valueOf(usuarioActual.getLogin()));

            String aux = causasCB.getSelectedItem().toString();
            String[] aux2 = aux.split("-");
            registro.setCodigo_causa(Integer.valueOf(aux2[0]));
            registro.setObservaciones(observaciones.getText());
            //System.out.println(registro.getIdentificacion_empleado() + " " + registro.getIdentificacion_paciente() + " " + registro.getCodigo_causa() + " " + registro.getObservaciones());

            boolean res1 = controladorRegistro.insertarRegistro(registro);
            boolean res2 = controladorFormula.insertarFormula(fo);
            boolean res3 = añadirFormulaMedicamentos();
            
            citaActual.atenderCita(Integer.valueOf(costoCita.getText()));
            ControladorCita ctrlcita = new ControladorCita();
            boolean res4 = ctrlcita.actualizarCita(citaActual);

            if (res1 && res2 && res3 && res4) {

                JOptionPane.showMessageDialog(this, "Se agrego el registro a la historia clinica del paciente", "Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
                ventanaMedico = new InterfazMedico(usuarioActual);
                ventanaMedico.setVisible(true);
                dispose();
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

    private void agregarMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMBActionPerformed
        // TODO add your handling code here:
        if (isNumeric(cantidadM.getText()) && !(medicamentoCB.getSelectedIndex() == -1)) {
            FormulaMedicamento faux = new FormulaMedicamento();

            String aux = medicamentoCB.getSelectedItem().toString();
            String[] aux2 = aux.split("-");

            faux.setCodigo_medicamento(aux2[0]);
            faux.setCantidad(cantidadM.getText());
            medicamentosS.add(faux);

            Medicamento me = new Medicamento();
            me = controladorMedicamento.consultarMedicamento(aux2[0]);

            Vector u = new Vector();
            u.add(String.valueOf(me.getCodigo_medicamento()));
            u.add(me.getNombre());
            u.add(me.getDescripcion());
            u.add(String.valueOf(me.getCosto()));
            u.add(cantidadM.getText());

            modelo.addRow(u);
            tableM.setModel(modelo);

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un medicamento", "", JOptionPane.INFORMATION_MESSAGE, null);
        }

    }//GEN-LAST:event_agregarMBActionPerformed

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
            JOptionPane.showMessageDialog(this, "La identificacion del paciente debe ser un dato numerico", "", JOptionPane.INFORMATION_MESSAGE, null);
            resultado = false;
            return resultado;
        }
        if (controladorPaciente.consultarPaciente(idPaciente.getText()) == null) {
            JOptionPane.showMessageDialog(this, "El paciente no se encuentra en la base de datos", "", JOptionPane.INFORMATION_MESSAGE, null);
            resultado = false;
            return resultado;
        }

        if (medicamentosS.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe añadir medicamentos a la formula", "", JOptionPane.INFORMATION_MESSAGE, null);
            resultado = false;
            return resultado;
        }
        
        if(!isNumeric(costoCita.getText())){
            JOptionPane.showMessageDialog(this, "el costo debe ser numerico", "", JOptionPane.INFORMATION_MESSAGE, null);
            resultado = false;
            return resultado;
        }
        //Verificar que exista el paciente
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

    public void limpiar() {
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
                //new AgregarRegistro().setVisible(true);
            }
        });
    }

    private boolean añadirFormulaMedicamentos() {
        boolean resultado = true;
        String codFormula = controladorFormula.consultarUltimaFormula();
        for (int i = 0; i < medicamentosS.size(); i++) {
            FormulaMedicamento aux = medicamentosS.get(i);
            aux.setCodigo_formula(codFormula);
            boolean res = controladorFormulaMedicamento.insertarFormulaMedicamento(aux);
            if (!res) {
                resultado = false;
            }
        }
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarB;
    private javax.swing.JButton agregarMB;
    private javax.swing.JButton atrasB;
    private javax.swing.JTextField cantidadM;
    private javax.swing.JButton causasB;
    private javax.swing.JComboBox<String> causasCB;
    private javax.swing.JTextField costoCita;
    private javax.swing.JTextField idPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> medicamentoCB;
    private javax.swing.JTextField observaciones;
    private javax.swing.JTable tableM;
    // End of variables declaration//GEN-END:variables
}
