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
public class Relieve extends Grabado {

    //Atributos  
    private boolean linografía;

    //Constructores
    public Relieve(int antiguedad, boolean autenticado, double precioBase, boolean linografía) {

        super(antiguedad, autenticado, precioBase);
        this.linografía = linografía;
    }

    //metodos
    @Override
    public double calcularPrecio() {
        double precioFinal;
        if (isAutenticado() && linografía) {
            precioFinal = getAntiguedad() < 50 ? getPrecioBase() + 800 + 700
                    : ValueRange.of(50, 70).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.1) + (getPrecioBase() + 800 + 700)
                    : ValueRange.of(71, 120).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.25) + (getPrecioBase() + 800 + 700)
                    : getAntiguedad() > 120 ? (getPrecioBase() * 0.4) + (getPrecioBase() + 800 + 700) : 0;
        } else {
            precioFinal = getAntiguedad() < 50 ? getPrecioBase()
                    : ValueRange.of(50, 70).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.1) + getPrecioBase()
                    : ValueRange.of(71, 120).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.25) + getPrecioBase()
                    : getAntiguedad() > 120 ? (getPrecioBase() * 0.4) + getPrecioBase() : 0;
        }

        return precioFinal;
    }

}
