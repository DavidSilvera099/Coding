package cuc.edu.serializacion3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionCuentas extends javax.swing.JFrame {

    ArrayList<Cuenta> cuentas = new ArrayList();
    DefaultTableModel model = new DefaultTableModel();

    public GestionCuentas() {
        initComponents();
        //Inicio de la configuración de tablas
        String[] identifiers = {"N° Cuenta", "Titular", "Saldo"};
        model.setColumnIdentifiers(identifiers);
        model.setRowCount(0);
        tblCuentas.setModel(model);
        //Final de la configuración de tablas
        //Inicio deserialización de la información
        ArrayList<Cuenta> data = deserializar();
        if (data != null) {
            cuentas = data;
        } else {System.out.println("Error de deserialización");}
        //Fin de la deserealización de la información
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTittle = new javax.swing.JLabel();
        lblSubTittle = new javax.swing.JLabel();
        txtNumCuenta = new javax.swing.JTextField();
        lblSubTittle2 = new javax.swing.JLabel();
        txtTitular = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuentas = new javax.swing.JTable();
        btnCrearCuenta = new javax.swing.JButton();
        btnConsignar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnEliminarCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTittle.setFont(new java.awt.Font("Dialog", 3, 28)); // NOI18N
        lblTittle.setText("Gestión de cuentas");

        lblSubTittle.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSubTittle.setText("Número de cuenta:");

        txtNumCuenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        lblSubTittle2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblSubTittle2.setText("Titular de la cuenta:");

        txtTitular.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tblCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblCuentas);

        btnCrearCuenta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnCrearCuenta.setText("Crear cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnConsignar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnConsignar.setText("Consignar");
        btnConsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsignarActionPerformed(evt);
            }
        });

        btnRetirar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnEliminarCuenta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEliminarCuenta.setText("Eliminar cuenta");
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsignar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetirar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCrearCuenta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSubTittle2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTitular))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSubTittle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTittle)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubTittle)
                    .addComponent(txtNumCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubTittle2)
                    .addComponent(txtTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCuenta)
                    .addComponent(btnConsignar)
                    .addComponent(btnRetirar)
                    .addComponent(btnEliminarCuenta))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        crearCuenta();
        actualizarTabla();
        serializar(cuentas);
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnConsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsignarActionPerformed
        consignar();
        actualizarTabla();
        serializar(cuentas);
    }//GEN-LAST:event_btnConsignarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        retirar();
        actualizarTabla();
        serializar(cuentas);
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed
        eliminarCuenta();
        serializar(cuentas);
    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(GestionCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCuentas().setVisible(true);
            }
        });
    }

    public void crearCuenta() {
        String num_cuenta = txtNumCuenta.getText();
        if (num_cuenta.equals("")) {
            JOptionPane.showMessageDialog(this, "Número de cuenta invalido", "Error", 0);
        } else {
            String nombre_titular = txtTitular.getText();
            if (nombre_titular.equals("")) {
                JOptionPane.showMessageDialog(this, "Nombre del titular invalido", "Error", 0);
            } else {
                Cuenta cuenta_aux = new Cuenta(num_cuenta, nombre_titular);
                cuentas.add(cuenta_aux);
                txtNumCuenta.setText("");
                txtTitular.setText("");
            }
        }
    }

    public void eliminarCuenta() {
        int seleccion = tblCuentas.getSelectedRow();
        if (seleccion != -1) {
            JOptionPane.showMessageDialog(this, "Cuenta N°: " + cuentas.get(seleccion).getNumeroCuenta() +
                    " eliminada correctamente.", "Info", 1);
            cuentas.remove(seleccion);
            model.removeRow(seleccion);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una cuenta", "Error", 0);
        }
    }
    
    public void consignar() {
        int seleccion = tblCuentas.getSelectedRow();
        if (seleccion != -1) {
            int saldo;
            try {
                saldo = Integer.parseInt(JOptionPane.showInputDialog(this, "Saldo a consignar", "Input", 3));
                if (cuentas.get(seleccion).consignar(saldo)) {
                    JOptionPane.showMessageDialog(this, "Consignación exitosa!", "Info", 1);
                } else {
                    JOptionPane.showMessageDialog(this, "Consignación no exitosa!", "Error", 0);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada erronea", "Error", WIDTH);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una cuenta", "Error", 0);
        }
    }

    public void retirar() {
        int seleccion = tblCuentas.getSelectedRow();
        if (seleccion != -1) {
            int saldo;
            try {
                saldo = Integer.parseInt(JOptionPane.showInputDialog(this, "Saldo a retirar", "Input", 3));
                if (cuentas.get(seleccion).retirar(saldo)) {
                    JOptionPane.showMessageDialog(this, "Retiro exitoso!", "Info", 1);
                } else {
                    JOptionPane.showMessageDialog(this, "Fondos insuficientes!", "Error", 0);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Entrada erronea", "Error", 0);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una cuenta", "Error", 0);
        }
    }

    public void actualizarTabla() {
        model.setRowCount(cuentas.size());
        for (int i = 0; i < tblCuentas.getRowCount(); i++) {
            tblCuentas.setValueAt(cuentas.get(i).getNumeroCuenta(), i, 0);
            tblCuentas.setValueAt(cuentas.get(i).getTitularCuenta(), i, 1);
            tblCuentas.setValueAt(cuentas.get(i).getSaldoCuenta(), i, 2);
        }
    }

    public void serializar(Object obj) {
        try {
            FileOutputStream archivo = new FileOutputStream("cuentas.dat");
            ObjectOutputStream outputStream = new ObjectOutputStream(archivo);
            outputStream.writeObject(obj);
            outputStream.close();
            archivo.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Archivo de almacenamiento no encontrado", "Error", 0);
        } catch (IOException ex) {
            Logger.getLogger(GestionCuentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Cuenta> deserializar() {
        try {
            FileInputStream archivo = new FileInputStream("cuentas.dat");
            ObjectInputStream inputStream = new ObjectInputStream(archivo);
            ArrayList<Cuenta> data = (ArrayList<Cuenta>)inputStream.readObject();
            inputStream.close();
            archivo.close();
            return data;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCuentas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(GestionCuentas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GestionCuentas.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsignar;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSubTittle;
    private javax.swing.JLabel lblSubTittle2;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblCuentas;
    private javax.swing.JTextField txtNumCuenta;
    private javax.swing.JTextField txtTitular;
    // End of variables declaration//GEN-END:variables
}
