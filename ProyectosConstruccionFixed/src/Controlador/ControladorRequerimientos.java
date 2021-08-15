/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DAO.Requerimiento_1Dao;
import Modelo.DAO.Requerimiento_2Dao;
import Modelo.DAO.Requerimiento_3Dao;
import Modelo.VO.Requerimiento_1Vo;
import Modelo.VO.Requerimiento_2Vo;
import Modelo.VO.Requerimiento_3Vo;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author jdmlm
 */
public class ControladorRequerimientos {
    
    private Requerimiento_1Dao requerimiento_1Dao;
    private Requerimiento_2Dao requerimiento_2Dao;
    private Requerimiento_3Dao requerimiento_3Dao;
    /*private Requerimiento_4Dao requerimiento_4Dao;
    private Requerimiento_5Dao requerimiento_5Dao;*/

    public ControladorRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.requerimiento_3Dao = new Requerimiento_3Dao();
        /*this.requerimiento_4Dao = new Requerimiento_4Dao();
        this.requerimiento_5Dao = new Requerimiento_5Dao();*/
    }

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        return this.requerimiento_1Dao.requerimiento1();
    }

   public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        return this.requerimiento_2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3Vo> consultarRequerimiento3() throws SQLException {
        return this.requerimiento_3Dao.requerimiento3();
    }

    /*public ArrayList<Requerimiento_4Vo> consultarRequerimiento4() throws SQLException {
        return this.requerimiento_4Dao.requerimiento4();
    }

    public ArrayList<Requerimiento_5Vo> consultarRequerimiento5() throws SQLException {
        return this.requerimiento_5Dao.requerimiento5();
    }*/
    
}
