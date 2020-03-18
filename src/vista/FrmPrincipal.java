/*
    Creamos la matriz tridimensional aquí y setteamos sus matrices a cada hilo
 */
package vista;

/**
 *
 * @author Dixiana Gómez
 * @author Carlos Mairena
 */
public class FrmPrincipal extends javax.swing.JFrame {

    //private byte cartones[][][] = new byte[6][8][10];
    public FrmPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        //Cartones carton1.matriz = triCart[0][][];

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
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
        btnTblJug = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        btnAsignar = new javax.swing.JButton();
        btnComenzar = new javax.swing.JButton();
        btnNuevaBo = new javax.swing.JButton();
        lblBolita = new javax.swing.JLabel();
        txtNumBolita = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNumJug = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblNumJug = new javax.swing.JTable();
        lblNumJug1 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblResum = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        pnlCart7 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblCart7 = new javax.swing.JTable();
        lblnumCarton6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEstado6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        btnCambiar6 = new javax.swing.JButton();
        pnlCart8 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCart8 = new javax.swing.JTable();
        lblnumCarton7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtEstado7 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        btnCambiar7 = new javax.swing.JButton();
        pnlCart9 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCart9 = new javax.swing.JTable();
        lblnumCarton8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtEstado8 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        btnCambiar8 = new javax.swing.JButton();
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
        pnlCart10 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblCart10 = new javax.swing.JTable();
        lblnumCarton9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtEstado9 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        btnCambiar9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino Looky - Gingo");
        setMinimumSize(new java.awt.Dimension(1200, 850));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlBase.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        pnlBase.setMinimumSize(new java.awt.Dimension(1200, 850));
        pnlBase.setPreferredSize(new java.awt.Dimension(1200, 850));
        pnlBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCart2.setBackground(new java.awt.Color(204, 204, 255));
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
        tblCart2.setCellSelectionEnabled(true);
        tblCart2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart2.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart2.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart2.setShowGrid(true);
        tblCart2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCart2);

        lblnumCarton1.setForeground(new java.awt.Color(102, 102, 102));
        lblnumCarton1.setText("Cartón N°");

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Estado:");

        txtEstado1.setEditable(false);
        txtEstado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton2.setText("Datos del jugador");

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apuesta:");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar1.setBackground(new java.awt.Color(204, 204, 255));
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
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(btnCambiar1))
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumCarton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCart2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCart2Layout.setVerticalGroup(
            pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart2Layout.createSequentialGroup()
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado1))
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiar1)
                    .addComponent(jButton2))
                .addGap(97, 97, 97))
        );

        pnlBase.add(pnlCart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 360, 290));

        btnTblJug.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darcula.selection.color1"));
        btnTblJug.setText("Tabla de Jugadores");
        pnlBase.add(btnTblJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 700, 260, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        btnNuevo.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevo.setText("Nuevo Juego");

        btnGenerar.setBackground(new java.awt.Color(204, 204, 255));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cartones.png"))); // NOI18N
        btnGenerar.setText("Generar Cartones");

        btnAsignar.setBackground(new java.awt.Color(204, 204, 255));
        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asignar.png"))); // NOI18N
        btnAsignar.setText("Asignar Cartones");
        btnAsignar.setMinimumSize(new java.awt.Dimension(167, 48));

        btnComenzar.setBackground(new java.awt.Color(204, 204, 255));
        btnComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/comenzar.png"))); // NOI18N
        btnComenzar.setText("Comenzar Juego");
        btnComenzar.setMaximumSize(new java.awt.Dimension(77, 32));
        btnComenzar.setMinimumSize(new java.awt.Dimension(167, 48));

        btnNuevaBo.setBackground(new java.awt.Color(204, 204, 255));
        btnNuevaBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bolitas.png"))); // NOI18N
        btnNuevaBo.setText("Nueva Bolita");
        btnNuevaBo.setMaximumSize(new java.awt.Dimension(77, 32));
        btnNuevaBo.setMinimumSize(new java.awt.Dimension(167, 48));

        lblBolita.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBolita.setForeground(new java.awt.Color(51, 51, 255));
        lblBolita.setText("BOLITA N°");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBolita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNumBolita, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevaBo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaBo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBolita, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumBolita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pnlBase.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1100, 90));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNumJug.setForeground(new java.awt.Color(102, 102, 102));
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

        lblNumJug1.setForeground(new java.awt.Color(102, 102, 102));
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
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
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
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblNumJug, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
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
                .addGap(50, 50, 50)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pnlBase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, 350, 750));

        pnlCart7.setBackground(new java.awt.Color(204, 204, 255));
        pnlCart7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart7.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCart7.setCellSelectionEnabled(true);
        tblCart7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart7.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart7.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart7.setShowGrid(true);
        tblCart7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart7MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tblCart7);

        lblnumCarton6.setForeground(new java.awt.Color(102, 102, 102));
        lblnumCarton6.setText("Cartón N°");

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Estado:");

        txtEstado6.setEditable(false);
        txtEstado6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton7.setText("Datos del jugador");

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Apuesta:");

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar6.setBackground(new java.awt.Color(204, 204, 255));
        btnCambiar6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar6.setText("Cambiar");

        javax.swing.GroupLayout pnlCart7Layout = new javax.swing.GroupLayout(pnlCart7);
        pnlCart7.setLayout(pnlCart7Layout);
        pnlCart7Layout.setHorizontalGroup(
            pnlCart7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart7Layout.createSequentialGroup()
                .addGroup(pnlCart7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart7Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart7Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(btnCambiar6))
                            .addGroup(pnlCart7Layout.createSequentialGroup()
                                .addGroup(pnlCart7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumCarton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCart7Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCart7Layout.setVerticalGroup(
            pnlCart7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCart7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart7Layout.createSequentialGroup()
                        .addGroup(pnlCart7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart7Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(pnlCart7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado6))
                        .addGap(3, 3, 3)))
                .addGroup(pnlCart7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiar6)
                    .addComponent(jButton7))
                .addGap(97, 97, 97))
        );

        pnlBase.add(pnlCart7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 360, 290));

        pnlCart8.setBackground(new java.awt.Color(204, 204, 255));
        pnlCart8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart8.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCart8.setCellSelectionEnabled(true);
        tblCart8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart8.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart8.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart8.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart8.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart8.setShowGrid(true);
        tblCart8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart8MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblCart8);

        lblnumCarton7.setForeground(new java.awt.Color(102, 102, 102));
        lblnumCarton7.setText("Cartón N°");

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Estado:");

        txtEstado7.setEditable(false);
        txtEstado7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton8.setText("Datos del jugador");

        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Apuesta:");

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar7.setBackground(new java.awt.Color(204, 204, 255));
        btnCambiar7.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar7.setText("Cambiar");

        javax.swing.GroupLayout pnlCart8Layout = new javax.swing.GroupLayout(pnlCart8);
        pnlCart8.setLayout(pnlCart8Layout);
        pnlCart8Layout.setHorizontalGroup(
            pnlCart8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart8Layout.createSequentialGroup()
                .addGroup(pnlCart8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart8Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart8Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart8Layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(btnCambiar7))
                            .addGroup(pnlCart8Layout.createSequentialGroup()
                                .addGroup(pnlCart8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumCarton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCart8Layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCart8Layout.setVerticalGroup(
            pnlCart8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCart8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart8Layout.createSequentialGroup()
                        .addGroup(pnlCart8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart8Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(pnlCart8Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado7))
                        .addGap(3, 3, 3)))
                .addGroup(pnlCart8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiar7)
                    .addComponent(jButton8))
                .addGap(97, 97, 97))
        );

        pnlBase.add(pnlCart8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 360, 290));

        pnlCart9.setBackground(new java.awt.Color(204, 204, 255));
        pnlCart9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart9.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCart9.setCellSelectionEnabled(true);
        tblCart9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart9.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart9.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart9.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart9.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart9.setShowGrid(true);
        tblCart9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart9MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblCart9);

        lblnumCarton8.setForeground(new java.awt.Color(102, 102, 102));
        lblnumCarton8.setText("Cartón N°");

        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Estado:");

        txtEstado8.setEditable(false);
        txtEstado8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton9.setText("Datos del jugador");

        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Apuesta:");

        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar8.setBackground(new java.awt.Color(204, 204, 255));
        btnCambiar8.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar8.setText("Cambiar");

        javax.swing.GroupLayout pnlCart9Layout = new javax.swing.GroupLayout(pnlCart9);
        pnlCart9.setLayout(pnlCart9Layout);
        pnlCart9Layout.setHorizontalGroup(
            pnlCart9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart9Layout.createSequentialGroup()
                .addGroup(pnlCart9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart9Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart9Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart9Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCambiar8))
                            .addGroup(pnlCart9Layout.createSequentialGroup()
                                .addGroup(pnlCart9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumCarton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCart9Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 1, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCart9Layout.setVerticalGroup(
            pnlCart9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCart9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart9Layout.createSequentialGroup()
                        .addGroup(pnlCart9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart9Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(pnlCart9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado8))
                        .addGap(3, 3, 3)))
                .addGroup(pnlCart9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiar8)
                    .addComponent(jButton9))
                .addGap(97, 97, 97))
        );

        pnlBase.add(pnlCart9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, 290));

        pnlCart3.setBackground(new java.awt.Color(204, 204, 255));
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
        tblCart3.setCellSelectionEnabled(true);
        tblCart3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart3.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart3.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart3.setShowGrid(true);
        tblCart3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblCart3);

        lblnumCarton2.setForeground(new java.awt.Color(102, 102, 102));
        lblnumCarton2.setText("Cartón N°");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Estado:");

        txtEstado2.setEditable(false);
        txtEstado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton3.setText("Datos del jugador");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Apuesta:");

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar2.setBackground(new java.awt.Color(204, 204, 255));
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
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCambiar2))
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumCarton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCart3Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 1, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCart3Layout.setVerticalGroup(
            pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart3Layout.createSequentialGroup()
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado2))
                        .addGap(3, 3, 3)))
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiar2)
                    .addComponent(jButton3))
                .addGap(97, 97, 97))
        );

        pnlBase.add(pnlCart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, 290));

        pnlCart10.setBackground(new java.awt.Color(204, 204, 255));
        pnlCart10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart10.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCart10.setCellSelectionEnabled(true);
        tblCart10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart10.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart10.setSelectionBackground(new java.awt.Color(0, 255, 204));
        tblCart10.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart10.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCart10.setShowGrid(true);
        tblCart10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCart10MouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblCart10);

        lblnumCarton9.setForeground(new java.awt.Color(102, 102, 102));
        lblnumCarton9.setText("Cartón N°");

        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Estado:");

        txtEstado9.setEditable(false);
        txtEstado9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton10.setText("Datos del jugador");

        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Apuesta:");

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar9.setBackground(new java.awt.Color(204, 204, 255));
        btnCambiar9.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btnCambiar9.setText("Cambiar");

        javax.swing.GroupLayout pnlCart10Layout = new javax.swing.GroupLayout(pnlCart10);
        pnlCart10.setLayout(pnlCart10Layout);
        pnlCart10Layout.setHorizontalGroup(
            pnlCart10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart10Layout.createSequentialGroup()
                .addGroup(pnlCart10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart10Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCart10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart10Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCambiar9))
                            .addGroup(pnlCart10Layout.createSequentialGroup()
                                .addGroup(pnlCart10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblnumCarton9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlCart10Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtEstado9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 1, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCart10Layout.setVerticalGroup(
            pnlCart10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart10Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCart10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart10Layout.createSequentialGroup()
                        .addGroup(pnlCart10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCart10Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(pnlCart10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtEstado9))
                        .addGap(3, 3, 3)))
                .addGroup(pnlCart10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiar9)
                    .addComponent(jButton10))
                .addGap(97, 97, 97))
        );

        pnlBase.add(pnlCart10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, 290));

        getContentPane().add(pnlBase);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu1.setBackground(new java.awt.Color(204, 204, 255));
        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setText("archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 204, 255));
        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setText("Jugar Gingo");
        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(204, 204, 255));
        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setText("Ayuda");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblCart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart2MouseClicked

    private void tblNumJugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNumJugMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNumJugMouseClicked

    private void tblResumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblResumMouseClicked

    private void tblCart7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart7MouseClicked

    private void tblCart8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart8MouseClicked

    private void tblCart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart3MouseClicked

    private void tblCart9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart9MouseClicked

    private void tblCart10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart10MouseClicked

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
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnCambiar1;
    private javax.swing.JButton btnCambiar2;
    private javax.swing.JButton btnCambiar6;
    private javax.swing.JButton btnCambiar7;
    private javax.swing.JButton btnCambiar8;
    private javax.swing.JButton btnCambiar9;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnNuevaBo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnTblJug;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblBolita;
    private javax.swing.JLabel lblNumJug;
    private javax.swing.JLabel lblNumJug1;
    private javax.swing.JLabel lblnumCarton1;
    private javax.swing.JLabel lblnumCarton2;
    private javax.swing.JLabel lblnumCarton6;
    private javax.swing.JLabel lblnumCarton7;
    private javax.swing.JLabel lblnumCarton8;
    private javax.swing.JLabel lblnumCarton9;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlCart10;
    private javax.swing.JPanel pnlCart2;
    private javax.swing.JPanel pnlCart3;
    private javax.swing.JPanel pnlCart7;
    private javax.swing.JPanel pnlCart8;
    private javax.swing.JPanel pnlCart9;
    private javax.swing.JTable tblCart10;
    private javax.swing.JTable tblCart2;
    private javax.swing.JTable tblCart3;
    private javax.swing.JTable tblCart7;
    private javax.swing.JTable tblCart8;
    private javax.swing.JTable tblCart9;
    private javax.swing.JTable tblNumJug;
    private javax.swing.JTable tblResum;
    private javax.swing.JTextField txtEstado1;
    private javax.swing.JTextField txtEstado2;
    private javax.swing.JTextField txtEstado6;
    private javax.swing.JTextField txtEstado7;
    private javax.swing.JTextField txtEstado8;
    private javax.swing.JTextField txtEstado9;
    private javax.swing.JTextField txtNumBolita;
    // End of variables declaration//GEN-END:variables
}
