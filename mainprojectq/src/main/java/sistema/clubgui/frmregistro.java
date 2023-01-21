
package sistema.clubgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.awt.*;


public class frmregistro extends javax.swing.JFrame {
    
    Connection conectar = null;
    String  usuario="root";
    String contrasena="02febrero";
    String bd ="proyectfn";
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

   /* private void limpiarCajas(){
        CajaCorreo.setText(null);
        CajaID.setText(null);
        CajaNombre.setText(null);
        CajaUsuario.setText(null);
        txtContra.setText(null);
    }*/
    
    public frmregistro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        TextoID = new javax.swing.JLabel();
        CajaID = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TextoNombre = new javax.swing.JLabel();
        CajaNombre = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        TextoUsuario = new javax.swing.JLabel();
        CajaUsuario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        TextoCorreo = new javax.swing.JLabel();
        CajaCorreo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        TextoContraseña = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        CajaRegistrar = new javax.swing.JPanel();
        TextoRegistrar = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        TextoRegistro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(589, 363));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(589, 363));
        bg.setPreferredSize(new java.awt.Dimension(589, 363));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextoID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoID.setText("ID");
        bg.add(TextoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        CajaID.setForeground(new java.awt.Color(204, 204, 204));
        CajaID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CajaID.setText("Ingrese su ID");
        CajaID.setBorder(null);
        CajaID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CajaID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaIDMousePressed(evt);
            }
        });
        bg.add(CajaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 80, 10));

        TextoNombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoNombre.setText("Nombre");
        bg.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        CajaNombre.setForeground(new java.awt.Color(204, 204, 204));
        CajaNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CajaNombre.setText("Nombre completo");
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
        bg.add(CajaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 150, 20));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 150, 10));

        TextoUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoUsuario.setText("Usuario");
        bg.add(TextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        CajaUsuario.setForeground(new java.awt.Color(204, 204, 204));
        CajaUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CajaUsuario.setText("Nombre de Usuario");
        CajaUsuario.setBorder(null);
        CajaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaUsuarioMousePressed(evt);
            }
        });
        CajaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CajaUsuarioKeyTyped(evt);
            }
        });
        bg.add(CajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 150, 20));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 150, 10));

        TextoCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoCorreo.setText("Correo");
        bg.add(TextoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        CajaCorreo.setForeground(new java.awt.Color(204, 204, 204));
        CajaCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
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
        bg.add(CajaCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 150, 20));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 150, 10));

        TextoContraseña.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TextoContraseña.setText("Contraseña");
        bg.add(TextoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, 10));

        CajaRegistrar.setBackground(new java.awt.Color(47, 106, 135));

        TextoRegistrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
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

        bg.add(CajaRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 160, 50));

        txtContra.setText("CajaContraseña");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });
        bg.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 120, 20));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        TextoRegistro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        TextoRegistro.setText("REGISTRO DE NUEVOS ASESORES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(TextoRegistro)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoRegistro)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if (String.valueOf(txtContra.getText()).isEmpty()){
        txtContra.setText("********");
        txtContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CajaCorreoMousePressed

    private void CajaNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaNombreMousePressed
        CajaNombre.setText("");
        CajaNombre.setForeground(Color.black);
    }//GEN-LAST:event_CajaNombreMousePressed

    private void CajaUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaUsuarioMousePressed
        CajaUsuario.setText("");
        CajaUsuario.setForeground(Color.black);
    }//GEN-LAST:event_CajaUsuarioMousePressed

    private void TextoRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrarMouseClicked

//=======
try {
        
            Connection con=null;
            con=conexionbd();
    
         ps=con.prepareStatement("INSERT INTO asesor(idCoach, nombre, usuario, password, correo) VALUES (?, ?, ?, ?, ?)");
         ps.setString(1,CajaID.getText());
         ps.setString(2,CajaNombre.getText());
         ps.setString(3,CajaUsuario.getText());
         ps.setString(4,txtContra.getText());
         ps.setString(5,CajaCorreo.getText());

         int res=ps.executeUpdate();
    
        if (res>0) {
            JOptionPane.showMessageDialog(null,"Registro exitoso"); 
                new frminicio().setVisible(true);
                this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Error al registrar");
        }
            con.close();
  }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR, Intente su registro nuevamente ");
        }
//>>>>>>> 343552615ffde1848eb1055176318b7ffa7245c4
    }//GEN-LAST:event_TextoRegistrarMouseClicked

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed

    }//GEN-LAST:event_txtContraActionPerformed

    private void txtContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMouseClicked
        txtContra.setText("");
    }//GEN-LAST:event_txtContraMouseClicked

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if (String.valueOf(txtContra.getText()).equals("********")){
            txtContra.setText("");
            txtContra.setForeground(Color.black);
            
        }
        if (CajaCorreo.getText().isEmpty()){
        CajaCorreo.setText("correo@dominio.com");
        CajaCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
        if(txtContra.getText().length() == 8){
        evt.consume();
        }
    }//GEN-LAST:event_txtContraKeyTyped

    private void CajaUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaUsuarioKeyTyped
        if(CajaUsuario.getText().length() == 10){
        evt.consume();
        }
    }//GEN-LAST:event_CajaUsuarioKeyTyped

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
    private javax.swing.JTextField CajaCorreo;
    private javax.swing.JTextField CajaID;
    private javax.swing.JTextField CajaNombre;
    private javax.swing.JPanel CajaRegistrar;
    private javax.swing.JTextField CajaUsuario;
    private javax.swing.JLabel TextoContraseña;
    private javax.swing.JLabel TextoCorreo;
    private javax.swing.JLabel TextoID;
    private javax.swing.JLabel TextoNombre;
    private javax.swing.JLabel TextoRegistrar;
    private javax.swing.JLabel TextoRegistro;
    private javax.swing.JLabel TextoUsuario;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPasswordField txtContra;
    // End of variables declaration//GEN-END:variables
   
}