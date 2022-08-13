package misiontic.Modelo.VO;
import java.sql.*;
import java.util.ArrayList;

import misiontic.Modelo.Dao.*;
public class Consulta2VO {
    public static ArrayList<String[]> valores(){
       
        ArrayList<String[]> salida_vo = new ArrayList<String[]>();

        try {
             ResultSet rs = consulta2.Consulta();

             while(rs.next()) {
                 
                 String ID = rs.getInt("ID_Proyecto")+"";
                 String Constructora = rs.getString("Constructora");
                 String nh = rs.getString("Numero_Habitaciones");
                 String ciudad = rs.getString("Ciudad");
                 salida_vo.add(new String[]{ID+"", Constructora, nh, ciudad});
             }
        } catch (Exception e) {
         //TODO: handle exception
         System.out.println(e);
        } 
        return salida_vo;
     }
}
