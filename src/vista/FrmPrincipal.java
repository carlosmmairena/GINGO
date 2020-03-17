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
        //Cartones carton1.matriz = triCart[0][][];

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlCart1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCart4 = new javax.swing.JTable();
        lblnumCarton3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtEstado12 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        btnCambiar12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        btnTblJug = new javax.swing.JButton();
        pnlEnca = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        pnlCart2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCart5 = new javax.swing.JTable();
        lblnumCarton4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        btnCambiar11 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        txtEstado11 = new javax.swing.JTextField();
        pnlCart4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCart6 = new javax.swing.JTable();
        lblnumCarton5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEstado5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        btnCambiar5 = new javax.swing.JButton();
        pnlCart5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblCart7 = new javax.swing.JTable();
        lblnumCarton6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEstado6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        btnCambiar6 = new javax.swing.JButton();
        pnlCart3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCart8 = new javax.swing.JTable();
        lblnumCarton7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtEstado10 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        btnCambiar10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        pnlCart6 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCart9 = new javax.swing.JTable();
        lblnumCarton8 = new javax.swing.JLabel();
        btnCambiar9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        txtEstado9 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        mnbMenu = new javax.swing.JMenuBar();
        mnJugarG = new javax.swing.JMenu();
        mnAyuda = new javax.swing.JMenu();
        mnArchi = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Casino Looky - Gingo");
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1274, 728));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        pnlBase.setBackground(new java.awt.Color(218, 246, 254));
        pnlBase.setMinimumSize(new java.awt.Dimension(1200, 700));
        pnlBase.setPreferredSize(new java.awt.Dimension(1274, 728));
        pnlBase.setRequestFocusEnabled(false);
        pnlBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlCart1.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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
        jScrollPane4.setViewportView(tblCart4);

        lblnumCarton3.setText("Cartón N°");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Estado:");

        txtEstado12.setEditable(false);
        txtEstado12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Apuesta:");

        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar12.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar12.setText("Cambiar");
        btnCambiar12.setEnabled(false);

        jButton13.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton13.setText("Datos del jugador");
        jButton13.setEnabled(false);

        javax.swing.GroupLayout pnlCart1Layout = new javax.swing.GroupLayout(pnlCart1);
        pnlCart1.setLayout(pnlCart1Layout);
        pnlCart1Layout.setHorizontalGroup(
            pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart1Layout.createSequentialGroup()
                .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblnumCarton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart1Layout.createSequentialGroup()
                                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart1Layout.createSequentialGroup()
                                .addComponent(btnCambiar12)
                                .addGap(9, 9, 9)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnlCart1Layout.setVerticalGroup(
            pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addComponent(txtEstado12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13)
                        .addGap(3, 3, 3))
                    .addGroup(pnlCart1Layout.createSequentialGroup()
                        .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar12)))
                .addGap(17, 17, 17))
        );

        pnlBase.add(pnlCart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 300, 280));

        btnTblJug.setText("Tabla de Jugadores");
        btnTblJug.setEnabled(false);
        pnlBase.add(btnTblJug, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 200, 40));

        pnlEnca.setBackground(new java.awt.Color(255, 255, 255));
        pnlEnca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_gingo_V.png"))); // NOI18N

        btnNuevJueg.setText("Nuevo Juego");

        btnGenCart.setText("Generar Cartones");
        btnGenCart.setEnabled(false);

        btnAsigCart.setText("Asignar Cartones");
        btnAsigCart.setEnabled(false);

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevJueg, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenCart, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsigCart, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(btnNuevJueg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBolita)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlBase.add(pnlEnca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1240, 70));

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
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pnlBase.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 80, 310, 620));

        pnlCart2.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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
        jScrollPane5.setViewportView(tblCart5);

        lblnumCarton4.setText("Cartón N°");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Estado:");

        jButton12.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton12.setText("Datos del jugador");
        jButton12.setEnabled(false);

        btnCambiar11.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar11.setText("Cambiar");
        btnCambiar11.setEnabled(false);

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Apuesta:");

        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEstado11.setEditable(false);
        txtEstado11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlCart2Layout = new javax.swing.GroupLayout(pnlCart2);
        pnlCart2.setLayout(pnlCart2Layout);
        pnlCart2Layout.setHorizontalGroup(
            pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart2Layout.createSequentialGroup()
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblnumCarton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart2Layout.createSequentialGroup()
                                .addComponent(btnCambiar11)
                                .addGap(9, 9, 9)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlCart2Layout.setVerticalGroup(
            pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addComponent(txtEstado11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addGap(3, 3, 3))
                    .addGroup(pnlCart2Layout.createSequentialGroup()
                        .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar11)))
                .addGap(17, 17, 17))
        );

        pnlBase.add(pnlCart2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, 280));

        pnlCart4.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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
        jScrollPane6.setViewportView(tblCart6);

        lblnumCarton5.setText("Cartón N°");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Estado:");

        txtEstado5.setEditable(false);
        txtEstado5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton6.setText("Datos del jugador");
        jButton6.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Apuesta:");

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar5.setText("Cambiar");
        btnCambiar5.setEnabled(false);

        javax.swing.GroupLayout pnlCart4Layout = new javax.swing.GroupLayout(pnlCart4);
        pnlCart4.setLayout(pnlCart4Layout);
        pnlCart4Layout.setHorizontalGroup(
            pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart4Layout.createSequentialGroup()
                .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblnumCarton5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart4Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart4Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart4Layout.createSequentialGroup()
                                .addComponent(btnCambiar5)
                                .addGap(8, 8, 8)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlCart4Layout.setVerticalGroup(
            pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnumCarton5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addComponent(txtEstado5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(109, 109, 109))
                    .addGroup(pnlCart4Layout.createSequentialGroup()
                        .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlBase.add(pnlCart4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 280));

        pnlCart5.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart7.setBackground(new java.awt.Color(255, 255, 255));
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
        tblCart7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart7.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart7.setRowSelectionAllowed(false);
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

        lblnumCarton6.setText("Cartón N°");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Estado:");

        txtEstado6.setEditable(false);
        txtEstado6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton7.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton7.setText("Datos del jugador");
        jButton7.setEnabled(false);

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Apuesta:");

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar6.setText("Cambiar");
        btnCambiar6.setEnabled(false);

        javax.swing.GroupLayout pnlCart5Layout = new javax.swing.GroupLayout(pnlCart5);
        pnlCart5.setLayout(pnlCart5Layout);
        pnlCart5Layout.setHorizontalGroup(
            pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart5Layout.createSequentialGroup()
                .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblnumCarton6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart5Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart5Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart5Layout.createSequentialGroup()
                                .addComponent(btnCambiar6)
                                .addGap(9, 9, 9)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnlCart5Layout.setVerticalGroup(
            pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addComponent(txtEstado6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addGap(109, 109, 109))
                    .addGroup(pnlCart5Layout.createSequentialGroup()
                        .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlBase.add(pnlCart5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 280));

        pnlCart3.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart8.setBackground(new java.awt.Color(255, 255, 255));
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
        tblCart8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart8.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart8.setRowSelectionAllowed(false);
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

        lblnumCarton7.setText("Cartón N°");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Estado:");

        txtEstado10.setEditable(false);
        txtEstado10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Apuesta:");

        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCambiar10.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar10.setText("Cambiar");
        btnCambiar10.setEnabled(false);

        jButton11.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton11.setText("Datos del jugador");
        jButton11.setEnabled(false);

        javax.swing.GroupLayout pnlCart3Layout = new javax.swing.GroupLayout(pnlCart3);
        pnlCart3.setLayout(pnlCart3Layout);
        pnlCart3Layout.setHorizontalGroup(
            pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart3Layout.createSequentialGroup()
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblnumCarton7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart3Layout.createSequentialGroup()
                                .addComponent(btnCambiar10)
                                .addGap(9, 9, 9)))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlCart3Layout.setVerticalGroup(
            pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addComponent(txtEstado10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11)
                        .addGap(3, 3, 3))
                    .addGroup(pnlCart3Layout.createSequentialGroup()
                        .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar10)))
                .addGap(17, 17, 17))
        );

        pnlBase.add(pnlCart3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, 280));

        pnlCart6.setBackground(new java.awt.Color(255, 255, 255));
        pnlCart6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        tblCart9.setBackground(new java.awt.Color(255, 255, 255));
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
        tblCart9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCart9.setGridColor(new java.awt.Color(102, 102, 102));
        tblCart9.setRowSelectionAllowed(false);
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

        lblnumCarton8.setText("Cartón N°");

        btnCambiar9.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar9.setText("Cambiar");
        btnCambiar9.setEnabled(false);

        jButton10.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jButton10.setText("Datos del jugador");
        jButton10.setEnabled(false);

        txtEstado9.setEditable(false);
        txtEstado9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Estado:");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Apuesta:");

        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout pnlCart6Layout = new javax.swing.GroupLayout(pnlCart6);
        pnlCart6.setLayout(pnlCart6Layout);
        pnlCart6Layout.setHorizontalGroup(
            pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart6Layout.createSequentialGroup()
                .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblnumCarton8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart6Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstado9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCart6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCart6Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCart6Layout.createSequentialGroup()
                                .addComponent(btnCambiar9)
                                .addGap(9, 9, 9)))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        pnlCart6Layout.setVerticalGroup(
            pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCart6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblnumCarton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addComponent(txtEstado9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10)
                        .addGap(3, 3, 3))
                    .addGroup(pnlCart6Layout.createSequentialGroup()
                        .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCart6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCambiar9)))
                .addGap(17, 17, 17))
        );

        pnlBase.add(pnlCart6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, -1, 280));

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

    private void tblCart4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart4MouseClicked

    private void tblNumJugMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNumJugMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblNumJugMouseClicked

    private void tblResumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblResumMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblResumMouseClicked

    private void tblCart5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart5MouseClicked

    private void tblCart6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart6MouseClicked

    private void tblCart7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart7MouseClicked

    private void tblCart8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart8MouseClicked

    private void tblCart9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblCart9MouseClicked

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
    private javax.swing.JButton btnCambiar10;
    private javax.swing.JButton btnCambiar11;
    private javax.swing.JButton btnCambiar12;
    private javax.swing.JButton btnCambiar5;
    private javax.swing.JButton btnCambiar6;
    private javax.swing.JButton btnCambiar9;
    private javax.swing.JButton btnComenzar;
    private javax.swing.JButton btnGenCart;
    private javax.swing.JButton btnNueBol;
    private javax.swing.JButton btnNuevJueg;
    private javax.swing.JButton btnTblJug;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblNumJug;
    private javax.swing.JLabel lblNumJug1;
    private javax.swing.JLabel lblnumCarton3;
    private javax.swing.JLabel lblnumCarton4;
    private javax.swing.JLabel lblnumCarton5;
    private javax.swing.JLabel lblnumCarton6;
    private javax.swing.JLabel lblnumCarton7;
    private javax.swing.JLabel lblnumCarton8;
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
    private javax.swing.JTable tblCart4;
    private javax.swing.JTable tblCart5;
    private javax.swing.JTable tblCart6;
    private javax.swing.JTable tblCart7;
    private javax.swing.JTable tblCart8;
    private javax.swing.JTable tblCart9;
    private javax.swing.JTable tblNumJug;
    private javax.swing.JTable tblResum;
    private javax.swing.JTextField txtBolita;
    private javax.swing.JTextField txtEstado10;
    private javax.swing.JTextField txtEstado11;
    private javax.swing.JTextField txtEstado12;
    private javax.swing.JTextField txtEstado5;
    private javax.swing.JTextField txtEstado6;
    private javax.swing.JTextField txtEstado9;
    // End of variables declaration//GEN-END:variables
}
