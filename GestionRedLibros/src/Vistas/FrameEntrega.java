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

import Daos.DaoAlumno;
import Daos.DaoMatricula;
import Pojos.Alumno;
import Pojos.Matricula;
import Renders.tableRender;
import Utilidades.ButtonColumn;
import Utilidades.Colores;
import Utilidades.Imagenes;
import Utilidades.tableEditor;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Jose Sanchis
 */
public class FrameEntrega extends javax.swing.JFrame {

    //Creamos el la pestaña InputAlumno
    private FrameInputAlumno frameInputAlumno;

    //Cremaos el frame de Cargar
    private FramePopup framePopup;

    //Creamos el DAO del Alumno y Matricula
    private DaoAlumno daoAlumno;
    private DaoMatricula daoMatricula;

    //Creamos el Alumno
    public static Alumno alumno, alumnoOld;

    //Matricula temporal
    public Matricula matriculaEntregada = null;
    public List<Matricula> listaMatriculasEntregadas = null;

    //Variable para controlar la carga de los datos
    public static boolean isLoad = false;

    public static int isConfirmationReady = 0;

    //Lista de matriculas pendientes
    public List<Matricula> listaMatriculas;

    /**
     * Creates new form FrameDevoluciones
     */
    public FrameEntrega() {
        initComponents();

        //Inicializamos el DaoAlumno
        daoAlumno = new DaoAlumno(Main.gestorSesiones.getSession());
        daoMatricula = new DaoMatricula(Main.gestorSesiones.getSession());

        //Deshabilitamos la edicion de las celdas en las tablas
        tablaPendientes.setDefaultEditor(Object.class, null);
        tableEntregados.setDefaultEditor(Object.class, null);

        //Inicializamos la lista de las matriculas entregadas
        listaMatriculasEntregadas = new ArrayList<>();

        //Centramos la pestaña al centro de la pantalla
        this.setLocationRelativeTo(null);

        //Maximizamos la pestaña
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarAlumno = new com.mommoo.flat.button.FlatButton();
        panelCuerpo = new javax.swing.JPanel();
        panelNoAlumno = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelSiAlumno = new javax.swing.JPanel();
        panelInfoGeneral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textCursoEscolar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textNIAAlumno = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textNombreAlumno = new javax.swing.JLabel();
        textCurso = new javax.swing.JLabel();
        panelGestionAsignaturas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panelTablas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPendientes = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableEntregados = new javax.swing.JTable();
        panelInfoTablas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entregas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        panelTitulo.setBackground(new java.awt.Color(58, 39, 35));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entregas");

        btnBuscarAlumno.setBackground(Colores.buttons);
        btnBuscarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/account-search.png"))); // NOI18N
        btnBuscarAlumno.setCornerRound(10);
        btnBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTituloLayout = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(panelTituloLayout);
        panelTituloLayout.setHorizontalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelTituloLayout.setVerticalGroup(
            panelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelCuerpo.setBackground(Colores.fondo);

        panelNoAlumno.setBackground(Colores.fondo);
        panelNoAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Busca un alumno para realizar una nueva entrega");

        javax.swing.GroupLayout panelNoAlumnoLayout = new javax.swing.GroupLayout(panelNoAlumno);
        panelNoAlumno.setLayout(panelNoAlumnoLayout);
        panelNoAlumnoLayout.setHorizontalGroup(
            panelNoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelNoAlumnoLayout.setVerticalGroup(
            panelNoAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNoAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSiAlumno.setBackground(Colores.fondo);

        panelInfoGeneral.setBackground(Colores.fondo);
        panelInfoGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelInfoGeneral.setMaximumSize(new java.awt.Dimension(300, 32767));
        panelInfoGeneral.setPreferredSize(new java.awt.Dimension(227, 170));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Curso escolar:");

        textCursoEscolar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textCursoEscolar.setForeground(new java.awt.Color(51, 51, 51));
        textCursoEscolar.setText("2019");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Curso:");

        textNIAAlumno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        textNIAAlumno.setForeground(new java.awt.Color(51, 51, 51));
        textNIAAlumno.setText("null");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Detalles Matrícula:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Alumno:");

        textNombreAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textNombreAlumno.setForeground(new java.awt.Color(51, 51, 51));
        textNombreAlumno.setText("Nombre");

        textCurso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        textCurso.setForeground(new java.awt.Color(51, 51, 51));
        textCurso.setText("jLabel10");

        javax.swing.GroupLayout panelInfoGeneralLayout = new javax.swing.GroupLayout(panelInfoGeneral);
        panelInfoGeneral.setLayout(panelInfoGeneralLayout);
        panelInfoGeneralLayout.setHorizontalGroup(
            panelInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfoGeneralLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNIAAlumno))
                    .addComponent(jLabel9)
                    .addGroup(panelInfoGeneralLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textNombreAlumno)
                            .addGroup(panelInfoGeneralLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCurso))
                            .addGroup(panelInfoGeneralLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textCursoEscolar)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        panelInfoGeneralLayout.setVerticalGroup(
            panelInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfoGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textNIAAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombreAlumno)
                .addGap(48, 48, 48)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textCursoEscolar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInfoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textCurso))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGestionAsignaturas.setBackground(Colores.fondo);
        panelGestionAsignaturas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Listado Asignaturas:");

        panelTablas.setBackground(Colores.fondo);
        panelTablas.setLayout(new java.awt.GridLayout(1, 2, 5, 0));

        jScrollPane2.setBackground(Colores.fondo);
        jScrollPane2.setForeground(Colores.fondo);
        jScrollPane2.setOpaque(false);

        tablaPendientes.setAutoCreateRowSorter(true);
        tablaPendientes.setBackground(Colores.fondo);
        tablaPendientes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tablaPendientes.setForeground(Colores.accent);
        tablaPendientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Asignatura", "Curso", "Idioma", "Gestión"
            }
        ));
        tablaPendientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaPendientes.setRowHeight(32);
        tablaPendientes.setRowSelectionAllowed(false);
        tablaPendientes.setSelectionBackground(Colores.accent);
        tablaPendientes.setSelectionForeground(Colores.fondo);
        jScrollPane2.setViewportView(tablaPendientes);

        panelTablas.add(jScrollPane2);

        jScrollPane3.setBackground(Colores.fondo);
        jScrollPane3.setForeground(Colores.fondo);
        jScrollPane3.setOpaque(false);

        tableEntregados.setBackground(Colores.fondo);
        tableEntregados.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tableEntregados.setForeground(Colores.accent);
        tableEntregados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Asignatura", "Curso", "Idioma", "Gestión"
            }
        ));
        tableEntregados.setRowHeight(32);
        tableEntregados.setSelectionBackground(Colores.accent);
        tableEntregados.setSelectionForeground(Colores.fondo);
        jScrollPane3.setViewportView(tableEntregados);

        panelTablas.add(jScrollPane3);

        panelInfoTablas.setBackground(Colores.fondo);
        panelInfoTablas.setLayout(new java.awt.GridLayout(1, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Pendiente de entrega");
        panelInfoTablas.add(jLabel6);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Entregados");
        panelInfoTablas.add(jLabel8);

        javax.swing.GroupLayout panelGestionAsignaturasLayout = new javax.swing.GroupLayout(panelGestionAsignaturas);
        panelGestionAsignaturas.setLayout(panelGestionAsignaturasLayout);
        panelGestionAsignaturasLayout.setHorizontalGroup(
            panelGestionAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionAsignaturasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGestionAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGestionAsignaturasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelInfoTablas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelGestionAsignaturasLayout.createSequentialGroup()
                        .addGroup(panelGestionAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGestionAsignaturasLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(panelTablas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        panelGestionAsignaturasLayout.setVerticalGroup(
            panelGestionAsignaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGestionAsignaturasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfoTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTablas, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSiAlumnoLayout = new javax.swing.GroupLayout(panelSiAlumno);
        panelSiAlumno.setLayout(panelSiAlumnoLayout);
        panelSiAlumnoLayout.setHorizontalGroup(
            panelSiAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSiAlumnoLayout.createSequentialGroup()
                .addComponent(panelInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGestionAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSiAlumnoLayout.setVerticalGroup(
            panelSiAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfoGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
            .addComponent(panelGestionAsignaturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCuerpoLayout = new javax.swing.GroupLayout(panelCuerpo);
        panelCuerpo.setLayout(panelCuerpoLayout);
        panelCuerpoLayout.setHorizontalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelNoAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelSiAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelCuerpoLayout.setVerticalGroup(
            panelCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelNoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSiAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Mostramos el formulario de busqueda para el alumno.
     */
    private void btnBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnoActionPerformed
        alumnoOld = alumno;
        alumno = null;
        //<editor-fold defaultstate="collapsed" desc="Paneles">
        panelNoAlumno.setVisible(alumno == null);
        panelSiAlumno.setVisible(alumno != null);
//</editor-fold>

        //Acción del botón de 'Devoluciones'
        if (frameInputAlumno == null) {
            //Si no existe la ventana la creamos
            frameInputAlumno = new FrameInputAlumno();
        } else {
            if (!frameInputAlumno.isVisible()) {
                //Si existe la ventana, y la hemos cerrado
                //limpiamos la variable y creamos una ventana nueva
                frameInputAlumno = null;
                frameInputAlumno = new FrameInputAlumno();
            }
        }
        //Hacemos visible la ventana creada anteriormente
        frameInputAlumno.setVisible(true);
    }//GEN-LAST:event_btnBuscarAlumnoActionPerformed

    /**
     * Controlamos el objeto de vuelta cuando se activa esta ventana.
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //<editor-fold defaultstate="collapsed" desc="Paneles">
        panelNoAlumno.setVisible(alumno == null);
        panelSiAlumno.setVisible(alumno != null);
//</editor-fold>

        if (alumno != null) {
            //Buscamos el alumno con el nia que hemos encontrado
            //(Tenemos que volverlo a buscar por las relaciones (matriculas, historial))
            if (!isLoad) {
                cargarDatos();
            }

            //Cuando hayamos realizado la confirmacion de la entrega
            switch (isConfirmationReady) {
                case 0:
                    System.out.println("Todavia no se ha realizado la confirmacion de la entrega");
                    break;
                case 1:
                    System.out.println("Se ha realizado la confirmacion de la entrega 1");
                    isConfirmationReady = 0; //Se resetea la variable

                    if (matriculaEntregada != null) {
                        anadirMatriculaEntregada(matriculaEntregada);
                    }

                    cargarDatos();
                    break;
                case 2:
                    System.out.println("Se ha cancelado la entrega");
                    isConfirmationReady = 0; //Se resetea la variable
                    break;
            }
        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * Controlamos cuando cerrmaos
     *
     * @param evt
     */
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        daoAlumno.desconectar();
        daoMatricula.desconectar();
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
            java.util.logging.Logger.getLogger(FrameEntrega.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEntrega.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEntrega.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEntrega.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEntrega().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mommoo.flat.button.FlatButton btnBuscarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelCuerpo;
    private javax.swing.JPanel panelGestionAsignaturas;
    private javax.swing.JPanel panelInfoGeneral;
    private javax.swing.JPanel panelInfoTablas;
    private javax.swing.JPanel panelNoAlumno;
    private javax.swing.JPanel panelSiAlumno;
    private javax.swing.JPanel panelTablas;
    private javax.swing.JPanel panelTitulo;
    public static javax.swing.JTable tablaPendientes;
    public static javax.swing.JTable tableEntregados;
    private javax.swing.JLabel textCurso;
    private javax.swing.JLabel textCursoEscolar;
    private javax.swing.JLabel textNIAAlumno;
    private javax.swing.JLabel textNombreAlumno;
    // End of variables declaration//GEN-END:variables

    /**
     * Metodo que utilizamos para rellenar la tabla de los libros pendientes de
     * entrega
     *
     * @param listaMatriculas Es la lista de matriculas que debemos recuperar
     * del archivo xml previamente importado
     */
    private void rellenarTablaPendiente(List<Matricula> listaMatriculas) {
        //DefaultTableModel tableModel = (DefaultTableModel) tablaPendientes.getModel();

        //tableModel.setRowCount(0);
        Object[][] contenidoTabla = new Object[listaMatriculas.size()][4];

        for (int i = 0; i < listaMatriculas.size(); i++) {
            contenidoTabla[i][0] = listaMatriculas.get(i).getContenido().getNombre_cas();
            contenidoTabla[i][1] = listaMatriculas.get(i).getContenido().getCurso().getAbreviatura();

            if (listaMatriculas.get(i).getIdioma().equals(" ")) {
                contenidoTabla[i][2] = "Por defecto";
            } else {
                contenidoTabla[i][2] = listaMatriculas.get(i).getIdioma();
            }
            contenidoTabla[i][3] = "";
        }

        Action entrega = new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int modelRow = Integer.valueOf(e.getActionCommand());
                //((DefaultTableModel) table.getModel()).removeRow(modelRow);
                matriculaEntregada = listaMatriculas.get(modelRow);
                new FrameConfirmacionEntrega(listaMatriculas.get(modelRow)).setVisible(true);
            }
        };

        DefaultTableModel tableModel = new DefaultTableModel(contenidoTabla,
                new Object[]{"Asignaturas", "Curso", "Idioma", "Gestión"});
        
        TableColumn agregarColumna;
        agregarColumna = tablaPendientes.getColumnModel().getColumn(0);
        agregarColumna.setCellEditor(new tableEditor(tablaPendientes));
        agregarColumna.setCellRenderer(new tableRender(entrega));
        
        
        /*tableModel.setDataVector(
         contenidoTabla,
         new Object[]{"Asignaturas", "Curso", "Idioma", ""}
         );*/ //ButtonColumn buttonColumn = new ButtonColumn(tablaPendientes, entrega, tableModel.getColumnCount() - 1);
        //tablaPendientes.setModel(tableModel);
    }

    /**
     * Cuando realizamos una entrega, este es el encargado de cambiar el libro
     * de tabla y pintarlo en la tabla de entregados
     *
     * @param matricula
     */
    public void anadirMatriculaEntregada(Matricula matricula) {
        DefaultTableModel tableModel = (DefaultTableModel) tableEntregados.getModel();

        //tableModel.setRowCount(0);
        listaMatriculasEntregadas.add(matricula);

        Object[][] contenidoTabla = new Object[listaMatriculasEntregadas.size()][3];

        for (int i = 0; i < listaMatriculasEntregadas.size(); i++) {
            contenidoTabla[i][0] = listaMatriculasEntregadas.get(i).getContenido().getNombre_cas();
            contenidoTabla[i][1] = listaMatriculasEntregadas.get(i).getContenido().getCurso().getAbreviatura();

            if (listaMatriculasEntregadas.get(i).getIdioma().equals(" ")) {
                contenidoTabla[i][2] = "Por defecto";
            } else {
                contenidoTabla[i][2] = listaMatriculasEntregadas.get(i).getIdioma();
            }
        }

        tableModel.setDataVector(
                contenidoTabla,
                new Object[]{"Asignaturas", "Curso", "Idioma"}
        );
        tableEntregados.setModel(tableModel);
    }

    /**
     * Este metodo se utiliza para cargar los datos de el alumno encontrado
     * anteriormente.
     */
    private void cargarDatos() {

        SwingWorker<?, ?> worker = new SwingWorker<Void, Void>() {
            protected Void doInBackground() throws InterruptedException {
                alumno = daoAlumno.buscar(alumno.getNia());
                return null;
            }

            protected void done() {

                listaMatriculas = daoMatricula.buscarPendientes(alumno, getFecha());

                if (listaMatriculas.size() > 0) {

                    textNIAAlumno.setText(alumno.getNia());
                    textNombreAlumno.setText(alumno.getNombre() + " " + alumno.getApellido1());
                    textNombreAlumno.setToolTipText(alumno.getNombre() + " " + alumno.getApellido1());

                    textCursoEscolar.setText(getFecha() + "-" + (getFecha() + 1));

                    textCurso.setText(listaMatriculas.get(0).getContenido().getCurso().getAbreviatura());

                    rellenarTablaPendiente(listaMatriculas);

                } else {
                    setEnabled(false);

                    showFramePopup("Este alumno no esta matriculado en este curso escolar.");
                }
                isLoad = true;
                framePopup.dispose();
            }

            private void showFramePopup(String texto) {
                Action cerrarVentana = new AbstractAction() {
                    public void actionPerformed(ActionEvent e) {
                        dispose();
                    }
                };

                new FramePopup(texto,
                        new ImageIcon(getClass().getResource("/Imagenes/icons/alert-black.png")),
                        cerrarVentana
                ).setVisible(true);
            }

        };
        worker.execute();
        //Mostramos la ventana de carga tan solo si 'isLoad == true'
        if ((framePopup == null) && (!isLoad)) {
            framePopup = new FramePopup();
        }
        framePopup.setVisible(true);
    }

    /**
     * Este metodo se utiliza para conseguir la fecha del curso escolar
     *
     * @return Devuelve un 'int' con la año actual
     */
    private int getFecha() {
        LocalDate localDate = LocalDate.now();
        String date = DateTimeFormatter.ofPattern("yyyy").format(localDate);
        int fecha = 0;
        try {
            fecha = Integer.parseInt(date);
        } catch (NumberFormatException e) {
            Action aceptar = new AbstractAction() {
                public void actionPerformed(ActionEvent e) {
                    FrameEntrega.this.dispose();
                }
            };

            new FramePopup("No se ha podido conseguir el curso escolar",
                    Imagenes.getImagen(this, "/Imagenes/icons/alert-black.png"),
                    "Aceptar", aceptar);
        }
        return fecha = 2018;
    }
}
