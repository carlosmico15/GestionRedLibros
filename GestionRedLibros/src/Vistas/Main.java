/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Utilidades.DimensionesFrame;
import Utilidades.GestorSesiones;
import Utilidades.GetInternetStatus;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jose Sanchis
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    FrameDevoluciones gesDevoluciones = null;
    FrameEntrega gesEntrega = null;
    FrameInputLibro inputLibro = null;
    FrameMatriculas gesMatri = null;
    FrameOpciones opciones = null;
    FrameCarga frameCarga;
    
    public static GestorSesiones gestorSesiones;

    public Main() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        if (!GetInternetStatus.isAvailable()) {
            JOptionPane.showMessageDialog(this, "No hay conexión al servidor");
        }

        gestorSesiones = new GestorSesiones();
        //<editor-fold defaultstate="collapsed" desc="Set the wallpaper image">
        String icono = "";
        BufferedImage img = null;
        icono = "../Imagenes/wallpaper.jpg";
        img = ImageIO.read(new File(icono));
        Image image = img.getScaledInstance(DimensionesFrame.width, DimensionesFrame.height, Image.SCALE_SMOOTH);
        ImageIcon imageIcon = new ImageIcon(image);
        wallpaper.setIcon(imageIcon);
        banner.setVisible(true);
//</editor-fold>

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPopup = new javax.swing.JPopupMenu();
        btnGestionLibros = new javax.swing.JMenuItem();
        btnGestionEjemplar = new javax.swing.JMenuItem();
        btnConsultaAlumnos = new javax.swing.JMenuItem();
        btnMatriculas = new javax.swing.JMenuItem();
        banner = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnDevoluciones = new com.mommoo.flat.button.FlatButton();
        btnEntrega = new com.mommoo.flat.button.FlatButton();
        btnGestiones = new com.mommoo.flat.button.FlatButton();
        btnOpciones = new com.mommoo.flat.button.FlatButton();
        flatButton1 = new com.mommoo.flat.button.FlatButton();
        wallpaper = new javax.swing.JLabel();

        menuPopup.setBackground(new java.awt.Color(66, 47, 44));
        menuPopup.setForeground(new java.awt.Color(66, 47, 44));
        menuPopup.setBorderPainted(false);
        menuPopup.setPreferredSize(new java.awt.Dimension(250, 150));

        btnGestionLibros.setBackground(new java.awt.Color(66, 47, 44));
        btnGestionLibros.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        btnGestionLibros.setForeground(new java.awt.Color(66, 47, 44));
        btnGestionLibros.setLabel("Libros");
        btnGestionLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionLibrosActionPerformed(evt);
            }
        });
        menuPopup.add(btnGestionLibros);

        btnGestionEjemplar.setBackground(new java.awt.Color(66, 47, 44));
        btnGestionEjemplar.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        btnGestionEjemplar.setForeground(new java.awt.Color(66, 47, 44));
        btnGestionEjemplar.setLabel("Ejemplar");
        btnGestionEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionEjemplarActionPerformed(evt);
            }
        });
        menuPopup.add(btnGestionEjemplar);

        btnConsultaAlumnos.setBackground(new java.awt.Color(66, 47, 44));
        btnConsultaAlumnos.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        btnConsultaAlumnos.setForeground(new java.awt.Color(66, 47, 44));
        btnConsultaAlumnos.setLabel("Alumnos");
        btnConsultaAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaAlumnosActionPerformed(evt);
            }
        });
        menuPopup.add(btnConsultaAlumnos);

        btnMatriculas.setBackground(new java.awt.Color(66, 47, 44));
        btnMatriculas.setFont(new java.awt.Font("Dialog", 1, 21)); // NOI18N
        btnMatriculas.setForeground(new java.awt.Color(66, 47, 44));
        btnMatriculas.setText("Matriculas");
        btnMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculasActionPerformed(evt);
            }
        });
        menuPopup.add(btnMatriculas);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión Red Libros");
        setMinimumSize(new java.awt.Dimension(960, 0));
        setPreferredSize(new java.awt.Dimension(970, 512));

        banner.setBackground(new java.awt.Color(58, 39, 35));
        banner.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión Red Libros");
        banner.add(jLabel1);

        jPanel1.setBackground(new java.awt.Color(58, 39, 35));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 37));
        jPanel1.setLayout(new java.awt.GridLayout(1, 4, 5, 0));

        btnDevoluciones.setBackground(new java.awt.Color(66, 47, 44));
        btnDevoluciones.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btnDevoluciones.setForeground(new java.awt.Color(204, 204, 204));
        btnDevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/clipboard-arrow-down.png"))); // NOI18N
        btnDevoluciones.setText("  Devoluciones");
        btnDevoluciones.setCornerRound(10);
        btnDevoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDevoluciones);

        btnEntrega.setBackground(new java.awt.Color(66, 47, 44));
        btnEntrega.setForeground(new java.awt.Color(204, 204, 204));
        btnEntrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/clipboard-arrow-up.png"))); // NOI18N
        btnEntrega.setText("  Entregas");
        btnEntrega.setCornerRound(10);
        btnEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrega);

        btnGestiones.setBackground(new java.awt.Color(66, 47, 44));
        btnGestiones.setForeground(new java.awt.Color(204, 204, 204));
        btnGestiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/book.png"))); // NOI18N
        btnGestiones.setText("  Gestiones");
        btnGestiones.setCornerRound(10);
        btnGestiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnGestionesMouseReleased(evt);
            }
        });
        btnGestiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestiones);

        btnOpciones.setBackground(new java.awt.Color(66, 47, 44));
        btnOpciones.setForeground(new java.awt.Color(204, 204, 204));
        btnOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/ballot.png"))); // NOI18N
        btnOpciones.setText("  Opciones");
        btnOpciones.setCornerRound(10);
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });
        jPanel1.add(btnOpciones);

        flatButton1.setBackground(new java.awt.Color(66, 47, 44));
        flatButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/help.png"))); // NOI18N
        flatButton1.setText("  Ayuda");
        flatButton1.setCornerRound(10);
        jPanel1.add(flatButton1);

        banner.add(jPanel1);

        wallpaper.setMinimumSize(new java.awt.Dimension(1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(banner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(banner, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(wallpaper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionesActionPerformed
        // TODO add your handling code here:
        if (gesDevoluciones == null) {
            gesDevoluciones = new FrameDevoluciones();
        }
        gesDevoluciones.setVisible(true);
    }//GEN-LAST:event_btnDevolucionesActionPerformed

    private void btnEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregaActionPerformed
        // TODO add your handling code here:
        if (gesEntrega == null) {
            gesEntrega = new FrameEntrega();
        }
        gesEntrega.setVisible(true);
    }//GEN-LAST:event_btnEntregaActionPerformed

    private void btnGestionLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionLibrosActionPerformed
        // TODO add your handling code here:
        if (inputLibro == null) {
            inputLibro = new FrameInputLibro(true);
        } else {
            if (!inputLibro.isVisible()) {
                inputLibro = null;
                inputLibro = new FrameInputLibro(true);
            }
        }
        inputLibro.textTitleFrame.setText("Gestión Libros");
        inputLibro.setVisible(true);
    }//GEN-LAST:event_btnGestionLibrosActionPerformed

    private void btnGestionEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEjemplarActionPerformed
        // TODO add your handling code here:
        if (inputLibro == null) {
            inputLibro = new FrameInputLibro(false);
        } else {
            if (!inputLibro.isVisible()) {
                inputLibro = null;
                inputLibro = new FrameInputLibro(false);
            }
        }
        inputLibro.textTitleFrame.setText("Gestión Ejemplares");
        inputLibro.setVisible(true);
    }//GEN-LAST:event_btnGestionEjemplarActionPerformed

    private void btnConsultaAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaAlumnosActionPerformed
        // TODO add your handling code here:
        System.out.println("Gestion Alumno");
    }//GEN-LAST:event_btnConsultaAlumnosActionPerformed

    private void btnGestionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionesMouseReleased
        // TODO add your handling code here:
        menuPopup.show(evt.getComponent(), 0, 66);
    }//GEN-LAST:event_btnGestionesMouseReleased

    private void btnGestionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGestionesActionPerformed

    private void btnMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculasActionPerformed
        // TODO add your handling code here:
        if (gesMatri == null) {
            gesMatri = new FrameMatriculas();
        }
<<<<<<< HEAD
=======

>>>>>>> master
        SwingWorker<?, ?> worker = new SwingWorker<Void, Integer>() {
            protected Void doInBackground() throws InterruptedException {
                gesMatri.RefrescarTabla();
                return null;
            }

            protected void process(List<Integer> chunks) {
            }

            protected void done() {
                //Rellenamos la lista de los libros
                gesMatri.setVisible(true);

                frameCarga.dispose();
            }
        };
        worker.execute();
        if (frameCarga == null) {
            frameCarga = new FrameCarga();
        }
        frameCarga.setVisible(true);

    }//GEN-LAST:event_btnMatriculasActionPerformed

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        // TODO add your handling code here:
        if (opciones == null) {
            try {
                opciones = new FrameOpciones();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        opciones.setVisible(true);
    }//GEN-LAST:event_btnOpcionesActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel banner;
    private javax.swing.JMenuItem btnConsultaAlumnos;
    private com.mommoo.flat.button.FlatButton btnDevoluciones;
    private com.mommoo.flat.button.FlatButton btnEntrega;
    private javax.swing.JMenuItem btnGestionEjemplar;
    private javax.swing.JMenuItem btnGestionLibros;
    private com.mommoo.flat.button.FlatButton btnGestiones;
    private javax.swing.JMenuItem btnMatriculas;
    private com.mommoo.flat.button.FlatButton btnOpciones;
    private com.mommoo.flat.button.FlatButton flatButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu menuPopup;
    private javax.swing.JLabel wallpaper;
    // End of variables declaration//GEN-END:variables
}
