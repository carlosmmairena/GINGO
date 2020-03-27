/*
    Creamos la matriz tridimensional aquí y setteamos sus matrices a cada hilo
 */
package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Banca;
import logica.Cartones;
import logica.Jugador;
import logica.CeldaCustom;

/**
 *
 * @author Dixiana Gómez
 * @author Carlos Mairena
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private byte carTri[][][];
    private ArrayList<Cartones> hilos;
    private Banca banca;
    private ArrayList<Jugador> arregloJugad;
    private Jugador jugador;
    private String numCarton;

    public FrmPrincipal() {
        initComponents();
        this.jugador = new Jugador();
        this.numCarton = "";
        this.banca = new Banca();

        //Obtnemos la resolución de pantalla
        Dimension tamanioPan = Toolkit.getDefaultToolkit().getScreenSize();

        this.setSize(tamanioPan);
        this.setExtendedState(MAXIMIZED_BOTH);

        this.carTri = new byte[6][8][10];
        this.hilos = new ArrayList();
        this.arregloJugad = new ArrayList();
        tblCart1.setBackground(Color.WHITE);
        tblCart1.setForeground(Color.BLACK);
        tblCart2.setBackground(Color.WHITE);
        tblCart3.setBackground(Color.WHITE);
        tblCart4.setBackground(Color.WHITE);
        tblCart5.setBackground(Color.WHITE);
        tblCart6.setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBase = new javax.swing.JPanel();
        pnlCart1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCart1 = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
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
        tblCart2 = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        lblnumCarton2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnDatos2 = new javax.swing.JButton();
        btnCambiar2 = new javax.swing.JButton();
        lblApuesta2 = new javax.swing.JLabel();
        txtApuesta2 = new javax.swing.JTextField();
        txtEstado2 = new javax.swing.JTextField();
        pnlCart4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblCart4 = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        lblnumCarton4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtEstado4 = new javax.swing.JTextField();
        btnDatos4 = new javax.swing.JButton();
        lblApuesta4 = new javax.swing.JLabel();
        txtApuesta4 = new javax.swing.JTextField();
        btnCambiar4 = new javax.swing.JButton();
        pnlCart5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblCart5 = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        lblnumCarton5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEstado5 = new javax.swing.JTextField();
        btnDatos5 = new javax.swing.JButton();
        lblApuesta5 = new javax.swing.JLabel();
        txtApuesta5 = new javax.swing.JTextField();
        btnCambiar5 = new javax.swing.JButton();
        pnlCart3 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblCart3 = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        lblnumCarton3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtEstado3 = new javax.swing.JTextField();
        lblApuesta3 = new javax.swing.JLabel();
        txtApuesta3 = new javax.swing.JTextField();
        btnCambiar3 = new javax.swing.JButton();
        btnDatos3 = new javax.swing.JButton();
        pnlCart6 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblCart6 = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
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

        pnlBase.setBackground(new java.awt.Color(75, 80, 253));
        pnlBase.setMinimumSize(new java.awt.Dimension(1200, 650));
        pnlBase.setPreferredSize(new java.awt.Dimension(1274, 710));
        pnlBase.setRequestFocusEnabled(false);

        pnlCart1.setBackground(new java.awt.Color(184, 186, 253));
        pnlCart1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCart1.setMinimumSize(new java.awt.Dimension(300, 300));
        pnlCart1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblCart1.setMinimumSize(new java.awt.Dimension(748, 130));
        tblCart1.setPreferredSize(new java.awt.Dimension(748, 130));
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

        pnlCart1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 288, 160));

        lblnumCarton1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnumCarton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carton.png"))); // NOI18N
        lblnumCarton1.setText("Cartón N°");
        pnlCart1.add(lblnumCarton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 112, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Estado:");
        pnlCart1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 50, 26));

        txtEstado1.setEditable(false);
        txtEstado1.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtEstado1.setForeground(new java.awt.Color(58, 27, 234));
        txtEstado1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart1.add(txtEstado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 100, 23));

        lblApuesta1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta1.setText("Apuesta:");
        pnlCart1.add(lblApuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 23));

        txtApuesta1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart1.add(txtApuesta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 43, -1));

        btnCambiar1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar1.setText("Cambiar");
        btnCambiar1.setEnabled(false);
        pnlCart1.add(btnCambiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        btnDatos1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos1.setText("Datos del jugador");
        btnDatos1.setEnabled(false);
        btnDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos1ActionPerformed(evt);
            }
        });
        pnlCart1.add(btnDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        btnTblJug.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuarios.png"))); // NOI18N
        btnTblJug.setText("Tabla de Jugadores");
        btnTblJug.setEnabled(false);
        btnTblJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTblJugActionPerformed(evt);
            }
        });

        pnlEnca.setBackground(new java.awt.Color(132, 136, 255));
        pnlEnca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblGingo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGingo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gingo.png"))); // NOI18N

        btnNuevJueg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevoJuego.png"))); // NOI18N
        btnNuevJueg.setText("Nuevo Juego");
        btnNuevJueg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevJuegActionPerformed(evt);
            }
        });

        btnGenCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/generarCartones.png"))); // NOI18N
        btnGenCart.setText("Generar Cartones");
        btnGenCart.setEnabled(false);
        btnGenCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenCartActionPerformed(evt);
            }
        });

        btnAsigCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/asignarCartones.png"))); // NOI18N
        btnAsigCart.setText("Asignar Cartones");
        btnAsigCart.setEnabled(false);
        btnAsigCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsigCartActionPerformed(evt);
            }
        });

        btnComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciarJuego.png"))); // NOI18N
        btnComenzar.setText("Comenzar Juego");
        btnComenzar.setEnabled(false);
        btnComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComenzarActionPerformed(evt);
            }
        });

        btnNueBol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bolitas.png"))); // NOI18N
        btnNueBol.setText("Nueva Bolita");
        btnNueBol.setEnabled(false);
        btnNueBol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueBolActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBolita, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNueBol, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        pnlEncaLayout.setVerticalGroup(
            pnlEncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlEncaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNueBol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsigCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevJueg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComenzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBolita)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(lblGingo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(184, 186, 253));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNumJug.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
        tblNumJug.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblNumJug.setFocusable(false);
        tblNumJug.setGridColor(new java.awt.Color(102, 102, 102));
        tblNumJug.setRowHeight(25);
        tblNumJug.setRowSelectionAllowed(false);
        tblNumJug.setSelectionBackground(new java.awt.Color(184, 186, 253));
        tblNumJug.setShowGrid(true);
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
        tblResum.setSelectionBackground(new java.awt.Color(184, 186, 253));
        tblResum.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblResum.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblResum.setShowGrid(true);
        jScrollPane8.setViewportView(tblResum);

        lblTotal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("Total en Banca");

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(58, 27, 234));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNumJug, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblNumJug1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        pnlCart2.setBackground(new java.awt.Color(184, 186, 253));
        pnlCart2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCart2.setMinimumSize(new java.awt.Dimension(300, 300));
        pnlCart2.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlCart2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblCart2.setMinimumSize(new java.awt.Dimension(748, 130));
        tblCart2.setPreferredSize(new java.awt.Dimension(748, 130));
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

        pnlCart2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 160));

        lblnumCarton2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnumCarton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carton.png"))); // NOI18N
        lblnumCarton2.setText("Cartón N°");
        pnlCart2.add(lblnumCarton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 94, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Estado:");
        pnlCart2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 50, 26));

        btnDatos2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos2.setText("Datos del jugador");
        btnDatos2.setEnabled(false);
        btnDatos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos2ActionPerformed(evt);
            }
        });
        pnlCart2.add(btnDatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        btnCambiar2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar2.setText("Cambiar");
        btnCambiar2.setEnabled(false);
        pnlCart2.add(btnCambiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        lblApuesta2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta2.setText("Apuesta:");
        pnlCart2.add(lblApuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 23));

        txtApuesta2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart2.add(txtApuesta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 43, -1));

        txtEstado2.setEditable(false);
        txtEstado2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtEstado2.setForeground(new java.awt.Color(58, 27, 234));
        txtEstado2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart2.add(txtEstado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 105, 23));

        pnlCart4.setBackground(new java.awt.Color(184, 186, 253));
        pnlCart4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCart4.setMinimumSize(new java.awt.Dimension(300, 300));
        pnlCart4.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlCart4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblCart4.setMinimumSize(new java.awt.Dimension(748, 130));
        tblCart4.setPreferredSize(new java.awt.Dimension(748, 130));
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

        pnlCart4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 160));

        lblnumCarton4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnumCarton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carton.png"))); // NOI18N
        lblnumCarton4.setText("Cartón N°");
        pnlCart4.add(lblnumCarton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, 94, 19));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Estado:");
        pnlCart4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 215, 54, 26));

        txtEstado4.setEditable(false);
        txtEstado4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtEstado4.setForeground(new java.awt.Color(58, 27, 234));
        txtEstado4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart4.add(txtEstado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 215, 105, -1));

        btnDatos4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos4.setText("Datos del jugador");
        btnDatos4.setEnabled(false);
        btnDatos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos4ActionPerformed(evt);
            }
        });
        pnlCart4.add(btnDatos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 241, -1, -1));

        lblApuesta4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta4.setText("Apuesta:");
        pnlCart4.add(lblApuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 215, -1, 23));

        txtApuesta4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart4.add(txtApuesta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 217, 43, -1));

        btnCambiar4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar4.setText("Cambiar");
        btnCambiar4.setEnabled(false);
        pnlCart4.add(btnCambiar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 247, -1, -1));

        pnlCart5.setBackground(new java.awt.Color(184, 186, 253));
        pnlCart5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCart5.setMinimumSize(new java.awt.Dimension(300, 300));
        pnlCart5.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlCart5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblCart5.setMinimumSize(new java.awt.Dimension(748, 130));
        tblCart5.setPreferredSize(new java.awt.Dimension(748, 130));
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

        pnlCart5.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 41, 290, 160));

        lblnumCarton5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnumCarton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carton.png"))); // NOI18N
        lblnumCarton5.setText("Cartón N°");
        pnlCart5.add(lblnumCarton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 99, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Estado:");
        pnlCart5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 54, 26));

        txtEstado5.setEditable(false);
        txtEstado5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtEstado5.setForeground(new java.awt.Color(58, 27, 234));
        txtEstado5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart5.add(txtEstado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 105, -1));

        btnDatos5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos5.setText("Datos del jugador");
        btnDatos5.setEnabled(false);
        btnDatos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos5ActionPerformed(evt);
            }
        });
        pnlCart5.add(btnDatos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblApuesta5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta5.setText("Apuesta:");
        pnlCart5.add(lblApuesta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 23));

        txtApuesta5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart5.add(txtApuesta5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 43, -1));

        btnCambiar5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar5.setText("Cambiar");
        btnCambiar5.setEnabled(false);
        pnlCart5.add(btnCambiar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        pnlCart3.setBackground(new java.awt.Color(184, 186, 253));
        pnlCart3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCart3.setMinimumSize(new java.awt.Dimension(300, 300));
        pnlCart3.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlCart3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblCart3.setMinimumSize(new java.awt.Dimension(748, 130));
        tblCart3.setPreferredSize(new java.awt.Dimension(748, 130));
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

        pnlCart3.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 288, 160));

        lblnumCarton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnumCarton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carton.png"))); // NOI18N
        lblnumCarton3.setText("Cartón N°");
        pnlCart3.add(lblnumCarton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 94, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Estado:");
        pnlCart3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 54, 26));

        txtEstado3.setEditable(false);
        txtEstado3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtEstado3.setForeground(new java.awt.Color(58, 27, 234));
        txtEstado3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart3.add(txtEstado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 105, 23));

        lblApuesta3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta3.setText("Apuesta:");
        pnlCart3.add(lblApuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, 23));

        txtApuesta3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart3.add(txtApuesta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 43, -1));

        btnCambiar3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar3.setText("Cambiar");
        btnCambiar3.setEnabled(false);
        pnlCart3.add(btnCambiar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        btnDatos3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos3.setText("Datos del jugador");
        btnDatos3.setEnabled(false);
        btnDatos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos3ActionPerformed(evt);
            }
        });
        pnlCart3.add(btnDatos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        pnlCart6.setBackground(new java.awt.Color(184, 186, 253));
        pnlCart6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pnlCart6.setMinimumSize(new java.awt.Dimension(300, 300));
        pnlCart6.setPreferredSize(new java.awt.Dimension(300, 300));
        pnlCart6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        tblCart6.setMinimumSize(new java.awt.Dimension(748, 130));
        tblCart6.setPreferredSize(new java.awt.Dimension(748, 130));
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

        pnlCart6.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 41, 290, 160));

        lblnumCarton6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblnumCarton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/carton.png"))); // NOI18N
        lblnumCarton6.setText("Cartón N°");
        pnlCart6.add(lblnumCarton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 97, -1));

        btnCambiar6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnCambiar6.setText("Cambiar");
        btnCambiar6.setEnabled(false);
        pnlCart6.add(btnCambiar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        btnDatos6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        btnDatos6.setText("Datos del jugador");
        btnDatos6.setEnabled(false);
        btnDatos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatos6ActionPerformed(evt);
            }
        });
        pnlCart6.add(btnDatos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        txtEstado6.setEditable(false);
        txtEstado6.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        txtEstado6.setForeground(new java.awt.Color(58, 27, 234));
        txtEstado6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart6.add(txtEstado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 105, 23));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Estado:");
        pnlCart6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 54, 26));

        lblApuesta6.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        lblApuesta6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApuesta6.setText("Apuesta:");
        pnlCart6.add(lblApuesta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, 23));

        txtApuesta6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnlCart6.add(txtApuesta6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 43, -1));

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCart4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCart2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addComponent(pnlCart5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCart3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCart6, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTblJug, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(355, 355, 355)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addComponent(pnlEnca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(pnlEnca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(pnlCart1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(pnlCart4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(pnlCart2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(pnlCart5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlBaseLayout.createSequentialGroup()
                                .addComponent(pnlCart3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(pnlCart6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnTblJug, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

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

    private void btnNuevJuegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevJuegActionPerformed
        this.nuevoJuego();
    }//GEN-LAST:event_btnNuevJuegActionPerformed

    private void btnGenCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenCartActionPerformed
        this.generarCartones();
    }//GEN-LAST:event_btnGenCartActionPerformed

    private void btnAsigCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsigCartActionPerformed
        this.asignarJugador();
    }//GEN-LAST:event_btnAsigCartActionPerformed

    private void btnDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatos1ActionPerformed

        Jugador jug = new Jugador();
        for (Jugador ju : arregloJugad) {
            if (ju.getNumCarton() == 1) {
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
            if (ju.getNumCarton() == 2) {
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
            if (ju.getNumCarton() == 3) {
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
            if (ju.getNumCarton() == 4) {
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
            if (ju.getNumCarton() == 5) {
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
            if (ju.getNumCarton() == 6) {
                jug = ju;
                break;
            }
        }
        DlgDatosJu datosJu = new DlgDatosJu(this, true, jug);
        datosJu.setVisible(true);

    }//GEN-LAST:event_btnDatos6ActionPerformed

    private void btnTblJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTblJugActionPerformed

        DlgTablaJugadores tablaJug = new DlgTablaJugadores(this, true, arregloJugad);
        tablaJug.setVisible(true);

    }//GEN-LAST:event_btnTblJugActionPerformed


    private void tblCart1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart1MouseClicked
        if (jugador.getNumCarton() == 1) {
            this.clickTabla1();
        } else {
            JOptionPane.showMessageDialog(this, "No es este cartón el seleccionado");
            System.out.println("No es este cartón el seleccionado");
        }
    }//GEN-LAST:event_tblCart1MouseClicked

    private void tblCart2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart2MouseClicked
        if (jugador.getNumCarton() == 2) {
            this.clickTabla2();
        } else {
            JOptionPane.showMessageDialog(this, "No es este cartón el seleccionado");
            System.out.println("No es este cartón el seleccionado");
        }
    }//GEN-LAST:event_tblCart2MouseClicked

    private void tblCart3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart3MouseClicked
        if (jugador.getNumCarton() == 3) {
            this.clickTabla3();
        } else {
            JOptionPane.showMessageDialog(this, "No es este cartón el seleccionado");
            System.out.println("No es este cartón el seleccionado");
        }
    }//GEN-LAST:event_tblCart3MouseClicked

    private void tblCart4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart4MouseClicked
        if (jugador.getNumCarton() == 4) {
            this.clickTabla4();
        } else {
            JOptionPane.showMessageDialog(this, "No es este cartón el seleccionado");
            System.out.println("No es este cartón el seleccionado");
        }
    }//GEN-LAST:event_tblCart4MouseClicked

    private void tblCart5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart5MouseClicked
        if (jugador.getNumCarton() == 5) {
            this.clickTabla5();
        } else {
            JOptionPane.showMessageDialog(this, "No es este cartón el seleccionado");
            System.out.println("No es este cartón el seleccionado");
        }
    }//GEN-LAST:event_tblCart5MouseClicked

    private void tblCart6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCart6MouseClicked
        if (jugador.getNumCarton() == 6) {
            this.clickTabla6();
        } else {
            JOptionPane.showMessageDialog(this, "No es este cartón el seleccionado");
            System.out.println("No es este cartón el seleccionado");
        }
    }//GEN-LAST:event_tblCart6MouseClicked


    private void btnNueBolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueBolActionPerformed
        // Retornamos la nueva bolita
        int bol = this.banca.getCantBols();
        System.out.println("Bolita generada: " + bol);
        txtBolita.setText(bol + "");

    }//GEN-LAST:event_btnNueBolActionPerformed

    private void btnComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComenzarActionPerformed

        int opc = JOptionPane.showConfirmDialog(this, "¿Desea iniciar el juego?", "Iniciar Juego", JOptionPane.YES_NO_OPTION);

        if (opc == JOptionPane.YES_OPTION) {
            this.iniciarJuego();
        }

    }//GEN-LAST:event_btnComenzarActionPerformed

    /**
     * Se llama cuando se arranca el juego
     */
    private void iniciarJuego() {

        System.out.println("Inciamos los hilos que se generaron y están el vector");

        for (int i = 0; i < hilos.size(); i++) {
            hilos.get(i).start();
        }
        this.btnNueBol.setEnabled(true);

    }

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
     * Se utiliza para que el usuario que seleccionó el cartón 1 pueda
     * seleccionar sus números
     */
    private void clickTabla1() {

        // Cuando se sobre pase el tamaño, llega la excepción, de tipo ArrayIndexOutOfBoundsException
        try {

            byte num = (byte) tblCart1.getValueAt(tblCart1.getSelectedRow(), tblCart1.getSelectedColumn());

            // Se llama el método que inserta o elimina un número
            jugador.agregaNumero(num);
            // Enviamos el valor de la celda y el vector de la celda
            CeldaCustom celdaPerso = new CeldaCustom(num, jugador.getNumSelec(),
                    tblCart1.getSelectedRow(), tblCart1.getSelectedColumn());

            // Llamamos al método que recorre toda la columna y no solo la celda
            tblCart1.getColumnModel().getColumn(tblCart1.getSelectedColumn()).
                    setCellRenderer(celdaPerso);

            tblCart1.selectAll();

        } catch (ArrayIndexOutOfBoundsException ex) {

            int opc = JOptionPane.showConfirmDialog(this, "Ha seleccionado la totalidad de 10 números.\n"
                    + "¿Desea modificar su selección?", "Números completados", JOptionPane.YES_NO_OPTION);

            // Si ya está todos los números, entonces creamos el hilo
            if (opc == JOptionPane.NO_OPTION) {

                Cartones carton = new Cartones("Vendido", Byte.parseByte("1"), tblCart1, jugador);

                this.hilos.add(carton);
                this.hilos.trimToSize();
                arregloJugad.add(jugador);
                arregloJugad.trimToSize();

                this.jugador = new Jugador();
                btnDatos1.setEnabled(true);
                btnAsigCart.setEnabled(true);
                this.verificaLisJuga();
            }

        }

    }

    /**
     * Se utiliza para que el usuario que seleccionó el cartón 2 pueda
     * seleccionar sus números
     */
    private void clickTabla2() {

        // Cuando se sobre pase el tamaño, llega la excepción, de tipo ArrayIndexOutOfBoundsException
        try {

            byte num = (byte) tblCart2.getValueAt(tblCart2.getSelectedRow(), tblCart2.getSelectedColumn());

            // Se llama el método que inserta o elimina un número
            jugador.agregaNumero(num);
            // Enviamos el valor de la celda y el vector de la celda
            CeldaCustom celdaPerso = new CeldaCustom(num, jugador.getNumSelec(),
                    tblCart2.getSelectedRow(), tblCart2.getSelectedColumn());

            // Llamamos al método que recorre toda la columna y no solo la celda
            tblCart2.getColumnModel().getColumn(tblCart2.getSelectedColumn()).
                    setCellRenderer(celdaPerso);

            tblCart2.selectAll();

        } catch (ArrayIndexOutOfBoundsException ex) {

            int opc = JOptionPane.showConfirmDialog(this, "Ha seleccionado la totalidad de 10 números.\n"
                    + "¿Desea modificar su selección?", "Números completados", JOptionPane.YES_NO_OPTION);

            // Si ya está todos los números, entonces creamos el hilo
            if (opc == JOptionPane.NO_OPTION) {

                Cartones carton = new Cartones("Vendido", Byte.parseByte("2"), tblCart2, jugador);

                this.hilos.add(carton);
                this.hilos.trimToSize();
                arregloJugad.add(jugador);
                arregloJugad.trimToSize();

                this.jugador = new Jugador();
                btnDatos2.setEnabled(true);
                btnAsigCart.setEnabled(true);
                this.verificaLisJuga();
            }
        }
    }

    /**
     * Se utiliza para que el usuario que seleccionó el cartón 3 pueda
     * seleccionar sus números
     */
    private void clickTabla3() {

        // Cuando se sobre pase el tamaño, llega la excepción, de tipo ArrayIndexOutOfBoundsException
        try {

            byte num = (byte) tblCart3.getValueAt(tblCart3.getSelectedRow(), tblCart3.getSelectedColumn());

            // Se llama el método que inserta o elimina un número
            jugador.agregaNumero(num);
            // Enviamos el valor de la celda y el vector de la celda
            CeldaCustom celdaPerso = new CeldaCustom(num, jugador.getNumSelec(),
                    tblCart3.getSelectedRow(), tblCart3.getSelectedColumn());

            // Llamamos al método que recorre toda la columna y no solo la celda
            tblCart3.getColumnModel().getColumn(tblCart3.getSelectedColumn()).
                    setCellRenderer(celdaPerso);

            tblCart3.selectAll();

        } catch (ArrayIndexOutOfBoundsException ex) {

            int opc = JOptionPane.showConfirmDialog(this, "Ha seleccionado la totalidad de 10 números.\n"
                    + "¿Desea modificar su selección?", "Números completados", JOptionPane.YES_NO_OPTION);

            // Si ya está todos los números, entonces creamos el hilo
            if (opc == JOptionPane.NO_OPTION) {

                Cartones carton = new Cartones("Vendido", Byte.parseByte("3"), tblCart3, jugador);

                this.hilos.add(carton);
                this.hilos.trimToSize();
                arregloJugad.add(jugador);
                arregloJugad.trimToSize();

                this.jugador = new Jugador();
                btnDatos3.setEnabled(true);
                btnAsigCart.setEnabled(true);
                this.verificaLisJuga();
            }
        }
    }

    /**
     * Se utiliza para que el usuario que seleccionó el cartón 4 pueda
     * seleccionar sus números
     */
    private void clickTabla4() {

        // Cuando se sobre pase el tamaño, llega la excepción, de tipo ArrayIndexOutOfBoundsException
        try {

            byte num = (byte) tblCart4.getValueAt(tblCart4.getSelectedRow(), tblCart4.getSelectedColumn());

            // Se llama el método que inserta o elimina un número
            jugador.agregaNumero(num);
            // Enviamos el valor de la celda y el vector de la celda
            CeldaCustom celdaPerso = new CeldaCustom(num, jugador.getNumSelec(),
                    tblCart4.getSelectedRow(), tblCart4.getSelectedColumn());

            // Llamamos al método que recorre toda la columna y no solo la celda
            tblCart4.getColumnModel().getColumn(tblCart4.getSelectedColumn()).
                    setCellRenderer(celdaPerso);

            tblCart4.selectAll();

        } catch (ArrayIndexOutOfBoundsException ex) {

            int opc = JOptionPane.showConfirmDialog(this, "Ha seleccionado la totalidad de 10 números.\n"
                    + "¿Desea modificar su selección?", "Números completados", JOptionPane.YES_NO_OPTION);

            // Si ya está todos los números, entonces creamos el hilo
            if (opc == JOptionPane.NO_OPTION) {

                Cartones carton = new Cartones("Vendido", Byte.parseByte("4"), tblCart4, jugador);

                this.hilos.add(carton);
                this.hilos.trimToSize();
                arregloJugad.add(jugador);
                arregloJugad.trimToSize();

                this.jugador = new Jugador();
                btnDatos4.setEnabled(true);
                btnAsigCart.setEnabled(true);
                this.verificaLisJuga();
            }
        }
    }

    /**
     * Se utiliza para que el usuario que seleccionó el cartón 5 pueda
     * seleccionar sus números
     */
    private void clickTabla5() {

        // Cuando se sobre pase el tamaño, llega la excepción, de tipo ArrayIndexOutOfBoundsException
        try {

            byte num = (byte) tblCart5.getValueAt(tblCart5.getSelectedRow(), tblCart5.getSelectedColumn());

            // Se llama el método que inserta o elimina un número
            jugador.agregaNumero(num);
            // Enviamos el valor de la celda y el vector de la celda
            CeldaCustom celdaPerso = new CeldaCustom(num, jugador.getNumSelec(),
                    tblCart5.getSelectedRow(), tblCart5.getSelectedColumn());

            // Llamamos al método que recorre toda la columna y no solo la celda
            tblCart5.getColumnModel().getColumn(tblCart5.getSelectedColumn()).
                    setCellRenderer(celdaPerso);

            tblCart5.selectAll();

        } catch (ArrayIndexOutOfBoundsException ex) {

            int opc = JOptionPane.showConfirmDialog(this, "Ha seleccionado la totalidad de 10 números.\n"
                    + "¿Desea modificar su selección?", "Números completados", JOptionPane.YES_NO_OPTION);

            // Si ya está todos los números, entonces creamos el hilo
            if (opc == JOptionPane.NO_OPTION) {

                Cartones carton = new Cartones("Vendido", Byte.parseByte("5"), tblCart5, jugador);

                this.hilos.add(carton);
                this.hilos.trimToSize();
                arregloJugad.add(jugador);
                arregloJugad.trimToSize();

                this.jugador = new Jugador();
                btnDatos5.setEnabled(true);
                btnAsigCart.setEnabled(true);
                this.verificaLisJuga();
            }
        }
    }

    /**
     * Se utiliza para que el usuario que seleccionó el cartón 6 pueda
     * seleccionar sus números
     */
    private void clickTabla6() {

        // Cuando se sobre pase el tamaño, llega la excepción, de tipo ArrayIndexOutOfBoundsException
        try {

            byte num = (byte) tblCart6.getValueAt(tblCart6.getSelectedRow(), tblCart6.getSelectedColumn());

            // Se llama el método que inserta o elimina un número
            jugador.agregaNumero(num);
            // Enviamos el valor de la celda y el vector de la celda
            CeldaCustom celdaPerso = new CeldaCustom(num, jugador.getNumSelec(),
                    tblCart6.getSelectedRow(), tblCart6.getSelectedColumn());

            // Llamamos al método que recorre toda la columna y no solo la celda
            tblCart6.getColumnModel().getColumn(tblCart6.getSelectedColumn()).
                    setCellRenderer(celdaPerso);

            tblCart6.selectAll();

        } catch (ArrayIndexOutOfBoundsException ex) {

            int opc = JOptionPane.showConfirmDialog(this, "Ha seleccionado la totalidad de 10 números.\n"
                    + "¿Desea modificar su selección?", "Números completados", JOptionPane.YES_NO_OPTION);

            // Si ya está todos los números, entonces creamos el hilo
            if (opc == JOptionPane.NO_OPTION) {

                Cartones carton = new Cartones("Vendido", Byte.parseByte("6"), tblCart6, jugador);

                this.hilos.add(carton);
                this.hilos.trimToSize();
                arregloJugad.add(jugador);
                arregloJugad.trimToSize();

                this.jugador = new Jugador();
                btnDatos6.setEnabled(true);
                btnAsigCart.setEnabled(true);
                this.verificaLisJuga();
            }
        }
    }

    /**
     * Se llama para asignar un jugador registrado al cartón
     */
    private void asignarJugador() {

        DlgRegistro registrar = new DlgRegistro(this, true, cartonesDisponibles());
        registrar.setVisible(true);

        // Si ha seleccionado guardar el registro
        if (registrar.isGuardado()) {
            this.numCarton = registrar.getCmbCarton().getSelectedItem().toString();
            this.jugador = registrar.getJugador();
            this.seleCarton();
            this.btnAsigCart.setEnabled(false); // Se desactiva para que no registren otro jugador sin terminar este
        }
    }

    /**
     * Selecciona el cartón para asignarle el jugador recién registrado
     *
     * @param numCarton
     * @param j
     */
    private void seleCarton() {

        switch (numCarton) {
            case "Cartón N° 1":
                jugador.setNumCarton(Byte.parseByte("1"));
                txtEstado1.setText("Vendido");
                btnCambiar1.setEnabled(true);
                break;

            case "Cartón N° 2":
                jugador.setNumCarton(Byte.parseByte("2"));
                txtEstado2.setText("Vendido");
                btnCambiar2.setEnabled(true);
                break;

            case "Cartón N° 3":
                jugador.setNumCarton(Byte.parseByte("3"));
                txtEstado3.setText("Vendido");
                btnCambiar3.setEnabled(true);
                break;

            case "Cartón N° 4":
                jugador.setNumCarton(Byte.parseByte("4"));
                txtEstado4.setText("Vendido");
                btnCambiar4.setEnabled(true);
                break;

            case "Cartón N° 5":
                jugador.setNumCarton(Byte.parseByte("5"));
                txtEstado5.setText("Vendido");
                btnCambiar5.setEnabled(true);
                break;

            case "Cartón N° 6":
                jugador.setNumCarton(Byte.parseByte("6"));
                txtEstado6.setText("Vendido");
                btnCambiar6.setEnabled(true);
                break;
        }
    }

    /**
     * Revisa los cartones disponibles y los retorna en un arreglo de string
     *
     * @return
     */
    private ArrayList<String> cartonesDisponibles() {

        ArrayList<String> cartones = new ArrayList();

        for (int i = 0; i < hilos.size(); i++) {
            if (hilos.get(i).getEstado().equals("Vendido")) {
                cartones.add("Cartón N° " + hilos.get(i).getNumCarton());
            }
        }
        cartones.trimToSize();
        return cartones;
    }

    /**
     * Rellena la matriz tridimensional, generando cada número aleatoriamente
     */
    private void generarCartones() {

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
                tblCart1.setValueAt(carTri[0][fil][col], fil, col);
                tblCart2.setValueAt(carTri[1][fil][col], fil, col);
                tblCart3.setValueAt(carTri[2][fil][col], fil, col);
                tblCart4.setValueAt(carTri[3][fil][col], fil, col);
                tblCart5.setValueAt(carTri[4][fil][col], fil, col);
                tblCart6.setValueAt(carTri[5][fil][col], fil, col);
            }
        }

        this.btnGenCart.setEnabled(false);
        this.btnAsigCart.setEnabled(true);
    }

    /**
     * Verifica si un número generado se repite en la matriz indicada posi, en
     * caso de que existe no se agrega... falta mejorar a que lo remueva
     *
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
    private void nuevoJuego() {

        banca = new Banca();
        this.llenarCampos();
        btnNuevJueg.setEnabled(false);
        btnGenCart.setEnabled(true);
    }

    /**
     * Método que asina los valores principales de la GUI principal
     */
    private void llenarCampos() {

        lblnumCarton1.setText("Cartón N° 1");
        lblnumCarton2.setText("Cartón N° 2");
        lblnumCarton3.setText("Cartón N° 3");
        lblnumCarton4.setText("Cartón N° 4");
        lblnumCarton5.setText("Cartón N° 5");
        lblnumCarton6.setText("Cartón N° 6");

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

    /**
     * Verifica si en la lista de los jugadores existe al menos 1 registrado
     */
    private void verificaLisJuga() {
        if (arregloJugad.size() > 0) {
            btnComenzar.setEnabled(true);
            btnTblJug.setEnabled(true);
        }
    }
}
