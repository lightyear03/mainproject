/*
 
package sistema.clubgui;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import sistema.dal.conectar;

public class frmcoach extends javax.swing.JFrame {
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
*/
    /**
     * Creates new form frmcoach
     
    public frmcoach() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonLogin = new javax.swing.JPanel();
        TextoLogin = new javax.swing.JLabel();
        CajaRegistrar1 = new javax.swing.JPanel();
        TextoRegistrar1 = new javax.swing.JLabel();
        TextoMiembros = new javax.swing.JLabel();
        BotonDieta = new javax.swing.JPanel();
        textodieta = new javax.swing.JLabel();
        TextoCoach = new javax.swing.JLabel();
        Registrarnuevofitness = new javax.swing.JPanel();
        TextoRegistrar3 = new javax.swing.JLabel();
        BotonPesaje = new javax.swing.JPanel();
        textoPesaje = new javax.swing.JLabel();
        BotonPagos = new javax.swing.JPanel();
        textoPagos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(47, 106, 135));

        jLabel2.setFont(new java.awt.Font("Open Sans Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("??Bienvenido al sistema Coach!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 570, 80));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 710, 20));

        botonLogin.setBackground(new java.awt.Color(47, 106, 135));

        TextoLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextoLogin.setForeground(new java.awt.Color(255, 255, 255));
        TextoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoLogin.setText("Iniciar sesi??n ");
        TextoLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextoLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextoLoginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botonLoginLayout = new javax.swing.GroupLayout(botonLogin);
        botonLogin.setLayout(botonLoginLayout);
        botonLoginLayout.setHorizontalGroup(
            botonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonLoginLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(TextoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        botonLoginLayout.setVerticalGroup(
            botonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 160, 50));

        CajaRegistrar1.setBackground(new java.awt.Color(47, 106, 135));

        TextoRegistrar1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextoRegistrar1.setForeground(new java.awt.Color(255, 255, 255));
        TextoRegistrar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoRegistrar1.setText("Registrarse");
        TextoRegistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoRegistrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoRegistrar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextoRegistrar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextoRegistrar1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout CajaRegistrar1Layout = new javax.swing.GroupLayout(CajaRegistrar1);
        CajaRegistrar1.setLayout(CajaRegistrar1Layout);
        CajaRegistrar1Layout.setHorizontalGroup(
            CajaRegistrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CajaRegistrar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextoRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        CajaRegistrar1Layout.setVerticalGroup(
            CajaRegistrar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CajaRegistrar1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextoRegistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(CajaRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 50));

        TextoMiembros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextoMiembros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoMiembros.setText("Opciones para Miembros");
        TextoMiembros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoMiembros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoMiembrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextoMiembrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextoMiembrosMouseExited(evt);
            }
        });
        bg.add(TextoMiembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 230, 50));

        BotonDieta.setBackground(new java.awt.Color(47, 106, 135));

        textodieta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textodieta.setForeground(new java.awt.Color(255, 255, 255));
        textodieta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textodieta.setText("Dieta");
        textodieta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textodieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textodietaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textodietaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textodietaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonDietaLayout = new javax.swing.GroupLayout(BotonDieta);
        BotonDieta.setLayout(BotonDietaLayout);
        BotonDietaLayout.setHorizontalGroup(
            BotonDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonDietaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textodieta, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        BotonDietaLayout.setVerticalGroup(
            BotonDietaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonDietaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textodieta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(BotonDieta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 90, 50));

        TextoCoach.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextoCoach.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoCoach.setText("Opciones para el Coach");
        TextoCoach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoCoach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoCoachMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextoCoachMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextoCoachMouseExited(evt);
            }
        });
        bg.add(TextoCoach, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 230, 50));

        Registrarnuevofitness.setBackground(new java.awt.Color(47, 106, 135));

        TextoRegistrar3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TextoRegistrar3.setForeground(new java.awt.Color(255, 255, 255));
        TextoRegistrar3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoRegistrar3.setText("Datos de miembro");
        TextoRegistrar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextoRegistrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextoRegistrar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextoRegistrar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextoRegistrar3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout RegistrarnuevofitnessLayout = new javax.swing.GroupLayout(Registrarnuevofitness);
        Registrarnuevofitness.setLayout(RegistrarnuevofitnessLayout);
        RegistrarnuevofitnessLayout.setHorizontalGroup(
            RegistrarnuevofitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarnuevofitnessLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TextoRegistrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        RegistrarnuevofitnessLayout.setVerticalGroup(
            RegistrarnuevofitnessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistrarnuevofitnessLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TextoRegistrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(Registrarnuevofitness, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        BotonPesaje.setBackground(new java.awt.Color(47, 106, 135));

        textoPesaje.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPesaje.setForeground(new java.awt.Color(255, 255, 255));
        textoPesaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPesaje.setText("Pesajes");
        textoPesaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoPesaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoPesajeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoPesajeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoPesajeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonPesajeLayout = new javax.swing.GroupLayout(BotonPesaje);
        BotonPesaje.setLayout(BotonPesajeLayout);
        BotonPesajeLayout.setHorizontalGroup(
            BotonPesajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonPesajeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(textoPesaje, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        BotonPesajeLayout.setVerticalGroup(
            BotonPesajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonPesajeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoPesaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(BotonPesaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 100, -1));

        BotonPagos.setBackground(new java.awt.Color(47, 106, 135));

        textoPagos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoPagos.setForeground(new java.awt.Color(255, 255, 255));
        textoPagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoPagos.setText("Pagos");
        textoPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textoPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textoPagosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textoPagosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textoPagosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BotonPagosLayout = new javax.swing.GroupLayout(BotonPagos);
        BotonPagos.setLayout(BotonPagosLayout);
        BotonPagosLayout.setHorizontalGroup(
            BotonPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonPagosLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(textoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        BotonPagosLayout.setVerticalGroup(
            BotonPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonPagosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(textoPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(BotonPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 100, -1));

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
*/
/*
    private void TextoLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoLoginMouseClicked
        frmlogin frmlogin = new frmlogin();
        frmlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TextoLoginMouseClicked

    private void TextoLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoLoginMouseEntered
        TextoLogin.setBackground(new Color (0, 156, 223));

        Connection con=null;
        try{
            con=conexionbd();
            ps=con.prepareStatement("INSERT INTO asesor(idCoach, nombre, uduario, password, correo) VALUES (?, ?, ?, ?, ?)");
            ps.setString(1,CajaID.getText());
            ps.setString(2,CajaNombre.getText());
            ps.setString(3,CajaUsuario.getText());
            ps.setString(4,CajaContrase??a.getText());
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

    }//GEN-LAST:event_TextoLoginMouseEntered

    private void TextoLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoLoginMouseExited
        TextoLogin.setBackground(new Color (47, 106, 135));
    }//GEN-LAST:event_TextoLoginMouseExited

    private void TextoRegistrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrar1MouseClicked
        frmregistro frmregistro = new frmregistro();
        frmregistro.setVisible(true);
        this.dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_TextoRegistrar1MouseClicked

    private void TextoRegistrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoRegistrar1MouseEntered

    private void TextoRegistrar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoRegistrar1MouseExited

    private void TextoMiembrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoMiembrosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoMiembrosMouseClicked

    private void TextoMiembrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoMiembrosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoMiembrosMouseEntered

    private void TextoMiembrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoMiembrosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoMiembrosMouseExited

    private void TextoCoachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoCoachMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCoachMouseClicked

    private void TextoCoachMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoCoachMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCoachMouseEntered

    private void TextoCoachMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoCoachMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCoachMouseExited

    private void textodietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textodietaMouseClicked
            frmdietas frmdietas = new frmdietas();
            frmdietas.setVisible(true);
            this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_textodietaMouseClicked

    private void textodietaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textodietaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textodietaMouseEntered

    private void textodietaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textodietaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textodietaMouseExited

    private void TextoRegistrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrar3MouseClicked
        frmfitnessdata frmfitnessdata = new frmfitnessdata();
        frmfitnessdata.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_TextoRegistrar3MouseClicked

    private void TextoRegistrar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoRegistrar3MouseEntered

    private void TextoRegistrar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextoRegistrar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoRegistrar3MouseExited

    private void textoPagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoPagosMouseClicked
     frmpagos frmpagos = new frmpagos(); 
     frmpagos.setVisible(true);
     this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_textoPagosMouseClicked

    private void textoPagosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoPagosMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPagosMouseEntered

    private void textoPagosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoPagosMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPagosMouseExited

    private void textoPesajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoPesajeMouseClicked
        frmpesajesdata frmpesajesdata = new frmpesajesdata();
        frmpesajesdata.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_textoPesajeMouseClicked

    private void textoPesajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoPesajeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPesajeMouseEntered

    private void textoPesajeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoPesajeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPesajeMouseExited
*/

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmcoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcoach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
/*
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcoach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonDieta;
    private javax.swing.JPanel BotonPagos;
    private javax.swing.JPanel BotonPesaje;
    private javax.swing.JPanel CajaRegistrar1;
    private javax.swing.JPanel Registrarnuevofitness;
    private javax.swing.JLabel TextoCoach;
    private javax.swing.JLabel TextoLogin;
    private javax.swing.JLabel TextoMiembros;
    private javax.swing.JLabel TextoRegistrar1;
    private javax.swing.JLabel TextoRegistrar3;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textoPagos;
    private javax.swing.JLabel textoPesaje;
    private javax.swing.JLabel textodieta;
    // End of variables declaration//GEN-END:variables
}
*/