/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.VO.Requerimiento_3Vo;
import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jdmlm
 */
public class Requerimiento_3Dao {
     public ArrayList<Requerimiento_3Vo> requerimiento3() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_3Vo> listado_registros_rq1 = new ArrayList<Requerimiento_3Vo>();
        String sql = "select ID_Proyecto, Proveedor FROM Compra where ID_Proyecto > 119 AND ID_Proyecto < 125 order by ID_Proyecto";
        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_3Vo requerimiento3 = new Requerimiento_3Vo();
                requerimiento3.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento3.setProveedor(rs.getString("Proveedor"));
                listado_registros_rq1.add(requerimiento3);
            }
        }
        return listado_registros_rq1;
    }
}
