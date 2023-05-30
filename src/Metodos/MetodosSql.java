package Metodos;
import java.sql.*;

public class MetodosSql 
{
   public static ConectarSQL conexion = new ConectarSQL();
   
   public static PreparedStatement sentecionaPreparada;
   public static ResultSet resultado;
   public static String sql; 
   public static int resultadoNumero = 0; 

   public int guardar(String Usuario, String Correo, String Contraseña)
   {
       int resultado = 0;
       Connection conexion = null;
       
       String sentenciaGuardar = ("INSERT INTO Logins (Usuario,Correo,Contraseña) VALUES (?,?,?)");
       
       try
       {
           conexion = ConectarSQL.getConexion();
           sentecionaPreparada = conexion.prepareStatement(sentenciaGuardar);
           sentecionaPreparada.setString(1, Usuario);
           sentecionaPreparada.setString(2, Correo);
           sentecionaPreparada.setString(3, Contraseña);
           
           resultado = sentecionaPreparada.executeUpdate();
           sentecionaPreparada.close();
           conexion.close();
       }
       catch(SQLException e)
       {
           System.out.println(e);
       } 
       return resultado;
   }
   
   public static String buscarNombre(String Usuario)
   {
       String busquedaNombre = "";
       Connection conexion = null;
       try
       {
           conexion = ConectarSQL.getConexion();
           String sentenciaBuscar  = ("SELECT usuario FROM Logins WHERE Usuario = '"+ Usuario + " ' ");
           sentecionaPreparada = conexion.prepareStatement(sentenciaBuscar);
           resultado = sentecionaPreparada.executeQuery();
           if(resultado.next())
           {
               String Usuario1 = resultado.getString("Usuario");
               busquedaNombre = Usuario1;
           }
           conexion.close();
       }
       catch(SQLException e)
       {
           System.out.println(e);
       }    
       return busquedaNombre;
   }
   
   public static String buscarUsuario(String Usuario,String Contraseña)
   {
       String busquedaUsuario = null;
       Connection conexion = null;
       try
       {
           conexion = ConectarSQL.getConexion();
           String sentenciaUsuario = ("SELECT Usuario,Correo,Contraseña FROM Logins WHERE Usuario = '"+Usuario+"' AND Contraseña = '"+Contraseña+"'");
           sentecionaPreparada = conexion.prepareStatement(sentenciaUsuario);
           resultado = sentecionaPreparada.executeQuery();
           if(resultado.next())
           {
               busquedaUsuario = "Usuario Encontrado";
           }
           else
           {
               busquedaUsuario = "Usuario No Encontrado"; 
           }    
           conexion.close();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }    
       return busquedaUsuario;
   }        

    public String busquedaNombre(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
