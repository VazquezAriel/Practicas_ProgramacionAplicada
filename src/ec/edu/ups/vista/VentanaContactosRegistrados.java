/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.modelo.Persona;
import ec.edu.ups.modelo.Telefono;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ariel
 */
public class VentanaContactosRegistrados extends javax.swing.JFrame {

    /**
     * Creates new form VentanaContactosRegistarados
     */
    private ControladorPersona controladorPersona;
    private VentanaEditarContactos ventanaEditarContactos;

    public VentanaContactosRegistrados(ControladorPersona controladorPersona, VentanaEditarContactos ventanaEditarContactos) {
        initComponents();

        this.controladorPersona = controladorPersona;
        this.ventanaEditarContactos = ventanaEditarContactos;
    }

    public void cargarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) jTableContactos.getModel();
        modelo.setRowCount(0);
        for (Object object : controladorPersona.getListado()) {
            Persona persona = (Persona) object;
            Object[] rowData = {persona.getId(), persona.getCedula(), persona.getNombre(), persona.getApellido(), persona.getDireccion(), persona.getTelefono()};
            modelo.addRow(rowData);
        }
        jTableContactos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContactos = new javax.swing.JTable();
        jComboBoxCondicion = new javax.swing.JComboBox<>();
        jTextFieldBusqueda = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonMostrarTodo = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Contactos Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Georgia", 0, 24))); // NOI18N

        jTableContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Cedula", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableContactos);
        if (jTableContactos.getColumnModel().getColumnCount() > 0) {
            jTableContactos.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jComboBoxCondicion.setFont(new java.awt.Font("Georgia", 0, 13)); // NOI18N
        jComboBoxCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apellido", "Numero" }));

        jTextFieldBusqueda.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonMostrarTodo.setText("Mostrar todos los contactos");
        jButtonMostrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonMostrarTodo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jComboBoxCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBoxCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonMostrarTodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTableContactos.getModel();
        modelo.setRowCount(0);
        List personasEncontradas;

        if (jComboBoxCondicion.getSelectedItem().toString().equals("Apellido")) {
            personasEncontradas = controladorPersona.buscarPorApellido(jTextFieldBusqueda.getText());
            if (personasEncontradas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron Contactos con ese apellido");
            } else {
                for (Object object : personasEncontradas) {
                    Persona persona = (Persona) object;
                    Object[] rowData = {persona.getCedula(), persona.getNombre(), persona.getApellido(), persona.getDireccion(), persona.getTelefono()};
                    modelo.addRow(rowData);
                }
                jTableContactos.setModel(modelo);
            }
        } else {
            personasEncontradas = controladorPersona.buscarPorNumero(jTextFieldBusqueda.getText());
            if (personasEncontradas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No se encontraron Contactos con ese numero");
            } else {
                for (Object object : personasEncontradas) {
                    Persona persona = (Persona) object;
                    if (persona.getTelefono().getNumero().equals(jTextFieldBusqueda.getText())) {
                        Object[] rowData = {persona.getCedula(), persona.getNombre(), persona.getApellido(), persona.getDireccion(), persona.getTelefono()};
                        modelo.addRow(rowData);
                    }
                    jTableContactos.setModel(modelo);
                }
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTableContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContactosMouseClicked
        // TODO add your handling code here:
        int filaIndex = jTableContactos.getSelectedRow();
        Persona persona = new Persona((int)jTableContactos.getValueAt(filaIndex, 0),jTableContactos.getValueAt(filaIndex, 1).toString(), jTableContactos.getValueAt(filaIndex, 2).toString(), jTableContactos.getValueAt(filaIndex, 3).toString(), jTableContactos.getValueAt(filaIndex, 4).toString(), (Telefono) jTableContactos.getValueAt(filaIndex, 5));
        ventanaEditarContactos.setPersona(persona);
        ventanaEditarContactos.cargarDatos();
        ventanaEditarContactos.setVisible(true);
        
    }//GEN-LAST:event_jTableContactosMouseClicked

    private void jButtonMostrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTodoActionPerformed
        // TODO add your handling code here:
        cargarDatos();
    }//GEN-LAST:event_jButtonMostrarTodoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonMostrarTodo;
    private javax.swing.JComboBox<String> jComboBoxCondicion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContactos;
    private javax.swing.JTextField jTextFieldBusqueda;
    // End of variables declaration//GEN-END:variables
}
