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
public class LideresVo {
    private Integer IdLider, Salario, Clasificacion;
    private String ciudadResidencia, Nombre, PrimerApellido, SegundoApellido, Cargo, DocumentoIdentidad, fechaNacimiento;

    public LideresVo() {
    }

    public int getClasificacion() {
        return Clasificacion;
    }

    public void setClasificacion(int Clasificacion) {
        this.Clasificacion = Clasificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(String DocumentoIdentidad) {
        this.DocumentoIdentidad = DocumentoIdentidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdLider() {
        return IdLider;
    }

    public void setIdLider(int IdLider) {
        this.IdLider = IdLider;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
    
    
    
}
