package vista;

import controlador.ControladorPersona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;

public class Ventana extends javax.swing.JFrame {

    ControladorPersona controlador;
    DefaultTableModel model;

    public Ventana() {
        initComponents();
        setLocationRelativeTo(this);

        controlador = new ControladorPersona();
        model = (DefaultTableModel) jTable1.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ventanaPrincipal = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventanaPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        ventanaPrincipal.setName("Datos"); // NOI18N

        lblNombre.setText("Nombre");

        jLabel2.setText("Cedula");

        jLabel3.setText("Edad");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setText("DATOS");

        javax.swing.GroupLayout ventanaPrincipalLayout = new javax.swing.GroupLayout(ventanaPrincipal);
        ventanaPrincipal.setLayout(ventanaPrincipalLayout);
        ventanaPrincipalLayout.setHorizontalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaPrincipalLayout.createSequentialGroup()
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(24, 24, 24)
                        .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txtCedula)
                            .addComponent(txtEdad)))
                    .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaPrincipalLayout.setVerticalGroup(
            ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ventanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cedula", "Edad"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ventanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ventanaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        int edad = Integer.parseInt(txtEdad.getText());

        Persona persona = new Persona(nombre, cedula, edad);
        boolean respuesta = controlador.guardarListaPersonas(persona);
        if (respuesta) {
            JOptionPane.showMessageDialog(null, "Se guardo");
            Object[] ob = {nombre, cedula, edad};
            model.addRow(ob);

        } else {
            JOptionPane.showMessageDialog(null, "No se guardo");
        }
        limpiar();


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();
        Persona persona = controlador.buscarListaPersona(cedula);
        if (persona != null) {
            txtNombre.setText(persona.getNombre());
            txtEdad.setText(String.valueOf(persona.getEdad()));
        } else {
            JOptionPane.showMessageDialog(null, "La persona de cedula " + cedula + " No se encuentra");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        Persona persona = new Persona(nombre, cedula, edad);
        boolean persona1 = controlador.editarPersona(persona);
        if (persona1 == true) {
            JOptionPane.showMessageDialog(null, "Se edito la persona");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "No se edito");
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String cedula = txtCedula.getText();
        Persona persona = controlador.buscarListaPersona(cedula);
        if (persona != null) {
            int comfirm = JOptionPane.showConfirmDialog(null, "Seguro de eliminar a " + persona.getNombre());
            if (comfirm == 0) {
                boolean eliminar = controlador.eliminarListaPersona(cedula);
                if (eliminar == true) {
                    JOptionPane.showMessageDialog(null, "Se elimino la persona");
//                    int filaSeleccionada = jTable1.getSelectedRow();
//                    model.removeRow(filaSeleccionada);
                    limpiar();

                }

            }

        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void limpiar() {
        txtNombre.setText(null);
        txtCedula.setText(null);
        txtEdad.setText(null);

    }

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPanel ventanaPrincipal;
    // End of variables declaration//GEN-END:variables

}
