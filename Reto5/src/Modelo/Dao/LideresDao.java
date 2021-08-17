/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Vo.LideresVo;
import java.sql.*;
import Utils.JDBCUtilities;
import java.util.ArrayList;

/**
 *
 * @author jdmlm
 */
public class LideresDao {

    public ArrayList<LideresVo> consultarLideres() throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<LideresVo> listado_registros_rq1 = new ArrayList<>();
        String sql = "SELECT ID_Lider, Nombre, Salario, Ciudad_Residencia from Lider\n"
                + "     where Ciudad_Residencia = \"Barranquilla\" AND Salario > (select min(Salario) from Lider) ORDER by Salario";
        try ( Statement stmt = connection.createStatement();  ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                LideresVo lideres = new LideresVo();
                lideres.setIdLider(rs.getInt("ID_Lider"));
                lideres.setSalario(rs.getInt("Salario"));
                lideres.setCiudadResidencia(rs.getString("Ciudad_Residencia"));
                listado_registros_rq1.add(lideres);
            }
        }
        return listado_registros_rq1;
    }

    public void insertarLideres(LideresVo l) throws SQLException {
        Connection connection = JDBCUtilities.getConnection();
        ResultSet rs = null;
        PreparedStatement pst = null;
        String sql = "insert into Lider (Nombre,Primer_Apellido,Segundo_Apellido, Salario,Ciudad_Residencia,Cargo,Clasificacion,Documento_Identidad,Fecha_Nacimiento)\n"
                + "values(?,?,?,?,?,?,?,?,?)";
        try  {
            pst = connection.prepareStatement(sql);
            
            /*PreparedStatement ps = connection.prepareStatement(sql);*/

            pst.setString(1, l.getNombre());
            pst.setString(2, l.getPrimerApellido());
            pst.setString(3, l.getSegundoApellido());

            pst.setInt(4, l.getSalario());
            pst.setString(5, l.getCiudadResidencia());
            pst.setString(6, l.getCargo());

            pst.setInt(7, l.getClasificacion());
            pst.setString(8, l.getDocumentoIdentidad());
            pst.setString(9, l.getFechaNacimiento());
            
            pst.execute();
            
            //stmt.executeUpdate(sql);
            //connection.commit();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
