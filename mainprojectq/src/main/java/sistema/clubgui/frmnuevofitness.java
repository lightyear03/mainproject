package sistema.clubgui;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sistema.dal.conexion;

public class frmnuevofitness extends javax.swing.JFrame {
    
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

    public frmnuevofitness() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtnom = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtcoach = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        registrar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtedad = new javax.swing.JTextField();
        txtaltura = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        cbxsex = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        modificar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        limpiar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(658, 369));
        setResizable(false);

        background1.setBackground(new java.awt.Color(255, 255, 255));
        background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE NUEVOS MIEMBROS");
        background1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 550, 70));

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 350));

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));

        jLabel10.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Inicio ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 367, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 420));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel2.setText("Nombre: ");
        background1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("ID del miembro: ");
        background1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Sexo:");
        background1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        txtid.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtid.setBorder(null);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        background1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 280, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        background1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 280, 10));

        txtnom.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtnom.setBorder(null);
        background1.add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 280, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        background1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 280, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        background1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 120, 10));

        txtcoach.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtcoach.setBorder(null);
        background1.add(txtcoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 120, 20));

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        registrar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrar.setText("REGISTRAR ");
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 110, 40));

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));

        jLabel11.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Pesaje");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 100, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setText("Correo:");
        background1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setText("Altura:");
        background1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        background1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 120, 10));

        txtedad.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtedad.setBorder(null);
        background1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 120, 20));

        txtaltura.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtaltura.setBorder(null);
        background1.add(txtaltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 120, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        background1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 120, 10));

        cbxsex.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cbxsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccona sexo...", "Femenino", "Masculino" }));
        cbxsex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxsexActionPerformed(evt);
            }
        });
        background1.add(cbxsex, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel12.setText("Edad:");
        background1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("id Asesor: ");
        background1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        txtmail.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        txtmail.setBorder(null);
        background1.add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 200, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        background1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 200, 20));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        modificar.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modificar.setText("MODIFICAR");
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));

        limpiar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        limpiar.setForeground(new java.awt.Color(255, 255, 255));
        limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        limpiar.setText("LIMPIAR");
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
 try{
            Connection con = null;
            con=conexionbd();
            ps=con.prepareStatement("INSERT INTO fitness (idFitness, nombreFitness, edad, altura, sexo, mail, idCoach) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, txtid.getText());
            ps.setString(2, txtnom.getText());
            ps.setString(3, txtedad.getText());
            ps.setString(4, txtaltura.getText());
            ps.setString(5, cbxsex.getSelectedItem().toString());
            ps.setString(6, txtmail.getText());
            ps.setString(7, txtcoach.getText());
            int res = ps.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null, "Se guardo");
            }else {JOptionPane.showMessageDialog(null, "No se guardo");}
            con.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: N"+e.toString());
        }
    }//GEN-LAST:event_registrarMouseClicked

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void cbxsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxsexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxsexActionPerformed

    private void modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseClicked
        try{
            Connection con = null;
            con=conexionbd();
            ps=con.prepareStatement("UPDATE fitness SET nombrefitness=?, edad=?, altura=?, sexo=?, mail=?,idCoach=? WHERE idfitness=?");
            
            ps.setString(1, txtnom.getText());
            ps.setString(2, txtedad.getText());
            ps.setString(3, txtaltura.getText());
            ps.setString(4, cbxsex.getSelectedItem().toString());
            ps.setString(5, txtmail.getText());
            ps.setString(6, txtcoach.getText());
            ps.setString(7, txtid.getText());   
            int res = ps.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null, "Se modifico el registro");
            }else {JOptionPane.showMessageDialog(null, "ERROR: No se modifico");}
            con.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: N"+e.toString());
        }
    }//GEN-LAST:event_modificarMouseClicked

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        txtid.setText("");
        txtnom.setText("");
        txtedad.setText("");
        txtaltura.setText("");
        txtmail.setText("");
        txtcoach.setText("");
    }//GEN-LAST:event_limpiarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmnuevofitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmnuevofitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmnuevofitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmnuevofitness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmnuevofitness().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background1;
    private javax.swing.JComboBox<String> cbxsex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel limpiar;
    private javax.swing.JLabel modificar;
    private javax.swing.JLabel registrar;
    private javax.swing.JTextField txtaltura;
    private javax.swing.JTextField txtcoach;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}

//Otro comentario