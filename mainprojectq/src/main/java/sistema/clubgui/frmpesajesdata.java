package sistema.clubgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmpesajesdata extends javax.swing.JFrame {
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
    public frmpesajesdata() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtcoach = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        bmiembro = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        basesor = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bdate = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        limpiar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        visor = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idpe = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 370));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CONSULTA DE PESAJES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 350, 60));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("ID del miembro: ");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        txtid.setBorder(null);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        bg.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 130, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 130, 10));

        txtcoach.setBorder(null);
        txtcoach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoachActionPerformed(evt);
            }
        });
        bg.add(txtcoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 130, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, 10));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("ID del asesor:");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Fecha:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtfecha.setBorder(null);
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });
        bg.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 130, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 130, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        bmiembro.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        bmiembro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bmiembro.setText("Buscar por ID de miebro");
        bmiembro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bmiembro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bmiembro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bmiembroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bmiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bmiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        basesor.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        basesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        basesor.setText("Buscar por ID de asesor");
        basesor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        basesor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basesor.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                basesorMouseDragged(evt);
            }
        });
        basesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                basesorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(basesor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(basesor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        bdate.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        bdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bdate.setText("Buscar por fecha");
        bdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        limpiar.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limpiar.setText("LIMPIAR");
        limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, 110, -1));

        visor.setBackground(new java.awt.Color(255, 204, 204));
        visor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(visor);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 930, 90));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Eliminar registro por ID");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        bg.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("ID pesaje:");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        idpe.setBorder(null);
        idpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpeActionPerformed(evt);
            }
        });
        bg.add(idpe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 130, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 130, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtcoachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcoachActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void mostrar(){
        String [] nombresColumnas={"Num de pesaje", "Fitness", "Asesor", "Fecha", "Peso", "Musculo", "Grasa", "Grasa viceral", "Edad metabolica", "IMC", "Brazo", "Pecho", "Cintura","Cadera", "Pierna"};
        String[] registros = new String[15];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        Connection con = null;
        try{
            con=conexionbd();
            ps= con.prepareStatement("SELECT * FROM pmed WHERE idfitness =?");
            ps.setString(1, txtid.getText());
            rs=ps.executeQuery();
            visor.setModel(modelo);
           while (rs.next())
           {
               registros [0] = rs.getString("idpesaje");
               registros [1] = rs.getString("idfitness");
               registros [2] = rs.getString("idcoach");
               registros [3] = rs.getString("fechap");
               registros [4] = rs.getString("pesofit");
               registros [5] = rs.getString("musculofit");
               registros [6] = rs.getString("grasafit");
               registros [7] = rs.getString("grasavfit");
               registros [8] = rs.getString("edadmfit");
               registros [9] = rs.getString("imcfit");
               registros [10] = rs.getString("mbrazofit");
               registros [11] = rs.getString("mpechofit");
               registros [12] = rs.getString("mcinturafit");
               registros [13] = rs.getString("mcaderafit");
              registros [14] = rs.getString("mpiernafit"); 
              modelo.addRow(registros);
           
           }
           
           
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR:"+e.toString());
        }
    }
    private void bmiembroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bmiembroMouseClicked
        mostrar();
        
    }//GEN-LAST:event_bmiembroMouseClicked

    private void basesorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basesorMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_basesorMouseDragged

    private void basesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basesorMouseClicked
        String [] nombresColumnas={"Num de pesaje", "Fitness", "Asesor", "Fecha", "Peso", "Musculo", "Grasa", "Grasa viceral", "Edad metabolica", "IMC", "Brazo", "Pecho", "Cintura","Cadera", "Pierna"};
        String[] registros = new String[15];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        Connection con = null;
        try{
            con=conexionbd();
            ps= con.prepareStatement("SELECT * FROM pmed WHERE idcoach=?");
            ps.setString(1, txtcoach.getText());
            rs=ps.executeQuery();
            visor.setModel(modelo);
           while (rs.next())
           {
               registros [0] = rs.getString("idpesaje");
               registros [1] = rs.getString("idfitness");
               registros [2] = rs.getString("idcoach");
               registros [3] = rs.getString("fechap");
               registros [4] = rs.getString("pesofit");
               registros [5] = rs.getString("musculofit");
               registros [6] = rs.getString("grasafit");
               registros [7] = rs.getString("grasavfit");
               registros [8] = rs.getString("edadmfit");
               registros [9] = rs.getString("imcfit");
               registros [10] = rs.getString("mbrazofit");
               registros [11] = rs.getString("mpechofit");
               registros [12] = rs.getString("mcinturafit");
               registros [13] = rs.getString("mcaderafit");
              registros [14] = rs.getString("mpiernafit"); 
              modelo.addRow(registros);
           
           }
           
           
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR:"+e.toString());
        }
    }//GEN-LAST:event_basesorMouseClicked

    private void bdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdateMouseClicked
        String [] nombresColumnas={"Num de pesaje", "Fitness", "Asesor", "Fecha", "Peso", "Musculo", "Grasa", "Grasa viceral", "Edad metabolica", "IMC", "Brazo", "Pecho", "Cintura","Cadera", "Pierna"};
        String[] registros = new String[15];
        DefaultTableModel modelo = new DefaultTableModel(null, nombresColumnas);
        Connection con = null;
        try{
            con=conexionbd();
            ps= con.prepareStatement("SELECT * FROM pmed WHERE fechap =?");
            ps.setString(1, txtfecha.getText());
            rs=ps.executeQuery();
            visor.setModel(modelo);
           while (rs.next())
           {
               registros [0] = rs.getString("idpesaje");
               registros [1] = rs.getString("idfitness");
               registros [2] = rs.getString("idcoach");
               registros [3] = rs.getString("fechap");
               registros [4] = rs.getString("pesofit");
               registros [5] = rs.getString("musculofit");
               registros [6] = rs.getString("grasafit");
               registros [7] = rs.getString("grasavfit");
               registros [8] = rs.getString("edadmfit");
               registros [9] = rs.getString("imcfit");
               registros [10] = rs.getString("mbrazofit");
               registros [11] = rs.getString("mpechofit");
               registros [12] = rs.getString("mcinturafit");
               registros [13] = rs.getString("mcaderafit");
              registros [14] = rs.getString("mpiernafit"); 
              modelo.addRow(registros);
           
           }
           
           
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR:"+e.toString());
        }
    }//GEN-LAST:event_bdateMouseClicked

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        txtid.setText("");
        txtcoach.setText("");
        txtfecha.setText("");
        idpe.setText("");
        visor.setModel(null);
    }//GEN-LAST:event_limpiarMouseClicked

    private void idpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpeActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try{
            Connection con = null;
            con=conexionbd();
            ps=con.prepareStatement("DELETE FROM pmed WHERE idpesaje=?");
            
            ps.setString(1, idpe.getText());   
            int res = ps.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null, "Se elimino el registro");
            }else {JOptionPane.showMessageDialog(null, "ERROR: No se elimino");}
            con.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: N"+e.toString());
        }
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(frmpesajesdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmpesajesdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmpesajesdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmpesajesdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmpesajesdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel basesor;
    private javax.swing.JLabel bdate;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bmiembro;
    private javax.swing.JTextField idpe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel limpiar;
    private javax.swing.JTextField txtcoach;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid;
    public javax.swing.JTable visor;
    // End of variables declaration//GEN-END:variables
}
