
package sistema.clubgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.Color;


public class frmregistro extends javax.swing.JFrame {

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

    private void limpiarCajas(){
        CajaCorreo.setText(null);
        CajaID.setText(null);
        CajaNombre.setText(null);
        CajaUsuario.setText(null);
        CajaContraseña.setText(null);
    }
    
    public frmregistro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        TextoRegistro = new javax.swing.JLabel();
        TextoID = new javax.swing.JLabel();
        CajaID = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TextoNombre = new javax.swing.JLabel();
        CajaNombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        TextoUsuario = new javax.swing.JLabel();
        CajaUsuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        TextoCorreo = new javax.swing.JLabel();
        CajaCorreo = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        TextoContraseña = new javax.swing.JLabel();
        CajaContraseña = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Img = new javax.swing.JLabel();
        CajaRegistrar = new javax.swing.JPanel();
        TextoRegistrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(657, 370));
        setPreferredSize(new java.awt.Dimension(568, 369));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(714, 369));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoRegistro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextoRegistro.setText("REGISTRO");
        bg.add(TextoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        TextoID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoID.setText("ID");
        bg.add(TextoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        CajaID.setForeground(new java.awt.Color(204, 204, 204));
        CajaID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaID.setText("Ingrese su ID");
        CajaID.setBorder(null);
        CajaID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaIDMousePressed(evt);
            }
        });
        bg.add(CajaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 10));

        TextoNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoNombre.setText("Nombre");
        bg.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        CajaNombre.setForeground(new java.awt.Color(204, 204, 204));
        CajaNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaNombre.setText("Ingrese su nombre");
        CajaNombre.setBorder(null);
        CajaNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaNombreMousePressed(evt);
            }
        });
        CajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaNombreActionPerformed(evt);
            }
        });
        bg.add(CajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 120, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 10));

        TextoUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoUsuario.setText("Usuario");
        bg.add(TextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        CajaUsuario.setForeground(new java.awt.Color(204, 204, 204));
        CajaUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaUsuario.setText("Nombre de Usuario");
        CajaUsuario.setBorder(null);
        CajaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaUsuarioMousePressed(evt);
            }
        });
        bg.add(CajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 110, -1));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 10));

        TextoCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoCorreo.setText("Correo");
        bg.add(TextoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        CajaCorreo.setForeground(new java.awt.Color(204, 204, 204));
        CajaCorreo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaCorreo.setText("correo@dominio.com");
        CajaCorreo.setBorder(null);
        CajaCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaCorreoMousePressed(evt);
            }
        });
        CajaCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaCorreoActionPerformed(evt);
            }
        });
        bg.add(CajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, -1));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, 10));

        TextoContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoContraseña.setText("Contraseña");
        bg.add(TextoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        CajaContraseña.setForeground(new java.awt.Color(204, 204, 204));
        CajaContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaContraseña.setText("**********");
        CajaContraseña.setBorder(null);
        CajaContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaContraseñaMousePressed(evt);
            }
        });
        bg.add(CajaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 110, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, 10));

        Img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistema/clubgui/img/nutrim.jpg"))); // NOI18N
        Img.setText("jLabel6");
        bg.add(Img, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 0, 220, 370));

        CajaRegistrar.setBackground(new java.awt.Color(47, 106, 135));

        TextoRegistrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextoRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        TextoRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoRegistrar.setText("Registrar");
        TextoRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextoRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextoRegistrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout CajaRegistrarLayout = new javax.swing.GroupLayout(CajaRegistrar);
        CajaRegistrar.setLayout(CajaRegistrarLayout);
        CajaRegistrarLayout.setHorizontalGroup(
            CajaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CajaRegistrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CajaRegistrarLayout.setVerticalGroup(
            CajaRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CajaRegistrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(CajaRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 160, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaNombreActionPerformed

    private void CajaCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajaCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajaCorreoActionPerformed

    private void TextoRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrarMouseEntered
        TextoRegistrar.setBackground(new Color (0, 156, 223));
        
            Connection con=null;
try{
    con=conexionbd();
    ps=con.prepareStatement("INSERT INTO asesor(idCoach, nombre, uduario, password, correo) VALUES (?, ?, ?, ?, ?)");
    ps.setString(1,CajaID.getText());
    ps.setString(2,CajaNombre.getText());
    ps.setString(3,CajaUsuario.getText());
    ps.setString(4,CajaContraseña.getText());
    ps.setString(5,CajaCorreo.getText());
    
    int res=ps.executeUpdate();
    
    if (res>0) {
        JOptionPane.showMessageDialog(null, "Registro exitoso");
        limpiarCajas();
    }
    else{
    JOptionPane.showMessageDialog(null, "Error al registrar");
    limpiarCajas();
    }
    con.close();
    }catch(Exception e){
    System.out.print(e.getMessage());
    }
 
    }//GEN-LAST:event_TextoRegistrarMouseEntered

    private void TextoRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrarMouseExited
        TextoRegistrar.setBackground(new Color (47, 106, 135));
    }//GEN-LAST:event_TextoRegistrarMouseExited

    private void CajaIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaIDMousePressed
        CajaID.setText("");
        CajaID.setForeground(Color.black);
    }//GEN-LAST:event_CajaIDMousePressed

    private void CajaCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaCorreoMousePressed
        if (CajaCorreo.getText().equals("correo@dominio.com")){
            CajaCorreo.setText("");
            CajaCorreo.setForeground(Color.black);
        }
        if (String.valueOf(CajaContraseña.getText()).isEmpty()){
        CajaContraseña.setText("**********");
        CajaContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CajaCorreoMousePressed

    private void CajaContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaContraseñaMousePressed
        if (String.valueOf(CajaCorreo.getText()).equals("**********")){
            CajaCorreo.setText("");
            CajaCorreo.setForeground(Color.black);
        }
        if (CajaContraseña.getText().isEmpty()){
        CajaContraseña.setText("correo@dominio.com");
        CajaContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CajaContraseñaMousePressed

    private void CajaNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaNombreMousePressed
        CajaNombre.setText("");
        CajaNombre.setForeground(Color.black);
    }//GEN-LAST:event_CajaNombreMousePressed

    private void CajaUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaUsuarioMousePressed
        CajaUsuario.setText("");
        CajaUsuario.setForeground(Color.black);
    }//GEN-LAST:event_CajaUsuarioMousePressed

    private void TextoRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrarMouseClicked
        
    }//GEN-LAST:event_TextoRegistrarMouseClicked

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
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmregistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CajaContraseña;
    private javax.swing.JTextField CajaCorreo;
    private javax.swing.JTextField CajaID;
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JPanel CajaRegistrar;
    private javax.swing.JTextField CajaUsuario;
    private javax.swing.JLabel Img;
    private javax.swing.JLabel TextoContraseña;
    private javax.swing.JLabel TextoCorreo;
    private javax.swing.JLabel TextoID;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoRegistrar;
    private javax.swing.JLabel TextoRegistro;
    private javax.swing.JLabel TextoUsuario;
    private javax.swing.JPanel bg;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables

}
