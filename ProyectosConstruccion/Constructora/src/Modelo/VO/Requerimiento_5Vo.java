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
public class Requerimiento_5Vo {

    private Integer Clasificacion;
    private double Promedio;

    public Requerimiento_5Vo() {
    }

    public Integer getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(Integer Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }

    @Override
    public String toString() {
        return "  " + Clasificacion + "  " + Promedio;
    }

}
