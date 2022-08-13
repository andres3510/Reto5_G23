package misiontic.Modelo.Dao;

import java.sql.*;

import misiontic.Utilidades.*;

public class consulta1 {
    public static ResultSet Consulta1(){
        ResultSet rs = null;
        String csql="SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
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
