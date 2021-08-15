/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.DAO;
import Modelo.VO.Requerimiento_1Vo;
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
public class Requerimiento_1Dao {
     public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_1Vo> listado_registros_rq1 = new ArrayList<Requerimiento_1Vo>();
        String sql = "SELECT ID_Lider, Nombre, Salario, Ciudad_Residencia from Lider\n"
                + "     where Ciudad_Residencia = \"Barranquilla\" AND Salario > (select min(Salario) from Lider) ORDER by Salario";
        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setID_Lider(rs.getInt("ID_Lider"));
                requerimiento1.setSalario(rs.getInt("Salario"));
                requerimiento1.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                listado_registros_rq1.add(requerimiento1);
            }
        }
        return listado_registros_rq1;
    }
}
