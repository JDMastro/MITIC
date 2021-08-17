/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Vo.MaterialesVo;
import java.sql.*;
import Utils.JDBCUtilities;
import java.util.ArrayList;

/**
 *
 * @author jdmlm
 */
public class MaterialesDao {

    public ArrayList<MaterialesVo> consultarMateriales() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<MaterialesVo> listado_registros_rq1 = new ArrayList<>();
        String sql = "SELECT p.id_Proyecto, mc.Nombre_Material, mc.Importado from Compra c\n"
                + "    INNER JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto\n"
                + "	INNER JOIN MaterialConstruccion mc ON mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion\n"
                + "	WHERE c.ID_Proyecto = 1 OR c.ID_Proyecto = 184 OR c.ID_Proyecto = 400 ORDER by c.ID_Proyecto";
        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                MaterialesVo materiales = new MaterialesVo();
                materiales.setIdProyecto(rs.getInt("ID_Proyecto"));
                materiales.setNombreMaterial(rs.getString("Nombre_Material"));
                materiales.setImportado(rs.getString("Importado"));
                listado_registros_rq1.add(materiales);
            }
        }
        return listado_registros_rq1;
    }
}
