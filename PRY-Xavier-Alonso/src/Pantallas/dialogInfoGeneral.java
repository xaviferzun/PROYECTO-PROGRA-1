/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Pantallas;

import Logica.Utilitario;
import Modelos.Album;
import Modelos.Artista;
import Modelos.Cancion;
import Modelos.Genero;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XAVIER FERNÁNDEZ Z
 */
public class dialogInfoGeneral extends javax.swing.JDialog {
    
    DefaultTableModel modeloTablaCanciones = new DefaultTableModel();

    /**
     * Creates new form dialogInfoCanciones
     */
    public dialogInfoGeneral(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        
        cargarListaCanciones();
        tablaInfoGeneral.setModel(modeloTablaCanciones);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInfoGeneral = new javax.swing.JTable();
        txtTipoArtista = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFormacion = new javax.swing.JTextField();
        txtOrigen = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCantidadAlbum = new javax.swing.JTextField();
        txtGenerosArtista = new javax.swing.JTextField();
        txtNumeroAlbum = new javax.swing.JTextField();
        txtTipoAlbum = new javax.swing.JTextField();
        txtGeneroAlbum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroCancion = new javax.swing.JTextField();
        txtGrabacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(856, 638));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Información General de Canciones");

        tablaInfoGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Número", "Título", "Artista", "Álbum", "Duración"
            }
        ));
        tablaInfoGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInfoGeneralMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaInfoGeneral);

        txtTipoArtista.setEditable(false);
        txtTipoArtista.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoArtista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoArtistaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Artista");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Canción");

        txtFormacion.setEditable(false);
        txtFormacion.setBackground(new java.awt.Color(255, 255, 255));
        txtFormacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFormacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormacionActionPerformed(evt);
            }
        });

        txtOrigen.setEditable(false);
        txtOrigen.setBackground(new java.awt.Color(255, 255, 255));
        txtOrigen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrigenActionPerformed(evt);
            }
        });

        txtEstado.setEditable(false);
        txtEstado.setBackground(new java.awt.Color(255, 255, 255));
        txtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        txtCantidadAlbum.setEditable(false);
        txtCantidadAlbum.setBackground(new java.awt.Color(255, 255, 255));
        txtCantidadAlbum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidadAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadAlbumActionPerformed(evt);
            }
        });

        txtGenerosArtista.setEditable(false);
        txtGenerosArtista.setBackground(new java.awt.Color(255, 255, 255));
        txtGenerosArtista.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGenerosArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenerosArtistaActionPerformed(evt);
            }
        });

        txtNumeroAlbum.setEditable(false);
        txtNumeroAlbum.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroAlbum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroAlbumActionPerformed(evt);
            }
        });

        txtTipoAlbum.setEditable(false);
        txtTipoAlbum.setBackground(new java.awt.Color(255, 255, 255));
        txtTipoAlbum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTipoAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoAlbumActionPerformed(evt);
            }
        });

        txtGeneroAlbum.setEditable(false);
        txtGeneroAlbum.setBackground(new java.awt.Color(255, 255, 255));
        txtGeneroAlbum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGeneroAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroAlbumActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Álbumes");

        txtNumeroCancion.setEditable(false);
        txtNumeroCancion.setBackground(new java.awt.Color(255, 255, 255));
        txtNumeroCancion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroCancionActionPerformed(evt);
            }
        });

        txtGrabacion.setEditable(false);
        txtGrabacion.setBackground(new java.awt.Color(255, 255, 255));
        txtGrabacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtGrabacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrabacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTipoArtista)
                    .addComponent(txtFormacion)
                    .addComponent(txtOrigen)
                    .addComponent(txtEstado)
                    .addComponent(txtCantidadAlbum, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTipoAlbum)
                        .addComponent(txtNumeroAlbum)
                        .addComponent(txtGeneroAlbum))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGrabacion, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                    .addComponent(txtNumeroCancion)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(159, 159, 159))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(txtGenerosArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTipoArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFormacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumeroAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTipoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumeroCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtGrabacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)
                        .addComponent(txtGeneroAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidadAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGenerosArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipoArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoArtistaActionPerformed

    private void txtFormacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormacionActionPerformed

    private void txtOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrigenActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void txtCantidadAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadAlbumActionPerformed

    private void txtNumeroAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroAlbumActionPerformed

    private void txtTipoAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoAlbumActionPerformed

    private void txtGeneroAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroAlbumActionPerformed

    private void txtNumeroCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroCancionActionPerformed

    private void txtGrabacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrabacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrabacionActionPerformed

    private void tablaInfoGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInfoGeneralMouseClicked
        cargarInfoArtista();
        cargarInfoAlbum();
        cargarInfoCancion();
    }//GEN-LAST:event_tablaInfoGeneralMouseClicked

    private void txtGenerosArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenerosArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenerosArtistaActionPerformed

    /**
    * Este método se utiliza para cargar la lista de canciones en la tabla de canciones.
    * Recorre la lista de artistas, álbumes y canciones, y agrega cada canción a la tabla.
    */
    private void cargarListaCanciones(){
        modeloTablaCanciones.setColumnIdentifiers(new String[] {"Número", "Título", "Artista", "Álbum", "Duración"});
        for (Artista artista : Utilitario.listaArtistas) {
            for (Album album : artista.getListaAlbumes()) { 
                for (Cancion cancion : album.getListaCanciones()){
                    int numero = cancion.getNumero();
                    String titulo = cancion.getTitulo();
                    String artistaCancion = album.getMapaAlbumArtista().get(album).getNombre();
                    String albumCancion = cancion.getMapaCancionAlbum().get(cancion).getNombre();
                    String duracion = cancion.getDuracion();
                    modeloTablaCanciones.addRow(new Object[]{numero, titulo, artistaCancion, albumCancion, duracion});
                }
            }
        }
    }
    
    /**
    * Este método se utiliza para cargar la información del artista de la canción seleccionada en la tabla.
    * Si el índice de la canción seleccionada no es -1, entonces se muestra la información del artista de la canción seleccionada.
    */
    private void cargarInfoArtista(){
        int indiceCancion = tablaInfoGeneral.getSelectedRow();
        Artista artistaCancion = null;
        if (indiceCancion != -1) {
            String nombreArtista = modeloTablaCanciones.getValueAt(indiceCancion, 2).toString();
            for (Artista artista : Utilitario.listaArtistas) {
                if (artista.getNombre().equals(nombreArtista)) {
                    artistaCancion = artista;
                }
            }
            txtTipoArtista.setText(artistaCancion.getTipo());
            txtFormacion.setText(Integer.toString(artistaCancion.getAnioFormacion()));
            txtOrigen.setText(artistaCancion.getOrigen());
            txtEstado.setText(artistaCancion.getEstado());
            txtCantidadAlbum.setText(Integer.toString(artistaCancion.getCantidadAlbumes()));
            String generos = "";
            for (Genero genero : artistaCancion.getListaGeneros()) {
                generos += genero.getNombre() + ", ";
            }
            if (!generos.isEmpty()) {
                generos = generos.substring(0, generos.length() -2);
            }
            txtGenerosArtista.setText(generos);  
        }
    }
    
    /**
    * Este método se utiliza para cargar la información del álbum de la canción seleccionada en la tabla.
    * Si el índice de la canción seleccionada no es -1, entonces se muestra la información del álbum de la canción seleccionada.
    */
    private void cargarInfoAlbum(){
        int indiceCancion = tablaInfoGeneral.getSelectedRow();
        Album albumCancion = null;
        if (indiceCancion != -1) {
            String nombreAlbum = modeloTablaCanciones.getValueAt(indiceCancion, 3).toString();
            for (Artista artista : Utilitario.listaArtistas) {
                for (Album album : artista.getListaAlbumes()) {
                    if (album.getNombre().equals(nombreAlbum)) {
                    albumCancion = album;
                    }   
                }
            }
            txtNumeroAlbum.setText(Integer.toString(albumCancion.getNumero()));
            txtTipoAlbum.setText(albumCancion.getTipo());
            txtGeneroAlbum.setText(albumCancion.getGenero().getNombre());
        }
    }
    
    /**
    * Este método se utiliza para cargar la información de la canción seleccionada en la tabla.
    * Si el índice de la canción seleccionada no es -1, entonces se muestra la información de la canción seleccionada.
    */
    private void cargarInfoCancion(){
        int indiceCancion = tablaInfoGeneral.getSelectedRow();
        Cancion cancionSeleccionada = null;
        if (indiceCancion != -1) {
            String nombreCancion = modeloTablaCanciones.getValueAt(indiceCancion, 1).toString();
        for (Artista artista : Utilitario.listaArtistas) {
            for (Album album : artista.getListaAlbumes()) { 
                for (Cancion cancion : album.getListaCanciones()){
                    if (cancion.getTitulo().equals(nombreCancion)) {
                        cancionSeleccionada = cancion;
                    }
                }
            }
        }
            txtNumeroCancion.setText(Integer.toString(cancionSeleccionada.getNumero()));
            txtGrabacion.setText(Integer.toString(cancionSeleccionada.getAnioGrabacion()));
        }
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
            java.util.logging.Logger.getLogger(dialogInfoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dialogInfoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dialogInfoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dialogInfoGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialogInfoGeneral dialog = new dialogInfoGeneral(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaInfoGeneral;
    private javax.swing.JTextField txtCantidadAlbum;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFormacion;
    private javax.swing.JTextField txtGeneroAlbum;
    private javax.swing.JTextField txtGenerosArtista;
    private javax.swing.JTextField txtGrabacion;
    private javax.swing.JTextField txtNumeroAlbum;
    private javax.swing.JTextField txtNumeroCancion;
    private javax.swing.JTextField txtOrigen;
    private javax.swing.JTextField txtTipoAlbum;
    private javax.swing.JTextField txtTipoArtista;
    // End of variables declaration//GEN-END:variables
}
