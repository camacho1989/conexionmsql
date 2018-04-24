import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;

public class persona extends PersonaApp.personaPOA { 

    private ORB orb;
    
    @Override
    public boolean insertarpersona(int id, String nombre, String apellido, String direccion) {
       boolean resultado= false;
       
       try {
           String query="insert into persona(id,nombre,apellido,direccion)"
                   + "values ("+id+","+apellido+","+direccion+","+nombre+")";
       }
       catch (Exception e) {
           JOptionPane.shwMessageDialog(null, "Ocurrio un error "+e.getMessage());
       }
      return resultado;
       }
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
