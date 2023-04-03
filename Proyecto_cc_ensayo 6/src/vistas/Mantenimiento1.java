package vistas;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Mantenimiento1 extends javax.swing.JFrame {

    File archivo = new File("Mantenimiento.txt");
    String opcionBoton = null;
    int numeroEditar = 0;
    int numeroEliminar = 0;

    public Mantenimiento1() throws IOException {
        initComponents();
        verificarArchivo();
        asignarEventoMouse();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLocal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jCombo1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nombre Local:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtLocal.setEnabled(false);
        jPanel1.add(txtLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, -1));

        jLabel4.setText("Descripcion Problema:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtDescripcion.setEnabled(false);
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 240, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Estado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento 2.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 120, -1));

        btnEditar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Nombre Local", "Problema", "Prioridad", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(40);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 480, 330));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mantenimiento 2.png"))); // NOI18N
        jLabel1.setText("MANTENIMIENTO");

        btnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        btnCerrar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir (1).png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(btnCerrar)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCerrar)
                    .addComponent(jLabel1))
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 890, 50));

        jCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En Espera", "Pendiente", "En Progreso", "Atendida" }));
        jPanel1.add(jCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void asignarEventoMouse() {
        jTable1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_event) {
                JTable tabla = (JTable) Mouse_event.getSource();
                Point point = Mouse_event.getPoint();
                int row = tabla.rowAtPoint(point);
                if (Mouse_event.getClickCount() == 2) {
                    btnEditar.setEnabled(true);
                    btnEliminar.setEnabled(true);

                    numeroEditar = Integer.parseInt("" + tabla.getValueAt(tabla.getSelectedRow(), 0));
                    numeroEliminar = numeroEditar;
                    txtLocal.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 1));
                    txtDescripcion.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 2));

                }
            }
        });
    }
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public void habilitarCajasTexto(boolean b) {
        txtLocal.setEnabled(b);
        txtDescripcion.setEnabled(b);
        jCombo1.setEnabled(b);

    }

    public void encerrarCajasTexto() {
        txtLocal.setText("");
        txtDescripcion.setText("");
        jCombo1.setSelectedItem("");

    }


    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarCajasTexto(true);
        encerrarCajasTexto();
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(false);
        opcionBoton = "Nuevo";

    }//GEN-LAST:event_btnNuevoActionPerformed

    private void ingresarPersonal() throws FileNotFoundException, UnsupportedEncodingException, IOException {

        String estados = jCombo1.getSelectedItem().toString();

        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
        escribirArchivo.write(txtLocal.getText() + "\t" + txtDescripcion.getText() + "\t" + estados + "\n");
        JOptionPane.showMessageDialog(null, "Personal ingresado correctamente");
        escribirArchivo.close();
        leerArchivo();
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!(txtLocal.getText().equals("") || txtDescripcion.getText().equals(""))) {
            if (opcionBoton.equals("Nuevo"))
                try {
                ingresarPersonal();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GestionarPersonalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(GestionarPersonalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GestionarPersonalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            } else if (opcionBoton.equals("Editar")) {
                efectuarEdicion();
                try {
                    almacenarFichero();
                } catch (IOException ex) {
                    Logger.getLogger(GestionarPersonalAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Se editó la solicitud satisactoriamente");

            }
            habilitarCajasTexto(false);
            encerrarCajasTexto();
            btnNuevo.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnEditar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnEliminar.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "No deje espacios vacíos");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        opcionBoton = "Editar";
        habilitarCajasTexto(true);
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarCajasTexto(false);
        encerrarCajasTexto();
        btnNuevo.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la solicitud de mantenimiento?", "Eliminar solicitud", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (numeroEliminar == Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 0)))) {
                    modelo.removeRow(i);
                }
            }
            JOptionPane.showMessageDialog(null, "Se ha eliminado la solicutud");
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);

            try {
                almacenarFichero();
            } catch (IOException ex) {
                Logger.getLogger(GestionarPersonalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("No se ha eliminado nada");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void almacenarFichero() throws IOException {
        archivo.delete();
        archivo.createNewFile();
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            escribirArchivo.write(jTable1.getValueAt(i, 1) + "\t" + jTable1.getValueAt(i, 2) + "\t" + jTable1.getValueAt(i, 3) + "\t" + jTable1.getValueAt(i, 4) + "\n");
        }
        escribirArchivo.close();
        leerArchivo();
    }

    public void efectuarEdicion() {

        String estados = jCombo1.getSelectedItem().toString();
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (numeroEditar == Integer.parseInt((String) jTable1.getValueAt(i, 0))) {
                jTable1.setValueAt(numeroEditar, i, 0);
                jTable1.setValueAt(txtLocal.getText(), i, 1);
                jTable1.setValueAt(txtDescripcion.getText(), i, 2);
                jTable1.setValueAt(estados, i, 4);

                break;
            }
        }
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
            java.util.logging.Logger.getLogger(Mantenimiento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mantenimiento1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Mantenimiento1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Mantenimiento1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtLocal;
    // End of variables declaration//GEN-END:variables

    private void verificarArchivo() throws IOException {

        if (!archivo.exists()) {
            archivo.createNewFile();
            System.out.println("Archivo de base de datos creado correctamente");
        } else {
            System.out.println("El archivo existe");
            leerArchivo();
        }
    }

    private void leerArchivo() throws FileNotFoundException, IOException {
        String linea = null;
        int numeroRegistros = 0;
        BufferedReader leerFichero = new BufferedReader(new FileReader(archivo));
        while ((linea = leerFichero.readLine()) != null) {
            numeroRegistros += 1;
        }
        leerFichero.close();
        if (numeroRegistros == 0) {
            System.out.println("No existen registros en el archivo");
        } else {
            String[][] datos = new String[numeroRegistros][10];
            int posicion = 0;
            String line = null;
            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
            while ((line = leerArchivo.readLine()) != null) {
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                datos[posicion][0] = mistokens.nextToken().trim();
                datos[posicion][1] = mistokens.nextToken().trim();
                datos[posicion][2] = mistokens.nextToken().trim();
                datos[posicion][3] = mistokens.nextToken().trim();

                posicion += 1;
            }
            leerArchivo.close();
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            limpiarTabla(modelo);
            for (int i = 0; i < datos.length; i++) {
                String[] data = new String[11];
                data[0] = String.valueOf(i + 1);
                for (int j = 0; j < datos[i].length; j++) {
                    data[(j + 1)] = datos[i][j];
                }
                modelo.addRow(data);
            }
        }
    }

    public void limpiarTabla(DefaultTableModel modelo) {
        for (int i = jTable1.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
}
