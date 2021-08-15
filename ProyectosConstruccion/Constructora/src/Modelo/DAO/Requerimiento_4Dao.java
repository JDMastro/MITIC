/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.VO.Requerimiento_4Vo;
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
public class Requerimiento_4Dao {

    public ArrayList<Requerimiento_4Vo> requerimiento4() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_4Vo> listado_registros_rq1 = new ArrayList<Requerimiento_4Vo>();
        String sql = "select ID_Proyecto, Proveedor FROM Compra where ID_Proyecto > 119 AND ID_Proyecto < 125";
        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_4Vo requerimiento4 = new Requerimiento_4Vo();
                requerimiento4.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento4.setProveedor(rs.getString("Proveedor"));
                listado_registros_rq1.add(requerimiento4);
            }
        }
        return listado_registros_rq1;
    }
}
