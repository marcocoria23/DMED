/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas_TEPJF;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mx.org.inegi.ExportaXlsm.TEPJF.Exporta_errores_insert;
import mx.org.inegi.QuerysGeneral.TEPJF.Querys;

/**
 *
 * @author ANTONIO.CORIA
 */
public class Errores_Insert_TR extends javax.swing.JFrame {

    /**
     * Creates new form Errores_Insert_TR
     */
    
    private boolean ventanaAbierta;
    
    public Errores_Insert_TR() {
        initComponents();
        this.setLocationRelativeTo(null);//JFRAME LOCALIZACION AL CENTRO DE LA PANTALLA
        this.getContentPane().setBackground(Color.WHITE);//JFRAME COLOR POR DEFAULT BLANCO
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(25);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(500);
        jTextArea1.setVisible(false);
        jProgressBar1.setVisible(false);
        ExportaB.setVisible(false);
        PkB.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ExportaB = new javax.swing.JButton();
        PkB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo CNG.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tabla", "ID", "Tipo_Error", "Exception"
            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane3.setViewportView(jTable1);

        ExportaB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Exporta.png"))); // NOI18N
        ExportaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportaBActionPerformed(evt);
            }
        });

        PkB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LLAVEPK.png"))); // NOI18N
        PkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PkBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExportaB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PkB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExportaB, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PkB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Thread(() -> {
            jButton1.setEnabled(false);
            limpiarTabla();
            MuestraError();
            jButton1.setEnabled(true);
        }).start();

        }

        public void limpiarTabla() {
             ExportaB.setVisible(false);
             PkB.setVisible(false);
            DefaultTableModel TablaError = (DefaultTableModel) jTable1.getModel();
            while (TablaError.getRowCount() > 0) {
                TablaError.removeRow(0);
            }
        }

        public void MuestraError() {
            jTextArea1.setVisible(false);
            jProgressBar1.setVisible(false);
            String Texto = "";
            String regNI = "", regTMP = "", regTR = "";
            ArrayList<String[]> ArrayErroresIns;
            Querys Q = new Querys();
            String[] ArrayTablasTMP = new String[4];
            ArrayTablasTMP[0] = "TEMP_TR_TEPJF_ACTORES";
            ArrayTablasTMP[1] = "TEMP_TR_TEPJF_EXPEDIENTE";
            ArrayTablasTMP[2] = "TEMP_TR_TEPJF_RESOLUCIONES";
            ArrayTablasTMP[3] = "TEMP_TR_TEPJF_RESPONSABLES";
            String[] ArrayTablasTR = new String[4];
            ArrayTablasTR[0] = "TR_TEPJF_ACTORES";
            ArrayTablasTR[1] = "TR_TEPJF_EXPEDIENTE";
            ArrayTablasTR[2] = "TR_TEPJF_RESOLUCIONES";
            ArrayTablasTR[3] = "TR_TEPJF_RESPONSABLES";
            ArrayErroresIns = Q.TotalErrores_insert_tepjftr();
            jProgressBar1.setVisible(true);
            int Contador = 25;
            for (int i = 0; i < 4; i++) {
                regNI = Q.Total_Reg_NITR(ArrayTablasTR[i]);
                regTMP = Q.Total_Reg_TMP(ArrayTablasTMP[i]);
                regTR=Q.Total_Reg_TR(ArrayTablasTR[i]);
                Texto = Texto + "" + ArrayTablasTR[i] + ": \n"
                + "Reg_TMP:" + regTMP + "  Reg_TR:" + regTR + " Reg_NoIn:"+ regNI+"\n \n";
                jProgressBar1.setValue(Contador);
                Contador = Contador + 25;
            }
            jTextArea1.setText(Texto);
            jTextArea1.setVisible(true);

            if (ArrayErroresIns.size() > 0) {
                ExportaB.setVisible(true);
                PkB.setVisible(true);
                String[] errorarray;
                String part0 = "", part1 = "", part2 = "", part3 = "";
                DefaultTableModel TablaError = (DefaultTableModel) jTable1.getModel();
                Object[] fila = new Object[5];
                for (int j = 0; j < ArrayErroresIns.size(); j++) {
                    String Datos = Arrays.toString(ArrayErroresIns.get(j)).replace("[", "").replace("]", "");
                    errorarray = Datos.split(",");
                    part0 = errorarray[0].trim();
                    part1 = errorarray[1].trim();
                    part2 = errorarray[2].trim();
                    part3 = errorarray[3].trim();
                    fila[0] = part0;
                    fila[1] = part1;
                    fila[2] = part2;
                    fila[3] = part3;
                    TablaError.addRow(fila);
                    Class<?> col_class = jTable1.getColumnClass(0);
                    jTable1.setDefaultEditor(col_class, null);
                }

            } else {

                JOptionPane.showMessageDialog(null, "No se encontraron registros con Error de insert", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        ventanaAbierta=false;
    }//GEN-LAST:event_formWindowClosing

    private void ExportaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportaBActionPerformed
        // TODO add your handling code here:
        
         Exporta_errores_insert ErroresInsert = new Exporta_errores_insert();
        try {
            ErroresInsert.exportarExcel(jTable1);
        } catch (IOException ex) {
            Logger.getLogger(Errores_Insert_TMP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ExportaBActionPerformed

    private void PkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PkBActionPerformed
        // TODO add your handling code here:
        Querys Q = new Querys();  
        int resp = JOptionPane.showConfirmDialog(null, "¿Desea modificar id Duplicados en BD?", "Alerta!", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                Q.Update_IdActores();
                Q.Update_IdResponsables();
                Q.Update_IdResoluciones();
                JOptionPane.showMessageDialog(null, "Se actualizaron correctamente los id duplicados", "Update",resp);
            }else{
               JOptionPane.showMessageDialog(null, "Confirmacion cancelada", "Cancel",resp);
               
            }
        
        
    }//GEN-LAST:event_PkBActionPerformed

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
            java.util.logging.Logger.getLogger(Errores_Insert_TR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Errores_Insert_TR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Errores_Insert_TR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Errores_Insert_TR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Errores_Insert_TR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExportaB;
    private javax.swing.JButton PkB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
