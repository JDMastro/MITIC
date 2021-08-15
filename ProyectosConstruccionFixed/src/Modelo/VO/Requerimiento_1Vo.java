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
public class Requerimiento_1Vo {
    private Integer ID_Lider;
    private Integer Salario;
    private String Ciudad_Residencia;

    public Requerimiento_1Vo() {
    }
    
    
    public Integer getID_Lider() {
        return ID_Lider;
    }

    public void setID_Lider(Integer ID_Lider) {
        this.ID_Lider = ID_Lider;
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
        return ID_Lider + " " + Salario + " " + Ciudad_Residencia;
    }
}
