/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventas;

/**
 *
 * @author rancagua
 */
public class JIVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form JIVentas
     */
    public JIVentas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        Fecha1 = new javax.swing.JLabel();
        Empleado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fondo = new javax.swing.JLabel();

        setTitle("Ventas");
        setPreferredSize(new java.awt.Dimension(1264, 493));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° venta", "Producto", "Detalle", "Cantidad", "Precio Unitario", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(790, 60, 452, 330);

        Fecha.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setText("USTED ES ATENDIDO POR :");
        getContentPane().add(Fecha);
        Fecha.setBounds(430, 10, 180, 50);

        jLabel1.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL :$");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(830, 400, 150, 50);

        Total.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("TOTAL :$");
        getContentPane().add(Total);
        Total.setBounds(990, 400, 150, 50);

        Fecha1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Fecha1.setForeground(new java.awt.Color(255, 255, 255));
        Fecha1.setText("FECHA");
        getContentPane().add(Fecha1);
        Fecha1.setBounds(10, 10, 140, 50);

        Empleado.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Empleado.setForeground(new java.awt.Color(255, 255, 255));
        Empleado.setText("USTED ES ATENDIDO POR :");
        getContentPane().add(Empleado);
        Empleado.setBounds(610, 10, 180, 50);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 60, 770, 10);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Layout.jpg"))); // NOI18N
        fondo.setPreferredSize(new java.awt.Dimension(1264, 493));
        fondo.setRequestFocusEnabled(false);
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 1270, 493);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Empleado;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Fecha1;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
