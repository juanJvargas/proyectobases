/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import logica.*;

/**
 *
 * @author jdtorres
 */
public class InterfazMedico extends javax.swing.JFrame {

    Usuario usuarioActual;
    AgregarRegistro agregarRegistro;
    Formular interfazFormulas;
    ReportesHC historiaClinica;
    ConsultarFormula consultarFormula;

    /**
     * Creates new form InterfazMedico
     */
    public InterfazMedico() {
        initComponents();
    }

    public InterfazMedico(Usuario usuario) {
        initComponents();
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

        agregarB = new javax.swing.JButton();
        formularB = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        consultarFB = new javax.swing.JButton();
        campana = new javax.swing.JButton();
        Modificar_campana = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        agregarB.setText("Agregar registro");
        agregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBActionPerformed(evt);
            }
        });
        getContentPane().add(agregarB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 190, -1));

        formularB.setText("Formular medicamentos");
        formularB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularBActionPerformed(evt);
            }
        });
        getContentPane().add(formularB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 190, -1));

        jButton2.setText("Reporte Citas Medico Por MES");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, -1));

        jButton3.setText("Reporte Citas Medico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 190, -1));

        jButton1.setText("Consultar historia clínica");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        consultarFB.setText("Consultar formulas");
        consultarFB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarFBActionPerformed(evt);
            }
        });
        getContentPane().add(consultarFB, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, -1));

        campana.setText("Agregar campaña");
        campana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campanaActionPerformed(evt);
            }
        });
        getContentPane().add(campana, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 190, -1));

        Modificar_campana.setText("Modificar Campaña");
        Modificar_campana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_campanaActionPerformed(evt);
            }
        });
        getContentPane().add(Modificar_campana, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 190, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Medico");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 8, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/images/fondo-blanco.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBActionPerformed
        // TODO add your handling code here:
        agregarRegistro = new AgregarRegistro(usuarioActual);
        agregarRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_agregarBActionPerformed

    private void formularBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularBActionPerformed
        // TODO add your handling code here:
        interfazFormulas = new Formular(usuarioActual);
        interfazFormulas.setVisible(true);
        dispose();
    }//GEN-LAST:event_formularBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        historiaClinica = new ReportesHC(usuarioActual);
        historiaClinica.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void consultarFBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarFBActionPerformed
        // TODO add your handling code here:
        consultarFormula = new ConsultarFormula(usuarioActual);
        consultarFormula.setVisible(true);
        dispose();
    }//GEN-LAST:event_consultarFBActionPerformed

    private void campanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campanaActionPerformed
        AgregarCampanaPrevencion campana = new AgregarCampanaPrevencion();
        campana.setVisible(true);
        dispose();
    }//GEN-LAST:event_campanaActionPerformed

    private void Modificar_campanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_campanaActionPerformed
        ModificarCampanasPrevencion campana = new ModificarCampanasPrevencion();
        campana.setVisible(true);
        dispose();
    }//GEN-LAST:event_Modificar_campanaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ReporteCitasMedicoPorMes i = new ReporteCitasMedicoPorMes();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ReporteCitasDeMedico i = new ReporteCitasDeMedico();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Modificar_campana;
    private javax.swing.JButton agregarB;
    private javax.swing.JButton campana;
    private javax.swing.JButton consultarFB;
    private javax.swing.JButton formularB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
