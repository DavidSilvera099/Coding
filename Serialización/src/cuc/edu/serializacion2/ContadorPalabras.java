package cuc.edu.serializacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ContadorPalabras extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    ArrayList<String[]> data = new ArrayList(); //ArrayList que almacena vectores String[].
    //En ellos se guardan: la ruta del archivo, la palabra buscada y el número de veces que se
    //encontró en el archivo de texto.

    public ContadorPalabras() {
        initComponents();
        //Inicio configuración de la tabla
        String[] identifiers = {"archivo", "Palabra", "Coincidencias"};
        model.setColumnIdentifiers(identifiers);
        model.setRowCount(0);
        tblDatos.setModel(model);
        //Final configuración de la tabla
        //Inicio deserialización de la información
        try {
            FileInputStream archivo_ser = new FileInputStream("contador.dat");
            ObjectInputStream inputStream = new ObjectInputStream(archivo_ser);
            data = (ArrayList<String[]>)inputStream.readObject();
            inputStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ContadorPalabras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ContadorPalabras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ContadorPalabras.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Final deserialización de la información
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTittle = new javax.swing.JLabel();
        lblSubTittle = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnContar = new javax.swing.JButton();
        lblCoincidencias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblSubTittle1 = new javax.swing.JLabel();
        txtPalabra = new javax.swing.JTextField();
        lblContador = new javax.swing.JLabel();
        btnEliminarFila = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTittle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTittle.setText("Contador de palabras");

        lblSubTittle.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSubTittle.setText("Ruta del archivo:");

        txtRuta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutaActionPerformed(evt);
            }
        });

        btnContar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnContar.setText("Contar");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        lblCoincidencias.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblCoincidencias.setText("Coincidencias: ");

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatos);

        lblSubTittle1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblSubTittle1.setText("Palabra a contar:");

        txtPalabra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        lblContador.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnEliminarFila.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnEliminarFila.setText("Eliminar fila");
        btnEliminarFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFilaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTittle)
                .addGap(291, 291, 291))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSubTittle1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnContar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                        .addComponent(btnEliminarFila))
                    .addComponent(jScrollPane1)
                    .addComponent(txtRuta)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubTittle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCoincidencias)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblContador)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubTittle1)
                    .addComponent(txtPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContar)
                    .addComponent(btnEliminarFila))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoincidencias)
                    .addComponent(lblContador))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        contarPalabras();
        actualizarTabla();
        guardarInformacion();
    }//GEN-LAST:event_btnContarActionPerformed

    private void btnEliminarFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFilaActionPerformed
        eliminarFila();
        actualizarTabla();
        guardarInformacion();
    }//GEN-LAST:event_btnEliminarFilaActionPerformed

    private void txtRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutaActionPerformed

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
            java.util.logging.Logger.getLogger(ContadorPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContadorPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContadorPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContadorPalabras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContadorPalabras().setVisible(true);
            }
        });
    }

    public void contarPalabras() {
        /*Ejecición completa del conteo de palabras.
        Toma la palabra a contar, define ciertas variantes a tener en cuenta,
        realiza la busqueda y almacena los datos resultantes dentro de un arreglo.
        */
        String ruta = txtRuta.getText();
        if (ruta.equals("")) {
            JOptionPane.showMessageDialog(this, "Ruta no especificada.", "Error", 0);
        } else {
            String palabra_buscar1 = txtPalabra.getText(); //Palabra a buscar indicacda por el usuario
            String palabra_buscar2 = palabra_buscar1+"."; //Posible variante de la palabra
            String palabra_buscar3 = palabra_buscar1+"..."; //Posible varienta de la palabra
            String palabra_buscar4 = palabra_buscar1+","; //Posible varienta de la palabra
            palabra_buscar1 = palabra_buscar1.toLowerCase(); //LowerCase para mayor compatibilidad
            
            int contador = 0; //Variable contrador de palabras
            File archivo_texto = new File(ruta); //Referencia al archivo de texto en la ruta indicada
            try {
                Scanner scanner = new Scanner(archivo_texto);
                while (scanner.hasNext()) { //Read palabra a palabra (Teniendo en cuenta que la separación es por espacios)
                    String palabra = scanner.next();
                    palabra = palabra.toLowerCase();
                    if ((palabra.equals(palabra_buscar1))||(palabra.equals(palabra_buscar2))
                            ||(palabra.equals(palabra_buscar3))||(palabra.equals(palabra_buscar4))) {
                        contador++;
                    }
                }
                scanner.close();
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Archivo no encontrado.\n Evita las comillas al inicio y final de la ruta.", "info", 1);
            }
            String contadorS = String.valueOf(contador); //Asigna el valor de contador a una variable String
            lblContador.setText(contadorS); //Muestra el número de coincidencias en la intefaz
            String[] info = {ruta, palabra_buscar1, contadorS}; //Crea un vector String[] con la información del conteo
            data.add(info);
        }
    }

    public void actualizarTabla() {
        /*Lee la información del arreglo y la muestra en una tabla.*/
        model.setRowCount(data.size());
        for (int i = 0; i < tblDatos.getRowCount(); i++) {
            tblDatos.setValueAt(data.get(i)[0], i, 0);
            tblDatos.setValueAt(data.get(i)[1], i, 1);
            tblDatos.setValueAt(data.get(i)[2], i, 2);
        }
    }
    
    public void guardarInformacion() {
        try {
            FileOutputStream archivo_ser = new FileOutputStream("contador.dat");
            ObjectOutputStream outputStream = new ObjectOutputStream(archivo_ser);
            outputStream.writeObject(data);
            outputStream.close();
            archivo_ser.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Archivo de almacenamiento no encontrado", "Error", 0);
        } catch (IOException ex) {
            Logger.getLogger(ContadorPalabras.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void eliminarFila() {
        try {
            int seleccion = tblDatos.getSelectedRow();
            model.removeRow(seleccion);
            data.remove(seleccion);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Selección nula.", "Error", 0);
        }
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JButton btnEliminarFila;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCoincidencias;
    private javax.swing.JLabel lblContador;
    private javax.swing.JLabel lblSubTittle;
    private javax.swing.JLabel lblSubTittle1;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtPalabra;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
