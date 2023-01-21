package sistema.clubgui;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class frmlogin extends javax.swing.JFrame {

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
    
   
    public void validarAcceso(){
            Connection con=null;
            String usuario = txtUsuario.getText();
            String pass= txtContra.getText();
// String pass =String.valueOf(txtContra.getPassword());
            if(usuario.equals("") || pass.equals("")){
                JOptionPane.showMessageDialog(this, "Uno de los campos se encuentra vasio");
            }else{
            try{
           
            con=conexionbd();
            
            ps = con.prepareStatement ("select usuario,password from asesor where usuario='" + usuario + "' and password ='" + pass + "'");
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                this.dispose();
                new frminicio().setVisible(true);  
            }else{
                    JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
                }
            } catch(SQLException e){
                System.err.print(e.toString());
            JOptionPane.showMessageDialog(this, "Error en el Acceso, Vuelva a Intentarlo" + e.getMessage());
        } 
      }
    }
    
    
    
    
    
    public frmlogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        TextoIni = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 370));
        setPreferredSize(new java.awt.Dimension(650, 421));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText(" Volver al Menú");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 370));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setBackground(new java.awt.Color(51, 0, 153));
        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLUB DE NUTRICION HALCONES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 450, 50));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setText("Bienvenido al sistema, por favor inicie sesion");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 390, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("USUARIO: ");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel5.setText("Contraseña:");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        txtUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txtUsuario.setText("Nombre de Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 210, 20));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 210, 10));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 210, 10));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        TextoIni.setBackground(new java.awt.Color(255, 255, 255));
        TextoIni.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TextoIni.setForeground(new java.awt.Color(255, 255, 255));
        TextoIni.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoIni.setText("Iniciar sesion");
        TextoIni.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoIni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoIniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TextoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TextoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 150, 30));

        txtContra.setText("jPasswordField1");
        txtContra.setBorder(null);
        txtContra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraMousePressed(evt);
            }
        });
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraKeyTyped(evt);
            }
        });
        bg.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 210, 20));

        jLabel3.setText("¿No tienes cuenta?");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Registrar");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

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

    private void TextoIniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoIniMouseClicked
        validarAcceso();
    }//GEN-LAST:event_TextoIniMouseClicked

    private void txtContraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMouseClicked
        txtContra.setText("");
    }//GEN-LAST:event_txtContraMouseClicked

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if (txtUsuario.getText().equals("Nombre de Usuario")){
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if (String.valueOf(txtContra.getPassword()).isEmpty()){
        txtContra.setText("********");
        txtContra.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraMousePressed
        if (String.valueOf(txtContra.getPassword()).equals("********")){
            txtContra.setText("");
            txtContra.setForeground(Color.black);
            
        }
        if (txtUsuario.getText().isEmpty()){
        txtUsuario.setText("Nombre de Usuario");
        txtUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtContraMousePressed

    private void txtContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyTyped
        if(txtContra.getText().length() == 8){
        evt.consume();
        }
    }//GEN-LAST:event_txtContraKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        if(txtUsuario.getText().length() == 10){
        evt.consume();
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        frmregistro registra = new frmregistro();
       registra.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        frminicio menu = new frminicio();
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TextoIni;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
