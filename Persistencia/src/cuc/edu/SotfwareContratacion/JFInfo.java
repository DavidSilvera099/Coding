package cuc.edu.SotfwareContratacion;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class JFInfo extends javax.swing.JFrame {

    JFPrincipal that;

    public JFInfo() {
        initComponents();
    }

    public JFInfo(JFPrincipal that, ArrayList<Persona> personas, ArrayList<Empleado> empleados, int persona_empleado) {
        initComponents();
        this.that = that;
        this.setVisible(true);
        this.that.setVisible(false);
        DefaultTableModel model = (DefaultTableModel)tblPersonas.getModel();
        if (persona_empleado == 0) {
            model.setRowCount(personas.size());
            for (int i = 0; i < tblPersonas.getRowCount(); i++) {
                tblPersonas.setValueAt(personas.get(i).getID(), i, 0);
                tblPersonas.setValueAt(personas.get(i).getTipo_ID(), i, 1);
                tblPersonas.setValueAt(personas.get(i).getNombre(), i, 2);
                tblPersonas.setValueAt(personas.get(i).getApellido(), i, 3);
                tblPersonas.setValueAt(personas.get(i).getDireccion(), i, 4);
                tblPersonas.setValueAt(personas.get(i).getCorreo(), i, 5);
                tblPersonas.setValueAt(personas.get(i).getTelefono(), i, 6);
            }
        } else if (persona_empleado == 1) {
            lblTittle.setText("Empleados registrados");
            String[] identifiers = {"ID", "Tipo ID", "Nombre", "Apellido", "Dirección", "Correo", "Teléfono", "Sueldo", "Tipo contrato"};
            model.setColumnIdentifiers(identifiers);
            model.setRowCount(empleados.size());
            for (int i = 0; i < tblPersonas.getRowCount(); i++) {
                tblPersonas.setValueAt(empleados.get(i).getID(), i, 0);
                tblPersonas.setValueAt(empleados.get(i).getTipo_ID(), i, 1);
                tblPersonas.setValueAt(empleados.get(i).getNombre(), i, 2);
                tblPersonas.setValueAt(empleados.get(i).getApellido(), i, 3);
                tblPersonas.setValueAt(empleados.get(i).getDireccion(), i, 4);
                tblPersonas.setValueAt(empleados.get(i).getCorreo(), i, 5);
                tblPersonas.setValueAt(empleados.get(i).getTelefono(), i, 6);
                tblPersonas.setValueAt(empleados.get(i).getSueldo(), i, 7);
                tblPersonas.setValueAt(empleados.get(i).getTipo_contrato(), i, 8);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTittle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTittle.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblTittle.setText("Personas registradas");

        tblPersonas.setAutoCreateRowSorter(true);
        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tipo de ID", "Nombre", "Apellido", "Dirección", "Correo", "Teléfono", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonas);
        if (tblPersonas.getColumnModel().getColumnCount() > 0) {
            tblPersonas.getColumnModel().getColumn(0).setResizable(false);
            tblPersonas.getColumnModel().getColumn(1).setResizable(false);
            tblPersonas.getColumnModel().getColumn(2).setResizable(false);
            tblPersonas.getColumnModel().getColumn(3).setResizable(false);
            tblPersonas.getColumnModel().getColumn(4).setResizable(false);
            tblPersonas.getColumnModel().getColumn(5).setResizable(false);
            tblPersonas.getColumnModel().getColumn(6).setResizable(false);
            tblPersonas.getColumnModel().getColumn(7).setResizable(false);
            tblPersonas.getColumnModel().getColumn(8).setResizable(false);
        }

        btnAtras.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 316, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblTittle)
                                .addGap(299, 299, 299))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAtras)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAtras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.setVisible(false);
        that.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(JFInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblPersonas;
    // End of variables declaration//GEN-END:variables
}
