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
        ArrayList<Requerimiento_2Vo> listado_registros_rq1 = new ArrayList<>();
        String sql = "SELECT p.id_Proyecto, mc.Nombre_Material, mc.Importado from Compra c INNER JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion WHERE c.ID_Proyecto = 1 OR c.ID_Proyecto = 184 OR c.ID_Proyecto = 400 ORDER by c.ID_Proyecto";

        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                requerimiento2.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento2.setNombre_Material(rs.getString("Nombre_Material"));
                requerimiento2.setImportado(rs.getString("Importado"));
                listado_registros_rq1.add(requerimiento2);
            }
        }

        return listado_registros_rq1;

    }
}
