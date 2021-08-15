/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.VO;

/**
 *
 * @author jdmlm
 */
public class Requerimiento_3Vo {

    private Integer ID_Proyecto;
    private String Nombre_Material;
    private String Importado;

    public Requerimiento_3Vo() {
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getNombre_Material() {
        return Nombre_Material;
    }

    public void setNombre_Material(String Nombre_Material) {
        this.Nombre_Material = Nombre_Material;
    }

    public String getImportado() {
        return Importado;
    }

    public void setImportado(String Importado) {
        this.Importado = Importado;
    }

    @Override
    public String toString() {
        return "  " + ID_Proyecto + "  " + Nombre_Material + "  " + Importado;
    }

}
