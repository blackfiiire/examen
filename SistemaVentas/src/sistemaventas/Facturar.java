/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jhonny
 */
public class Facturar extends javax.swing.JFrame {
ConexionBD conexion = new ConexionBD();
Connection cn = conexion.conectar();
    /**
     * Creates new form Facturar
     */
    public Facturar() {
        initComponents();
        Total.setText(Variable.Total);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Vuelto = new javax.swing.JLabel();
        tfEfectivo = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Impact", 0, 80)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 90, 90));

        jLabel1.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 90, -1));

        Total.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("jLabel2");
        getContentPane().add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 120, 45));

        jLabel3.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("EFECTIVO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, -1));

        jLabel4.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VUELTO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        Vuelto.setFont(new java.awt.Font("Impact", 0, 28)); // NOI18N
        Vuelto.setForeground(new java.awt.Color(255, 255, 255));
        Vuelto.setText("jLabel5");
        getContentPane().add(Vuelto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, -1));

        tfEfectivo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        tfEfectivo.setForeground(new java.awt.Color(51, 102, 255));
        tfEfectivo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                tfEfectivoCaretUpdate(evt);
            }
        });
        tfEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEfectivoActionPerformed(evt);
            }
        });
        getContentPane().add(tfEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 100, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Layout.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEfectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEfectivoActionPerformed

    private void tfEfectivoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_tfEfectivoCaretUpdate
        if (tfEfectivo.getText().equals(""))
            {
                Vuelto.setText("");      
            }
            else
            {
                if (Double.parseDouble(tfEfectivo.getText()) < Double.parseDouble(Total.getText()))
                {
                     Vuelto.setText("");
                }
                else
                {
                    double cal = Double.parseDouble(tfEfectivo.getText()) - Double.parseDouble(Total.getText());
                    Vuelto.setText(Double.toString(cal));
                }     
            }
    }//GEN-LAST:event_tfEfectivoCaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        //total venta antigua
                        //Abrir Conexion
                        conexion.conectar();
                        //hacer update de rut cliente
                        String Query2 = "UPDATE venta SET Total ='" + Total.getText() + "' WHERE Numero ='" + Variable.NumeroVenta + "';";
                        Statement st2 = cn.createStatement();
                        st2.executeUpdate(Query2);
        //Nueva Venta
        //abrir nueva conexion
        conexion.conectar();
        int TotalV = 0;
        String n = "Null";
        String Emple = "0";
        //armar query
        String Query = "INSERT INTO venta (Numero, Fecha, Empleado, Cliente, Total) VALUES (" + n + ",'" + Variable.Fecha + "'," + Variable.Rut + "," + Emple + "," + TotalV + ")";
        //ejecutar query
        Statement st1 = cn.createStatement();
        st1.executeUpdate(Query);
        //cerrar conexion
        conexion.desconectar();
               
        //Cerrar ventana
        this.dispose();
    } catch (SQLException ex) {
        Logger.getLogger(Facturar.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Vuelto;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfEfectivo;
    // End of variables declaration//GEN-END:variables
}
