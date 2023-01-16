package sistema.dal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class conexion {
    
    Connection conectar = null;
    String  usuario="DDEVE"
            + "LOP";
    String contrasena="DATADEV20163q";
    String bd ="projectfn";
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
    
    public int ejecutarsentencia(String strSentenciaSQL){
        try{
            Connection con = null;
            con=conexionbd();
            ps=con.prepareStatement("INSERT INTO fitness VALUES (1002,'JUANITO PEREZ HERNANDEZ', 19, '1:70', 104);");
            return 1;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: N"+e.toString());
            return 0;
        }
    }
    
}
