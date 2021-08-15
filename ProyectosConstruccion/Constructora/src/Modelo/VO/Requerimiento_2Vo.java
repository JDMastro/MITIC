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
public class Requerimiento_2Vo {

    private Integer ID_Lider;
    private String Nombre;
    private Integer Salario;
    private String Ciudad_Residencia;

    public Requerimiento_2Vo() {
    }

    public Integer getID_Lider() {
        return ID_Lider;
    }

    public void setID_Lider(Integer ID_Lider) {
        this.ID_Lider = ID_Lider;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getSalario() {
        return Salario;
    }

    public void setSalario(Integer Salario) {
        this.Salario = Salario;
    }

    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }

    public void setCiudad_Residencia(String Ciudad_Residencia) {
        this.Ciudad_Residencia = Ciudad_Residencia;
    }

    @Override
    public String toString() {
        return ID_Lider + " " + Nombre + " " + Salario + " " + Ciudad_Residencia;
    }
}
