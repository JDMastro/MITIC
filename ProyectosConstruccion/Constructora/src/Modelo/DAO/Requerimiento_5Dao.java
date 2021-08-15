/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.VO.Requerimiento_5Vo;
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
public class Requerimiento_5Dao {

    public ArrayList<Requerimiento_5Vo> requerimiento5() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_5Vo> listado_registros_rq1 = new ArrayList<Requerimiento_5Vo>();
        String sql = "SELECT Clasificacion, avg(Salario) as Promedio from Lider Where Salario < 500000 \n"
                + "GROUP by Clasificacion ORDER by Promedio DESC";
        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_5Vo requerimiento5 = new Requerimiento_5Vo();
                requerimiento5.setClasificacion(rs.getInt("Clasificacion"));
                requerimiento5.setPromedio(rs.getDouble("Promedio"));
                listado_registros_rq1.add(requerimiento5);
            }
        }
        return listado_registros_rq1;
    }
}
