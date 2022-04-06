package cuc.edu.SotfwareProductos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class JfPRoductos extends javax.swing.JFrame {

    JFrPrincipal that;

    public JfPRoductos() {
        initComponents();
    }

    public JfPRoductos(JFrPrincipal that, ArrayList<Productos> productos, ArrayList<Productos_vendidos> productos_vendidos, int productos_o_vendidos) {
        initComponents();
        this.that = that;
        this.setVisible(true);
        this.that.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
        if (productos_o_vendidos == 0) {
            model.setColumnCount(5);
            model.setRowCount(productos.size());
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                tblProductos.setValueAt(productos.get(i).getReferencia(), i, 0);
                tblProductos.setValueAt(productos.get(i).getDescripcion(), i, 1);
                tblProductos.setValueAt(productos.get(i).getCantidad(), i, 2);
                tblProductos.setValueAt(productos.get(i).getValoruUnitario(), i, 3);
                tblProductos.setValueAt(productos.get(i).getValorTotal(), i, 4);
            }
        } else if (productos_o_vendidos == 1) {
            lblTittle.setText("Factura de productos");
            String[] identifiers = {"CC", "Nombre", "Apellido", "Referencia","Descripcion", "Cantidad", "Valor total"};
            model.setColumnIdentifiers(identifiers);
            model.setRowCount(productos_vendidos.size());
            for (int i = 0; i < tblProductos.getRowCount(); i++) {
                tblProductos.setValueAt(productos_vendidos.get(i).getCC(), i, 0);
                tblProductos.setValueAt(productos_vendidos.get(i).getNombreCliente(), i, 1);
                tblProductos.setValueAt(productos_vendidos.get(i).getApellido(), i, 2);
                tblProductos.setValueAt(productos_vendidos.get(i).getReferencia(), i, 3);
                tblProductos.setValueAt(productos_vendidos.get(i).getDescripcion(), i, 4);
                tblProductos.setValueAt(productos_vendidos.get(i).getCantidad(), i, 5);
                tblProductos.setValueAt(productos_vendidos.get(i).getValorTotal(), i, 6);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTittle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTittle.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lblTittle.setText("Inventario de productos");

        tblProductos.setAutoCreateRowSorter(true);
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Ref", "Descripcion", "Cantidad", "V. Unitario", "V. Total", "null", "null"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductos);
        if (tblProductos.getColumnModel().getColumnCount() > 0) {
            tblProductos.getColumnModel().getColumn(0).setResizable(false);
            tblProductos.getColumnModel().getColumn(1).setResizable(false);
            tblProductos.getColumnModel().getColumn(2).setResizable(false);
            tblProductos.getColumnModel().getColumn(3).setResizable(false);
            tblProductos.getColumnModel().getColumn(4).setResizable(false);
            tblProductos.getColumnModel().getColumn(5).setResizable(false);
            tblProductos.getColumnModel().getColumn(6).setResizable(false);
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(lblTittle))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAtras)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAtras)
                .addContainerGap(32, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(JfPRoductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfPRoductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfPRoductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfPRoductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfPRoductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
