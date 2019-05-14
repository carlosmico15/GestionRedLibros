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

import Pojos.Ejemplar;
import Pojos.Historial;
import Utilidades.CodigoBarras;
import Utilidades.Colores;
import Utilidades.Configuracion;
import Utilidades.ConfirmacionDevolucion;
import Utilidades.Estado;
import Utilidades.Imagenes.Imagenes;
import Vistas.FramePopup;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

/**
 *
 * @author Jose Sanchis
 */
public class FrameConfirmacionDevolucion extends javax.swing.JFrame {

    private Historial historial;

    private FramePopup framePopup;

    private String placeHolderObservaciones = "Escribe una observación…";

    //Cogemos el FramePadre para trabajar con los dialogos
    private JFrame topFrame;

    /**
     * Creates new form FrameConfirmacionEntrega
     */
    public FrameConfirmacionDevolucion(Historial h) {
        initComponents();

        topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

        textObservaciones.setText(placeHolderObservaciones);

        this.historial = h;

        rellenarEjemplar();
        pack();

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

        rbgEstados = new javax.swing.ButtonGroup();
        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelCuerpo = new javax.swing.JPanel();
        panelEjemplares = new javax.swing.JPanel();
        panelCuerpoEjemplares = new javax.swing.JPanel();
        panelEstadoParent15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        panelEstado15 = new javax.swing.JPanel();
        btnBadStatus = new javax.swing.JLabel();
        btnRegularStatus = new javax.swing.JLabel();
        btnGoodStatus = new javax.swing.JLabel();
        panelCodigoEjemplar = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        imgCodigo = new javax.swing.JLabel();
        btnImprimirEtiqueta = new com.mommoo.flat.button.FlatButton();
        textCodigo = new javax.swing.JLabel();
        textTituloLibro = new javax.swing.JLabel();
        panelObservaciones = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textObservaciones = new javax.swing.JTextArea();
        jLabel30 = new javax.swing.JLabel();
        panelBotonera = new javax.swing.JPanel();
        btnCancel = new com.mommoo.flat.button.FlatButton();
        btnAceptar = new com.mommoo.flat.button.FlatButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Confirmación");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelTitulo.setBackground(Colores.fondoOscuro);

        jLabel1.setBackground(Colores.accento);
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(Colores.letraTitulo);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Confirmar Devolución");

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCuerpo.setBackground(Colores.fondo);

        panelEjemplares.setBackground(Colores.fondo);
        panelEjemplares.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        panelCuerpoEjemplares.setBackground(Colores.fondo);

        panelEstadoParent15.setBackground(Colores.fondo);
        panelEstadoParent15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setForeground(Colores.letraNormal);
        jLabel29.setText("Estado del ejemplar");

        panelEstado15.setBackground(Colores.fondo);
        panelEstado15.setLayout(new java.awt.GridLayout(1, 0, 5, 5));

        btnBadStatus.setBackground(Colores.fondo);
        btnBadStatus.setForeground(Colores.letraNormal);
        btnBadStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBadStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bad_disabled.png"))); // NOI18N
        btnBadStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBadStatusMouseClicked(evt);
            }
        });
        panelEstado15.add(btnBadStatus);

        btnRegularStatus.setBackground(Colores.fondo);
        btnRegularStatus.setForeground(Colores.letraNormal);
        btnRegularStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegularStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regular_disabled.png"))); // NOI18N
        btnRegularStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegularStatusMouseClicked(evt);
            }
        });
        panelEstado15.add(btnRegularStatus);

        btnGoodStatus.setBackground(Colores.fondo);
        btnGoodStatus.setForeground(Colores.letraNormal);
        btnGoodStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGoodStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/good.png"))); // NOI18N
        btnGoodStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoodStatusMouseClicked(evt);
            }
        });
        panelEstado15.add(btnGoodStatus);

        javax.swing.GroupLayout panelEstadoParent15Layout = new javax.swing.GroupLayout(panelEstadoParent15);
        panelEstadoParent15.setLayout(panelEstadoParent15Layout);
        panelEstadoParent15Layout.setHorizontalGroup(
            panelEstadoParent15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoParent15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEstadoParent15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEstadoParent15Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelEstado15, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE))
                    .addGroup(panelEstadoParent15Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEstadoParent15Layout.setVerticalGroup(
            panelEstadoParent15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEstadoParent15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstado15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCodigoEjemplar.setBackground(Colores.fondo);
        panelCodigoEjemplar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel15.setBackground(Colores.accento);
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setForeground(Colores.letraNormal);
        jLabel15.setText("Código del ejemplar");

        imgCodigo.setForeground(Colores.letraNormal);
        imgCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCodigo.setToolTipText("");

        btnImprimirEtiqueta.setBackground(Colores.botones);
        btnImprimirEtiqueta.setForeground(Colores.letraBotones);
        btnImprimirEtiqueta.setText("Imprimir etiqueta");
        btnImprimirEtiqueta.setCornerRound(10);
        btnImprimirEtiqueta.setPreferredSize(new java.awt.Dimension(169, 32));
        btnImprimirEtiqueta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirEtiquetaActionPerformed(evt);
            }
        });

        textCodigo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        textCodigo.setForeground(Colores.letraNormal);
        textCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        textTituloLibro.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        textTituloLibro.setForeground(Colores.letraNormal);
        textTituloLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textTituloLibro.setLabelFor(imgCodigo);

        javax.swing.GroupLayout panelCodigoEjemplarLayout = new javax.swing.GroupLayout(panelCodigoEjemplar);
        panelCodigoEjemplar.setLayout(panelCodigoEjemplarLayout);
        panelCodigoEjemplarLayout.setHorizontalGroup(
            panelCodigoEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodigoEjemplarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCodigoEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCodigoEjemplarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnImprimirEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCodigoEjemplarLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelCodigoEjemplarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelCodigoEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textTituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelCodigoEjemplarLayout.setVerticalGroup(
            panelCodigoEjemplarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCodigoEjemplarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimirEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelObservaciones.setBackground(Colores.fondo);
        panelObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textObservaciones.setBackground(Colores.fondo);
        textObservaciones.setColumns(20);
        textObservaciones.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textObservaciones.setForeground(Colores.campoTextSinFocus);
        textObservaciones.setRows(5);
        textObservaciones.setSelectedTextColor(Colores.letraBotones);
        textObservaciones.setSelectionColor(Colores.accento);
        jScrollPane2.setViewportView(textObservaciones);

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel30.setForeground(Colores.letraNormal);
        jLabel30.setText("Observaciones");

        javax.swing.GroupLayout panelObservacionesLayout = new javax.swing.GroupLayout(panelObservaciones);
        panelObservaciones.setLayout(panelObservacionesLayout);
        panelObservacionesLayout.setHorizontalGroup(
            panelObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelObservacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
                    .addGroup(panelObservacionesLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelObservacionesLayout.setVerticalGroup(
            panelObservacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelObservacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCuerpoEjemplaresLayout = new javax.swing.GroupLayout(panelCuerpoEjemplares);
        panelCuerpoEjemplares.setLayout(panelCuerpoEjemplaresLayout);
        panelCuerpoEjemplaresLayout.setHorizontalGroup(
            panelCuerpoEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuerpoEjemplaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuerpoEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCodigoEjemplar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEstadoParent15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCuerpoEjemplaresLayout.setVerticalGroup(
            panelCuerpoEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoEjemplaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCodigoEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstadoParent15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelEjemplaresLayout = new javax.swing.GroupLayout(panelEjemplares);
        panelEjemplares.setLayout(panelEjemplaresLayout);
        panelEjemplaresLayout.setHorizontalGroup(
            panelEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEjemplaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCuerpoEjemplares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelEjemplaresLayout.setVerticalGroup(
            panelEjemplaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEjemplaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCuerpoEjemplares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBotonera.setBackground(Colores.fondo);

        btnCancel.setBackground(Colores.botones);
        btnCancel.setForeground(Colores.letraBotones);
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/close.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.setCornerRound(10);
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
        });

        btnAceptar.setBackground(Colores.botones);
        btnAceptar.setForeground(Colores.letraBotones);
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/check-white.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setCornerRound(10);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotoneraLayout = new javax.swing.GroupLayout(panelBotonera);
        panelBotonera.setLayout(panelBotoneraLayout);
        panelBotoneraLayout.setHorizontalGroup(
            panelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoneraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBotoneraLayout.setVerticalGroup(
            panelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotoneraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBotoneraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEjemplares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotonera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBotonera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked
        FrameDevoluciones.isConfirmationReady = ConfirmacionDevolucion.CANCELADA;
        FrameDevoluciones.frameConfirmacion = null;
        dispose();
    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnBadStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBadStatusMouseClicked
        // TODO add your handling code here:
        setEstado(Estado.deteriorado);
    }//GEN-LAST:event_btnBadStatusMouseClicked

    private void btnRegularStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegularStatusMouseClicked
        // TODO add your handling code here:
        setEstado(Estado.usado);
    }//GEN-LAST:event_btnRegularStatusMouseClicked

    private void btnGoodStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoodStatusMouseClicked
        // TODO add your handling code here:
        setEstado(Estado.nuevo);
    }//GEN-LAST:event_btnGoodStatusMouseClicked

    private void btnImprimirEtiquetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirEtiquetaActionPerformed
        // TODO add your handling code here:
        new FrameEtiquetasPopup(topFrame, historial.getEjemplar()).setVisible(true);
    }//GEN-LAST:event_btnImprimirEtiquetaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        //El estado se actualiza al cambiar el estado visual en el metodo setEstado()
        historial.setFecha_final(new Date());
        historial.setObservaciones(textObservaciones.getText());

        try {
            //Actualizamos los campos del historial y el ejemplar hijo del historial.
            SwingWorker<?, ?> worker = new SwingWorker<Void, Void>() {
                protected Void doInBackground() throws InterruptedException {
                    Ejemplar ejemplar = historial.getEjemplar();

                    ejemplar.setEstado(historial.getEstado_final());
                    ejemplar.setPrestado(false);

                    historial.setEjemplar(ejemplar);
                    return null;
                }

                protected void done() {
                    FrameDevoluciones.isConfirmationReady = ConfirmacionDevolucion.REALIZADA;
                    FrameDevoluciones.historialConfirmado = historial;

                    framePopup.dispose();
                    dispose();
                }
            };
            worker.execute();
            framePopup = new FramePopup(this, "Generando historial de préstamo...");
            framePopup.setVisible(true);
        } catch (Exception e) {
            FrameDevoluciones.isConfirmationReady = ConfirmacionDevolucion.CANCELADA;
            e.printStackTrace();

            new FramePopup(this, "Error al devolver el ejemplar.",
                    new ImageIcon(getClass().getResource("/Imagenes/icons/alert-black.png")),
                    "Aceptar").setVisible(true);
        }

        FrameDevoluciones.frameConfirmacion = null;
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        FrameDevoluciones.frameConfirmacion = null;
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
            java.util.logging.Logger.getLogger(FrameConfirmacionDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameConfirmacionDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameConfirmacionDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameConfirmacionDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameConfirmacionDevolucion(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mommoo.flat.button.FlatButton btnAceptar;
    private javax.swing.JLabel btnBadStatus;
    private com.mommoo.flat.button.FlatButton btnCancel;
    private javax.swing.JLabel btnGoodStatus;
    private com.mommoo.flat.button.FlatButton btnImprimirEtiqueta;
    private javax.swing.JLabel btnRegularStatus;
    private javax.swing.JLabel imgCodigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelBotonera;
    private javax.swing.JPanel panelCodigoEjemplar;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelCuerpoEjemplares;
    private javax.swing.JPanel panelEjemplares;
    private javax.swing.JPanel panelEstado15;
    private javax.swing.JPanel panelEstadoParent15;
    private javax.swing.JPanel panelObservaciones;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.ButtonGroup rbgEstados;
    private javax.swing.JLabel textCodigo;
    private javax.swing.JTextArea textObservaciones;
    private javax.swing.JLabel textTituloLibro;
    // End of variables declaration//GEN-END:variables

    private void rellenarEjemplar() {
        CodigoBarras cb = new CodigoBarras();
        textCodigo.setText(historial.getEjemplar().getCodigo());
        textTituloLibro.setText(historial.getEjemplar().getLibro().getNombre());
        try {
            ImageIcon icon = cb.getImage(cb.generarCodigoIndividual(historial.getEjemplar().getCodigo()), 400, 120);
            imgCodigo.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
            new FramePopup(this, "Error al conseguir el codigo de barras de los ejemplares",
                    new ImageIcon(getClass().getResource("/Imagenes/icons/alert-black.png")),
                    "Aceptar").setVisible(true);
        }

        textObservaciones.setText(historial.getObservaciones());

        setEstado(historial.getEjemplar().getEstado());
    }

    public void setEstado(int estado) {
        historial.setEstado_final(estado);

        switch (estado) {
            case Estado.deteriorado:
                //El libro se encuentra en mal estado

                btnBadStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/bad.png")));               //Bad face
                btnRegularStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/regular_disabled.png")));  //Regular face
                btnGoodStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/good_disabled.png")));     //Good face
                break;

            case Estado.usado:
                //El libro se encuentra en mal estado

                btnBadStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/bad_disabled.png")));     //Bad face
                btnRegularStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/regular.png")));          //Regular face
                btnGoodStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/good_disabled.png")));    //Good face
                break;

            case Estado.nuevo:
                //El libro se encuentra en mal estado

                btnBadStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/bad_disabled.png")));     //Bad face
                btnRegularStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/regular_disabled.png"))); //Regular face
                btnGoodStatus.setIcon(new ImageIcon(
                        getClass().getResource("/Imagenes/good.png")));             //Good face
                break;
        }
    }
}
