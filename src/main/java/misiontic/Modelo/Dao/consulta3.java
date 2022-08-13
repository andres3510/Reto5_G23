package misiontic.Modelo.Dao;
import java.sql.*;
import misiontic.Utilidades.*;

public class consulta3 {
    public static ResultSet Consulta(){
        ResultSet rs = null;
        String csql="SELECT ID_Compra, Constructora, Banco_Vinculado FROM Compra JOIN Proyecto USING(ID_PROYECTO) WHERE Proveedor == 'Homecenter' AND Ciudad == 'Salento';";
        try{
            Connection conn = JDBCUtilities.conexion();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(csql);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        return rs;
    }
}
