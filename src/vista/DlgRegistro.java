/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Jugador;

/**
 *
 * @author dixia
 */
public class DlgRegistro extends javax.swing.JDialog {

    private Jugador jugador;
    ArrayList<String> cartones;
    ArrayList<String> cedulas;
    private boolean guardado;

    public DlgRegistro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jugador = new Jugador();
        this.guardado = false;

    }

    public DlgRegistro(java.awt.Frame parent, boolean modal, ArrayList<String> cartones, ArrayList<String> cedulas) {
        super(parent, modal);
        initComponents();
        jugador = new Jugador();
        this.cartones = cartones;
        this.guardado = false;
        this.cedulas = cedulas;

        // Actualiza automáticamente los cartones disponibles
        for (String carton : cartones) {
            cmbCarton.removeItem(carton);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtMontoI = new javax.swing.JTextField();
        cmbCarton = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar jugador");

        pnlBase.setBackground(new java.awt.Color(184, 186, 253));
        pnlBase.setMinimumSize(new java.awt.Dimension(520, 503));
        pnlBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCedula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCedula.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCedula.setText("Cédula:");
        pnlBase.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 103, 40));

        lblNombre.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombre.setText("Nombre:");
        pnlBase.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 103, 44));

        lblDireccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDireccion.setText("Dirección:");
        pnlBase.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 103, 44));

        lblMonto.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblMonto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMonto.setText("Monto Inicial:");
        pnlBase.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 103, 44));

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        pnlBase.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 300, 30));

        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        pnlBase.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 300, 30));

        txtMontoI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMontoIKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoIKeyTyped(evt);
            }
        });
        pnlBase.add(txtMontoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 147, 30));

        cmbCarton.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cmbCarton.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar cartón", "Cartón N° 1", "Cartón N° 2", "Cartón N° 3", "Cartón N° 4", "Cartón N° 5", "Cartón N° 6" }));
        pnlBase.add(cmbCarton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 150, 30));

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(txtDireccion);

        pnlBase.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 300, -1));

        btnCancelar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlBase.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 117, 40));

        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        pnlBase.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, 40));

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        pnlBase.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 120, 40));

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        pnlBase.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 300, 30));

        lblTelefono.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelefono.setText("Teléfono:");
        pnlBase.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 103, 30));

        jLabel1.setBackground(new java.awt.Color(132, 136, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de registro");
        pnlBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if ((cmbCarton.getSelectedIndex() != 0) && (revisarDatos())) {

            if (Integer.parseInt(txtMontoI.getText()) < 100) {
                JOptionPane.showMessageDialog(this, "El monto inicial para participar debe ser mínimo $100",
                        "Monto inicial muy bajo", JOptionPane.ERROR_MESSAGE);

            } else if (validarCedula(txtCedula.getText())) {
                JOptionPane.showMessageDialog(this, "Esta cédula ya fue registrada");
            } else {
                jugador.setNombre(txtNombre.getText());
                jugador.setCedula(Integer.parseInt(txtCedula.getText()));
                jugador.setTelefono(Integer.parseInt(txtTelefono.getText()));
                jugador.setMontoIni(Integer.parseInt(txtMontoI.getText()));
                jugador.setDireccion(txtDireccion.getText());

                // Cambiar icono
                JOptionPane.showMessageDialog(this, "¡Registrado exitosamente! \n    Ahora selecciona 10 números para jugar.",
                        "Registrado", JOptionPane.PLAIN_MESSAGE);
                this.guardado = true;
                this.dispose();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Rellene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText(null);
        txtCedula.setText(null);
        txtTelefono.setText(null);
        txtMontoI.setText(null);
        txtDireccion.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char tecla;
        tecla = evt.getKeyChar();
        if (Character.isDigit(tecla) && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
        if (txtCedula.getText().length() >= 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtMontoIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoIKeyTyped
        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
        if (txtMontoI.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoIKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
        if (txtTelefono.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        txtNombre.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtCedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyReleased
        txtCedula.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtCedulaKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        txtTelefono.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtMontoIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoIKeyReleased
        txtMontoI.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtMontoIKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        txtDireccion.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtDireccionKeyReleased

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
            java.util.logging.Logger.getLogger(DlgRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DlgRegistro dialog = new DlgRegistro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbCarton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtMontoI;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private boolean revisarDatos() {
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setBackground(Color.red);
            return false;

        } else if (txtCedula.getText().isEmpty()) {
            txtCedula.setBackground(Color.red);
            return false;
        } else if (txtTelefono.getText().isEmpty()) {
            txtTelefono.setBackground(Color.red);
            return false;
        } else if (txtMontoI.getText().isEmpty()) {
            txtMontoI.setBackground(Color.red);
            return false;

        } else if (txtDireccion.getText().isEmpty()) {
            txtDireccion.setBackground(Color.red);
            return false;
        }
        return true;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public javax.swing.JComboBox<String> getCmbCarton() {
        return cmbCarton;
    }

    public boolean isGuardado() {
        return guardado;
    }

    /**
     * Revisa que la cédula no sea igual a las ya registradas
     *
     * @param ced
     * @return
     */
    public boolean validarCedula(String ced) {

        boolean existe = false;
        try {
            if (!cedulas.isEmpty()) {

                for (int i = 0; i < cedulas.size(); i++) {

                    if (cedulas.get(i).equals(ced)) {
                        existe = true;
                    }
                }
            }
            return existe;
        } catch (Exception e) {
            return false;
        }
    }

}
