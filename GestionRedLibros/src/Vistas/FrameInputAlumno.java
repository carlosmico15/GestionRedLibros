/*
 * Copyright (C) 2019 Jose Sanchis
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package Vistas;

import Daos.*;
import Pojos.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.SwingWorker;

/**
 *
 * @author Jose Sanchis
 */
public class FrameInputAlumno extends javax.swing.JFrame {

    /**
     * Creates new form FrameDevoluciones
     */
    /**
     * Modos de busqueada: - busquedaPorCodigo = true: por codigo del libro
     * (codigo de barras) - busquedaPorCodigo = false: por nombre del libro
     * (debe ser exacto)
     *
     * "Por defecto el modo de busqueda es el true, es decir, por el codigo del
     * libro"
     */
    public boolean isLoading = false;

    private FrameCarga frameCarga;
    private FrameAlumno frameAlumno;

    private DaoAlumno daoAlumno;

    private Alumno alumno;

    public FrameInputAlumno() {
        initComponents();

        textErrorBusqueda.setText("");

        this.setLocationRelativeTo(null);

        textNIAAlumno.requestFocusInWindow();

        daoAlumno = new DaoAlumno(Main.gestorSesiones.getSession());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        head = new javax.swing.JPanel();
        textTitleFrame = new javax.swing.JLabel();
        bodyCode = new javax.swing.JPanel();
        textTitle = new javax.swing.JLabel();
        textNIAAlumno = new javax.swing.JTextField();
        btnBuscar = new com.mommoo.flat.button.FlatButton();
        textErrorBusqueda = new javax.swing.JLabel();
        botonera = new javax.swing.JPanel();
        btnCancel = new com.mommoo.flat.button.FlatButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Alumnos");
        setBackground(new java.awt.Color(239, 235, 233));
        setMinimumSize(new java.awt.Dimension(569, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        head.setBackground(new java.awt.Color(58, 39, 35));
        head.setPreferredSize(new java.awt.Dimension(135, 75));

        textTitleFrame.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        textTitleFrame.setForeground(new java.awt.Color(204, 204, 204));
        textTitleFrame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTitleFrame.setText("Buscar Alumnos");

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textTitleFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textTitleFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bodyCode.setBackground(new java.awt.Color(239, 235, 233));

        textTitle.setBackground(new java.awt.Color(51, 51, 51));
        textTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textTitle.setForeground(new java.awt.Color(51, 51, 51));
        textTitle.setText("NIA del Alumno:");
        textTitle.setToolTipText("");

        textNIAAlumno.setBackground(new java.awt.Color(239, 235, 233));
        textNIAAlumno.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        textNIAAlumno.setForeground(new java.awt.Color(51, 51, 51));
        textNIAAlumno.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textNIAAlumno.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        textNIAAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textNIAAlumnoKeyPressed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(66, 47, 44));
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/magnify.png"))); // NOI18N
        btnBuscar.setCornerRound(10);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        textErrorBusqueda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textErrorBusqueda.setForeground(new java.awt.Color(255, 102, 102));
        textErrorBusqueda.setText("No existe ningún alumno con este codigo");

        javax.swing.GroupLayout bodyCodeLayout = new javax.swing.GroupLayout(bodyCode);
        bodyCode.setLayout(bodyCodeLayout);
        bodyCodeLayout.setHorizontalGroup(
            bodyCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyCodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bodyCodeLayout.createSequentialGroup()
                        .addComponent(textTitle)
                        .addGap(0, 389, Short.MAX_VALUE))
                    .addGroup(bodyCodeLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(bodyCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bodyCodeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(textErrorBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textNIAAlumno))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        bodyCodeLayout.setVerticalGroup(
            bodyCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyCodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyCodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(textNIAAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textErrorBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonera.setBackground(new java.awt.Color(239, 235, 233));

        btnCancel.setBackground(new java.awt.Color(66, 47, 44));
        btnCancel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancel.setText("Cancelar");
        btnCancel.setCornerRound(10);
        btnCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancel.setPreferredSize(new java.awt.Dimension(141, 30));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botoneraLayout = new javax.swing.GroupLayout(botonera);
        botonera.setLayout(botoneraLayout);
        botoneraLayout.setHorizontalGroup(
            botoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botoneraLayout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        botoneraLayout.setVerticalGroup(
            botoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoneraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(head, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(bodyCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(head, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(bodyCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void textNIAAlumnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNIAAlumnoKeyPressed
        // TODO add your handling code here:
        if (textNIAAlumno.hasFocus()) {
            textNIAAlumno.addKeyListener(new KeyAdapter() {
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        if (!isLoading) {
                            buscarLibro(textNIAAlumno.getText());
                            isLoading = true;
                        }
                    }
                }
            });
        }
    }//GEN-LAST:event_textNIAAlumnoKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if (!isLoading) {
            buscarLibro(textNIAAlumno.getText());
            isLoading = true;
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        try {
            daoAlumno.desconectar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(FrameDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDevoluciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDevoluciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bodyCode;
    private javax.swing.JPanel botonera;
    private com.mommoo.flat.button.FlatButton btnBuscar;
    private com.mommoo.flat.button.FlatButton btnCancel;
    private javax.swing.JPanel head;
    public javax.swing.JLabel textErrorBusqueda;
    public javax.swing.JTextField textNIAAlumno;
    private javax.swing.JLabel textTitle;
    public javax.swing.JLabel textTitleFrame;
    // End of variables declaration//GEN-END:variables

    private void buscarLibro(String nia) {
        if (!nia.equals("")) {
            //Se ha insertado un codigo
            SwingWorker<?, ?> worker = new SwingWorker<Void, Integer>() {
                protected Void doInBackground() throws InterruptedException {
                    alumno = daoAlumno.buscar(nia);
                    return null;
                }

                protected void process(List<Integer> chunks) {
                }

                protected void done() {
                    if (alumno != null) {
                        dispose();
                        if (frameAlumno == null){
                            frameAlumno = new FrameAlumno(alumno.getNia());
                        }
                        frameAlumno.setVisible(true);
                    } else {
                        textErrorBusqueda.setVisible(true);
                        textErrorBusqueda.setText("No existen alumnos con este NIA.");
                        isLoading = false;
                    }

                    frameCarga.dispose();
                }
            };
            worker.execute();
            if (frameCarga == null) {
                frameCarga = new FrameCarga();
            }
            frameCarga.setVisible(true);
        } else {
            //No se ha insertado ningun valor en el campo de texto
            textErrorBusqueda.setVisible(true);
            isLoading = false;
            textErrorBusqueda.setText("El NIA no puede ser un campo vacío.");
            textNIAAlumno.setText("");
        }

    }
}
