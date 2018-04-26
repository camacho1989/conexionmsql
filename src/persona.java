import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;


public class persona extends PersonaApp.personaPOA { 

    private ORB orb;
    Conexion conex =new Conexion();
    
    @Override
    public boolean insertarpersona(int id, String nombre, String apellidos, String direccion) {
       boolean resultado= false;
       
       try {
           String query="insert into persona(id,nombre,apellido,direccion)"
                   + "values ('"+id+" ','"+apellidos+" ','"+direccion+"','"+nombre+"')";
           
           conex.conexion();
           Statement st = conex.conex.createStatement();
           int valor=st.executeUpdate(query);
           if (valor > 0) {
               resultado=true;
           }
           //cerramos los recursos.
           
           st.close();
           conex.conex.close();
       }
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.getMessage());
       }
      return resultado;
       }
    
    

    @Override
    public String consultarpersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarpersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarpersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarpersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
