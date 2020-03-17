/*
    Creamos la matriz tridimensional aquí y setteamos sus matrices a cada hilo
 */
package vista;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Dixiana Gómez
 * @author Carlos Mairena
 */
public class FrmPrincipal extends javax.swing.JFrame {

    //private byte cartones[][][] = new byte[6][8][10];
    public FrmPrincipal() {
        initComponents();
        //Cartones carton1.matriz = triCart[0][][];

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlCart1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart1 = new javax.swing.JTable();
        lblnumCarton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnCambiar = new javax.swing.JButton();
        pnlCart2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart2 = new javax.swing.JTable();
        lblnumCarton1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEstado1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnCambiar1 = new javax.swing.JButton();
        pnlCart3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCart3 = new javax.swing.JTable();
        lblnumCarton2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEstado2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        btnCambiar2 = new javax.swing.JButton();
        pnlCart4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCart4 = new javax.swing.JTable();
        lblnumCarton3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEstado3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnCambiar3 = new javax.swing.JButton();
        pnlCart5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCart5 = new javax.swing.JTable();
        lblnumCarton4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEstado4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        btnCambiar4 = new javax.swing.JButton();
        pnlCart6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCart6 = new javax.swing.JTable();
        lblnumCarton5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEstado5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        btnCambiar5 = new javax.swing.JButton();
        btnTblJug = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblNumJug = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblNumJug = new javax.swing.JTable();
        lblNumJug1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblResum = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino Looky - Gingo");
        setMinimumSize(new java.awt.Dimension(1200, 850));
        setPreferredSize(new java.awt.Dimension(1200, 850));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlBase.setBackground(new java.awt.Color(218, 246, 254));
        pnlBase.setMinimumSize(new java.awt.Dimension(1200, 850));
        pnlBase.setPreferredSize(new java.awt.Dimension(1200, 850));
        pnlBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCart1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "G", "I", "N", "G", "O", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart1.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCart1);

        lblnumCarton.setText("Cartón N°");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Estado:");

        txtEstado.setEditable(false);
        txtEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton1.setText("Datos del jugador");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apuesta:");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar.setText("Cambiar");

        javax.swing.GroupLayout pnlCart1Layout = new javax.swing.GroupLayout(pnlCart1);
        pnlCart1.setLayout(pnlCart1Layout);
        pnlCart1Layout.setHorizontalGroup(
            pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart1Layout.createSequentialGroup()
                .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlCart1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCambiar))
                                .addGroup(pnlCart1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblnumCarton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlCart1Layout.setVerticalGroup(
            pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado))
                        .addGap(3, 3, 3)))
                .addGap(9, 9, 9)
                .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar)
                    .addComponent(jButton1))
                .addGap(71, 71, 71))
        );

        pnlBase.add(pnlCart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 380, 320));

        pnlCart2.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "G", "I", "N", "G", "O", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart2.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCart2);

        lblnumCarton1.setText("Cartón N°");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Estado:");

        txtEstado1.setEditable(false);
        txtEstado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setText("Datos del jugador");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apuesta:");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar1.setText("Cambiar");

        javax.swing.GroupLayout pnlCart2Layout = new javax.swing.GroupLayout(pnlCart2);
        pnlCart2.setLayout(pnlCart2Layout);
        pnlCart2Layout.setHorizontalGroup(
            pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart2Layout.createSequentialGroup()
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlCart2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCambiar1))
                                .addGroup(pnlCart2Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblnumCarton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlCart2Layout.setVerticalGroup(
            pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado1))
                        .addGap(3, 3, 3)))
                .addGap(9, 9, 9)
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar1)
                    .addComponent(jButton2))
                .addGap(71, 71, 71))
        );

        pnlBase.add(pnlCart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, 320));

        pnlCart3.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "G", "I", "N", "G", "O", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart3.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCart3);

        lblnumCarton2.setText("Cartón N°");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estado:");

        txtEstado2.setEditable(false);
        txtEstado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton3.setText("Datos del jugador");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apuesta:");

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar2.setText("Cambiar");

        javax.swing.GroupLayout pnlCart3Layout = new javax.swing.GroupLayout(pnlCart3);
        pnlCart3.setLayout(pnlCart3Layout);
        pnlCart3Layout.setHorizontalGroup(
            pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart3Layout.createSequentialGroup()
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlCart3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCambiar2))
                                .addGroup(pnlCart3Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblnumCarton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlCart3Layout.setVerticalGroup(
            pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado2))
                        .addGap(3, 3, 3)))
                .addGap(9, 9, 9)
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar2)
                    .addComponent(jButton3))
                .addGap(71, 71, 71))
        );

        pnlBase.add(pnlCart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, -1, 320));

        pnlCart4.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "G", "I", "N", "G", "O", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart4.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCart4);

        lblnumCarton3.setText("Cartón N°");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Estado:");

        txtEstado3.setEditable(false);
        txtEstado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setText("Datos del jugador");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Apuesta:");

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar3.setText("Cambiar");

        javax.swing.GroupLayout pnlCart4Layout = new javax.swing.GroupLayout(pnlCart4);
        pnlCart4.setLayout(pnlCart4Layout);
        pnlCart4Layout.setHorizontalGroup(
            pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart4Layout.createSequentialGroup()
                .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlCart4Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCambiar3))
                                .addGroup(pnlCart4Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblnumCarton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlCart4Layout.setVerticalGroup(
            pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado3))
                        .addGap(3, 3, 3)))
                .addGap(9, 9, 9)
                .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar3)
                    .addComponent(jButton4))
                .addGap(71, 71, 71))
        );

        pnlBase.add(pnlCart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 380, 320));

        pnlCart5.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "G", "I", "N", "G", "O", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart5.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblCart5);

        lblnumCarton4.setText("Cartón N°");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Estado:");

        txtEstado4.setEditable(false);
        txtEstado4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton5.setText("Datos del jugador");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Apuesta:");

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar4.setText("Cambiar");

        javax.swing.GroupLayout pnlCart5Layout = new javax.swing.GroupLayout(pnlCart5);
        pnlCart5.setLayout(pnlCart5Layout);
        pnlCart5Layout.setHorizontalGroup(
            pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart5Layout.createSequentialGroup()
                .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlCart5Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCambiar4))
                                .addGroup(pnlCart5Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblnumCarton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlCart5Layout.setVerticalGroup(
            pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado4))
                        .addGap(3, 3, 3)))
                .addGap(9, 9, 9)
                .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar4)
                    .addComponent(jButton5))
                .addGap(71, 71, 71))
        );

        pnlBase.add(pnlCart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, 320));

        pnlCart6.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "", "", "G", "I", "N", "G", "O", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart6.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart6MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblCart6);

        lblnumCarton5.setText("Cartón N°");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Estado:");

        txtEstado5.setEditable(false);
        txtEstado5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton6.setText("Datos del jugador");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Apuesta:");

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar5.setText("Cambiar");

        javax.swing.GroupLayout pnlCart6Layout = new javax.swing.GroupLayout(pnlCart6);
        pnlCart6.setLayout(pnlCart6Layout);
        pnlCart6Layout.setHorizontalGroup(
            pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart6Layout.createSequentialGroup()
                .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlCart6Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCambiar5))
                                .addGroup(pnlCart6Layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtEstado5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblnumCarton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pnlCart6Layout.setVerticalGroup(
            pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado5))
                        .addGap(3, 3, 3)))
                .addGap(9, 9, 9)
                .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCambiar5)
                    .addComponent(jButton6))
                .addGap(71, 71, 71))
        );

        pnlBase.add(pnlCart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, -1, 320));

        btnTblJug.setText("Tabla de Jugadores");
        pnlBase.add(btnTblJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 780, 260, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1528, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        pnlBase.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1530, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNumJug.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumJug.setText("Números Jugados");

        tblNumJug.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tblNumJug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNumJug.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblNumJug.setFocusable(false);
        tblNumJug.setRowHeight(25);
        tblNumJug.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblNumJug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNumJugMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblNumJug);

        lblNumJug1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumJug1.setText("Resumen del juego");

        tblResum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "N° Cartón", "Jugador", "Aciertos", "Apuesta", "Premio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResum.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblResum.setRowHeight(20);
        tblResum.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblResum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResumMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblResum);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Total en Banca");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField7.setText("$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNumJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblNumJug, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblNumJug, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lblNumJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pnlBase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 100, 350, 750));

        getContentPane().add(pnlBase);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblCart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart1MouseClicked

        int columna = tblCart1.getSelectedColumn();
        int fila = tblCart1.getSelectedRow();

        //tblCart1.getTableHeader().setDefaultRenderer(thisMyRenderer(tblCart1, tblCart1.getValueAt(fila, columna), true, false, fila, columna));
        // Clase interna
        class MyRenderer extends DefaultTableCellRenderer {

            public MyRenderer(JTable table,
                    Object value,
                    boolean isSelected,
                    boolean hasFocus,
                    int row,
                    int column) {
                this.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }

            @Override
            public DefaultTableCellRenderer getTableCellRendererComponent(
                    JTable table,
                    Object value,
                    boolean isSelected,
                    boolean hasFocus,
                    int row,
                    int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (!tblCart1.getColorModel().equals(Color.RED)) {
                    this.setBackground(Color.RED);
                    this.setForeground(Color.white);
                } else {
                    this.setBackground(Color.white);
                }
                return this;
            }
        }

    }//GEN-LAST:event_tblCart1MouseClicked

    private void tblCart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart2MouseClicked

    private void tblCart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart3MouseClicked

    private void tblCart4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart4MouseClicked

    private void tblCart5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart5MouseClicked

    private void tblCart6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart6MouseClicked

    private void tblNumJugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNumJugMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNumJugMouseClicked

    private void tblResumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblResumMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnCambiar1;
    private javax.swing.JButton btnCambiar2;
    private javax.swing.JButton btnCambiar3;
    private javax.swing.JButton btnCambiar4;
    private javax.swing.JButton btnCambiar5;
    private javax.swing.JButton btnTblJug;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblNumJug;
    private javax.swing.JLabel lblNumJug1;
    private javax.swing.JLabel lblnumCarton;
    private javax.swing.JLabel lblnumCarton1;
    private javax.swing.JLabel lblnumCarton2;
    private javax.swing.JLabel lblnumCarton3;
    private javax.swing.JLabel lblnumCarton4;
    private javax.swing.JLabel lblnumCarton5;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlCart1;
    private javax.swing.JPanel pnlCart2;
    private javax.swing.JPanel pnlCart3;
    private javax.swing.JPanel pnlCart4;
    private javax.swing.JPanel pnlCart5;
    private javax.swing.JPanel pnlCart6;
    private javax.swing.JTable tblCart1;
    private javax.swing.JTable tblCart2;
    private javax.swing.JTable tblCart3;
    private javax.swing.JTable tblCart4;
    private javax.swing.JTable tblCart5;
    private javax.swing.JTable tblCart6;
    private javax.swing.JTable tblNumJug;
    private javax.swing.JTable tblResum;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstado1;
    private javax.swing.JTextField txtEstado2;
    private javax.swing.JTextField txtEstado3;
    private javax.swing.JTextField txtEstado4;
    private javax.swing.JTextField txtEstado5;
    // End of variables declaration//GEN-END:variables
}
