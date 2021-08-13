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
public class Plano extends Grabado {

    //Atributos
    private String procedimiento;

    //Constructores
    public Plano(int antiguedad, boolean autenticado, double precioBase, String procedimiento) {
        super(antiguedad, autenticado, precioBase);
        this.procedimiento = procedimiento;
    }

    //metodos
    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        if (isAutenticado()) {
            switch (procedimiento) {
                case "SERIGRAFIA" ->
                    precioFinal = getAntiguedad() < 50 ? getPrecioBase() + 800 + 700
                            : ValueRange.of(50, 70).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.1) + (getPrecioBase() + 800 + 700)
                            : ValueRange.of(71, 120).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.25) + (getPrecioBase() + 800 + 700)
                            : getAntiguedad() > 120 ? (getPrecioBase() * 0.4) + (getPrecioBase() + 800 + 700) : 0;
                case "MONOPATIA" ->
                    precioFinal = getAntiguedad() < 50 ? getPrecioBase() + 800 + 300
                            : ValueRange.of(50, 70).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.1) + (getPrecioBase() + 800 + 300)
                            : ValueRange.of(71, 120).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.25) + (getPrecioBase() + 800 + 300)
                            : getAntiguedad() > 120 ? (getPrecioBase() * 0.4) + (getPrecioBase() + 800 + 300) : 0;

                case "LITOGRAFIA" ->
                    precioFinal = getAntiguedad() < 50 ? getPrecioBase() + 800 + 100
                            : ValueRange.of(50, 70).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.1) + (getPrecioBase() + 800 + 100)
                            : ValueRange.of(71, 120).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.25) + (getPrecioBase() + 800 + 100)
                            : getAntiguedad() > 120 ? (getPrecioBase() * 0.4) + (getPrecioBase() + 800 + 100) : 0;
            }
        } else {
            switch (procedimiento) {
                case "SERIGRAFIA" ->
                    precioFinal = getAntiguedad() < 50 ? getPrecioBase() + 700
                            : ValueRange.of(50, 70).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.1) + (getPrecioBase() + 700)
                            : ValueRange.of(71, 120).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.25) + (getPrecioBase() + 700)
                            : getAntiguedad() > 120 ? (getPrecioBase() * 0.4) + (getPrecioBase() + 700) : 0;
                case "MONOPATIA" ->
                    precioFinal = getAntiguedad() < 50 ? getPrecioBase() + 300
                            : ValueRange.of(50, 70).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.1) + (getPrecioBase() + 300)
                            : ValueRange.of(71, 120).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.25) + (getPrecioBase() + 300)
                            : getAntiguedad() > 120 ? (getPrecioBase() * 0.4) + (getPrecioBase() + 300) : 0;
                case "LITOGRAFIA" ->
                    precioFinal = getAntiguedad() < 50 ? getPrecioBase() + 100
                            : ValueRange.of(50, 70).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.1) + (getPrecioBase() + 100)
                            : ValueRange.of(71, 120).isValidIntValue(getAntiguedad()) ? (getPrecioBase() * 0.25) + (getPrecioBase() + 100)
                            : getAntiguedad() > 120 ? (getPrecioBase() * 0.4) + (getPrecioBase() + 100) : 0;
            }
        }
        return precioFinal;
    }

}
