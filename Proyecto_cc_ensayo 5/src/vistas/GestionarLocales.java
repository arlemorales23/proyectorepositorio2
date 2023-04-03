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

public class GestionarLocales extends javax.swing.JFrame {

    File archivo = new File("Locales.txt");
    String opcionBoton = null;
    int numeroEditar = 0;
    int numeroEliminar = 0;

    public GestionarLocales() throws IOException {
        initComponents();
        verificarArchivo();
        asignarEventoMouse();
        ingresarCombo();
    }
 
    public void ingresarCombo() throws FileNotFoundException, IOException{
      String linea = null;
        int numeroRegistros=0;
        BufferedReader leerFichero = new BufferedReader(new FileReader("Login.txt"));
        while ((linea = leerFichero.readLine()) != null) { 
            numeroRegistros+=1;
        }
        leerFichero.close();
        if(numeroRegistros==0)
            System.out.println("No existen registros en el archivo");
        else{
            String [][]datos = new String[numeroRegistros][10];
            int posicion=0;
            String rol = "";
            String line = null;
            String nombreAdmin = "";
            BufferedReader leerArchivo = new BufferedReader(new FileReader("Login.txt"));
            while ((line = leerArchivo.readLine()) != null) {   
                StringTokenizer mistokens = new StringTokenizer(line,"\t");
                datos[posicion][0] = mistokens.nextToken().trim();
                datos[posicion][1] = mistokens.nextToken().trim();
                datos[posicion][2] = mistokens.nextToken().trim();
                datos[posicion][3] = mistokens.nextToken().trim();
                datos[posicion][4] = mistokens.nextToken().trim();
                datos[posicion][5] = mistokens.nextToken().trim();
                rol = datos[posicion][5];
                nombreAdmin = datos[posicion][0]+" "+datos[posicion][1];
                 if(rol.equals("Administrador Local")){
                    jCombo1.addItem(nombreAdmin);
                }
                 posicion+=1; 
            }
            leerArchivo.close();
               
                
            }   
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaInicial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtFechaFinal = new javax.swing.JTextField();
        jCheck1 = new javax.swing.JCheckBox();
        jCombo1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtRenta = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GESTIÓN DE LOCALES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 280, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txtNombre.setEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Numero:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        txtNumero.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtNumero.setEnabled(false);
        jPanel1.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 180, -1));

        jLabel4.setText("Fecha Inicial:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtFechaInicial.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFechaInicial.setEnabled(false);
        jPanel1.add(txtFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 180, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Encargado:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 60, 20));

        btnNuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnNuevo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

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
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, -1));

        btnBuscar.setBackground(new java.awt.Color(51, 153, 255));
        btnBuscar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "Nombre", "Fecha Inicial", "Fecha Final", "Numero", "Encargado", "Disponibilidad", "Renta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 790, 250));

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, -1, -1));

        jLabel7.setText("Fecha Final:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        txtFechaFinal.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtFechaFinal.setEnabled(false);
        jPanel1.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 180, -1));

        jCheck1.setText("Ocupado");
        jCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheck1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheck1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, -1, -1));

        jCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(jCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 180, -1));

        jLabel5.setText("Renta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));
        jPanel1.add(txtRenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 140, -1));

        btnActualizar.setBackground(new java.awt.Color(51, 153, 255));
        btnActualizar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                .addContainerGap(719, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 840, 50));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 170, 840, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String buscar = String.valueOf(txtBuscar.getText());
        String[][] datos = new String[jTable1.getRowCount()][7];
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < 7; j++) {
                datos[i][j] = String.valueOf(jTable1.getValueAt(i, j));
            }
        }
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        limpiarTabla(modelo);
        for (int i = 0; i < datos.length; i++) {
            if (datos[i][1].equals(buscar)) {
                modelo.addRow(new Object[]{datos[i][0], datos[i][1], datos[i][2], datos[i][3], datos[i][4], datos[i][5],
                    datos[i][6]});
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
                    txtNombre.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 1));
                    txtFechaInicial.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 2));
                    txtFechaFinal.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 3));
                    txtNumero.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 4));
                    txtRenta.setText("" + tabla.getValueAt(tabla.getSelectedRow(), 7));

                }
            }
        });
    }
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    public void habilitarCajasTexto(boolean b) {
        txtNombre.setEnabled(b);
        txtFechaInicial.setEnabled(b);
        txtFechaFinal.setEnabled(b);
        txtNumero.setEnabled(b);
        txtRenta.setEnabled(b);

    }

    public void encerrarCajasTexto() {
        txtNombre.setText("");
        txtFechaInicial.setText("");
        txtFechaFinal.setText("");
        txtNumero.setText("");
        txtRenta.setText("");

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

    private void ingresarLocales() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        String disponible = "";
        if (jCheck1.isSelected()) {
            disponible = "Arrendado";

        } else {
            disponible = "Disponible";

        }
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
        escribirArchivo.write(txtNombre.getText() + "\t" + txtFechaInicial.getText() + "\t" + txtFechaFinal.getText() + "\t" + txtNumero.getText() + "\t" + jCombo1.getSelectedItem().toString()
                + "\t" + disponible + "\t" + txtRenta.getText() + "\n");
        JOptionPane.showMessageDialog(null, "Local ingresado correctamente");
        escribirArchivo.close();
        leerArchivo();
    }

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (!(txtNombre.getText().equals("") || txtFechaInicial.getText().equals("") || txtFechaFinal.getText().equals("") || txtNumero.getText().equals("") || txtRenta.getText().equals(""))) {
            if (opcionBoton.equals("Nuevo"))
                try {
                ingresarLocales();
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
                JOptionPane.showMessageDialog(null, "Se editó los locales satisactoriamente");

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
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este local?", "Eliminar local", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                if (numeroEliminar == Integer.parseInt(String.valueOf(jTable1.getValueAt(i, 0)))) {
                    modelo.removeRow(i);
                }
            }
            JOptionPane.showMessageDialog(null, "Se ha eliminado el Local seleccionado");
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

    private void jCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheck1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheck1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            leerArchivo();
        } catch (IOException ex) {
            Logger.getLogger(GestionarLocales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    public void almacenarFichero() throws IOException {
        archivo.delete();
        archivo.createNewFile();
        BufferedWriter escribirArchivo = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo, true), "utf-8"));
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            escribirArchivo.write(jTable1.getValueAt(i, 1) + "\t" + jTable1.getValueAt(i, 2) + "\t" + jTable1.getValueAt(i, 3) + "\t" + jTable1.getValueAt(i, 4) + "\t" + jTable1.getValueAt(i, 5)
                    + "\t" + jTable1.getValueAt(i, 6) + "\t" + jTable1.getValueAt(i, 7) + "\n");
        }
        escribirArchivo.close();
        leerArchivo();
    }

    public void efectuarEdicion() {
        String disponible = "";
        if (jCheck1.isSelected()) {
            disponible = "Arrendado";

        } else {
            disponible = "Disponible";

        }
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (numeroEditar == Integer.parseInt((String) jTable1.getValueAt(i, 0))) {
                jTable1.setValueAt(numeroEditar, i, 0);
                jTable1.setValueAt(txtNombre.getText(), i, 1);
                jTable1.setValueAt(txtFechaInicial.getText(), i, 2);
                jTable1.setValueAt(txtFechaFinal.getText(), i, 3);
                jTable1.setValueAt(txtNumero.getText(), i, 4);
                jTable1.setValueAt(jCombo1.getSelectedItem().toString(), i, 5);
                jTable1.setValueAt(disponible, i, 6);
                jTable1.setValueAt(txtRenta.getText(), i, 7);
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
            java.util.logging.Logger.getLogger(GestionarLocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionarLocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionarLocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionarLocales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GestionarLocales().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GestionarLocales.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox jCheck1;
    private javax.swing.JComboBox<String> jCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRenta;
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
            String ultimo = "";
            BufferedReader leerArchivo = new BufferedReader(new FileReader(archivo));
            while ((line = leerArchivo.readLine()) != null) {
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                datos[posicion][0] = mistokens.nextToken().trim();
                datos[posicion][1] = mistokens.nextToken().trim();
                datos[posicion][2] = mistokens.nextToken().trim();
                datos[posicion][3] = mistokens.nextToken().trim();
                datos[posicion][4] = mistokens.nextToken().trim();
                datos[posicion][5] = mistokens.nextToken().trim();
                datos[posicion][6] = mistokens.nextToken().trim();
                ultimo = datos[posicion][5];
                if(ultimo.equals("Arrendado")){
                   datos[posicion][6] = "--"; 
                }
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