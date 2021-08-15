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
    private String Proveedor;

    public Requerimiento_3Vo() {
    }

    public Integer getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(Integer ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String Proveedor) {
        this.Proveedor = Proveedor;
    }

    @Override
    public String toString() {
        return "  " + ID_Proyecto + "  " + Proveedor;
    }
}
