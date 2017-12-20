/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import logica.*;
import controlador.*;
import java.sql.Array;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class ModificarUsuario extends javax.swing.JFrame {

    ControladorArea controlArea;
    ControladorEmpleado controlEmpleado = new ControladorEmpleado();

    /**
     * Creates new form ModificarUsuario
     */
    public ModificarUsuario() {
        initComponents();
        controlArea = new ControladorArea();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        codigo_areas = new javax.swing.JComboBox<>();
        buscar_areas = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        codigo_jefe = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        activa = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        inactiva = new javax.swing.JRadioButton();
        identifiacion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        buscar_jefes = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        medico = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        enfermera = new javax.swing.JRadioButton();
        salario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buscar_areas.setText("buscar areas");
        buscar_areas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_areasActionPerformed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Codigo jefe:");
        jLabel12.setToolTipText("");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Estado:");
        jLabel10.setToolTipText("");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACION BASICA");

        buttonGroup1.add(activa);
        activa.setText("activa");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Identificacion empelado:");
        jLabel2.setToolTipText("");

        buttonGroup1.add(inactiva);
        inactiva.setText("incativa");

        identifiacion.setToolTipText("");
        identifiacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identifiacionActionPerformed(evt);
            }
        });

        jButton1.setText("Siguiente ->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Direccion:");
        jLabel3.setToolTipText("");

        direccion.setToolTipText("");
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefono:");
        jLabel4.setToolTipText("");

        telefono.setToolTipText("");
        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nombre:");
        jLabel5.setToolTipText("");

        nombre.setToolTipText("");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Email:");
        jLabel6.setToolTipText("");

        buscar_jefes.setText("buscar jefes");
        buscar_jefes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_jefesActionPerformed(evt);
            }
        });

        email.setToolTipText("");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        medico.setText("medico");
        medico.setEnabled(false);
        medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicoActionPerformed(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Salario:");
        jLabel7.setToolTipText("");

        enfermera.setText("enfermera");
        enfermera.setEnabled(false);
        enfermera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enfermeraActionPerformed(evt);
            }
        });

        salario.setToolTipText("");
        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Codigo area:");
        jLabel9.setToolTipText("");

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(identifiacion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codigo_areas, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codigo_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(buscar_areas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buscar_jefes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(activa)
                        .addGap(35, 35, 35)
                        .addComponent(inactiva)
                        .addGap(170, 170, 170)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(medico)
                .addGap(25, 25, 25)
                .addComponent(enfermera)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identifiacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enfermera)
                    .addComponent(medico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo_areas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_areas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo_jefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_jefes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activa)
                    .addComponent(inactiva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscar_areasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_areasActionPerformed

        codigo_areas.removeAllItems();
        ArrayList<String> ve = new ArrayList<String>();
        ve = controlArea.retornarAreas();
        codigo_areas.addItem("");

        for (int i = 0; i < ve.size() - 1; i += 2) {
            String item;
            item = ve.get(i) + "," + ve.get(i + 1);
            codigo_areas.addItem(item);
            item = "";
        }
    }//GEN-LAST:event_buscar_areasActionPerformed

    private void identifiacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identifiacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identifiacionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!direccion.getText().equalsIgnoreCase("") && !telefono.getText().equalsIgnoreCase("")
                && !nombre.getText().equalsIgnoreCase("") && !email.getText().equalsIgnoreCase("")) {
            Empleado empleado = new Empleado();

            empleado.setDireccion(this.direccion.getText());
            empleado.setTelefono(this.telefono.getText());
            empleado.setNombre(this.nombre.getText());
            empleado.setEmail(this.email.getText());

            String codigo = "";
            boolean seModifico = true;
            boolean aux = false;
            try {
                empleado.setIdentificacion_empleado(Integer.parseInt(this.identifiacion.getText()));
                empleado.setSalario(Integer.parseInt(this.salario.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Hubo un error, el codigo y el salario deben ser nuemrico", "Error", JOptionPane.INFORMATION_MESSAGE);
                aux = true;
            }
            String parametro = "" + this.codigo_areas.getSelectedItem();
            if ((parametro.compareTo("null") != 0) && (parametro.compareTo("") != 0) && !(aux)) {
                codigo = this.codigo_areas.getSelectedItem().toString();
                String[] cod = codigo.split(",");
                empleado.setCodigo_area(Integer.parseInt(cod[0]));
            } else {
                aux = true;
            }
            parametro = "" + this.codigo_jefe.getSelectedItem();
            if ((parametro.compareTo("null") != 0) && (parametro.compareTo("") != 0) && !(aux)) {

                codigo = this.codigo_jefe.getSelectedItem().toString();
                String[] cod = codigo.split(",");
                empleado.setIdentificacion_jefe(Integer.parseInt(cod[0]));
            } else {
                empleado.setIdentificacion_jefe(0);
            }

            if (!(medico.isSelected() || enfermera.isSelected())) {
                aux = true;
            }
            if (this.activa.isSelected() && !(aux)) {
                empleado.setEstado("activa");
            } else if (this.inactiva.isSelected() && !(aux)) {
                empleado.setEstado("inactiva");
            } else {
                seModifico = false;
            }

            if (seModifico) {

                if (medico.isSelected()) {
                    ModificarMedico medico = new ModificarMedico();
                    medico.setVisible(true);
                    medico.iniciar(Integer.parseInt(identifiacion.getText()), empleado);
                    dispose();
                }
                if (enfermera.isSelected()) {
                    ModificarEnfermera enfermera = new ModificarEnfermera();
                    enfermera.setVisible(true);
                    enfermera.iniciar(Integer.parseInt(identifiacion.getText()), empleado);
                    dispose();
                }

            } else {
                //Icon p = new ImageIcon(getClass().getResource("/gui/images/x.png"));
                JOptionPane.showMessageDialog(this, "Hubo un error, revise los datos", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error, los datos no pueden ser vacios \n(Excepto el codigo del jefe)", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void buscar_jefesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_jefesActionPerformed

        codigo_jefe.removeAllItems();
        ArrayList<String> ve = new ArrayList<String>();
        try {
            ve = controlEmpleado.retornarEmpleados();
        } catch (NullPointerException e) {
            System.out.println(ve);
        }
        codigo_jefe.addItem("");

        for (int i = 0; i < ve.size() - 1; i += 2) {
            String item;
            item = ve.get(i) + "," + ve.get(i + 1);
            codigo_jefe.addItem(item);
            item = "";
        }
    }//GEN-LAST:event_buscar_jefesActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void medicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicoActionPerformed

    }//GEN-LAST:event_medicoActionPerformed

    private void enfermeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enfermeraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enfermeraActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try {
            Empleado empleado = controlEmpleado.consultarEmpleado(Integer.parseInt(identifiacion.getText()));
            direccion.setText(empleado.getDireccion());
            telefono.setText(empleado.getTelefono());
            nombre.setText(empleado.getNombre());
            email.setText(empleado.getEmail());
            salario.setText(String.valueOf(empleado.getSalario()));
            try {
                ControladorMedico medic1 = new ControladorMedico();
                Medico me = medic1.consultarMedico(empleado.getIdentificacion_empleado());
                if (me.getIdentificacion_empleado() == empleado.getIdentificacion_empleado()) {
                    medico.setSelected(true);
                }
            } catch (NullPointerException e) {
                System.out.println(e);

            }
            try {
                ControladorEnfermera medic1 = new ControladorEnfermera();
                Enfermera me = medic1.consultarEnfermera(empleado.getIdentificacion_empleado());
                if (me.getIdentificacion_empleado() == empleado.getIdentificacion_empleado()) {
                    enfermera.setSelected(true);
                }
            } catch (NullPointerException i) {

            }
            Area area = new Area();
            ControladorArea control = new ControladorArea();
            area = control.consultarArea(empleado.getCodigo_area());
            codigo_areas.removeAllItems();
            codigo_areas.addItem(area.getCodigo() + "," + area.getNombre());
            codigo_jefe.removeAllItems();
            if (!(empleado.getIdentificacion_jefe() == 0)) {
                Empleado aux = controlEmpleado.consultarEmpleado(empleado.getIdentificacion_jefe());
                codigo_jefe.addItem(aux.getIdentificacion_empleado() + "," + aux.getNombre());
            }
            if (empleado.getEstado().equals("activa")) {
                activa.setSelected(true);
            } else {
                inactiva.setSelected(true);
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Hubo un error, La identifiacion suministrada no existe en la base de datos", "Error", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_BuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JRadioButton activa;
    private javax.swing.JButton buscar_areas;
    private javax.swing.JButton buscar_jefes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> codigo_areas;
    private javax.swing.JComboBox<String> codigo_jefe;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton enfermera;
    private javax.swing.JTextField identifiacion;
    private javax.swing.JRadioButton inactiva;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton medico;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField salario;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
