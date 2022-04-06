package cuc.edu.SotfwareContratacion;

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

public class JFPrincipal extends javax.swing.JFrame {

    ArrayList<Persona> personas = new ArrayList();
    ArrayList<Empleado> empleados = new ArrayList();

    public JFPrincipal() {
        initComponents(); 
        //Para leer los datos guardados en el txt
        LeerArchivoPersonas();
        LeerArchivoEmpleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCrearEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnMostrarEmpleados = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCrearPersona = new javax.swing.JButton();
        btnEliminarPersona = new javax.swing.JButton();
        btnMostarPersonas = new javax.swing.JButton();
        btnCrePerPosEs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setText("Software de contratación");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCrearEmpleado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCrearEmpleado.setText("Crear");
        btnCrearEmpleado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCrearEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEliminarEmpleado.setText("Eliminar");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        btnMostrarEmpleados.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnMostrarEmpleados.setText("Mostrar lista");
        btnMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEmpleadosActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("  Empleado");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostrarEmpleados, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostrarEmpleados)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnCrearPersona.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCrearPersona.setText("Crear");
        btnCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPersonaActionPerformed(evt);
            }
        });

        btnEliminarPersona.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnEliminarPersona.setText("Eliminar");
        btnEliminarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPersonaActionPerformed(evt);
            }
        });

        btnMostarPersonas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnMostarPersonas.setText("Mostrar lista");
        btnMostarPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarPersonasActionPerformed(evt);
            }
        });

        btnCrePerPosEs.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCrePerPosEs.setText("Crear en posición especifica");
        btnCrePerPosEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrePerPosEsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText(" Persona");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrearPersona))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarPersona, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMostarPersonas, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCrePerPosEs)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCrearPersona)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarPersona)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMostarPersonas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCrePerPosEs)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPersonaActionPerformed
        Persona persona_agregar = instanciarPersona(personas, empleados);
        if (persona_agregar != null) {
            personas.add(persona_agregar);
        }
    }//GEN-LAST:event_btnCrearPersonaActionPerformed

    private void btnEliminarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPersonaActionPerformed
        Persona persona_eliminar = eliminarPersona(personas);
        if (persona_eliminar != null) {
            personas.remove(persona_eliminar);
        }
    }//GEN-LAST:event_btnEliminarPersonaActionPerformed

    private void btnMostarPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarPersonasActionPerformed
         JFInfo JFInfo = new JFInfo(this, personas, empleados, 0);
    }//GEN-LAST:event_btnMostarPersonasActionPerformed

    private void btnCrearEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpleadoActionPerformed
        Empleado empleado_agregar = instanciarEmpleado();
        if (empleado_agregar != null) {
            empleados.add(empleado_agregar);
        }
    }//GEN-LAST:event_btnCrearEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        Empleado empleado_eliminar = eliminarEmpleado(empleados);
        if (empleado_eliminar != null) {
            empleados.remove(empleado_eliminar);
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEmpleadosActionPerformed
        JFInfo JFInfo = new JFInfo(this, personas, empleados, 1);
    }//GEN-LAST:event_btnMostrarEmpleadosActionPerformed

    private void btnCrePerPosEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrePerPosEsActionPerformed
        crearPersonaPosEs();
    }//GEN-LAST:event_btnCrePerPosEsActionPerformed

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
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    //Métodos relacionados con el tratamiento de objetos Persona
    public Persona instanciarPersona(ArrayList<Persona> personas, ArrayList<Empleado> empleados) {
        //Recibe los datos necesarios para instancia un objeto tipo persona y lo retorna
        //Si la ID ingresada está registrada retorna null
        String ID = JOptionPane.showInputDialog(this, "ID: ", "Input", 1);
        if (ID != null) { //Si la operación de ingreso de datos no fue cancelada
            boolean registrado = buscarID(ID, personas, empleados); //Indica si la ID está registrada
            if (registrado) { //Si la ID ha sido registrada
                JOptionPane.showMessageDialog(this, "ID registrada", "Info", 1);
                return null;
            } else { //Si la ID no ha sido registrada
                String tipo_ID = JOptionPane.showInputDialog(this, "Tipo de ID: ", "Input", 1);
                if (tipo_ID != null) { //Si la operación de ingreso de datos no fue cancelada
                    String nombre = JOptionPane.showInputDialog(this, "Nombre: ", "Input", 1);
                    if (nombre != null) { //Si la operación de ingreso de datos no fue cancelada
                        String apellido = JOptionPane.showInputDialog(this, "Apellido: ", "Input", 1);
                        if (apellido != null) { //Si la operación de ingreso de datos no fue cancelada
                            String direccion = JOptionPane.showInputDialog(this, "Dirección: ", "Input", 1);
                            if (direccion != null) { //Si la operación de ingreso de datos no fue cancelada
                                String correo = JOptionPane.showInputDialog(this, "Correo: ", "Input", 1);
                                if (correo != null) { //Si la operación de ingreso de datos no fue cancelada
                                    String telefono = JOptionPane.showInputDialog(this, "Telefono: ", "Input", 1);
                                    if (telefono != null) { //Si la operación de ingreso de datos no fue cancelada
                                        //Toda la informacion de persona                                      
                                        String informacionPersona = ID + " " + tipo_ID
                                                + " " + nombre + " " + apellido + " " + direccion + " " + correo + " " + telefono;
                                        //Invocacion del metodo que guarda la informacion en un txt
                                        escribirDatosPersona(informacionPersona);
                                        Persona persona_aux = new Persona(ID, tipo_ID, nombre, apellido, direccion, correo, telefono);
                                        return persona_aux;
                                    } else {
                                        return null; //Si la operación de ingreso de datos fue cancelada
                                    }
                                } else {
                                    return null; //Si la operación de ingreso de datos fue cancelada
                                }
                            } else {
                                return null; //Si la operación de ingreso de datos fue cancelada
                            }
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
        } else {
            return null; //Si la operación de ingreso de datos fue cancelada
        }
    }

    public void escribirDatosEmpleado(String informacion){
    //Crear el archivo para personas
        File archivo = new File("Empleado.txt");
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
    
    public void escribirDatosPersona(String informacion) {
        //Toma la ruta del archivo txt para personas
        File archivo = new File("Persona.txt");
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

    public Persona eliminarPersona(ArrayList<Persona> personas) {
        //Realiza una busqueda por ID y si hay coincidencias elimina el objeto con la ID que lo identifica
        Persona persona_eliminar = null; //Toma por valor el objeto Persona a eliminar
        String ID = JOptionPane.showInputDialog(this, "ID de la persona a eliminar: ", "Eliminar", 1);
        if (ID != null) { //Si la operación de ingreso de datos no fue cancelada
            Iterator<Persona> persona_iterator = personas.iterator();
            while (persona_iterator.hasNext()) {
                Persona persona_aux = persona_iterator.next();
                if (ID.equals(persona_aux.ID)) { //Si la ID ingresada corresponde a una registrada
                    JOptionPane.showMessageDialog(this, "¡Se eliminó exitosamente!", "Info", 1);
                    persona_eliminar = persona_aux;
                    return persona_eliminar; //Retorna la persona a eliminar
                }
            }
            JOptionPane.showMessageDialog(this, "No se encontró esta ID", "Info", 1);
            return null; //Si la ID no coincide con la de ninguna de las personas
        } else {
            return null; //Si la operación de ingreso de datos fue cancelada
        }
    }

    public void crearPersonaPosEs() {
        //Crea objeto Persona en una posición (Pos) especifica (Es)
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(this, "Posición: ", "Input", 1));
        personas.add(posicion, instanciarPersona(personas, empleados));
    }

     public void LeerArchivoEmpleado() {
        try {
            //Toma la ruta del archivo
            File archivo = new File("Empleado.txt");
            //Toma el archivo de la ruta especificada
            Scanner scan = new Scanner(archivo);
            //Lee el archivo      
            while (scan.hasNextLine()) {//Verifica si quedan palabras por leer
                //El metodo lee La persona pero no diferencia sus atributos
                String ID = scan.next();
                String tipo_ID = scan.next();
                String nombre = scan.next();
                String apellido = scan.next();
                String direccion = scan.next();
                String correo = scan.next();
                String telefono = scan.next();
                int sueldo = scan.nextInt();
                String tipo_contrato = scan.next();
                //Creo el objeto tipo empleado con los datos leidos
                Empleado empleadodatos = new Empleado(ID, tipo_ID, nombre, apellido, direccion, correo, telefono, sueldo, tipo_contrato);
                //Añado los datos (Objeto) al arrayList
                empleados.add(empleadodatos);
            }
            scan.close();
         } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo leer la ruta, quita comillas", "Error", 1);
        }
    }
    
    public void LeerArchivoPersonas() {
        try {
            //Toma la ruta del archivo
            File archivo = new File("Persona.txt");
            //Toma el archivo de la ruta especificada
            Scanner scan = new Scanner(archivo);
            //Lee el archivo
            while (scan.hasNextLine()) {//Verifica si quedan palabras por leer
                //El metodo lee La persona pero no diferencia sus atributos
                String ID = scan.next();
                String tipo_ID = scan.next();
                String nombre = scan.next();
                String apellido = scan.next();
                String direccion = scan.next();
                String correo = scan.next();
                String telefono = scan.next(); 
                //Creo el objeto tipo persona con los datos leidos
                Persona personaDatos = new Persona(ID, tipo_ID, nombre, apellido, direccion, correo, telefono);
                //Añado los datos (Objeto) al arrayList
                personas.add(personaDatos);
            }
            scan.close();
         } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo leer la ruta, quita comillas", "Error", 1);
        }
    }

    //Métodos relacionados con en tratamiento de objetos Empleados
    public Empleado instanciarEmpleado() {
        //Recibe los datos necesarios para instancia un objeto tipo empleado y lo retorna
        //Es necesario hacer referencia a una persona para hacerla empleado si la ID no coincide retorna null
        String ID = JOptionPane.showInputDialog(this, "ID de la persona a contrarar: ", "Input", 1);
        if (ID != null) { //Si la operación de ingreso de datos no fue cancelada
            Iterator<Persona> persona_iterator = personas.iterator();
            while (persona_iterator.hasNext()) {
                Persona persona_aux = persona_iterator.next();
                if (ID.equals(persona_aux.ID)) { //Si la ID ingresada corresponde a una registrada
                    int sueldo;
                    String input_sueldo = JOptionPane.showInputDialog(this, "Sueldo: ", "Input", 1);
                    if (input_sueldo != null) { //Si la operación de ingreso de datos no fue cancelada
                        if (input_sueldo.equals("")) { //Si el campo fue dejado en blanco
                            sueldo = 0;
                        } else {
                            sueldo = Integer.parseInt(input_sueldo);
                        }
                        String tipo_contrato = JOptionPane.showInputDialog(this, "Tipo de contrato: ", "Input", 1);
                        if (tipo_contrato != null) { //Si la operación de ingreso de datos no fue cancelada
                            //Tomar la informacion para tratar el objeto
                            String informacionEmpleado = persona_aux.ID +" "+ persona_aux.tipo_ID + " "+persona_aux.nombre + " "+
                                    persona_aux.apellido + " "+persona_aux.direccion +" "+ persona_aux.correo +" "+ persona_aux.telefono +" "+
                                    sueldo +" "+ tipo_contrato;
                            //Invocacion del metodo que guarda la escritura
                              escribirDatosEmpleado(informacionEmpleado);
                              
                            Empleado empleado_aux = new Empleado(persona_aux.ID, persona_aux.tipo_ID, persona_aux.nombre,
                                    persona_aux.apellido, persona_aux.direccion, persona_aux.correo, persona_aux.telefono,
                                    sueldo, tipo_contrato);
                            personas.remove(persona_aux); //Remueve el objeto Persona que ahora hace parte de los empleados
                            return empleado_aux;
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

    public Empleado eliminarEmpleado(ArrayList<Empleado> empleados) {
        //Realiza una busqueda por ID y si hay coincidencias elimina el objeto con la ID que lo identifica
        Empleado empleado_eliminar = null; //Toma por valor el objeto Empleado a eliminar
        String ID = JOptionPane.showInputDialog(this, "ID del empleado a eliminar: ", "Eliminar", 1);
        if (ID != null) { //Si la operación de ingreso de datos no fue cancelada
            Iterator<Empleado> empleado_iterator = empleados.iterator();
            while (empleado_iterator.hasNext()) {
                Empleado empleado_aux = empleado_iterator.next();
                if (ID.equals(empleado_aux.ID)) { //Si la ID ingresada corresponde a una registrada
                    JOptionPane.showMessageDialog(this, "¡Se eliminó exitosamente!", "Info", 1);
                    empleado_eliminar = empleado_aux;
                    return empleado_eliminar; //Retorna el empleado a eliminar
                }
            }
            JOptionPane.showMessageDialog(this, "No se encontró esta ID", "Info", 1);
            return null; //Si la ID no coincide con la de ninguno de los empleados
        } else {
            return null; //Si la operación de ingreso de datos fue cancelada
        }
    }

    //Métodos generales
    public boolean buscarID(String ID, ArrayList<Persona> lista_personas, ArrayList<Empleado> lista_empleados) {
        //Ingresa una lista de empleados y personas para buscar coincidencias con la ID ingresada
        Iterator<Persona> persona_iterator = lista_personas.iterator();
        while (persona_iterator.hasNext()) {
            Persona persona_aux = persona_iterator.next();
            if (ID.equals(persona_aux.ID)) { //Si la ID ingresada corresponde a una registrada
                return true;
            }
        }
        Iterator<Empleado> empleado_iterator = lista_empleados.iterator();
        while (empleado_iterator.hasNext()) {
            Empleado empleado_aux = empleado_iterator.next();
            if (ID.equals(empleado_aux.ID)) { //Si la ID ingresada corresponde a una registrada
                return true;
            }
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrePerPosEs;
    private javax.swing.JButton btnCrearEmpleado;
    private javax.swing.JButton btnCrearPersona;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarPersona;
    private javax.swing.JButton btnMostarPersonas;
    private javax.swing.JButton btnMostrarEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
