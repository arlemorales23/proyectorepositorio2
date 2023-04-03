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

public class FrmConcurso extends javax.swing.JFrame {

    File archivo = new File("Concursos.txt");
    int numeroEliminar = 0;
    int numeroEditar = 0;

    public FrmConcurso() throws IOException {
        initComponents();
        verificarArchivo();
        asignarEventoMouse();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtInicio = new javax.swing.JTextField();
        txtFinal = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnRealizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Fecha Inicio:");

        jLabel3.setText("Fecha Final:");

        jLabel4.setText("Descripcion:");

        jLabel5.setText("Valor Minimo de Consumo:");

        btnRealizar.setBackground(new java.awt.Color(51, 153, 255));
        btnRealizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRealizar.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizar.setText("Realizar");
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "#", "Fecha Inicio", "Fecha Final", "Descripcion", "Min Consumo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnSalir.setBackground(new java.awt.Color(51, 153, 255));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trofeo 2.png"))); // NOI18N
        jLabel1.setText("CONCURSO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnEliminar.setBackground(new java.awt.Color(51, 153, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtValor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        if (!(txtInicio.getText().equals("") || txtFinal.getText().equals("") || txtDescripcion.getText().equals("") || txtValor.getText().equals(""))) {

            try {
                ingresarConcurso();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(GestionarPersonalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(GestionarPersonalAdmin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(GestionarPersonalAdmin.class.getName()).log(Level.SEVERE, null, ex);

                JOptionPane.showMessageDialog(null, "No deje espacios vacíos");
            }

        }
    }//GEN-LAST:event_btnRealizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este Concurso?", "Eliminar Concurso", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (numeroEliminar == Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 0)))) {
                    modelo.removeRow(i);
                }
            }
            JOptionPane.showMessageDialog(null, "Se ha eliminado el concurso seleccionado");

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

    public void asignarEventoMouse() {
        jTable1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent Mouse_event) {
                JTable tabla = (JTable) Mouse_event.getSource();
                Point point = Mouse_event.getPoint();
                int row = tabla.rowAtPoint(point);
                if (Mouse_event.getClickCount() == 2) {

                    numeroEditar = Integer.parseInt("" + tabla.getValueAt(tabla.getSelectedRow(), 0));
                    numeroEliminar = numeroEditar;
                    txtInicio.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 1));
                    txtFinal.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 2));
                    txtDescripcion.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 3));
                    txtValor.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 4));

                }
            }
        });
    }

    private void ingresarConcurso() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
        escribirArchivo.write(txtInicio.getText() + "\t" + txtFinal.getText() + "\t" + txtDescripcion.getText() + "\t" + txtValor.getText() + "\n");
        JOptionPane.showMessageDialog(null, "Concurso ingresado correctamente");
        escribirArchivo.close();
        leerArchivo();
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
            java.util.logging.Logger.getLogger(FrmConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConcurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmConcurso().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FrmConcurso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFinal;
    private javax.swing.JTextField txtInicio;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
