/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.LideresDao;
import Modelo.Dao.MaterialesDao;
import Modelo.Vo.LideresVo;
import Modelo.Vo.MaterialesVo;
import java.util.ArrayList;

import java.sql.SQLException;

/**
 *
 * @author jdmlm
 */
public class Controlador {

   private LideresDao lideresDao;
   private MaterialesDao materialesDao;

    public Controlador() {
        this.lideresDao = new LideresDao();
        this.materialesDao = new MaterialesDao();
    }
    
    public ArrayList<LideresVo> consultarLideres() throws SQLException {
        return this.lideresDao.consultarLideres();
    }
    
    public ArrayList<MaterialesVo> consultarMateriales() throws SQLException {
        return this.materialesDao.consultarMateriales();
    }
    
    public void insertarLider(LideresVo l) throws SQLException {
        this.lideresDao.insertarLideres(l);
    }
    
}
