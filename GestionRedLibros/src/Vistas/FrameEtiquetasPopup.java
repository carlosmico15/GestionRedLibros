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
import Pojos.Libro;
import Renders.comboBoxRender;
import Utilidades.CodigoBarras;
import Utilidades.Colores;
import Utilidades.Configuracion;
import Utilidades.Imagenes.Imagenes;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Jose Sanchis
 */
public class FrameEtiquetasPopup extends javax.swing.JDialog {

    JFrame parent;
    Ejemplar ejemplar;

    FramePopup frameInfo;

    /**
     * Crea el nuevo formulario FramePopup con texto, icono y botón
     * personalizado con acción personalizada. (Si puede cerrarse desde el mismo
     * formulario)
     *
     * @param mensaje Es el texto que aparece en la ventana
     * @param icon Es la imagen que se muestra en la ventana
     * @param buttonText Es el texto que contendra el Botón
     * @param action Es la acción que realizará el Botón
     */
    public FrameEtiquetasPopup(JFrame parent) {
        super(parent, true);
        initComponents();
        this.ejemplar = null;
        this.parent = parent;
        jPanel10.setVisible(false);

        configuracionComboBox();

        setMode(true); //por defecto tenemos seleccionado la opcion 'por defecto'

        btnAceptar.setVisible(true);
        btnCancelar.setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    public FrameEtiquetasPopup(JFrame parent, Ejemplar ejemplar) {
        super(parent, true);
        initComponents();
        this.ejemplar = ejemplar;
        this.parent = parent;

        configuracionComboBox();

        setMode(true); //por defecto tenemos seleccionado la opcion 'por defecto'

        btnAceptar.setVisible(true);
        btnCancelar.setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eleccion = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        text = new org.jdesktop.swingx.JXLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbFilas = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbColumnas = new javax.swing.JComboBox();
        jPanel8 = new javax.swing.JPanel();
        rbByDefault = new javax.swing.JRadioButton();
        rbPersonalizado = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfEjemplares1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfCantidad = new javax.swing.JTextField();
        panelButton = new javax.swing.JPanel();
        btnCancelar = new com.mommoo.flat.button.FlatButton();
        btnAceptar = new com.mommoo.flat.button.FlatButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 20000));
        setMinimumSize(new java.awt.Dimension(400, 460));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(Colores.fondoOscuro);
        jPanel1.setPreferredSize(new java.awt.Dimension(521, 330));

        jPanel2.setBackground(Colores.fondo);
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 389));

        text.setBackground(Colores.fondoOscuro);
        text.setForeground(Colores.letraTitulo);
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Ajustes de impresión");
        text.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        text.setMinimumSize(new java.awt.Dimension(375, 36));
        text.setOpaque(true);

        jPanel7.setBackground(Colores.fondo);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel6.setBackground(Colores.fondo);
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel4.setBackground(Colores.fondo);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(Colores.letraNormal);
        jLabel1.setText("Filas:");

        cbFilas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbFilas.setForeground(Colores.letraNormal);
        cbFilas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "10", "8", "7", "6", "5", "4", "2", "1" }));
        cbFilas.setSelectedIndex(1);
        cbFilas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbFilasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFilas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel5.setBackground(Colores.fondo);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(Colores.letraNormal);
        jLabel2.setText("Columnas:");

        cbColumnas.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        cbColumnas.setForeground(Colores.letraNormal);
        cbColumnas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "3", "2", "1" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbColumnas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(Colores.fondo);

        eleccion.add(rbByDefault);
        rbByDefault.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbByDefault.setForeground(Colores.letraNormal);
        rbByDefault.setSelected(true);
        rbByDefault.setText("Por defecto");
        rbByDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbByDefaultActionPerformed(evt);
            }
        });

        eleccion.add(rbPersonalizado);
        rbPersonalizado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbPersonalizado.setForeground(Colores.letraNormal);
        rbPersonalizado.setText("Personalizado");
        rbPersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPersonalizadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbByDefault)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbPersonalizado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbByDefault)
                    .addComponent(rbPersonalizado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(Colores.fondo);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(Colores.letraNormal);
        jLabel3.setText("Posición primera etiqueta:");

        tfEjemplares1.setBackground(Colores.fondo);
        tfEjemplares1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfEjemplares1.setForeground(Colores.letraNormal);
        tfEjemplares1.setText("0");
        tfEjemplares1.setToolTipText("");
        tfEjemplares1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEjemplares1)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfEjemplares1, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(Colores.fondo);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(Colores.letraNormal);
        jLabel4.setText("Cantidad de etiquetas:");

        tfCantidad.setBackground(Colores.fondo);
        tfCantidad.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfCantidad.setForeground(Colores.letraNormal);
        tfCantidad.setText("0");
        tfCantidad.setToolTipText("");
        tfCantidad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCantidad)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelButton.setBackground(Colores.fondo);

        btnCancelar.setBackground(Colores.botones);
        btnCancelar.setForeground(Colores.letraBotones);
        btnCancelar.setText("Cancelar");
        btnCancelar.setCornerRound(10);
        btnCancelar.setMaximumSize(new java.awt.Dimension(150, 32));
        btnCancelar.setMinimumSize(new java.awt.Dimension(150, 32));
        btnCancelar.setPreferredSize(new java.awt.Dimension(150, 32));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(Colores.botones);
        btnAceptar.setForeground(Colores.letraBotones);
        btnAceptar.setText("Aceptar");
        btnAceptar.setCornerRound(10);
        btnAceptar.setMaximumSize(new java.awt.Dimension(150, 32));
        btnAceptar.setMinimumSize(new java.awt.Dimension(150, 32));
        btnAceptar.setPreferredSize(new java.awt.Dimension(150, 32));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int columnas = 0, filas = 0, posicion = 0, cantidad = 0;

        try {
            columnas = Configuracion.getColumnaLayoutHoja();
            filas = Configuracion.getFilasLayoutHoja();
        } catch (Exception e) {
            System.out.println("Error al cargar las filas y columnas.");
        }

        String error = "";
        try {
            posicion = Integer.parseInt(tfEjemplares1.getText());
        } catch (Exception e) {
            error += "- El valor de la posición debe ser un valor numérico.\n";
            e.printStackTrace();
        }

        try {
            cantidad = Integer.parseInt(tfCantidad.getText());
        } catch (Exception e) {
            error += "- El valor de la cantidad debe ser un valor numérico.";
            e.printStackTrace();
        }

        Libro libro = FrameLibro.libro;

        CodigoBarras cb = new CodigoBarras();

        List<String> listaCodigoEjemplares = new ArrayList<>();

        for (int i = 0; i < libro.getEjemplaresDisponibles().size(); i++) {
            listaCodigoEjemplares.add(libro.getEjemplaresDisponibles().get(i).getCodigo());
        }

        if (error.equals("")) {
            if (ejemplar == null) {
                //Todos los ejemplares
                if (rbByDefault.isSelected()) {

                    if (columnas == 0 || filas == 0) {

                        Action personalizar = new AbstractAction() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                setMode(false);
                                rbPersonalizado.setSelected(true);
                                if (frameInfo != null) {
                                    frameInfo.dispose();
                                }
                            }
                        };
                        frameInfo = new FramePopup(null, "No se ha podido cargar la configuración por defecto.\n"
                                + "Por favor, selecciona esta configuracion manualmente.",
                                Imagenes.getImagen("alert-black.png"),
                                "Personalizar",
                                personalizar);
                        frameInfo.setVisible(true);

                    } else {
                        try {
                            cb.imprimirList(libro, cb.generarCodigoList(listaCodigoEjemplares), filas, columnas, posicion);
                        } catch (Exception e) {
                            e.printStackTrace();
                            new FramePopup(this.parent, "No se han podido general los códigos de barras",
                                    new ImageIcon(getClass().getResource("/Imagenes/icons/alert-black.png")),
                                    "Aceptar").setVisible(true);
                        }
                    }
                } else {
                    try {
                        filas = Integer.parseInt(cbFilas.getSelectedItem().toString());
                        columnas = Integer.parseInt(cbColumnas.getSelectedItem().toString());

                        cb.imprimirList(libro, cb.generarCodigoList(listaCodigoEjemplares), filas, columnas, posicion);
                    } catch (Exception e) {
                        e.printStackTrace();
                        new FramePopup(this.parent, "No se han podido general los códigos de barras",
                                new ImageIcon(getClass().getResource("/Imagenes/icons/alert-black.png")),
                                "Aceptar").setVisible(true);
                    }
                }
            } else {
                //Un solo ejemplar
                if (rbByDefault.isSelected()) {

                    if (columnas == 0 || filas == 0) {

                        Action personalizar = new AbstractAction() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                setMode(false);
                                rbPersonalizado.setSelected(true);
                                if (frameInfo != null) {
                                    frameInfo.dispose();
                                }
                            }
                        };
                        frameInfo = new FramePopup(null, "No se ha podido cargar la configuración por defecto.\n"
                                + "Por favor, selecciona esta configuracion manualmente.",
                                Imagenes.getImagen("alert-black.png"),
                                "Personalizar",
                                personalizar);
                        frameInfo.setVisible(true);

                    } else {
                        try {
                            cb.imprimirIndividual(ejemplar, cb.generarCodigoIndividual(ejemplar.getCodigo()), filas, columnas, posicion, cantidad);
                        } catch (Exception e) {
                            e.printStackTrace();
                            new FramePopup(this.parent, "No se han podido general los códigos de barras",
                                    new ImageIcon(getClass().getResource("/Imagenes/icons/alert-black.png")),
                                    "Aceptar").setVisible(true);
                        }
                    }
                } else {
                    try {
                        filas = Integer.parseInt(cbFilas.getSelectedItem().toString());
                        columnas = Integer.parseInt(cbColumnas.getSelectedItem().toString());

                        cb.imprimirIndividual(ejemplar, cb.generarCodigoIndividual(ejemplar.getCodigo()), filas, columnas, posicion, cantidad);
                    } catch (Exception e) {
                        e.printStackTrace();
                        new FramePopup(this.parent, "No se han podido general los códigos de barras",
                                new ImageIcon(getClass().getResource("/Imagenes/icons/alert-black.png")),
                                "Aceptar").setVisible(true);
                    }
                }
            }
        } else {
            new FramePopup(null, "Revisa los siguientes errores: \n" + error,
                    Imagenes.getImagen("alert-black.png"),
                    "Aceptar").setVisible(true);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void rbByDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbByDefaultActionPerformed
        // TODO add your handling code here:
        setMode(true);
    }//GEN-LAST:event_rbByDefaultActionPerformed

    private void rbPersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPersonalizadoActionPerformed
        // TODO add your handling code here:
        setMode(false);
    }//GEN-LAST:event_rbPersonalizadoActionPerformed

    private void cbFilasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbFilasItemStateChanged
        // TODO add your handling code here:
        controlarComboBox();
    }//GEN-LAST:event_cbFilasItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        controlarComboBox();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FrameEtiquetasPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEtiquetasPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEtiquetasPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEtiquetasPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrameEtiquetasPopup dialog = new FrameEtiquetasPopup(new javax.swing.JFrame());
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
    private com.mommoo.flat.button.FlatButton btnAceptar;
    private com.mommoo.flat.button.FlatButton btnCancelar;
    private javax.swing.JComboBox cbColumnas;
    private javax.swing.JComboBox cbFilas;
    private javax.swing.ButtonGroup eleccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel panelButton;
    private javax.swing.JRadioButton rbByDefault;
    private javax.swing.JRadioButton rbPersonalizado;
    private org.jdesktop.swingx.JXLabel text;
    private javax.swing.JTextField tfCantidad;
    private javax.swing.JTextField tfEjemplares1;
    // End of variables declaration//GEN-END:variables

    public void setMode(boolean byDefault) {
        cbFilas.setEnabled(!byDefault);
        cbColumnas.setEnabled(!byDefault);
        if (byDefault) {
            jLabel1.setForeground(Colores.campoTextSinFocus);
            jLabel2.setForeground(Colores.campoTextSinFocus);
        } else {
            jLabel1.setForeground(Colores.letraNormal);
            jLabel2.setForeground(Colores.letraNormal);
        }
    }

    public void controlarComboBox() {
        int item = Integer.parseInt(cbFilas.getSelectedItem().toString());

        cbColumnas.removeAllItems();

        switch (item) {
            case 10:
            case 7:
            case 6:
            case 5:
            case 4:
            case 2:
                cbColumnas.addItem(2);
                break;

            case 8:
                cbColumnas.addItem(3);
                cbColumnas.addItem(2);
                break;

            case 1:
                cbColumnas.addItem(1);
                break;
        }
    }

    private void configuracionComboBox() {
        cbFilas.setEditable(false);
        cbFilas.setUI(new comboBoxRender());
        cbFilas.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList list, Object value, int index,
                    boolean isSelected, boolean hasFocus) {
                JLabel l = (JLabel) super.getListCellRendererComponent(
                        list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    l.setForeground(Colores.letraBotones);
                    l.setBackground(Colores.accento);
                } else {
                    l.setForeground(Colores.letraNormal);
                    l.setBackground(Colores.fondo);
                }
                return l;
            }
        });

        cbColumnas.setEditable(false);
        cbColumnas.setUI(new comboBoxRender());
        cbColumnas.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(
                    JList list, Object value, int index,
                    boolean isSelected, boolean hasFocus) {
                JLabel l = (JLabel) super.getListCellRendererComponent(
                        list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    l.setForeground(Colores.letraBotones);
                    l.setBackground(Colores.accento);
                } else {
                    l.setForeground(Colores.letraNormal);
                    l.setBackground(Colores.fondo);
                }
                return l;
            }
        });
    }

}
