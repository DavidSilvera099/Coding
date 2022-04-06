package cuc.edu.SotfwareProductos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JFrPrincipal extends javax.swing.JFrame {

    ArrayList<Productos> productosA = new ArrayList();
    ArrayList<Productos_vendidos> pvendidosA = new ArrayList();

    public JFrPrincipal() {
        initComponents();
        //Para leer los datos guardados en el txt
        LeerArchivoProductos();
        LeerArchivoVentas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnVender = new javax.swing.JButton();
        btnEliminarVenta = new javax.swing.JButton();
        btnMostrarVentas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnInsertarProductos = new javax.swing.JButton();
        btnEliminarProductos = new javax.swing.JButton();
        btnListarProductos = new javax.swing.JButton();
        btnCreProdPosEs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Electrodomésticos ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("θptical ");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnVender.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnVender.setText("Vender ");
        btnVender.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnEliminarVenta.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEliminarVenta.setText("Eliminar venta");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });

        btnMostrarVentas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnMostrarVentas.setText("Mostrar ventas");
        btnMostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarVentasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("  Ventas");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 88, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnMostrarVentas)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnEliminarVenta)
                                .addGap(93, 93, 93))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnInsertarProductos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnInsertarProductos.setText("Insertar productos");
        btnInsertarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarProductosActionPerformed(evt);
            }
        });

        btnEliminarProductos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEliminarProductos.setText("Eliminar productos");
        btnEliminarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductosActionPerformed(evt);
            }
        });

        btnListarProductos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnListarProductos.setText("Listar productos");
        btnListarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProductosActionPerformed(evt);
            }
        });

        btnCreProdPosEs.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCreProdPosEs.setText("Asignar posición");
        btnCreProdPosEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreProdPosEsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Inventario");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsertarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCreProdPosEs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertarProductos)
                    .addComponent(btnEliminarProductos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreProdPosEs)
                    .addComponent(btnListarProductos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menú principal");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarProductosActionPerformed
        Productos agregarProductos = AgregarProductos(productosA, pvendidosA);
        if (agregarProductos != null) {
            productosA.add(agregarProductos);
        }
    }//GEN-LAST:event_btnInsertarProductosActionPerformed

    private void btnEliminarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductosActionPerformed
        Productos productos_eliminar = eliminarProductos(productosA);
        if (productos_eliminar != null) {
            productosA.remove(productos_eliminar);
        }
        sobreescribirProductos(productosA);
    }//GEN-LAST:event_btnEliminarProductosActionPerformed

    private void btnListarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProductosActionPerformed
        JfPRoductos JFInfor = new JfPRoductos(this, productosA, pvendidosA, 0);
    }//GEN-LAST:event_btnListarProductosActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        Productos_vendidos agregarP = AgregarVentas();
        if (agregarP != null) {
            pvendidosA.add(agregarP);
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
        Productos_vendidos producto_eliminar = eliminarVentasP(pvendidosA);
        if (producto_eliminar != null) {
            pvendidosA.remove(producto_eliminar);
        }
        sobreescribirVentas(pvendidosA);
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnMostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarVentasActionPerformed
        JfPRoductos JFInfo = new JfPRoductos(this, productosA, pvendidosA, 1);
    }//GEN-LAST:event_btnMostrarVentasActionPerformed

    private void btnCreProdPosEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreProdPosEsActionPerformed
        crearProdPosE();
    }//GEN-LAST:event_btnCreProdPosEsActionPerformed

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
            java.util.logging.Logger.getLogger(JFrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrPrincipal().setVisible(true);
            }
        });
    }

    //Métodos relacionados con el tratamiento de objetos tipo productos
    public Productos AgregarProductos(ArrayList<Productos> productoses, ArrayList<Productos_vendidos> productos_vendidoses) {
        //Recibe los datos necesarios para instancia un objeto tipo producto y lo retorna
        //Si la referencia ingresada está registrada retorna null
        String referencia = JOptionPane.showInputDialog(this, "Referencia: ", "Input", 1);
        if (referencia != null) { //Si la operación de ingreso de datos no fue cancelada
            boolean registrado = buscarReferencia(referencia, productosA, pvendidosA);//Indica si la referencia está registrada
            if (registrado) { //Si la referencia ha sido registrada
                JOptionPane.showMessageDialog(this, "Referencia ya registrada", "Info", 1);
                return null;
            } else { //Si la referencia no ha sido registrada    ValoruUnitario, ValorTotal
                String Descripcion = JOptionPane.showInputDialog(this, "Descripcion: ", "Input", 1);
                if (Descripcion != null) { //Si la operación de ingreso de datos no fue cancelada

                    while (true) {
                        String cantidad = JOptionPane.showInputDialog(this, "Cantidad: ", "Input", 1);
                        if (cantidad != null) { //Si la operación de ingreso de datos no fue cancelada
                            int cantidad_aux = Integer.parseInt(cantidad);
                            if (cantidad_aux <= 0) {
                                JOptionPane.showMessageDialog(this, "La cantidad debe ser mayor a cero");
                                continue;
                            } else {
                                String ValorUnitario = JOptionPane.showInputDialog(this, "Valor Unitario: ", "Input", 1);
                                if (ValorUnitario != null) { //Si la operación de ingreso de datos no fue cancelada
                                    int ValorTotal = Integer.parseInt(cantidad) * Integer.parseInt(ValorUnitario);
                                    //Toda la informacion de persona                                      
                                    String informacionProductos = referencia + " " + Descripcion
                                            + " " + cantidad + " " + ValorUnitario + " " + ValorTotal;
                                    //Invocacion del metodo que guarda la informacion en un txt
                                    escribirDatosProductos(informacionProductos);
                                    Productos productos_aux = new Productos(referencia, cantidad, cantidad, ValorUnitario, String.valueOf(ValorTotal));
                                    return productos_aux;

                                } else {
                                    return null;//Si la operación de ingreso de datos fue cancelada
                                }
                            }

                        } else {
                            return null;
                        }

                    }

                } else {
                    return null; //Si la operación de ingreso de datos fue cancelada
                }
            }
        } else {
            return null; //Si la operación de ingreso de datos fue cancelada
        }
    }

    public void escribirVentas(String informacion) {
        //Crear el archivo para personas
        File archivo = new File("Ventas.txt");
        try {
            //Instanciar el obj para escribir
            FileWriter escritura = new FileWriter(archivo, true);
            //Escritura
            escritura.write("\n");
            escritura.write(informacion);
            JOptionPane.showMessageDialog(this, "Se escribió correctamente");
            //Cierre del flujo            
            escritura.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo escribir");
        }

    }

    public void escribirDatosProductos(String informacion) {
        //Toma la ruta del archivo txt para personas
        File archivo = new File("Productos.txt");
        try {
            //Instanciar el obj para escribir
            FileWriter escritura = new FileWriter(archivo, true);
            //Escritura
            escritura.write("\n");
            escritura.write(informacion);
            JOptionPane.showMessageDialog(this, "Se escribió correctamente");
            //Cierre del flujo            
            escritura.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo escribir");
        }
    }

    public void sobreescribirVentas(ArrayList<Productos_vendidos> productosvendidos) {
        //Toma la ruta del archivo txt para personas
        File archivo = new File("Ventas.txt");
        try {
            //Instanciar el obj para escribir
            FileWriter escritura = new FileWriter(archivo);
            //Escritura
            for (Productos_vendidos productos : productosvendidos) {
                escritura.write("\n" + productos.Referencia + " ");
                escritura.write(productos.Descripcion + " ");
                escritura.write(productos.cantidad + " ");
                escritura.write(productos.ValoruUnitario + " ");
                escritura.write(productos.ValorTotal + " ");
                escritura.write(productos.CC + " ");
                escritura.write(productos.NombreCliente + " ");
                escritura.write(productos.Apellido);
            }
            JOptionPane.showMessageDialog(this, "Se eliminó del archivo ventas");
            //Cierre del flujo            
            escritura.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo escribir");
        }
    }

    public void sobreescribirProductos(ArrayList<Productos> productoses) {
        //Toma la ruta del archivo txt para personas
        File archivo = new File("Productos.txt");
        try {
            //Instanciar el obj para escribir
            FileWriter escritura = new FileWriter(archivo);
            //Escritura
            for (Productos productos : productoses) {
                escritura.write("\n" + productos.Referencia + " ");
                escritura.write(productos.Descripcion + " ");
                escritura.write(productos.cantidad + " ");
                escritura.write(productos.ValoruUnitario + " ");
                escritura.write(productos.ValorTotal);
            }
            JOptionPane.showMessageDialog(this, "Se eliminó del archivo poductos");
            //Cierre del flujo            
            escritura.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo escribir");
        }
    }

    public Productos eliminarProductos(ArrayList<Productos> productoses) {
        //Realiza una busqueda por referencia y si hay coincidencias elimina el objeto con la referencia que lo identifica
        Productos productos_eliminar = null; //Toma por valor el objeto Producto a eliminar
        String referencia = JOptionPane.showInputDialog(this, "Referencia del producto a eliminar: ", "Eliminar", 1);
        if (referencia != null) { //Si la operación de ingreso de datos no fue cancelada
            Iterator<Productos> productos_iterator = productosA.iterator();
            while (productos_iterator.hasNext()) {
                Productos productos_aux = productos_iterator.next();
                if (referencia.equals(productos_aux.Referencia)) { //Si la referencia ingresada corresponde a una registrada
                    JOptionPane.showMessageDialog(this, "¡Se eliminó exitosamente!", "Info", 1);
                    productos_eliminar = productos_aux;
                    return productos_eliminar; //Retorna el producto a eliminar
                }
            }
            JOptionPane.showMessageDialog(this, "No se encontró la referencia", "Info", 1);
            return null; //Si la referencia no coincide con ninguno de los productos
        } else {
            return null; //Si la operación de ingreso de datos fue cancelada
        }

    }

    public void crearProdPosE() {
        //Crea objeto productos en una posicion especifica
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(this, "Posición: ", "Input", 1));
        productosA.add(posicion, AgregarProductos(productosA, pvendidosA));
    }

    public void LeerArchivoVentas() {
        try {
            //Toma la ruta del archivo
            File archivo = new File("Ventas.txt");
            //Toma el archivo de la ruta especificada
            Scanner scan = new Scanner(archivo);
            //Lee el archivo      
            while (scan.hasNextLine()) {//Verifica si quedan palabras por leer
                //El metodo lee La persona pero no diferencia sus atributos productos_aux.Referencia+" "+ productos_aux.Descripcion+" "+ productos_aux.cantidad+" "+ 
                //productos_aux.ValoruUnitario+" "+ productos_aux.ValorTotal+" "+ ref+" "+ input_cc+" "+ nombre_cliente;
                String Referencia = scan.next();
                String Descripcion = scan.next();
                String cantidad = scan.next();
                String ValoruUnitario = scan.next();
                String ValorTotal = scan.next();
                String CC = scan.next();
                String NombreClientes = scan.next();
                String Apellido = scan.next();
                //Creo el objeto tipo productos con los datos leidos
                Productos_vendidos producDatos = new Productos_vendidos(Referencia, Descripcion, cantidad, ValoruUnitario, ValorTotal, CC, NombreClientes, Apellido);
                //Añado los datos (Objeto) al arrayList
                pvendidosA.add(producDatos);
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo leer la ruta, quita comillas", "Error", 1);
        }
    }

    public void LeerArchivoProductos() {
        try {
            //Toma la ruta del archivo
            File archivo = new File("Productos.txt");
            //Toma el archivo de la ruta especificada
            Scanner scan = new Scanner(archivo);
            //Lee el archivo 
            while (scan.hasNextLine()) {//Verifica si quedan palabras por leer
                //El metodo lee La persona pero no diferencia sus atributos
                String Referencia = scan.next();
                String Descripcion = scan.next();
                String cantidad = scan.next();
                String ValoruUnitario = scan.next();
                String ValorTotal = scan.next();
                //Creo el objeto tipo productos con los datos leidos
                Productos producDatos = new Productos(Referencia, Descripcion, cantidad, ValoruUnitario, ValorTotal);
                //Añado los datos (Objeto) al arrayList
                productosA.add(producDatos);
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo leer la ruta, quita comillas", "Error", 1);
        }
    }

    public Productos_vendidos AgregarVentas() {
        //Recibe los datos necesarios para instancia un objeto tipo ventas y lo retorna
        //Es necesario hacer referencia a un producto para hacerla venta si la referencia no coincide, retorna null
        String ref = JOptionPane.showInputDialog(this, "Ref del producto: ", "Input", 1);
        if (ref != null) { //Si la operación de ingreso de datos no fue cancelada
            Iterator<Productos> productos_iterator = productosA.iterator();
            while (productos_iterator.hasNext()) {
                Productos productos_aux = productos_iterator.next();
                if (ref.equals(productos_aux.Referencia)) { //Si la referencia ingresada corresponde a una registrada

                    String input_cc = JOptionPane.showInputDialog(this, "Cedula del cliente: ", "Input", 1);
                    if (input_cc != null) { //Si la operación de ingreso de datos no fue cancelada

                        String nombre_cliente = JOptionPane.showInputDialog(this, "Nombre del cliente: ", "Input", 1);
                        if (nombre_cliente != null) { //Si la operación de ingreso de datos no fue cancelada

                            String apellido = JOptionPane.showInputDialog(this, "Apellido del cliente: ", "Input", 1);
                            if (apellido != null) { //Si la operación de ingreso de datos no fue cancelada
                                //Tomar la informacion para tratar el objeto
                                String informacionVentas = productos_aux.Referencia + " " + productos_aux.Descripcion + " " + productos_aux.cantidad + " "
                                        + productos_aux.ValoruUnitario + " " + productos_aux.ValorTotal + " " + input_cc + " " + nombre_cliente + " " + apellido;
                                //Invocacion del metodo que guarda la escritura
                                escribirVentas(informacionVentas);

                                Productos_vendidos pvendidos_aux = new Productos_vendidos(productos_aux.Referencia, productos_aux.Descripcion, productos_aux.cantidad,
                                        productos_aux.ValoruUnitario, productos_aux.ValorTotal, input_cc, nombre_cliente, apellido);

                                productosA.remove(productos_aux); //Remueve el objeto Productos que ahora hace parte de los prod vendidos
                                return pvendidos_aux;
                            } else {
                                return null; //Si la operación de ingreso de datos fue cancelada
                            }

                        } else {
                            return null; //Si la operación de ingreso de datos fue cancelada
                        }
                    } else {
                        return null; //Si la operación de ingreso de datos fue cancelada
                    }
                }
            } //Si termina de recorrer todo el arreglo "personas" y no encuentra la ID
            JOptionPane.showMessageDialog(this, "ID no registrada", "Info", 1);
            return null;
        } else {
            return null; //Si la operación de ingreso de datos fue cancelada
        }
    }

    public Productos_vendidos eliminarVentasP(ArrayList<Productos_vendidos> pvendidos) {
        //Realiza una busqueda por ref y si hay coincidencias elimina el objeto con la ref que lo identifica
        Productos_vendidos prod_eliminar = null; //Toma por valor el objeto producto vendido a eliminar
        String ref = JOptionPane.showInputDialog(this, "Referencia de la venta a eliminar ", "Eliminar", 1);
        if (ref != null) { //Si la operación de ingreso de datos no fue cancelada
            Iterator<Productos_vendidos> pvendido_iterator = pvendidos.iterator();
            while (pvendido_iterator.hasNext()) {
                Productos_vendidos pvendido_aux = pvendido_iterator.next();
                if (ref.equals(pvendido_aux.Referencia)) { //Si la referencia ingresada corresponde a una registrada
                    JOptionPane.showMessageDialog(this, "¡Se eliminó exitosamente!", "Info", 1);
                    prod_eliminar = pvendido_aux;
                    return prod_eliminar; //Retorna el producto a eliminar
                }
            }
            JOptionPane.showMessageDialog(this, "No se encontró esta referencia", "Info", 1);
            return null; //Si la referencia no coincide con la de ninguno de los empleados
        } else {
            return null; //Si la operación de ingreso de datos fue cancelada
        }
    }

    //Métodos generales
    public boolean buscarReferencia(String referencia, ArrayList<Productos> listaProductos, ArrayList<Productos_vendidos> listaproducVend) {
        //Ingresa una lista de productos y productos vendidos para buscar coincidencias con la referencia ingresada
        Iterator<Productos> productos_iterator = listaProductos.iterator();
        while (productos_iterator.hasNext()) {
            Productos productos_aux = productos_iterator.next();
            if (referencia.equals(productos_aux.Referencia)) { //Si la referencia ingresada corresponde a una registrada
                return true;
            }
        }
        Iterator<Productos_vendidos> productosvend_iterator = listaproducVend.iterator();
        while (productosvend_iterator.hasNext()) {
            Productos_vendidos productosV_aux = productosvend_iterator.next();
            if (referencia.equals(productosV_aux.Referencia)) { //Si la referencia ingresada corresponde a una registrada
                return true;
            }
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreProdPosEs;
    private javax.swing.JButton btnEliminarProductos;
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnInsertarProductos;
    private javax.swing.JButton btnListarProductos;
    private javax.swing.JButton btnMostrarVentas;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
