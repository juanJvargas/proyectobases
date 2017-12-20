/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controlador.ControladorEnfermera;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import logica.*;
import controlador.*;
import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class ModificarEnfermera extends javax.swing.JFrame {

    int codigo;
    ControladorEnfermera controladorEnfermera = new ControladorEnfermera();
    TableRowSorter<TableModel> sorter1;
    Empleado empleado = new Empleado();
    ControladorEmpleado controlEmpleado = new ControladorEmpleado();

    /**
     * Creates new form ModificarEnfermera
     */
    public ModificarEnfermera() {
        initComponents();
        acomodarTabla();
    }

    public void iniciar(int codigo1, Empleado empleado1) {
        this.empleado = empleado1;
        this.codigo = codigo1;
        Enfermera enfermera = controladorEnfermera.consultarEnfermera(codigo);
        System.out.println(String.valueOf(enfermera.getAnos_experiencia()));
        anos_experiencia.setText(String.valueOf(enfermera.getAnos_experiencia()));
        habilidades.setText(enfermera.getCodigo_habilidad());

    }

    private void acomodarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        sorter1 = new TableRowSorter<>(modelo);
        jTable1.setRowSorter(sorter1);

        ArrayList<String> v = new ArrayList();
        v = controladorEnfermera.habilidades();

        int i = 0;

        while (i != v.size()) {
            Vector u = new Vector();

            u.add(v.get(i));
            u.add(v.get(i + 1));
            System.out.println(u.get(i));
            modelo.addRow(u);
            jTable1.setModel(modelo);
            i += 2;
        }

        // TODO add your handling code here:
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        habilidades = new javax.swing.JTextField();
        anos_experiencia = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LISTA DE HABILIDADES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 545, 31));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Ides de habilidades:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 172, -1));
        getContentPane().add(habilidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 169, 369, -1));
        getContentPane().add(anos_experiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 44, 360, -1));

        agregar.setText("Modificar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });
        getContentPane().add(agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        jLabel6.setText("Advertencia: escriba el id de las habilidades separadas por \",\" ejemplo : \"1,2,3\"");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 195, 545, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Codigo", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 107, 545, 56));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Años de expetiencia:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, 181, -1));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMACION PROFESIONAL.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 560, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        Enfermera enfermera = new Enfermera();
        try {
            enfermera.setAnos_experiencia(Integer.parseInt(anos_experiencia.getText()));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Hubo un error, los años de experiencia deben ser numericos", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (controladorEnfermera.buscarHabilidades(habilidades.getText().split(",")) && !habilidades.getText().endsWith(",")) {
            enfermera.setCodigo_habilidad(habilidades.getText());
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error, las habilidades deben tener el formato #,#,#,......#\n Ademas los codigos deben coincidir con los presentados en la tabla", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        enfermera.setIdentificacion_empleado(codigo);

        Usuario u = new Usuario();
        ControladorUsuarios controlUsuario = new ControladorUsuarios();
        controlEmpleado.modificarEmpleado(empleado);
        controladorEnfermera.modificarEnfermera(enfermera);
        u.setEstado(empleado.getEstado());
        u.setLogin(String.valueOf(empleado.getIdentificacion_empleado()));
        u.setPassword(String.valueOf(empleado.getIdentificacion_empleado()));
        u.setTipo("enfermera");
        controlUsuario.modificarUsuario(u);

        InterfazAdministrador interfaz = new InterfazAdministrador();
        interfaz.setVisible(true);
        dispose();
    }//GEN-LAST:event_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEnfermera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEnfermera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JTextField anos_experiencia;
    private javax.swing.JTextField habilidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
