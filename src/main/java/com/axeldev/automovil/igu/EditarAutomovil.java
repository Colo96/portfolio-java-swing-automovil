

package com.axeldev.automovil.igu;

import com.axeldev.automovil.logica.Automovil;
import com.axeldev.automovil.logica.Controladora;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class EditarAutomovil extends javax.swing.JFrame {

    Controladora control = null;
    Automovil auto = new Automovil();
    
    /** Creates new form EditarAutomovil */
    public EditarAutomovil(int id) {
        control = new Controladora();
        initComponents();
        cargarDatosAuto(id);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerEdiciones = new javax.swing.JPanel();
        labelTitleEdiciones = new javax.swing.JLabel();
        labelImageEdiciones = new javax.swing.JLabel();
        containeLabelsAndBtns = new javax.swing.JPanel();
        labelModelo = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelMotor = new javax.swing.JLabel();
        labelNroPuertas = new javax.swing.JLabel();
        labelPatente = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtMotor = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        txtNroPuertas = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitleEdiciones.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        labelTitleEdiciones.setText("Editar Automóviles");

        labelImageEdiciones.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Documentos\\NetBeansProjects\\automovil\\src\\resources\\coche.png")); // NOI18N

        labelModelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelModelo.setText("Modelo:");

        labelMarca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMarca.setText("Marca:");

        labelColor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelColor.setText("Color:");

        labelMotor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelMotor.setText("Motor:");

        labelNroPuertas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelNroPuertas.setText("Nro de Puertas:");

        labelPatente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPatente.setText("Patente:");

        txtModelo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtMarca.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtMotor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtColor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        txtPatente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        txtNroPuertas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Documentos\\NetBeansProjects\\automovil\\src\\resources\\boton-mas.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Probando Uno\\OneDrive\\Documentos\\NetBeansProjects\\automovil\\src\\resources\\limpieza.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout containeLabelsAndBtnsLayout = new javax.swing.GroupLayout(containeLabelsAndBtns);
        containeLabelsAndBtns.setLayout(containeLabelsAndBtnsLayout);
        containeLabelsAndBtnsLayout.setHorizontalGroup(
            containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containeLabelsAndBtnsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containeLabelsAndBtnsLayout.createSequentialGroup()
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containeLabelsAndBtnsLayout.createSequentialGroup()
                            .addComponent(labelPatente)
                            .addGap(18, 18, 18)
                            .addComponent(txtPatente))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containeLabelsAndBtnsLayout.createSequentialGroup()
                            .addComponent(labelNroPuertas)
                            .addGap(18, 18, 18)
                            .addComponent(txtNroPuertas))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containeLabelsAndBtnsLayout.createSequentialGroup()
                            .addComponent(labelMotor)
                            .addGap(18, 18, 18)
                            .addComponent(txtMotor))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containeLabelsAndBtnsLayout.createSequentialGroup()
                            .addComponent(labelColor)
                            .addGap(18, 18, 18)
                            .addComponent(txtColor))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containeLabelsAndBtnsLayout.createSequentialGroup()
                            .addComponent(labelMarca)
                            .addGap(18, 18, 18)
                            .addComponent(txtMarca))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containeLabelsAndBtnsLayout.createSequentialGroup()
                            .addComponent(labelModelo)
                            .addGap(18, 18, 18)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9))
        );
        containeLabelsAndBtnsLayout.setVerticalGroup(
            containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containeLabelsAndBtnsLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMotor)
                    .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPatente)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNroPuertas)
                    .addComponent(txtNroPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(containeLabelsAndBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout containerEdicionesLayout = new javax.swing.GroupLayout(containerEdiciones);
        containerEdiciones.setLayout(containerEdicionesLayout);
        containerEdicionesLayout.setHorizontalGroup(
            containerEdicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerEdicionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(containerEdicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerEdicionesLayout.createSequentialGroup()
                        .addComponent(containeLabelsAndBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(labelImageEdiciones)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerEdicionesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelTitleEdiciones)
                        .addGap(197, 197, 197))))
        );
        containerEdicionesLayout.setVerticalGroup(
            containerEdicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerEdicionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitleEdiciones)
                .addGroup(containerEdicionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerEdicionesLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(labelImageEdiciones)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(containerEdicionesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(containeLabelsAndBtns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerEdiciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerEdiciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String motor = txtMotor.getText();
        String color = txtColor.getText();
        String patente = txtPatente.getText();
        int nroPuertas = Integer.parseInt(txtNroPuertas.getText());
        
        control.modificarAuto(auto, modelo, marca, motor, color, patente, nroPuertas);
        
        mostrarMensaje("Edición realizada correctamente!", "Info", "Edición exitosa!");
        
        ConsultaAutomovil consulta = new ConsultaAutomovil();
        consulta.setVisible(true);
        consulta.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtModelo.setText("");
        txtMarca.setText("");
        txtMotor.setText("");
        txtColor.setText("");
        txtPatente.setText("");
        txtNroPuertas.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JPanel containeLabelsAndBtns;
    private javax.swing.JPanel containerEdiciones;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelImageEdiciones;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelModelo;
    private javax.swing.JLabel labelMotor;
    private javax.swing.JLabel labelNroPuertas;
    private javax.swing.JLabel labelPatente;
    private javax.swing.JLabel labelTitleEdiciones;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtNroPuertas;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables

    public void mostrarMensaje(String message, String type, String title) {
        JOptionPane optionPane = new JOptionPane(message);
        if (type.equalsIgnoreCase("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (type.equalsIgnoreCase("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private void cargarDatosAuto(int id) {
        auto = control.traerAutomovil(id);
        txtModelo.setText(auto.getModelo());
        txtMarca.setText(auto.getMarca());
        txtMotor.setText(auto.getMotor());
        txtColor.setText(auto.getColor());
        txtPatente.setText(auto.getPatente());
        txtNroPuertas.setText(String.valueOf(auto.getNroPuertas()));
    }
}
