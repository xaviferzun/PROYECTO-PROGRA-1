/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Pantallas;

import Logica.Utilitario;
import Modelos.Album;
import Modelos.Artista;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;


public class dialogAlbumes extends javax.swing.JDialog {
   
    DefaultListModel modeloListaAlbumes = new DefaultListModel();
    
    //Variable para verificar si el usuario está usando el botón "Modificar"
    private boolean modificando = false; 
    
    //Variable de instancia para almacenar el Artista actual
    private Album albumActual;
    private Artista artistaActual;
    

    /**
     * Creates new form dialogArtistas
     */
    public dialogAlbumes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        lstAlbumes.setModel(modeloListaAlbumes);
        actualizarListaAlbumes();
        
    }

    private dialogAlbumes(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        txtNombreAlbum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNumeroAlbum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAlbumes = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        cmbArtistas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidadCanciones = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(735, 548));
        jPanel1.setRequestFocusEnabled(false);

        txtNombreAlbum.setEditable(false);
        txtNombreAlbum.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreAlbum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreAlbum.setPreferredSize(new java.awt.Dimension(135, 22));
        txtNombreAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlbumActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");

        txtNumeroAlbum.setEditable(false);
        txtNumeroAlbum.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroAlbum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroAlbumActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Número");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        btnInsertar.setText("Insertar");
        btnInsertar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsertar.setMaximumSize(new java.awt.Dimension(81, 23));
        btnInsertar.setMinimumSize(new java.awt.Dimension(81, 23));
        btnInsertar.setPreferredSize(new java.awt.Dimension(98, 23));
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setEnabled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.setMaximumSize(new java.awt.Dimension(81, 23));
        btnEliminar.setMinimumSize(new java.awt.Dimension(81, 23));
        btnEliminar.setPreferredSize(new java.awt.Dimension(98, 23));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lstAlbumes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstAlbumesValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstAlbumes);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Albumes");

        for (Artista item : Utilitario.listaArtistas){
            cmbArtistas.addItem(item.getNombre());
        }

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Artista del  Album");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Cantidad de Canciones");

        txtCantidadCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadCancionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAceptar)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNumeroAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(txtCantidadCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbArtistas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel4)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(177, 177, 177))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbArtistas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidadCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btnAceptar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Eliminar artista seleccionado de la lista
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarAlbum(artistaActual);
        actualizarListaAlbumes();
        limpiarCajas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlbumActionPerformed
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        artistaSeleccionado();
        if (modificando == true) { //Verifica si el usuario está usando el botón de modificar
            modificarAlbum(artistaActual);
        } else {
            agregarAlbum(artistaActual);
        }
        actualizarListaAlbumes();
        deshabilitarCajas();
        btnAceptar.setEnabled(false);
        modificando = false;
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        modificando = false;
        habilitarCajas();
        limpiarCajas();
        btnAceptar.setEnabled(true);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        modificando = true;
        //obtenerInfoAlbum(albumActual);
        habilitarCajas();
        btnAceptar.setEnabled(true);    
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtNumeroAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroAlbumActionPerformed

    private void lstAlbumesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstAlbumesValueChanged
        albumSeleccionado();
        artistaSeleccionado();
        obtenerInfoAlbum(albumActual);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        
    }//GEN-LAST:event_lstAlbumesValueChanged

    private void txtCantidadCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadCancionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadCancionesActionPerformed

    
    
    //Toma el indice seleccionado de la lista Albumes
    private void albumSeleccionado(){
        int indiceAlbum = lstAlbumes.getSelectedIndex();
        if (indiceAlbum != -1){
            this.albumActual = artistaActual.getListaAlbumes().get(indiceAlbum);
        }
    }
    
    //Toma el indice seleccionado del ComboBox Artistas
    private void artistaSeleccionado(){
        int indiceArtista = cmbArtistas.getSelectedIndex();
        if (indiceArtista != -1){
            Artista artista = Utilitario.listaArtistas.get(indiceArtista);
            this.artistaActual = artista;
        }
    }
    
    //Obtiene los datos de un album, y los muestra en las cajas de texto respectivas
    private void obtenerInfoAlbum(Album album){
       txtNumeroAlbum.setText(Integer.toString(album.getNumero()));
       txtNombreAlbum.setText(album.getNombre());
       txtCantidadCanciones.setText(Integer.toString(album.getCantidadCanciones()));
       cmbArtistas.setSelectedItem(artistaActual.getMapaAlbumArtista().get(album.getNombre()));       
    }
    
    private void agregarAlbum(Artista artista){
       Album album = new Album(
        Integer.parseInt(txtNumeroAlbum.getText()),
        txtNombreAlbum.getText());
        artista.agregarAlbum(album);
    }
    
    private void eliminarAlbum(Artista artista){
        int indiceAlbum = lstAlbumes.getSelectedIndex();
        if (indiceAlbum != -1) {
            Album album = artista.getListaAlbumes().get(indiceAlbum);
            artista.eliminarAlbum(album);  
        }
    }
    
    private void modificarAlbum(Artista artista){
        int indice = lstAlbumes.getSelectedIndex();
        if (indice != -1) {
            Album album = artista.getListaAlbumes().get(indice);
            album.setNumero(Integer.parseInt(txtNumeroAlbum.getText()));
            album.setNombre(txtNombreAlbum.getText());
            artista.getMapaAlbumArtista().put(album.getNombre(), artista.getNombre());
        }        
    }
    
    //Actualiza la lista en la interfaz sin necesidad de cerrar la ventana, y que pueda ser invocado cuando sea necesario
    private void actualizarListaAlbumes(){
        modeloListaAlbumes.clear(); //Limpiar la lista visualmente antes de volver a cargarla, evitando el duplicado visual de informacion
        modeloListaAlbumes.addAll(artistaActual.generarListaAlbumes());
    }
    
    //Deshabilita las cajas de texto para prevenir cambios en los datos
    private void deshabilitarCajas(){
        txtNombreAlbum.setEditable(false);
        txtNumeroAlbum.setEditable(false);
    }
    
    //Habilita las cajas de texto para agregar datos
    private void habilitarCajas(){
        txtNombreAlbum.setEditable(true);
        txtNumeroAlbum.setEditable(true);
    }
    
    //Limpia las cajas de texto
    private void limpiarCajas(){
        txtNombreAlbum.setText("");
        txtNumeroAlbum.setText("");
        cmbArtistas.setSelectedItem(null);
    }
    
    
    
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
            java.util.logging.Logger.getLogger(dialogAlbumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogAlbumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogAlbumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogAlbumes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogAlbumes dialog = new dialogAlbumes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cmbArtistas;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> lstAlbumes;
    private javax.swing.JTextField txtCantidadCanciones;
    private javax.swing.JTextField txtNombreAlbum;
    private javax.swing.JTextField txtNumeroAlbum;
    // End of variables declaration//GEN-END:variables
}
