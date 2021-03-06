/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entidades.Equipo;
import Entidades.EquipoAcciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis
 */
public class AdminTeamsForms extends javax.swing.JInternalFrame {

    private EquipoAcciones equipos;
    private DefaultTableModel tabla_modelo;
    
    public AdminTeamsForms() {
        initComponents();
        this.equipos = new EquipoAcciones();
        this.tabla_modelo = (DefaultTableModel) this.tabla_jugadores.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_jugadores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        input_codigo_equipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        input_codigo_name = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        activateUpdate = new javax.swing.JCheckBox();

        jButton3.setText("Actualizar ");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
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
        jLabel1.setText("Administrar equipos");

        tabla_jugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ));
        tabla_jugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_jugadoresMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_jugadores);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Agregar, Actualizar o Eliminar");

        jLabel3.setText("C??digo:");

        jLabel4.setText("Nombre equipo:");

        btnAdd.setText("Agregar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Actualizar ");
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

        activateUpdate.setText("Activar los botonos Actualizar y Eliminar");
        activateUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(input_codigo_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(input_codigo_equipo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(activateUpdate)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_codigo_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(activateUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(input_codigo_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarTabla(equipos.cargarEquipos());
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            if (isCorrect()) {
                JOptionPane.showMessageDialog(null,"Por favor revisa los campos. Revisa que no esten vacios ?? que sea un valor correcto");
            }else{
                Equipo equipo_agregar = new Equipo();
                equipo_agregar.setCodigo_equipo(this.input_codigo_equipo.getText());
                equipo_agregar.setNombre_equipo(this.input_codigo_name.getText());
                
                JOptionPane.showMessageDialog(null,equipos.agregarEquipo(equipo_agregar));
                cargarTabla(this.equipos.cargarEquipos());
                resetCampos();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,"Seguro que desea eliminar la universidad: " + this.input_codigo_name.getText() + " ?");
     
        if (opcion == 0) {
            String codigo_equipo = this.input_codigo_equipo.getText();

            JOptionPane.showMessageDialog(null,this.equipos.eliminarEquipo(codigo_equipo));
            cargarTabla(this.equipos.cargarEquipos());
            resetCampos();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tabla_jugadoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_jugadoresMousePressed
        if(this.activateUpdate.isSelected()) {
            Equipo equipo = new Equipo();
            int fila = this.tabla_jugadores.getSelectedRow();

            equipo.setCodigo_equipo(this.tabla_jugadores.getValueAt(fila, 0).toString());
            equipo.setNombre_equipo(this.tabla_jugadores.getValueAt(fila,1).toString());

            this.input_codigo_equipo.setText(equipo.getCodigo_equipo());
            this.input_codigo_name.setText(equipo.getNombre_equipo());
        }else{
            JOptionPane.showMessageDialog(null,"Debes de activar el checkbox para poder actualizar ?? eliminar datos");
        }
    }//GEN-LAST:event_tabla_jugadoresMousePressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if (isCorrect()) {
                JOptionPane.showMessageDialog(null,"Por favor revisar los datos ingresados");
            }else{
                Equipo equipo_actualizar = new Equipo();
                
                equipo_actualizar.setCodigo_equipo(this.input_codigo_equipo.getText());
                equipo_actualizar.setNombre_equipo(this.input_codigo_name.getText());
                
                JOptionPane.showMessageDialog(null,equipos.actualizarEquipo(equipo_actualizar));
                cargarTabla(this.equipos.cargarEquipos());
                resetCampos();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    void cargarTabla(ArrayList<Equipo> equipos_cargar){
        
        this.tabla_modelo.setRowCount(0);
        
        for (Equipo equipo : equipos_cargar) {
            String[] datos = {
                equipo.getCodigo_equipo(),
                equipo.getNombre_equipo()
            };
            
            this.tabla_modelo.addRow(datos);
        }
        
    }
    
     void resetCampos(){
       this.input_codigo_equipo.setText("");
       this.input_codigo_name.setText("");
    }
     
     boolean isCorrect(){
        boolean isAdded = 
                (      this.input_codigo_equipo.getText().isEmpty() 
                    || this.input_codigo_name.getText().isEmpty()
               );
        return isAdded;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activateUpdate;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField input_codigo_equipo;
    private javax.swing.JTextField input_codigo_name;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_jugadores;
    // End of variables declaration//GEN-END:variables
}
