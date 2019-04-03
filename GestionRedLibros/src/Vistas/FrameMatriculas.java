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

import Daos.DaoMatricula;
import Pojos.Matricula;
import javax.swing.JFrame;
import Utilidades.*;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose Sanchis
 */
public class FrameMatriculas extends javax.swing.JFrame {

    /**
     * Creates new form FrameDevoluciones
     */
    GestorSesiones gestorSesiones;

    FrameCarga frameCarga = null;

    public DaoMatricula daoMatricula;

    List<Matricula> matriculas;

    public FrameMatriculas() {
        initComponents();

        gestorSesiones = Main.gestorSesiones;

        //Deshabilitamos la edición de la tabla para no crear confusión, 
        //puesto que solo es de lectura.
        tableMatriculas.setAutoCreateRowSorter(true);
        this.tableMatriculas.setEnabled(false);

        this.setLocationRelativeTo(null);
    }

    //Refrescamos los datos de la tabla recuperados de la BD
    public void RefrescarTabla() {
        System.out.println("");
        
        daoMatricula = new DaoMatricula(gestorSesiones.getSession());
        
        daoMatricula.session.beginTransaction();
        matriculas = daoMatricula.buscarTodos();
        daoMatricula.session.getTransaction().commit();

        if (matriculas.size() > 0) {
            DefaultTableModel tableModel = (DefaultTableModel) tableMatriculas.getModel();

            tableModel.setRowCount(0);

            for (int i = 0; i < matriculas.size(); i++) {
                Matricula matricula = matriculas.get(i);
                String[] fila = new String[13];

                fila[0] = matricula.getAlumno().getNombre();
                fila[1] = matricula.getCurso_escolar() + "";
                fila[2] = matricula.getCurso();
                fila[3] = matricula.getContenido() + "";
                fila[4] = matricula.getIdioma();
                fila[5] = matricula.getTipo_basico();
                fila[6] = matricula.getTipo_predom();
                fila[7] = matricula.getFec_ini_acis().toString();
                fila[8] = matricula.getFec_fin_acis().toString();
                fila[9] = matricula.getCur_ref_acis();
                fila[10] = matricula.getCurso_pendiente();

                tableModel.addRow(fila);
            }

            tableMatriculas.setModel(tableModel);
        } else {
            System.out.println("Error");
            //JOptionPane.showMessageDialog(this, "No hay datos de matrículas en la Base de Datos.");
        }

        pack();
        
        
        /*SwingWorker<?, ?> worker = new SwingWorker<Void, Integer>() {
            protected Void doInBackground() throws InterruptedException {
                daoMatricula = new DaoMatricula(gestorSesiones.getSession());
                matriculas = daoMatricula.buscarTodos();
                daoMatricula.session.getTransaction().commit();
                return null;
            }

            protected void process(List<Integer> chunks) {
            }

            protected void done() {
                //Rellenamos la lista de los libros
                if (matriculas.size() > 0) {
                    DefaultTableModel tableModel = (DefaultTableModel) tableMatriculas.getModel();

                    tableModel.setRowCount(0);

                    for (int i = 0; i < matriculas.size(); i++) {
                        Matricula matricula = matriculas.get(i);
                        String[] fila = new String[13];

                        fila[0] = matricula.getAlumno().getNombre();
                        fila[1] = matricula.getCurso_escolar() + "";
                        fila[2] = matricula.getCurso();
                        fila[3] = matricula.getContenido() + "";
                        fila[4] = matricula.getIdioma();
                        fila[5] = matricula.getTipo_basico();
                        fila[6] = matricula.getTipo_predom();
                        fila[7] = matricula.getFec_ini_acis().toString();
                        fila[8] = matricula.getFec_fin_acis().toString();
                        fila[9] = matricula.getCur_ref_acis();
                        fila[10] = matricula.getCurso_pendiente();

                        tableModel.addRow(fila);
                    }

                    tableMatriculas.setModel(tableModel);
                } else {
                    System.out.println("Error");
                    //JOptionPane.showMessageDialog(this, "No hay datos de matrículas en la Base de Datos.");
                }

                pack();

                frameCarga.dispose();
            }
        };
        worker.execute();
        if (frameCarga == null) {
            frameCarga = new FrameCarga();
        }
        frameCarga.setVisible(true);
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        flatCheckBox1 = new com.mommoo.flat.select.FlatCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnImportar = new com.mommoo.flat.button.FlatButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMatriculas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Matrículas");
        setMinimumSize(new java.awt.Dimension(600, 36));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(58, 39, 35));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Matrículas");

        btnImportar.setBackground(Colores.buttons);
        btnImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons/plus.png"))); // NOI18N
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnImportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(239, 235, 233));

        tableMatriculas.setBackground(Colores.fondo);
        tableMatriculas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableMatriculas.setForeground(Colores.accent);
        tableMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alumno", "Curso Escolar", "Curso", "Contenido", "Idioma", "Tipo Basico", "Tipo Predom", "Acis", "Fecha Inicio Acis", "Fecha Fin Acis", "Curso Ref Acis", "Curso Pendiente"
            }
        ));
        tableMatriculas.setGridColor(Colores.buttons);
        tableMatriculas.setSelectionBackground(new java.awt.Color(77, 49, 49));
        tableMatriculas.setSelectionForeground(Colores.fondo);
        jScrollPane1.setViewportView(tableMatriculas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1262, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        JFileChooser chooser = new JFileChooser();

        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "XML", "xml");

        chooser.setFileFilter(filter);

        int returnVal = chooser.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            try {
                ImportarMatriculasXML importar = new ImportarMatriculasXML(chooser.getSelectedFile().getPath());

                RefrescarTabla();

                JOptionPane.showMessageDialog(this, "Matrículas importadas correctamente!", "Información", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "No se han podido importar las matrículas.\nError: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        daoMatricula.desconectar();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FrameMatriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMatriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMatriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMatriculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMatriculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mommoo.flat.button.FlatButton btnImportar;
    private com.mommoo.flat.select.FlatCheckBox flatCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMatriculas;
    // End of variables declaration//GEN-END:variables
}
