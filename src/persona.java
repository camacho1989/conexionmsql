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
           String query="insert into persona(id,nombre,apellidos,direccion)"
                   + "values ('"+id+" ','"+apellidos+" ','"+direccion+"','"+nombre+"')";
           
           conex.conexion();
           try (Statement st = conex.conex.createStatement()) {
               int valor=st.executeUpdate(query);
               if (valor > 0) {
                   resultado=true;
               }
               //cerramos los recursos.
           }
           conex.conex.close();
       }
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.getMessage());
       }
      return resultado;
       }
    
    

    @Override
    public String consultarpersona(int id) {
                String resultado= "";
        try {
            String query = "select * from persona WHERE id=" + id;
            conex.conexion();
            ResultSet rs;
            try (Statement st = conex.conex.createStatement()) {
                rs = st.executeQuery(query);
                while (rs.next()){
                    
                    resultado+= rs.getLong(1)+ "_" + rs.getString(4)+ "_" + rs.getString(2)+ "_" +rs.getString(3)+ "\n";{           
                }

                }   }
             rs.close();
             conex.conex.close();            
           
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "ocurrio un error"+e.getLocalizedMessage());
        }
        return resultado;
    }

    @Override
    public boolean eliminarpersona(int id) {
       boolean resultado= false;
       
       try {
           String query= "DELETE from persona where id='"+id+"'";
           
           conex.conexion();
           try (Statement st = conex.conex.createStatement()) {
               int valor=st.executeUpdate(query);
               if (valor > 0) {
                   resultado=true;
               }
               //cerramos los recursos.
           }
           conex.conex.close();
       }
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.getMessage());
       }
      return resultado;
      
        
       
    }

    @Override
    public boolean actualizarpersona(int id, String nombre, String apellidos, String direccion) {
       boolean resultado= false;
       
       try {
           String query= "UPDATE persona set nombre= '"+nombre+"', apellidos='"+apellidos+"', direccion='"+direccion+"' WHERE id='"+id+"'";
           
           conex.conexion();
           try (Statement st = conex.conex.createStatement()) {
               int valor=st.executeUpdate(query);
               if (valor > 0) {
                   resultado=true;
               }
               //cerramos los recursos.
           }
           conex.conex.close();
       }
       catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Ocurrio un error "+e.getMessage());
       }
      return resultado;
      
        
       
    }

    @Override
    public String listarpersona() {
        String resultado= "";
        try {
            String query = "select * from persona";
            conex.conexion();
            ResultSet rs;
            try (Statement st = conex.conex.createStatement()) {
                rs = st.executeQuery(query);
                while (rs.next()){
                    
                    resultado+= rs.getLong(1)+ "_" + rs.getString(4)+ "_" + rs.getString(2)+ "_" +rs.getString(3)+ "\n";{
                    
                }
                    //cerramos los recursos.
                    
                }   }
             rs.close();
             conex.conex.close();            
           
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, "ocurrio un error"+e.getLocalizedMessage());
        }
        return resultado;
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void consultarpersona(int parseInt, String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void eliminarpersona(int parseInt, String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String actualizarpersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}

