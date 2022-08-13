package misiontic.Modelo.VO;
import java.sql.*;
import java.util.ArrayList;

import misiontic.Modelo.Dao.*;

public class Consulta3VO {
    public static ArrayList<String[]> valores(){
       
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();

        try {
             ResultSet rs = consulta3.Consulta();
             while(rs.next()) {
                 
                 String ID = rs.getInt("ID_Compra")+"";
                 String Constructora = rs.getString("Constructora");
                 String banco = rs.getString("Banco_Vinculado");
                 salida_vo.add(new String[]{ID+"", Constructora, banco});
             }
        } catch (Exception e) {
         //TODO: handle exception
            System.out.println(e);
        }
        return salida_vo;

     }
}
