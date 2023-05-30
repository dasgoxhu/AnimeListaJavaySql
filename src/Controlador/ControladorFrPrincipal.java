package Controlador;

import Metodos.ConectarSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ControladorFrPrincipal {
    public void eliminar(int codigo)
    {
        try
        {
            Connection con = ConectarSQL.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM Animes WHERE Id=?");
            ps.setInt(1, codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Anime Eliminado");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.toString());
        }        
    }
}
