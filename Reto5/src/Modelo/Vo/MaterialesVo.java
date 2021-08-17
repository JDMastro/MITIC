/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Vo;

/**
 *
 * @author jdmlm
 */
public class MaterialesVo {
    private int IdProyecto;
    private String NombreMaterial, importado;

    public MaterialesVo() {
    }

    public int getIdProyecto() {
        return IdProyecto;
    }

    public void setIdProyecto(int IdProyecto) {
        this.IdProyecto = IdProyecto;
    }

    public String getNombreMaterial() {
        return NombreMaterial;
    }

    public void setNombreMaterial(String NombreMaterial) {
        this.NombreMaterial = NombreMaterial;
    }

    public String getImportado() {
        return importado;
    }

    public void setImportado(String importado) {
        this.importado = importado;
    }
    
    
}
