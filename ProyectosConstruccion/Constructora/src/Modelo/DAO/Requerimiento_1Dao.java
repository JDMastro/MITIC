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
        ArrayList<Requerimiento_1Vo> listado_registros_rq1 = new ArrayList<>();
        String sql = "SELECT p.ID_Proyecto , p.Constructora, p.Numero_Habitaciones FROM Proyecto p WHERE p.Clasificacion ='Apartaestudio' and p.Numero_Habitaciones >=3;";
        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setIdProyecto(rs.getInt("ID_Proyecto"));
                requerimiento1.setConstructora(rs.getString("Constructora"));
                requerimiento1.setHabitaciones(rs.getInt("Numero_Habitaciones"));
                listado_registros_rq1.add(requerimiento1);
            }
        }
        return listado_registros_rq1;
    }
}
