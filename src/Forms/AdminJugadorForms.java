/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Entidades.Jugador;
import Entidades.JugadorAcciones;
import Entidades.Universidad;
import Entidades.UniversidadAcciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis
 */
public class AdminJugadorForms extends javax.swing.JInternalFrame {

    private JugadorAcciones jugadores = new JugadorAcciones();
    private UniversidadAcciones universidades = new UniversidadAcciones();
    private DefaultTableModel tablaModelo;
    
    public AdminJugadorForms() {
        initComponents();
        this.tablaModelo = (DefaultTableModel) this.tablaJugadores.getModel();
        this.setLocation(10,10);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaJugadores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboUniversidadFiltro = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inputDui = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputEdad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputPeso = new javax.swing.JTextField();
        inputPosicionCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        inputUniversidadCombo = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        activateUpdate = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        inputEstatura = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Administrador de jugadores");
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

        tablaJugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dui", "Nombre", "Edad", "Estatura", "Peso", "Posicion", "Universidad"
            }
        ));
        tablaJugadores.setFocusable(false);
        tablaJugadores.setRequestFocusEnabled(false);
        tablaJugadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaJugadoresMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaJugadores);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Jugadores");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel2.setText("Filtrar:");

        jLabel3.setText("Universidad");

        comboUniversidadFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUniversidadFiltroActionPerformed(evt);
            }
        });

        jButton2.setText("Restablecer filtro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Agregar ó Actualizar");

        jLabel5.setText("DUI:");

        jLabel6.setText("Nombre:");

        jLabel7.setText("Edad");

        jLabel8.setText("Peso");

        jLabel9.setText("Posicion");

        jLabel10.setText("Universidad");

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

        activateUpdate.setText("Activar actualización o eliminación datos");
        activateUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateUpdateActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Nota:");

        jLabel12.setText("Si desea actualizar ó eliminar datos debe de activar");

        jLabel13.setText("el checkbox y selecionar al jugador en la tabla.");

        btnDelete.setText("Eliminar");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel14.setText("Estatura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(comboUniversidadFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(inputNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputDui, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(45, 45, 45)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(inputPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jLabel14)
                                        .addComponent(inputEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel13)
                                .addComponent(jLabel12))
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(inputUniversidadCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputPosicionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(259, 259, 259)
                            .addComponent(activateUpdate)))
                    .addComponent(jLabel11))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboUniversidadFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(activateUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputUniversidadCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPosicionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void cargarJugadores(ArrayList<Jugador> jugadoresCargados){
        this.tablaModelo.setRowCount(0);
        
        for (Jugador jugador : jugadoresCargados) {
                String[] datos = {
                    jugador.getDui(),
                    jugador.getNombre(),
                    Integer.toString(jugador.getEdad()),
                    Double.toString(jugador.getEstatura()) + " cm",
                    Double.toString(jugador.getPeso())  + " Kg",
                    jugador.getId_posicion(),
                    jugador.getId_universidad()
                };

                this.tablaModelo.addRow(datos);
            }
        
    };
    void resetCampos(){
          
            this.inputDui.setText("");
            this.inputNombre.setText("");
            this.inputEdad.setText("");
            this.inputPeso.setText("");
            this.inputUniversidadCombo.setSelectedIndex(0);
            this.inputPosicionCombo.setSelectedIndex(0);
            this.inputEstatura.setText("");
    }
    private void comboUniversidadFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUniversidadFiltroActionPerformed
        this.tablaModelo.setRowCount(0);
        
        if (jugadores.filtrarJugador(this.comboUniversidadFiltro.getSelectedItem().toString()).size() > 0) {
            cargarJugadores(jugadores.filtrarJugador(this.comboUniversidadFiltro.getSelectedItem().toString()));
        }else if(!this.comboUniversidadFiltro.getSelectedItem().toString().contains("Selecciona una universidad")){
            JOptionPane.showMessageDialog(null,"La universidad selecionada no tiene jugadores");
        }else if(this.comboUniversidadFiltro.getSelectedItem().toString().contains("Selecciona una universidad")){
            this.tablaModelo.setRowCount(0);
            cargarJugadores(this.jugadores.cargarDatos());
        }
        
    }//GEN-LAST:event_comboUniversidadFiltroActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarJugadores(this.jugadores.cargarDatos());
        this.comboUniversidadFiltro.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
            Jugador jugador = new Jugador();
            
        try {
            jugador.setDui(this.inputDui.getText());
            jugador.setNombre(this.inputNombre.getText());
            jugador.setEdad(Integer.parseInt(this.inputEdad.getText()));
            jugador.setPeso(Double.parseDouble(this.inputPeso.getText()));
            jugador.setId_posicion(this.inputPosicionCombo.getSelectedItem().toString());
            jugador.setId_universidad(this.inputUniversidadCombo.getSelectedItem().toString());
            jugador.setEstatura(Double.parseDouble(this.inputEstatura.getText()));
            
            if (isCorrect()) {
                JOptionPane.showMessageDialog(null,"Por favor revisa los campos. Revisa que no esten vacios ó que sea un valor correcto");
            }else{
                
                if (jugadores.cantidadJugador(jugador.getId_universidad()) > 15) {
                    JOptionPane.showMessageDialog(null,"Ya haz ingresado el maximo de jugadores");
                }else{
                    JOptionPane.showMessageDialog(null,jugadores.agregarJugador(jugador));
                    cargarJugadores(this.jugadores.cargarDatos());
                    resetCampos();
                }                
            }
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        ArrayList<Universidad> universidadesCargadas = this.universidades.cargarUniversidades();
        ArrayList<String> posiciones = this.jugadores.obtenerPosiciones();
        
        this.comboUniversidadFiltro.addItem("-- Selecciona una universidad -- ");
        this.inputUniversidadCombo.addItem("-- Selecciona una universidad -- ");
        this.inputPosicionCombo.addItem("-- Selecciona una posicion -- ");
        
        for (Universidad universidad : universidadesCargadas) {
            this.comboUniversidadFiltro.addItem(universidad.getId_universidad());
            this.inputUniversidadCombo.addItem(universidad.getId_universidad());
        }
        
        for (String posicion : posiciones) {
            this.inputPosicionCombo.addItem(posicion);
        }
        
        cargarJugadores(this.jugadores.cargarDatos());
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

    private void tablaJugadoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaJugadoresMousePressed
        if (this.activateUpdate.isSelected()) {
            Jugador SelectedPlayer = new Jugador();
            int fila_selecionada = this.tablaJugadores.getSelectedRow();
            
            SelectedPlayer.setDui(this.tablaJugadores.getValueAt(fila_selecionada,0).toString());
            SelectedPlayer.setNombre(this.tablaJugadores.getValueAt(fila_selecionada,1).toString());
            SelectedPlayer.setEdad(Integer.parseInt(this.tablaJugadores.getValueAt(fila_selecionada,2).toString()));
            SelectedPlayer.setEstatura(Double.parseDouble(this.tablaJugadores.getValueAt(fila_selecionada,3).toString().substring(0,this.tablaJugadores.getValueAt(fila_selecionada,3).toString().indexOf("c") )));
            SelectedPlayer.setPeso(Double.parseDouble(this.tablaJugadores.getValueAt(fila_selecionada,4).toString().substring(0,this.tablaJugadores.getValueAt(fila_selecionada,4).toString().indexOf("K"))));
            SelectedPlayer.setId_posicion(this.tablaJugadores.getValueAt(fila_selecionada,5).toString());
            SelectedPlayer.setId_universidad(this.tablaJugadores.getValueAt(fila_selecionada,6).toString());
            
            //Asignamos nuevos valores
            this.inputDui.setText(SelectedPlayer.getDui());
            this.inputNombre.setText(SelectedPlayer.getNombre());
            this.inputEdad.setText(Integer.toString(SelectedPlayer.getEdad()));
            this.inputPeso.setText(Double.toString(SelectedPlayer.getPeso()));
            this.inputUniversidadCombo.setSelectedItem(SelectedPlayer.getId_universidad());
            this.inputPosicionCombo.setSelectedItem(SelectedPlayer.getId_posicion());
            this.inputEstatura.setText(Double.toString(SelectedPlayer.getEstatura()));
        }else{
            JOptionPane.showMessageDialog(null,"Debes de activar el checkbox para poder actualizar ó eliminar datos");
        }
    }//GEN-LAST:event_tablaJugadoresMousePressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Jugador jugador = new Jugador();
        
        try {
            jugador.setDui(this.inputDui.getText());
            jugador.setNombre(this.inputNombre.getText());
            jugador.setEdad(Integer.parseInt(this.inputEdad.getText()));
            jugador.setPeso(Double.parseDouble(this.inputPeso.getText()));
            jugador.setId_posicion(this.inputPosicionCombo.getSelectedItem().toString());
            jugador.setId_universidad(this.inputUniversidadCombo.getSelectedItem().toString());
            jugador.setEstatura(Double.parseDouble(this.inputEstatura.getText()));
            
            if (isCorrect()) {
                JOptionPane.showMessageDialog(null,"Por favor revisa los campos. Revisa que no esten vacios ó que sea un valor correcto");
                resetCampos();
            }else{
                JOptionPane.showMessageDialog(null,jugadores.actualizarJugador(jugador));
                 cargarJugadores(this.jugadores.cargarDatos());
                 resetCampos();
            }
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,"Seguro que desea eliminar el jugador: " + this.inputNombre.getText() + " ?");
        
        if (opcion == 0) {
            String duiJugador = this.inputDui.getText();
            String id_universidad = this.inputUniversidadCombo.getSelectedItem().toString();
            
            if (jugadores.cantidadJugador(id_universidad) < 5) {
                JOptionPane.showMessageDialog(null,"Ya haz llegado al minimo de jugadores (5)");
                resetCampos();
            }else{
                JOptionPane.showMessageDialog(null,jugadores.eliminarJugador(duiJugador));
                cargarJugadores(this.jugadores.cargarDatos());
                resetCampos();
            }
        }
     
    }//GEN-LAST:event_btnDeleteActionPerformed

    boolean isCorrect(){
        boolean isAdded = 
                (      this.inputDui.getText().isEmpty() 
                    || this.inputNombre.getText().isEmpty() 
                    || this.inputEdad.getText().isEmpty()
                    || this.inputPeso.getText().isEmpty()
                    || this.inputPosicionCombo.getSelectedItem().toString().isEmpty()
                    || this.inputUniversidadCombo.getSelectedItem().toString().isEmpty()
                    || this.inputEstatura.getText().isEmpty()
                    && this.inputPosicionCombo.getSelectedItem().toString().contains("Selecciona una universidad")
                    && this.inputUniversidadCombo.getSelectedItem().toString().contains("Selecciona una universidad")
               );
        return isAdded;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox activateUpdate;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comboUniversidadFiltro;
    private javax.swing.JTextField inputDui;
    private javax.swing.JTextField inputEdad;
    private javax.swing.JTextField inputEstatura;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputPeso;
    private javax.swing.JComboBox<String> inputPosicionCombo;
    private javax.swing.JComboBox<String> inputUniversidadCombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaJugadores;
    // End of variables declaration//GEN-END:variables
}
