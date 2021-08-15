/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;

import Modelo.VO.Requerimiento_2Vo;
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
public class Requerimiento_2Dao {

    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_2Vo> listado_registros_rq1 = new ArrayList<Requerimiento_2Vo>();
        String sql = "SELECT ID_Lider, Nombre, Salario, Ciudad_Residencia from Lider\n"
                + "     where Ciudad_Residencia = \"Barranquilla\" AND Salario > (select min(Salario) from Lider) ORDER by Salario";
        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                requerimiento2.setID_Lider(rs.getInt("ID_Lider"));
                requerimiento2.setNombre(rs.getString("Nombre"));
                requerimiento2.setSalario(rs.getInt("Salario"));
                requerimiento2.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                listado_registros_rq1.add(requerimiento2);
            }
        }
        return listado_registros_rq1;
    }
}
