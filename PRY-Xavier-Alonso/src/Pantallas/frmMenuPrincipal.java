/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantallas;

import Logica.Utilitario;

/**
 *
 * @author XAVIER FERNÁNDEZ Z
 */
public class frmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuPrincipal
     */
    public frmMenuPrincipal() {
        initComponents();
        
        //Centrar la ventanda del Menu Principal
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frmPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuInicioDatos = new javax.swing.JMenuItem();
        menuInicioSalir = new javax.swing.JMenuItem();
        menuMantenimiento = new javax.swing.JMenu();
        mantenimientoArtistas = new javax.swing.JMenuItem();
        mantenimientoAlbumes = new javax.swing.JMenuItem();
        mantenimientoCanciones = new javax.swing.JMenuItem();
        menuMantenimientoGeneros = new javax.swing.JMenuItem();
        mantenimientoGenerosxArtista = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout frmPrincipalLayout = new javax.swing.GroupLayout(frmPrincipal);
        frmPrincipal.setLayout(frmPrincipalLayout);
        frmPrincipalLayout.setHorizontalGroup(
            frmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        frmPrincipalLayout.setVerticalGroup(
            frmPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 242, Short.MAX_VALUE)
        );

        menuInicio.setText("Inicio");

        menuInicioDatos.setText("Cargar datos iniciales");
        menuInicioDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioDatosActionPerformed(evt);
            }
        });
        menuInicio.add(menuInicioDatos);

        menuInicioSalir.setText("Salir");
        menuInicioSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioSalirActionPerformed(evt);
            }
        });
        menuInicio.add(menuInicioSalir);

        jMenuBar1.add(menuInicio);

        menuMantenimiento.setText("Mantenimiento");

        mantenimientoArtistas.setText("Artistas");
        mantenimientoArtistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoArtistasActionPerformed(evt);
            }
        });
        menuMantenimiento.add(mantenimientoArtistas);

        mantenimientoAlbumes.setText("Albumes");
        menuMantenimiento.add(mantenimientoAlbumes);

        mantenimientoCanciones.setText("Canciones");
        menuMantenimiento.add(mantenimientoCanciones);

        menuMantenimientoGeneros.setText("Géneros");
        menuMantenimiento.add(menuMantenimientoGeneros);

        mantenimientoGenerosxArtista.setText("Géneros por artista");
        menuMantenimiento.add(mantenimientoGenerosxArtista);

        jMenuBar1.add(menuMantenimiento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frmPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frmPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInicioSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuInicioSalirActionPerformed

    //Método para instanciar la ventana de Artistas
    private void mantenimientoArtistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoArtistasActionPerformed
        frmArtistas artistas = new frmArtistas(this, true);
        artistas.setVisible(true);
    }//GEN-LAST:event_mantenimientoArtistasActionPerformed
    
    //Este método permite que al presionar el botón se llame al método utilitario para cargar datos iniciales.
    private void menuInicioDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioDatosActionPerformed
        Utilitario.cargarDatosArtista();
    }//GEN-LAST:event_menuInicioDatosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel frmPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mantenimientoAlbumes;
    private javax.swing.JMenuItem mantenimientoArtistas;
    private javax.swing.JMenuItem mantenimientoCanciones;
    private javax.swing.JMenuItem mantenimientoGenerosxArtista;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuInicioDatos;
    private javax.swing.JMenuItem menuInicioSalir;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenuItem menuMantenimientoGeneros;
    // End of variables declaration//GEN-END:variables
}
