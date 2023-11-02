package View;

import Model.DatosGraficos;
import Model.PintarDibujo;
import Model.Algoritmo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;


/**
 *
 * @author EDII
 */
public class Inicio extends javax.swing.JFrame {

    private int Numerotope = 0;//Numero de nodos 
    
    DatosGraficos arboles = new DatosGraficos();

    public static void PintarFiguras(int tope, DatosGraficos arboles) {//pinta lo q esta antes en el panel 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if (arboles.getmAdyacencia(j, k) == 1) {
                    PintarDibujo.pinta_Linea(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getCordeX(k), arboles.getCordeY(k), arboles.getmCoeficiente(j, k));
                }
            }
        }
        for (int j = 0; j < tope; j++) {
            PintarDibujo.pinta_Circulo(jPanel1.getGraphics(), arboles.getCordeX(j), arboles.getCordeY(j), arboles.getNombre(j));
        }

    }

    public Inicio() {
        initComponents();
        cboDestino.setEnabled(false);
        cboOrigen.setEnabled(false);
        btnBuscar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtKMAcumulados = new javax.swing.JTextArea();
        MostrarCaminos = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cboDestino = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        cboOrigen = new javax.swing.JComboBox<>();
        escudo = new javax.swing.JLabel();
        colorNodoVisitado = new javax.swing.JLabel();
        colorDestino = new javax.swing.JLabel();
        colorOrigen = new javax.swing.JLabel();
        txtColorNodoRecorrido = new javax.swing.JLabel();
        txtColorDestino = new javax.swing.JLabel();
        txtColorOrigen = new javax.swing.JLabel();
        txtDestino = new javax.swing.JLabel();
        kmRecorridos = new javax.swing.JLabel();
        txtOrigen = new javax.swing.JLabel();
        kmRecorridos1 = new javax.swing.JLabel();
        LateralSuperior = new javax.swing.JLabel();
        LateralSuperior1 = new javax.swing.JLabel();
        kmRecorridos2 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        txtKMAcumulados.setBackground(new java.awt.Color(153, 255, 153));
        txtKMAcumulados.setColumns(20);
        txtKMAcumulados.setRows(5);
        jScrollPane1.setViewportView(txtKMAcumulados);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MostrarCaminos.setBackground(new java.awt.Color(255, 0, 0));
        MostrarCaminos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MostrarCaminos.setForeground(new java.awt.Color(255, 255, 255));
        MostrarCaminos.setText("Mostrar Caminos");
        MostrarCaminos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarCaminosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarCaminos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 220, 50));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setBackground(new java.awt.Color(255, 51, 51));
        BotonSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("X");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 50, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Screenshot_50.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 1120, 930));

        cboDestino.setBackground(new java.awt.Color(255, 255, 0));
        cboDestino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboDestino.setForeground(new java.awt.Color(0, 0, 153));
        cboDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro - La Molina", "Paradero 2 - Ovalo La Fontana", "Hotel Javier Prado", "Universidad de Lima", "Paradero 5 - San Telmo", "Universidad San Ignacio de Loyola", "Paradero 7 - Los Condes", "Molina Plaza", "Universidad de San Martín de Porres", "Ovalo de los Condores", "Hotel La Molina", "BCP Sede Central", "Wong La Planicie", "Mirador La Laguna", "Rinconada Country Club" }));
        cboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(cboDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 460, 50));

        btnBuscar.setBackground(new java.awt.Color(255, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 180, 50));

        cboOrigen.setBackground(new java.awt.Color(255, 255, 0));
        cboOrigen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cboOrigen.setForeground(new java.awt.Color(0, 0, 153));
        cboOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metro - La Molina", "Paradero 2 - Ovalo La Fontana", "Hotel Javier Prado", "Universidad de Lima", "Paradero 5 - San Telmo", "Universidad San Ignacio de Loyola", "Paradero 7 - Los Condes", "Molina Plaza", "Universidad de San Martín de Porres", "Ovalo de los Condores", "Hotel La Molina", "BCP Sede Central", "Wong La Planicie", "Mirador La Laguna", "Rinconada Country Club" }));
        cboOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(cboOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 460, 50));

        escudo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escudoLM.png"))); // NOI18N
        getContentPane().add(escudo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 240, 330));

        colorNodoVisitado.setBackground(new java.awt.Color(0, 51, 255));
        colorNodoVisitado.setOpaque(true);
        getContentPane().add(colorNodoVisitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 20, 20));

        colorDestino.setBackground(new java.awt.Color(51, 255, 51));
        colorDestino.setOpaque(true);
        getContentPane().add(colorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 20, 20));

        colorOrigen.setBackground(new java.awt.Color(255, 0, 0));
        colorOrigen.setOpaque(true);
        getContentPane().add(colorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 20, 20));

        txtColorNodoRecorrido.setBackground(new java.awt.Color(153, 255, 153));
        txtColorNodoRecorrido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorNodoRecorrido.setForeground(new java.awt.Color(51, 0, 204));
        txtColorNodoRecorrido.setText("Nodo Recorrido ---->");
        txtColorNodoRecorrido.setOpaque(true);
        getContentPane().add(txtColorNodoRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 190, 40));

        txtColorDestino.setBackground(new java.awt.Color(153, 255, 153));
        txtColorDestino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorDestino.setForeground(new java.awt.Color(51, 0, 204));
        txtColorDestino.setText("Destino-------------->");
        txtColorDestino.setOpaque(true);
        getContentPane().add(txtColorDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 190, 30));

        txtColorOrigen.setBackground(new java.awt.Color(153, 255, 153));
        txtColorOrigen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtColorOrigen.setForeground(new java.awt.Color(51, 0, 204));
        txtColorOrigen.setText("Origen--------------->");
        txtColorOrigen.setOpaque(true);
        getContentPane().add(txtColorOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 190, 40));

        txtDestino.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtDestino.setForeground(new java.awt.Color(255, 255, 255));
        txtDestino.setText("Seleccionar Destino:");
        getContentPane().add(txtDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 260, 40));

        kmRecorridos.setBackground(new java.awt.Color(153, 255, 153));
        kmRecorridos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos.setOpaque(true);
        getContentPane().add(kmRecorridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 390, 40));

        txtOrigen.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtOrigen.setForeground(new java.awt.Color(255, 255, 255));
        txtOrigen.setText("Seleccionar Origen:");
        getContentPane().add(txtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 250, 40));

        kmRecorridos1.setBackground(new java.awt.Color(153, 255, 153));
        kmRecorridos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos1.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos1.setOpaque(true);
        getContentPane().add(kmRecorridos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 140, 40));

        LateralSuperior.setBackground(new java.awt.Color(153, 255, 153));
        LateralSuperior.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior.setOpaque(true);
        getContentPane().add(LateralSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 930));

        LateralSuperior1.setBackground(new java.awt.Color(153, 255, 153));
        LateralSuperior1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LateralSuperior1.setForeground(new java.awt.Color(0, 0, 153));
        LateralSuperior1.setOpaque(true);
        getContentPane().add(LateralSuperior1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 560, 360));

        kmRecorridos2.setBackground(new java.awt.Color(153, 255, 153));
        kmRecorridos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        kmRecorridos2.setForeground(new java.awt.Color(0, 0, 153));
        kmRecorridos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kmRecorridos2.setText("Distancia Recorrida:");
        kmRecorridos2.setOpaque(true);
        getContentPane().add(kmRecorridos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 510, 30));

        txtBuscar.setBackground(new java.awt.Color(51, 51, 51));
        txtBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.setText("BUSCAR EL CAMINO MÁS CORTO");
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 320, 30));

        Fondo.setBackground(new java.awt.Color(255, 255, 153));
        Fondo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/verde.jpg"))); // NOI18N
        Fondo.setOpaque(true);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-560, -300, 1120, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarCaminosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarCaminosActionPerformed
        //jMenuItem2.setEnabled(false);
        cboOrigen.setEnabled(true);
        MostrarCaminos.setEnabled(false);
        MostrarCaminos.setVisible(false);
        txtKMAcumulados.setEnabled(false);

        jPanel1.paint(jPanel1.getGraphics());
        
        
        int Matriz[][] = {
            {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0}
        };

        double coe[][] = 
        {
            {0, 1.2, 1, 0, 2.6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1.2, 0, 0, 0, 0, 0.9, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1.5, 0, 0, 3.6, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1.5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0},
            {2.6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0.7, 0, 0, 0, 0},
            {0, 0.9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3.7, 0, 0, 0},
            {0, 0, 3.6, 0, 0, 0, 0, 2, 5, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 2, 0, 4.8, 0, 0, 0, 0, 0, 3},
            {0, 0, 0, 0, 0, 0, 5, 4.8, 0, 0.8, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0.8, 0, 0, 0, 0, 5, 0},
            {0, 0, 0, 0, 0.7, 0, 0, 0, 0, 0, 0, 1.8, 0, 0, 0},
            {0, 0, 0, 0, 0, 3.7, 0, 0, 0, 0, 1.8, 0, 4.1, 0, 0},
            {0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 4.1, 0, 2.2, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 2.2, 0, 3.5},
            {0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3.5, 0},
        };
                                                                 //10
        int xx1[] = {350, 390, 252, 100, 452, 455, 350, 490, 525, 605, 528, 730, 1083, 1035, 770, 315};
        int yy1[] = {190, 270, 260, 460, 70, 235, 465, 580, 813, 765, 48, 180, 320, 450, 570, 565};
        String nom[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};
      
        for (int j = 0; j < 15; j++) {
            arboles.setCordeX(j, xx1[j]);
            arboles.setCordeY(j, yy1[j]);
            arboles.setNombre(j, nom[j]);

        }
        for (int j = 0; j < 15; j++) {
            for (int k = 0; k < 15; k++) {
                arboles.setmAdyacencia(j, k, Matriz[j][k]);
                arboles.setmCoeficiente(j, k, coe[j][k]);
            }
        }
        Numerotope = 15;
        PintarFiguras(Numerotope, arboles);
    }//GEN-LAST:event_MostrarCaminosActionPerformed


    private void cboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDestinoActionPerformed
        btnBuscar.setEnabled(true);
    }//GEN-LAST:event_cboDestinoActionPerformed

    private void cboOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboOrigenActionPerformed
        cboDestino.setEnabled(true);
    }//GEN-LAST:event_cboOrigenActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int origen = 0, destino = 0;
        String nombreOrigen, nombreDestino;
        nombreOrigen = (String) cboOrigen.getSelectedItem();
        nombreDestino = (String) cboDestino.getSelectedItem();

        if ("Metro - La Molina".equals(nombreOrigen)) {
            origen = 0;
        }
        if ("Paradero 2 - Ovalo La Fontana".equals(nombreOrigen)) {
            origen = 1;
        }
        if ("Hotel Javier Prado".equals(nombreOrigen)) {
            origen = 2;
        }
        if ("Universidad de Lima".equals(nombreOrigen)) {
            origen = 3;
        }
        if ("Paradero 5 - San Telmo".equals(nombreOrigen)) {
            origen = 4;
        }
        if ("Universidad San Ignacio de Loyola".equals(nombreOrigen)) {
            origen = 5;
        }
        if ("Paradero 7 - Los Condes".equals(nombreOrigen)) {
            origen = 6;
        }
        if ("Molina Plaza".equals(nombreOrigen)) {
            origen = 7;
        }
        if ("Universidad de San Martín de Porres".equals(nombreOrigen)) {
            origen = 8;
        }
        if ("Ovalo de los Condores".equals(nombreOrigen)) {
            origen = 9;
        }
        if ("Hotel La Molina".equals(nombreOrigen)) {
            origen = 10;
        }
        if ("BCP Sede Central".equals(nombreOrigen)) {
            origen = 11;
        }
        if ("Wong La Planicie".equals(nombreOrigen)) {
            origen = 12;
        }
        if ("Mirador La Laguna".equals(nombreOrigen)) {
            origen = 13;
        }
        if ("Rinconada Country Club".equals(nombreOrigen)) {
            origen = 14;
        }

        if ("Metro - La Molina".equals(nombreDestino)) {
            destino = 0;
        }
        if ("Paradero 2 - Ovalo La Fontana".equals(nombreDestino))          {
            destino = 1;
        }
        if ("Hotel Javier Prado".equals(nombreDestino)) {
            destino = 2;
        }
        if ("Universidad de Lima".equals(nombreDestino)) {
            destino = 3;
        }
        if ("Paradero 5 - San Telmo".equals(nombreDestino)) {
            destino = 4;
        }
        if ("Universidad San Ignacio de Loyola".equals(nombreDestino)) {
            destino = 5;
        }
        if ("Paradero 7 - Los Condes".equals(nombreDestino)) {
            destino = 6;
        }
        if ("Molina Plaza".equals(nombreDestino)) {
            destino = 7;
        }
        if ("Universidad de San Martín de Porres".equals(nombreDestino)) {
            destino = 8;
        }
        if ("Ovalo de los Condores".equals(nombreDestino)) {
            destino = 9;
        }
        if ("Hotel La Molina".equals(nombreDestino)) {
            destino = 10;
        }
        if ("BCP Sede Central".equals(nombreDestino)) {
            destino = 11;
        }
        if ("Wong La Planicie".equals(nombreDestino)) {
            destino = 12;
        }
        if ("Mirador La Laguna".equals(nombreDestino)) {
            destino = 13;
        }
        if ("Rinconada Country Club".equals(nombreDestino)) {
            destino = 14;
        }

        if (origen == destino) {
            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            JOptionPane.showMessageDialog(null, "Estas en:" + nombreOrigen);
            txtKMAcumulados.setText("Intenta de nuevo!!");
            txtKMAcumulados.setEnabled(false);
            txtKMAcumulados.setForeground(Color.RED);

        } else {
            Algoritmo Dijkstra = new Algoritmo(arboles, Numerotope, origen, destino);
            Dijkstra.dijkstra();

            Font fuente = new Font("Arial", Font.BOLD, 18);
            txtKMAcumulados.setFont(fuente);
            txtKMAcumulados.setText("No hay ningun error :)");
            txtKMAcumulados.setForeground(Color.BLUE);
            txtKMAcumulados.setEnabled(false);
            
            kmRecorridos.setText(Dijkstra.getAcumulado() + " KM");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel LateralSuperior;
    private javax.swing.JLabel LateralSuperior1;
    private javax.swing.JButton MostrarCaminos;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cboDestino;
    private javax.swing.JComboBox<String> cboOrigen;
    private javax.swing.JLabel colorDestino;
    private javax.swing.JLabel colorNodoVisitado;
    private javax.swing.JLabel colorOrigen;
    private javax.swing.JLabel escudo;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kmRecorridos;
    private javax.swing.JLabel kmRecorridos1;
    private javax.swing.JLabel kmRecorridos2;
    private javax.swing.JLabel txtBuscar;
    private javax.swing.JLabel txtColorDestino;
    private javax.swing.JLabel txtColorNodoRecorrido;
    private javax.swing.JLabel txtColorOrigen;
    private javax.swing.JLabel txtDestino;
    private javax.swing.JTextArea txtKMAcumulados;
    private javax.swing.JLabel txtOrigen;
    // End of variables declaration//GEN-END:variables
}
