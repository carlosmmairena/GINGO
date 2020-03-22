/*
    Creamos la matriz tridimensional aquí y setteamos sus matrices a cada hilo
 */
package vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Banca;
import logica.Cartones;
import logica.Jugador;

/**
 *
 * @author Dixiana Gómez
 * @author Carlos Mairena
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private byte carTri[][][];
    ArrayList<Cartones> hilos;
    Banca banca;
    ArrayList<Jugador> arregloJugad;

    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.carTri = new byte[6][8][10];
        this.hilos = new ArrayList();
        this.arregloJugad = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlCart1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCart1 = new javax.swing.JTable();
        lblnumCarton1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtEstado1 = new javax.swing.JTextField();
        lblApuesta1 = new javax.swing.JLabel();
        txtApuesta1 = new javax.swing.JTextField();
        btnCambiar1 = new javax.swing.JButton();
        btnDatos1 = new javax.swing.JButton();
        btnTblJug = new javax.swing.JButton();
        pnlEnca = new javax.swing.JPanel();
        lblGingo = new javax.swing.JLabel();
        btnNuevJueg = new javax.swing.JButton();
        btnGenCart = new javax.swing.JButton();
        btnAsigCart = new javax.swing.JButton();
        btnComenzar = new javax.swing.JButton();
        btnNueBol = new javax.swing.JButton();
        txtBolita = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNumJug = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblNumJug = new javax.swing.JTable();
        lblNumJug1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblResum = new javax.swing.JTable();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        pnlCart2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCart2 = new javax.swing.JTable();
        lblnumCarton2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnDatos2 = new javax.swing.JButton();
        btnCambiar2 = new javax.swing.JButton();
        lblApuesta2 = new javax.swing.JLabel();
        txtApuesta2 = new javax.swing.JTextField();
        txtEstado2 = new javax.swing.JTextField();
        pnlCart4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCart4 = new javax.swing.JTable();
        lblnumCarton4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEstado4 = new javax.swing.JTextField();
        btnDatos4 = new javax.swing.JButton();
        lblApuesta4 = new javax.swing.JLabel();
        txtApuesta4 = new javax.swing.JTextField();
        btnCambiar4 = new javax.swing.JButton();
        pnlCart5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblCart5 = new javax.swing.JTable();
        lblnumCarton5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEstado5 = new javax.swing.JTextField();
        btnDatos5 = new javax.swing.JButton();
        lblApuesta5 = new javax.swing.JLabel();
        txtApuesta5 = new javax.swing.JTextField();
        btnCambiar5 = new javax.swing.JButton();
        pnlCart3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCart3 = new javax.swing.JTable();
        lblnumCarton3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtEstado3 = new javax.swing.JTextField();
        lblApuesta3 = new javax.swing.JLabel();
        txtApuesta3 = new javax.swing.JTextField();
        btnCambiar3 = new javax.swing.JButton();
        btnDatos3 = new javax.swing.JButton();
        pnlCart6 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCart6 = new javax.swing.JTable();
        lblnumCarton6 = new javax.swing.JLabel();
        btnCambiar6 = new javax.swing.JButton();
        btnDatos6 = new javax.swing.JButton();
        txtEstado6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        lblApuesta6 = new javax.swing.JLabel();
        txtApuesta6 = new javax.swing.JTextField();
        mnbMenu = new javax.swing.JMenuBar();
        mnJugarG = new javax.swing.JMenu();
        mnAyuda = new javax.swing.JMenu();
        mnArchi = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino Looky - Gingo");
        setMinimumSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlBase.setBackground(new java.awt.Color(218, 246, 254));
        pnlBase.setMinimumSize(new java.awt.Dimension(1200, 650));
        pnlBase.setPreferredSize(new java.awt.Dimension(1274, 710));
        pnlBase.setRequestFocusEnabled(false);
        pnlBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCart1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart1.setBackground(new java.awt.Color(255, 255, 255));
        tblCart1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblCart1.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart1.setRowSelectionAllowed(false);
        tblCart1.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart1.setShowGrid(true);
        tblCart1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCart1);

        lblnumCarton1.setText("Cartón N°");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Estado:");

        txtEstado1.setEditable(false);
        txtEstado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblApuesta1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta1.setText("Apuesta:");

        txtApuesta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar1.setText("Cambiar");
        btnCambiar1.setEnabled(false);

        btnDatos1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos1.setText("Datos del jugador");
        btnDatos1.setEnabled(false);
        btnDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCart1Layout = new javax.swing.GroupLayout(pnlCart1);
        pnlCart1.setLayout(pnlCart1Layout);
        pnlCart1Layout.setHorizontalGroup(
            pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(pnlCart1Layout.createSequentialGroup()
                .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart1Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnDatos1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart1Layout.createSequentialGroup()
                                .addComponent(lblApuesta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart1Layout.createSequentialGroup()
                                .addComponent(btnCambiar1)
                                .addGap(9, 9, 9))))
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblnumCarton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pnlCart1Layout.setVerticalGroup(
            pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addComponent(txtEstado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatos1)
                        .addGap(3, 3, 3))
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblApuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar1)))
                .addGap(17, 17, 17))
        );

        pnlBase.add(pnlCart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 300, 280));

        btnTblJug.setText("Tabla de Jugadores");
        btnTblJug.setEnabled(false);
        btnTblJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTblJugActionPerformed(evt);
            }
        });
        pnlBase.add(btnTblJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 640, 210, 40));

        pnlEnca.setBackground(new java.awt.Color(255, 255, 255));
        pnlEnca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblGingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_gingo_V.png"))); // NOI18N

        btnNuevJueg.setText("Nuevo Juego");
        btnNuevJueg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevJuegActionPerformed(evt);
            }
        });

        btnGenCart.setText("Generar Cartones");
        btnGenCart.setEnabled(false);
        btnGenCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenCartActionPerformed(evt);
            }
        });

        btnAsigCart.setText("Asignar Cartones");
        btnAsigCart.setEnabled(false);
        btnAsigCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsigCartActionPerformed(evt);
            }
        });

        btnComenzar.setText("Comenzar Juego");
        btnComenzar.setEnabled(false);

        btnNueBol.setText("Nueva Bolita");
        btnNueBol.setEnabled(false);

        txtBolita.setEditable(false);
        txtBolita.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bolita N°:");

        javax.swing.GroupLayout pnlEncaLayout = new javax.swing.GroupLayout(pnlEnca);
        pnlEnca.setLayout(pnlEncaLayout);
        pnlEncaLayout.setHorizontalGroup(
            pnlEncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblGingo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevJueg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenCart, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsigCart, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBolita, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNueBol)
                .addGap(28, 28, 28))
        );
        pnlEncaLayout.setVerticalGroup(
            pnlEncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlEncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNueBol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsigCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblGingo, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btnNuevJueg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBolita)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlBase.add(pnlEnca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1210, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNumJug.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNumJug.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumJug.setText("Números Jugados");

        tblNumJug.setBackground(new java.awt.Color(255, 255, 255));
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
        tblNumJug.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblNumJug.setFocusable(false);
        tblNumJug.setGridColor(new java.awt.Color(102, 102, 102));
        tblNumJug.setRowHeight(25);
        tblNumJug.setRowSelectionAllowed(false);
        tblNumJug.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tblNumJug.setShowGrid(true);
        tblNumJug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNumJugMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblNumJug);

        lblNumJug1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblNumJug1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumJug1.setText("Resumen del juego");

        tblResum.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
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
        tblResum.setGridColor(new java.awt.Color(102, 102, 102));
        tblResum.setRowHeight(20);
        tblResum.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tblResum.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblResum.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblResum.setShowGrid(true);
        tblResum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblResumMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblResum);

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total en Banca");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTotal.setText("$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(lblNumJug, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblNumJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblNumJug, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblNumJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pnlBase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 70, 310, 610));

        pnlCart2.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart2.setBackground(new java.awt.Color(255, 255, 255));
        tblCart2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblCart2.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart2.setRowSelectionAllowed(false);
        tblCart2.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart2.setShowGrid(true);
        tblCart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblCart2);

        lblnumCarton2.setText("Cartón N°");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Estado:");

        btnDatos2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos2.setText("Datos del jugador");
        btnDatos2.setEnabled(false);
        btnDatos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos2ActionPerformed(evt);
            }
        });

        btnCambiar2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar2.setText("Cambiar");
        btnCambiar2.setEnabled(false);

        lblApuesta2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta2.setText("Apuesta:");

        txtApuesta2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEstado2.setEditable(false);
        txtEstado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlCart2Layout = new javax.swing.GroupLayout(pnlCart2);
        pnlCart2.setLayout(pnlCart2Layout);
        pnlCart2Layout.setHorizontalGroup(
            pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart2Layout.createSequentialGroup()
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblnumCarton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCart2Layout.createSequentialGroup()
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCart2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnDatos2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCart2Layout.createSequentialGroup()
                                        .addComponent(lblApuesta2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart2Layout.createSequentialGroup()
                                        .addComponent(btnCambiar2)
                                        .addGap(9, 9, 9)))))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCart2Layout.setVerticalGroup(
            pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addComponent(txtEstado2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatos2)
                        .addGap(3, 3, 3))
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblApuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar2)))
                .addGap(17, 17, 17))
        );

        pnlBase.add(pnlCart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, 280));

        pnlCart4.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart4.setBackground(new java.awt.Color(255, 255, 255));
        tblCart4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblCart4.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart4.setRowSelectionAllowed(false);
        tblCart4.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart4.setShowGrid(true);
        tblCart4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblCart4);

        lblnumCarton4.setText("Cartón N°");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Estado:");

        txtEstado4.setEditable(false);
        txtEstado4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDatos4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos4.setText("Datos del jugador");
        btnDatos4.setEnabled(false);
        btnDatos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos4ActionPerformed(evt);
            }
        });

        lblApuesta4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta4.setText("Apuesta:");

        txtApuesta4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar4.setText("Cambiar");
        btnCambiar4.setEnabled(false);

        javax.swing.GroupLayout pnlCart4Layout = new javax.swing.GroupLayout(pnlCart4);
        pnlCart4.setLayout(pnlCart4Layout);
        pnlCart4Layout.setHorizontalGroup(
            pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart4Layout.createSequentialGroup()
                .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblnumCarton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnDatos4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart4Layout.createSequentialGroup()
                                .addComponent(lblApuesta4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart4Layout.createSequentialGroup()
                                .addComponent(btnCambiar4)
                                .addGap(8, 8, 8)))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlCart4Layout.setVerticalGroup(
            pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnumCarton4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addComponent(txtEstado4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatos4)
                        .addGap(109, 109, 109))
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblApuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlBase.add(pnlCart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 280));

        pnlCart5.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart5.setBackground(new java.awt.Color(255, 255, 255));
        tblCart5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblCart5.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart5.setRowSelectionAllowed(false);
        tblCart5.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart5.setShowGrid(true);
        tblCart5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart5MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblCart5);

        lblnumCarton5.setText("Cartón N°");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Estado:");

        txtEstado5.setEditable(false);
        txtEstado5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnDatos5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos5.setText("Datos del jugador");
        btnDatos5.setEnabled(false);
        btnDatos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos5ActionPerformed(evt);
            }
        });

        lblApuesta5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta5.setText("Apuesta:");

        txtApuesta5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar5.setText("Cambiar");
        btnCambiar5.setEnabled(false);

        javax.swing.GroupLayout pnlCart5Layout = new javax.swing.GroupLayout(pnlCart5);
        pnlCart5.setLayout(pnlCart5Layout);
        pnlCart5Layout.setHorizontalGroup(
            pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart5Layout.createSequentialGroup()
                .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblnumCarton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnDatos5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart5Layout.createSequentialGroup()
                                .addComponent(lblApuesta5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart5Layout.createSequentialGroup()
                                .addComponent(btnCambiar5)
                                .addGap(9, 9, 9)))))
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlCart5Layout.setVerticalGroup(
            pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addComponent(txtEstado5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatos5)
                        .addGap(109, 109, 109))
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblApuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApuesta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlBase.add(pnlCart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, 280));

        pnlCart3.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart3.setBackground(new java.awt.Color(255, 255, 255));
        tblCart3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblCart3.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart3.setRowSelectionAllowed(false);
        tblCart3.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart3.setShowGrid(true);
        tblCart3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart3MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblCart3);

        lblnumCarton3.setText("Cartón N°");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Estado:");

        txtEstado3.setEditable(false);
        txtEstado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblApuesta3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta3.setText("Apuesta:");

        txtApuesta3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar3.setText("Cambiar");
        btnCambiar3.setEnabled(false);

        btnDatos3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos3.setText("Datos del jugador");
        btnDatos3.setEnabled(false);
        btnDatos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCart3Layout = new javax.swing.GroupLayout(pnlCart3);
        pnlCart3.setLayout(pnlCart3Layout);
        pnlCart3Layout.setHorizontalGroup(
            pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart3Layout.createSequentialGroup()
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblnumCarton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCart3Layout.createSequentialGroup()
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlCart3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(btnDatos3)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCart3Layout.createSequentialGroup()
                                        .addComponent(lblApuesta3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtApuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart3Layout.createSequentialGroup()
                                        .addComponent(btnCambiar3)
                                        .addGap(9, 9, 9)))))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCart3Layout.setVerticalGroup(
            pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addComponent(txtEstado3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatos3)
                        .addGap(3, 3, 3))
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblApuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar3)))
                .addGap(17, 17, 17))
        );

        pnlBase.add(pnlCart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, 280));

        pnlCart6.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart6.setBackground(new java.awt.Color(255, 255, 255));
        tblCart6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblCart6.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart6.setRowSelectionAllowed(false);
        tblCart6.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart6.setShowGrid(true);
        tblCart6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart6MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblCart6);

        lblnumCarton6.setText("Cartón N°");

        btnCambiar6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar6.setText("Cambiar");
        btnCambiar6.setEnabled(false);

        btnDatos6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos6.setText("Datos del jugador");
        btnDatos6.setEnabled(false);
        btnDatos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos6ActionPerformed(evt);
            }
        });

        txtEstado6.setEditable(false);
        txtEstado6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Estado:");

        lblApuesta6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta6.setText("Apuesta:");

        txtApuesta6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlCart6Layout = new javax.swing.GroupLayout(pnlCart6);
        pnlCart6.setLayout(pnlCart6Layout);
        pnlCart6Layout.setHorizontalGroup(
            pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart6Layout.createSequentialGroup()
                .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblnumCarton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart6Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnDatos6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart6Layout.createSequentialGroup()
                                .addComponent(lblApuesta6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApuesta6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart6Layout.createSequentialGroup()
                                .addComponent(btnCambiar6)
                                .addGap(9, 9, 9)))))
                .addContainerGap(10, Short.MAX_VALUE))
            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        pnlCart6Layout.setVerticalGroup(
            pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addComponent(txtEstado6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDatos6)
                        .addGap(3, 3, 3))
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblApuesta6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtApuesta6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar6)))
                .addGap(17, 17, 17))
        );

        pnlBase.add(pnlCart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, 280));

        getContentPane().add(pnlBase);

        mnJugarG.setText("Jugar Gingo");
        mnbMenu.add(mnJugarG);

        mnAyuda.setText("Ayuda");
        mnbMenu.add(mnAyuda);

        mnArchi.setText("Archivo");
        mnbMenu.add(mnArchi);

        setJMenuBar(mnbMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblCart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart1MouseClicked
        
    }//GEN-LAST:event_tblCart1MouseClicked

    private void tblNumJugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNumJugMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNumJugMouseClicked

    private void tblResumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblResumMouseClicked

    private void tblCart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart2MouseClicked

    private void tblCart4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart4MouseClicked

    private void tblCart5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart5MouseClicked

    private void tblCart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart3MouseClicked

    private void tblCart6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart6MouseClicked

    private void btnNuevJuegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevJuegActionPerformed
        this.iniciarJuego();
    }//GEN-LAST:event_btnNuevJuegActionPerformed

    private void btnGenCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenCartActionPerformed
        this.generarCartones();

    }//GEN-LAST:event_btnGenCartActionPerformed

    private void btnAsigCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsigCartActionPerformed
        
        this.asignarCarton();
    }//GEN-LAST:event_btnAsigCartActionPerformed

    private void btnDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatos1ActionPerformed
        
        Jugador jug = new Jugador();
        for (Jugador ju : arregloJugad) {
            if (ju.getCarton().getNumCarton() == 1){
                jug = ju;
                break;
            }
        }
        DlgDatosJu datosJu = new DlgDatosJu(this, true, jug);
        datosJu.setVisible(true);
    }//GEN-LAST:event_btnDatos1ActionPerformed

    private void btnDatos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatos2ActionPerformed
        
        Jugador jug = new Jugador();
        for (Jugador ju : arregloJugad) {
            if (ju.getCarton().getNumCarton() == 2){
                jug = ju;
                break;
            }
        }
        DlgDatosJu datosJu = new DlgDatosJu(this, true, jug);
        datosJu.setVisible(true);
        
    }//GEN-LAST:event_btnDatos2ActionPerformed

    private void btnDatos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatos3ActionPerformed
        
        Jugador jug = new Jugador();
        for (Jugador ju : arregloJugad) {
            if (ju.getCarton().getNumCarton() == 3){
                jug = ju;
                break;
            }
        }
        DlgDatosJu datosJu = new DlgDatosJu(this, true, jug);
        datosJu.setVisible(true);
        
    }//GEN-LAST:event_btnDatos3ActionPerformed

    private void btnDatos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatos4ActionPerformed
        
        Jugador jug = new Jugador();
        for (Jugador ju : arregloJugad) {
            if (ju.getCarton().getNumCarton() == 4){
                jug = ju;
                break;
            }
        }
        DlgDatosJu datosJu = new DlgDatosJu(this, true, jug);
        datosJu.setVisible(true);
        
    }//GEN-LAST:event_btnDatos4ActionPerformed

    private void btnDatos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatos5ActionPerformed
        
        Jugador jug = new Jugador();
        for (Jugador ju : arregloJugad) {
            if (ju.getCarton().getNumCarton() == 5){
                jug = ju;
                break;
            }
        }
        DlgDatosJu datosJu = new DlgDatosJu(this, true, jug);
        datosJu.setVisible(true);
        
    }//GEN-LAST:event_btnDatos5ActionPerformed

    private void btnDatos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatos6ActionPerformed
        
        Jugador jug = new Jugador();
        for (Jugador ju : arregloJugad) {
            if (ju.getCarton().getNumCarton() == 6){
                jug = ju;
                break;
            }
        }
        DlgDatosJu datosJu = new DlgDatosJu(this, true, jug);
        datosJu.setVisible(true);
        
    }//GEN-LAST:event_btnDatos6ActionPerformed

    private void btnTblJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTblJugActionPerformed
        // Falta completar la gráfica que muestra los datos del jugador, como el teléfono
        DlgTablaJugadores tablaJug = new DlgTablaJugadores(this, true, arregloJugad);
        tablaJug.setVisible(true);
    }//GEN-LAST:event_btnTblJugActionPerformed

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
    private javax.swing.JButton btnAsigCart;
    private javax.swing.JButton btnCambiar1;
    private javax.swing.JButton btnCambiar2;
    private javax.swing.JButton btnCambiar3;
    private javax.swing.JButton btnCambiar4;
    private javax.swing.JButton btnCambiar5;
    private javax.swing.JButton btnCambiar6;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnDatos1;
    private javax.swing.JButton btnDatos2;
    private javax.swing.JButton btnDatos3;
    private javax.swing.JButton btnDatos4;
    private javax.swing.JButton btnDatos5;
    private javax.swing.JButton btnDatos6;
    private javax.swing.JButton btnGenCart;
    private javax.swing.JButton btnNueBol;
    private javax.swing.JButton btnNuevJueg;
    private javax.swing.JButton btnTblJug;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblApuesta1;
    private javax.swing.JLabel lblApuesta2;
    private javax.swing.JLabel lblApuesta3;
    private javax.swing.JLabel lblApuesta4;
    private javax.swing.JLabel lblApuesta5;
    private javax.swing.JLabel lblApuesta6;
    private javax.swing.JLabel lblGingo;
    private javax.swing.JLabel lblNumJug;
    private javax.swing.JLabel lblNumJug1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblnumCarton1;
    private javax.swing.JLabel lblnumCarton2;
    private javax.swing.JLabel lblnumCarton3;
    private javax.swing.JLabel lblnumCarton4;
    private javax.swing.JLabel lblnumCarton5;
    private javax.swing.JLabel lblnumCarton6;
    private javax.swing.JMenu mnArchi;
    private javax.swing.JMenu mnAyuda;
    private javax.swing.JMenu mnJugarG;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlCart1;
    private javax.swing.JPanel pnlCart2;
    private javax.swing.JPanel pnlCart3;
    private javax.swing.JPanel pnlCart4;
    private javax.swing.JPanel pnlCart5;
    private javax.swing.JPanel pnlCart6;
    private javax.swing.JPanel pnlEnca;
    private javax.swing.JTable tblCart1;
    private javax.swing.JTable tblCart2;
    private javax.swing.JTable tblCart3;
    private javax.swing.JTable tblCart4;
    private javax.swing.JTable tblCart5;
    private javax.swing.JTable tblCart6;
    private javax.swing.JTable tblNumJug;
    private javax.swing.JTable tblResum;
    private javax.swing.JTextField txtApuesta1;
    private javax.swing.JTextField txtApuesta2;
    private javax.swing.JTextField txtApuesta3;
    private javax.swing.JTextField txtApuesta4;
    private javax.swing.JTextField txtApuesta5;
    private javax.swing.JTextField txtApuesta6;
    private javax.swing.JTextField txtBolita;
    private javax.swing.JTextField txtEstado1;
    private javax.swing.JTextField txtEstado2;
    private javax.swing.JTextField txtEstado3;
    private javax.swing.JTextField txtEstado4;
    private javax.swing.JTextField txtEstado5;
    private javax.swing.JTextField txtEstado6;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

    /**
     * Se llama para asignar un cartón
     */
    private void asignarCarton(){
        
        DlgRegistro registrar = new DlgRegistro(this, true, cartonesDisponibles());
        registrar.setVisible(true);
        seleCarton(registrar.getCmbCarton().getSelectedItem().toString(),registrar.getJugador());
        JOptionPane.showMessageDialog(this, "¡Registrado exitosamente! \nElija 10 números.");
    }
    
    private void seleCarton(String r, Jugador j){
        Cartones carton;
        
        switch(r){
            case "Cartón N° 1":
                //carton = new Cartones("Vendido",Byte.parseByte("1"), carTri[0].clone());
                carton = new Cartones("Vendido",Byte.parseByte("1"), tblCart1);
                this.hilos.add(carton);
                this.hilos.trimToSize();
                j.setCarton(carton);
                
                txtEstado1.setText(hilos.get(hilos.size()-1).getEstado());
                btnCambiar1.setEnabled(true);
                btnDatos1.setEnabled(true);
                break;
                
            case "Cartón N° 2":
                //carton = new Cartones("Vendido",Byte.parseByte("2"), carTri[1].clone());
                carton = new Cartones("Vendido",Byte.parseByte("2"), tblCart2);
                this.hilos.add(carton);
                this.hilos.trimToSize();
                j.setCarton(carton);
                
                txtEstado2.setText(hilos.get(hilos.size()-1).getEstado());
                btnCambiar2.setEnabled(true);
                btnDatos2.setEnabled(true);
                break;
                
            case "Cartón N° 3":
                //carton = new Cartones("Vendido",Byte.parseByte("3"), carTri[2].clone());
                carton = new Cartones("Vendido",Byte.parseByte("3"), tblCart3);
                this.hilos.add(carton);
                this.hilos.trimToSize();
                j.setCarton(carton);
                
                txtEstado3.setText(hilos.get(hilos.size()-1).getEstado());
                btnCambiar3.setEnabled(true);
                btnDatos3.setEnabled(true);
                break;
                
            case "Cartón N° 4":
                //carton = new Cartones("Vendido",Byte.parseByte("4"), carTri[3].clone());
                carton = new Cartones("Vendido",Byte.parseByte("4"), tblCart4);
                this.hilos.add(carton);
                this.hilos.trimToSize();
                j.setCarton(carton);
                
                txtEstado4.setText(hilos.get(hilos.size()-1).getEstado());
                btnCambiar4.setEnabled(true);
                btnDatos4.setEnabled(true);
                break;
                
            case "Cartón N° 5":
                //carton = new Cartones("Vendido", Byte.parseByte("5"), carTri[4].clone());
                carton = new Cartones("Vendido", Byte.parseByte("5"), tblCart5);
                this.hilos.add(carton);
                this.hilos.trimToSize();
                j.setCarton(carton);
                
                txtEstado5.setText(hilos.get(hilos.size()-1).getEstado());
                btnCambiar5.setEnabled(true);
                btnDatos5.setEnabled(true);
                break;
                
            case "Cartón N° 6":
                //carton = new Cartones("Vendido",Byte.parseByte("6"), carTri[5].clone());
                carton = new Cartones("Vendido",Byte.parseByte("6"), tblCart6);
                this.hilos.add(carton);
                this.hilos.trimToSize();
                j.setCarton(carton);
                
                txtEstado6.setText(hilos.get(hilos.size()-1).getEstado());
                btnCambiar6.setEnabled(true);
                btnDatos6.setEnabled(true);
                break;
        }
        arregloJugad.add(j);
        arregloJugad.trimToSize();
    }
    
    /**
     * Revisa los cartones disponibles y los retorna en un arreglo de string
     * @return 
     */
    private ArrayList<String> cartonesDisponibles(){
        
        ArrayList<String> cartones = new ArrayList();
        
        for (int i = 0; i < hilos.size(); i++) {
            if(hilos.get(i).getEstado().equals("Vendido")){
                cartones.add("Cartón N° "+hilos.get(i).getNumCarton());
            }
        }
        cartones.trimToSize();
        return cartones;
    }
    
    /**
     * Rellena la matriz tridimensional
     */
    private void generarCartones(){
        
        byte num;
        
        for (int posi = 0; posi < 6; posi++) {
            for (int fil = 0; fil < 8; fil++) {
                for (int col = 0; col < 10; col++) {

                    num = (byte) (Math.random() * 80 + 1);
                    if (revisar(num, posi)) {
                        col--;
                    } else {
                        carTri[posi][fil][col] = num;
                    }
                }
            }
        }
        
        // Asigna el valor de la matriz a cada cartón gráfico
        for (int fil = 0; fil < 8; fil++) {
            for (int col = 0; col < 10; col++) {
                tblCart1.setValueAt(carTri[0][fil][col],fil,col);
                tblCart2.setValueAt(carTri[1][fil][col],fil,col);
                tblCart3.setValueAt(carTri[2][fil][col],fil,col);
                tblCart4.setValueAt(carTri[3][fil][col],fil,col);
                tblCart5.setValueAt(carTri[4][fil][col],fil,col);
                tblCart6.setValueAt(carTri[5][fil][col],fil,col);
            }
        }
        
        this.btnGenCart.setEnabled(false);
        this.btnAsigCart.setEnabled(true);
    }
    
    /**
     * Revisa si un número está repetido
     * @param num
     * @return 
     */
    private boolean revisar(byte num, int posi) {

        boolean aviso = false;
            for (int fil = 0; fil < 8; fil++) {
                for (int col = 0; col < 10; col++) {

                    if (num == carTri[posi][fil][col]) {
                        aviso = true;
                        break;
                    }
                }
            }
        return aviso;
    }
    
    /**
     * Método que inicializa los parámetros del juego
     */
    private void iniciarJuego() {

        
//        for (int i = 0; i < hilos.length; i++) {
//            hilos[i] = new Cartones(Byte.parseByte(String.valueOf(i)), carTri[0].clone());
//        }
        
        banca = new Banca();

        this.llenarCampos();
        btnNuevJueg.setEnabled(false);
        btnGenCart.setEnabled(true);

    }

    private void llenarCampos() {

        lblnumCarton1.setText("Cartón N° 1");
        lblnumCarton2.setText("Cartón N° 2" );
        lblnumCarton3.setText("Cartón N° 3" );
        lblnumCarton4.setText("Cartón N° 4" );
        lblnumCarton5.setText("Cartón N° 5" );
        lblnumCarton6.setText("Cartón N° 6" );

        txtEstado1.setText("Disponible");
        txtEstado2.setText("Disponible");
        txtEstado3.setText("Disponible");
        txtEstado4.setText("Disponible");
        txtEstado5.setText("Disponible");
        txtEstado6.setText("Disponible");

        txtApuesta1.setText("$5");
        txtApuesta2.setText("$5");
        txtApuesta3.setText("$5");
        txtApuesta4.setText("$5");
        txtApuesta5.setText("$5");
        txtApuesta6.setText("$5");

        txtTotal.setText("$" + banca.getTotalBanca());

    }

}
