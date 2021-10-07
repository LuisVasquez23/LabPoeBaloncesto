/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entidades.Universidad;
import Entidades.UniversidadAcciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis
 */
public class AdminUniversidad extends javax.swing.JInternalFrame {

    private UniversidadAcciones universidades = new UniversidadAcciones();
    private DefaultTableModel tablaModelo;
    
    public AdminUniversidad() {
        initComponents();
        this.tablaModelo = (DefaultTableModel) this.tablaUniversidad.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUniversidad = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputUniversidad = new javax.swing.JTextField();
        activateUpdate = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administrar Universidad");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Universidad");

        tablaUniversidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Universidad"
            }
        ));
        tablaUniversidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaUniversidadMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaUniversidad);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Agregar , actualizar ó eliminar");

        jLabel3.setText("ID");

        jLabel4.setText("Nombre universidad:");

        activateUpdate.setText("Activar eliminación o actualización de datos");
        activateUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateUpdateActionPerformed(evt);
            }
        });

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Actualizar");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel13.setText("el checkbox y selecionar la universidad en la tabla.");

        jLabel12.setText("Si desea actualizar ó eliminar datos debe de activar");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nota:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(activateUpdate)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(163, 163, 163)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(inputUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputUniversidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(activateUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void cargarUniversidades(ArrayList<Universidad> universidades){
        this.tablaModelo.setRowCount(0);
        
        for (Universidad universidad : universidades) {
                String[] datos = {
                    universidad.getId_universidad(),
                    universidad.getNombre_universidad()
                };

                this.tablaModelo.addRow(datos);
            }
        
    };
    
    void resetCampos(){
       this.inputId.setText("");
       this.inputUniversidad.setText("");
    }
    
    boolean isCorrect(){
        boolean isAdded = 
                (      this.inputUniversidad.getText().isEmpty() 
                    || this.inputId.getText().isEmpty()
               );
        return isAdded;
    }
    
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarUniversidades(universidades.cargarUniversidades());
    }//GEN-LAST:event_formInternalFrameOpened

    private void activateUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateUpdateActionPerformed
        if (this.activateUpdate.isSelected()) {
            this.btnAdd.setEnabled(false);
            this.btnUpdate.setEnabled(true);
            this.btnDelete.setEnabled(true);
            
        }else{
            this.btnAdd.setEnabled(true);
            this.btnUpdate.setEnabled(false);
            this.btnDelete.setEnabled(false);
            resetCampos();
        }
    }//GEN-LAST:event_activateUpdateActionPerformed

    private void tablaUniversidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUniversidadMousePressed
        
        if (this.activateUpdate.isSelected()) {
            Universidad universidad = new Universidad();
            int fila = this.tablaUniversidad.getSelectedRow();

            universidad.setId_universidad(this.tablaUniversidad.getValueAt(fila, 0).toString());
            universidad.setNombre_universidad(this.tablaUniversidad.getValueAt(fila,1).toString());

            this.inputId.setText(universidad.getId_universidad());
            this.inputUniversidad.setText(universidad.getNombre_universidad());
        }else{
            JOptionPane.showMessageDialog(null,"Debes de activar el checkbox para poder actualizar ó eliminar datos");
        }
    }//GEN-LAST:event_tablaUniversidadMousePressed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Universidad universidadToAdd = new Universidad();
        
        try {
            universidadToAdd.setId_universidad(this.inputId.getText());
            universidadToAdd.setNombre_universidad(this.inputUniversidad.getText());
            
            if (isCorrect()) {
                JOptionPane.showMessageDialog(null,"Por favor revisa los campos. Revisa que no esten vacios ó que sea un valor correcto");
            }else{
                JOptionPane.showMessageDialog(null,universidades.agregarJugador(universidadToAdd));
                cargarUniversidades(this.universidades.cargarUniversidades());
                resetCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Universidad universidadUpdate = new Universidad();
        
        try {
            universidadUpdate.setId_universidad(this.inputId.getText());
            universidadUpdate.setNombre_universidad(this.inputUniversidad.getText());
            
            if (isCorrect()) {
                JOptionPane.showMessageDialog(null,"Por favor revisar los datos ingresados");
            }else{
                JOptionPane.showMessageDialog(null,universidades.actualizarUniversidad(universidadUpdate));
                cargarUniversidades(universidades.cargarUniversidades());
                resetCampos();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,"Seguro que desea eliminar la universidad: " + this.inputUniversidad.getText() + " ?");
     
        if (opcion == 0) {
            String codigo_universidad = this.inputId.getText();

            JOptionPane.showMessageDialog(null,universidades.eliminarUniversidad(codigo_universidad));
            cargarUniversidades(this.universidades.cargarUniversidades());
            resetCampos();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activateUpdate;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputUniversidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUniversidad;
    // End of variables declaration//GEN-END:variables
}