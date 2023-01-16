
package sistema.clubgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class frmpesaje extends javax.swing.JFrame {
    Connection conectar = null;
    String  usuario="DDEVELOP";
    String contrasena="DATADEV20163q";
    String bd ="bdconsul";
    String ip="localhost";
    String puerto="3306";
    PreparedStatement ps;
    ResultSet rs;
    
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection conexionbd(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "ACCESO: Se conecto la base de datos.");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: No se conecto la base de datos."+e.toString());
        }
        return conectar;
        
    }

    public frmpesaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bckg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtidfit = new javax.swing.JTextField();
        txtcoach = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        et5 = new javax.swing.JLabel();
        et6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        et1 = new javax.swing.JLabel();
        et3 = new javax.swing.JLabel();
        txtpier = new javax.swing.JLabel();
        et7 = new javax.swing.JLabel();
        et9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        et2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtmus = new javax.swing.JTextField();
        txtgra = new javax.swing.JTextField();
        txtgv = new javax.swing.JTextField();
        txtpie = new javax.swing.JTextField();
        txtpeso = new javax.swing.JTextField();
        txtcad = new javax.swing.JTextField();
        txtcin = new javax.swing.JTextField();
        txtpe = new javax.swing.JTextField();
        txtbra = new javax.swing.JTextField();
        txtem = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        inicio = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        registrar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        modificar = new javax.swing.JLabel();
        et4 = new javax.swing.JLabel();
        txtimc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtidp = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        limpiar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(658, 369));
        setPreferredSize(new java.awt.Dimension(714, 400));
        setResizable(false);

        bckg.setBackground(new java.awt.Color(255, 255, 255));
        bckg.setMinimumSize(new java.awt.Dimension(658, 369));
        bckg.setPreferredSize(new java.awt.Dimension(714, 369));
        bckg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(154, 81, 49));

        jLabel1.setBackground(new java.awt.Color(154, 81, 49));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE PESAJE Y MEDICIÓN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bckg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 460, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("Id del Fitness:");
        bckg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("Fecha de pesaje:");
        bckg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("Id del Asesor:");
        bckg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        txtidfit.setBorder(null);
        txtidfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidfitActionPerformed(evt);
            }
        });
        bckg.add(txtidfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 140, 20));

        txtcoach.setBorder(null);
        txtcoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoachActionPerformed(evt);
            }
        });
        bckg.add(txtcoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 20));

        txtfecha.setBorder(null);
        bckg.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 140, 20));
        bckg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 140, -1));
        bckg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 140, 10));
        bckg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 140, 10));

        et5.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        et5.setText("Brazo");
        bckg.add(et5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        et6.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        et6.setText("Pecho");
        bckg.add(et6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel8.setText("Musculo");
        bckg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        et1.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        et1.setText("Grasa");
        bckg.add(et1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        et3.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        et3.setText("Edad metabólica");
        bckg.add(et3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        txtpier.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        txtpier.setText("Pierna");
        bckg.add(txtpier, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, -1, -1));

        et7.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        et7.setText("Cintura");
        bckg.add(et7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, -1, -1));

        et9.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        et9.setText("Cadera");
        bckg.add(et9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        jLabel14.setText("Peso KG");
        bckg.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        et2.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        et2.setText("Grasa viceral");
        bckg.add(et2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jPanel2.setBackground(new java.awt.Color(154, 81, 49));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PESAJE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        bckg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        jPanel3.setBackground(new java.awt.Color(154, 81, 49));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("MEDICIÓN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel17)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bckg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        bckg.add(txtmus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 70, -1));
        bckg.add(txtgra, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 70, -1));
        bckg.add(txtgv, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, -1));
        bckg.add(txtpie, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 70, -1));
        bckg.add(txtpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 70, -1));
        bckg.add(txtcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 70, -1));
        bckg.add(txtcin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 70, -1));
        bckg.add(txtpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 70, -1));
        bckg.add(txtbra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 70, -1));
        bckg.add(txtem, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 70, -1));

        jPanel4.setBackground(new java.awt.Color(154, 81, 49));

        inicio.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        inicio.setForeground(new java.awt.Color(255, 255, 255));
        inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio.setText("INICIO");
        inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bckg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, 30));

        jPanel5.setBackground(new java.awt.Color(154, 81, 49));

        registrar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("REGISTRAR");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bckg.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, 30));

        jPanel6.setBackground(new java.awt.Color(154, 81, 49));

        modificar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificar.setText("MODIFICAR");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bckg.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, 30));

        et4.setFont(new java.awt.Font("Dubai Light", 1, 14)); // NOI18N
        et4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        et4.setText("IMC");
        bckg.add(et4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 90, -1));
        bckg.add(txtimc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 70, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("id del pesaje:");
        bckg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtidp.setBorder(null);
        txtidp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpActionPerformed(evt);
            }
        });
        bckg.add(txtidp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, 20));
        bckg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 140, 10));

        jPanel7.setBackground(new java.awt.Color(154, 81, 49));

        limpiar.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limpiar.setText("LIMPIAR");
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bckg.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bckg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bckg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidfitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidfitActionPerformed

    private void txtcoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoachActionPerformed

    private void txtidpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpActionPerformed

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
       try{
            Connection con = null;
            con=conexionbd();
            ps=con.prepareStatement("INSERT INTO pmed (idpesaje, idfitness, idcoach, fechap, pesofit, musculofit, grasafit, grasavfit, edadmfit, imcfit, mbrazofit, mpechofit, mcinturafit, mcaderafit, mpiernafit ) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
             ps.setString(1, txtidp.getText());
             ps.setString(2, txtidfit.getText());
             ps.setString(3, txtcoach.getText());
             ps.setString(4, txtfecha.getText());
             ps.setString(5, txtpeso.getText());
             ps.setString(6, txtmus.getText());
             ps.setString(7, txtgra.getText());
             ps.setString(8, txtgv.getText());
             ps.setString(9, txtem.getText());
             ps.setString(10, txtimc.getText());
             ps.setString(11, txtbra.getText());
             ps.setString(12, txtpe.getText());
             ps.setString(13, txtcin.getText());
             ps.setString(14, txtcad.getText());
             ps.setString(15, txtpie.getText());
             int res = ps.executeUpdate();
             if (res>0){
                JOptionPane.showMessageDialog(null, "Se guardo");
            }else {JOptionPane.showMessageDialog(null, "No se guardo");}
            con.close();
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: N"+e.toString());
        }
    }//GEN-LAST:event_registrarMouseClicked

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        txtidp.setText("");
        txtidfit.setText("");
        txtcoach.setText("");
        txtfecha.setText("");
        txtpeso.setText("");
        txtmus.setText("");
        txtgra.setText("");
        txtgv.setText("");
        txtem.setText("");
        txtimc.setText("");
        txtbra.setText("");
        txtpe.setText("");
        txtcin.setText("");
        txtcad.setText("");
        txtpie.setText("");
    }//GEN-LAST:event_limpiarMouseClicked

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        try{
            Connection con = null;
            con=conexionbd();
            ps=con.prepareStatement("UPDATE pmed SET idfitness=?, idcoach=?, fechap=?, pesofit=?, musculofit=?, grasafit=?, grasavfit=?, edadmfit=?, imcfit=?, mbrazofit=?, mpechofit=?, mcinturafit=?, mcaderafit=?, mpiernafit=? WHERE idpesaje=?");
            
            
             ps.setString(1, txtidfit.getText());
             ps.setString(2, txtcoach.getText());
             ps.setString(3, txtfecha.getText());
             ps.setString(4, txtpeso.getText());
             ps.setString(5, txtmus.getText());
             ps.setString(6, txtgra.getText());
             ps.setString(7, txtgv.getText());
             ps.setString(8, txtem.getText());
             ps.setString(9, txtimc.getText());
             ps.setString(10, txtbra.getText());
             ps.setString(11, txtpe.getText());
             ps.setString(12, txtcin.getText());
             ps.setString(13, txtcad.getText());
             ps.setString(14, txtpie.getText());
             ps.setString(15, txtidp.getText());
            int res = ps.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null, "Se modifico el registro");
            }else {JOptionPane.showMessageDialog(null, "ERROR: No se modifico");}
            con.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: N"+e.toString());
        }
    }//GEN-LAST:event_modificarMouseClicked

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
            java.util.logging.Logger.getLogger(frmpesaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpesaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpesaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpesaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpesaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bckg;
    private javax.swing.JLabel et1;
    private javax.swing.JLabel et2;
    private javax.swing.JLabel et3;
    private javax.swing.JLabel et4;
    private javax.swing.JLabel et5;
    private javax.swing.JLabel et6;
    private javax.swing.JLabel et7;
    private javax.swing.JLabel et9;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel limpiar;
    private javax.swing.JLabel modificar;
    private javax.swing.JLabel registrar;
    private javax.swing.JTextField txtbra;
    private javax.swing.JTextField txtcad;
    private javax.swing.JTextField txtcin;
    private javax.swing.JTextField txtcoach;
    private javax.swing.JTextField txtem;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtgra;
    private javax.swing.JTextField txtgv;
    private javax.swing.JTextField txtidfit;
    private javax.swing.JTextField txtidp;
    private javax.swing.JTextField txtimc;
    private javax.swing.JTextField txtmus;
    private javax.swing.JTextField txtpe;
    private javax.swing.JTextField txtpeso;
    private javax.swing.JTextField txtpie;
    private javax.swing.JLabel txtpier;
    // End of variables declaration//GEN-END:variables
}
