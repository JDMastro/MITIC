/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tic;

import java.time.temporal.ValueRange;

/**
 *
 * @author jdmlm
 */
public class Grabado {

    //constantes
    private final static double PRECIOBASE = 350.0;
    private final static int ANTIGUEDAD = 50;
    private final static boolean AUTENTICADO = false;

    //atributos
    private int antiguedad;
    private boolean autenticado;
    private double precioBase;

    //constructor
    public Grabado(int antiguedad, boolean autenticado, double precioBase) {
        this.antiguedad = antiguedad;
        this.autenticado = autenticado;
        this.precioBase = precioBase;
    }

    public Grabado() {
        this.antiguedad = 0;
        this.precioBase = 0;
    }

    //METODOS
    public static double getPRECIOBASE() {
        return PRECIOBASE;
    }

    public static int getANTIGUEDAD() {
        return ANTIGUEDAD;
    }

    public static boolean isAUTENTICADO() {
        return AUTENTICADO;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double calcularPrecio() {
        double precioFinal = 0;
        if (antiguedad == 0 && precioBase == 0) {
            precioFinal = grabadoPorDefecto();
        } else {
            precioFinal = grabado();
        }

        return precioFinal;
    }

    private double grabadoPorDefecto() {
        return ANTIGUEDAD > 49 ? PRECIOBASE + (PRECIOBASE * 0.1) : 0;
    }

    private double grabado() {
        double precioFinal = 0;
        if (autenticado) {
            precioFinal = antiguedad < 50 ? precioBase + 800
                    : ValueRange.of(50, 70).isValidIntValue(antiguedad) ? (precioBase * 0.1) + precioBase + 800
                    : ValueRange.of(71, 120).isValidIntValue(antiguedad) ? (precioBase * 0.25) + precioBase + 800
                    : antiguedad > 120 ? (precioBase * 0.4) + (precioBase + 800) : 0;
        } else {
            precioFinal = antiguedad < 50 ? precioBase
                    : ValueRange.of(50, 70).isValidIntValue(antiguedad) ? (precioBase * 0.1) + precioBase
                    : ValueRange.of(71, 120).isValidIntValue(antiguedad) ? (precioBase * 0.25) + precioBase
                    : ValueRange.of(121, 99999).isValidIntValue(antiguedad) ? (precioBase * 0.4) + precioBase : 0;
        }
        return precioFinal;
    }

}