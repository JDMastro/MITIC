/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tic;

/**
 *
 * @author jdmlm
 */
public class ValorTotal {

    //Atributos
    private Grabado[] listaGrabados;
    //Constructores

    public ValorTotal(Grabado[] listaGrabados) {
        this.listaGrabados = listaGrabados;
    }

    //metodos
    public void mostrarTotales() {

        double valorTotalGrabados = 0;
        double valorTotalGrabadosRelieve = 0;
        double valorTotalGrabadosPlanos = 0;
        double totalColeccion = 0;

        for (int i = 0; i < listaGrabados.length; i++) {
            if (listaGrabados[i].getClass().getName() == "com.mycompany.tic.Grabado") {
                valorTotalGrabados += listaGrabados[i].calcularPrecio();
            }

            if (listaGrabados[i].getClass().getName() == "com.mycompany.tic.Relieve") {
                valorTotalGrabadosRelieve += listaGrabados[i].calcularPrecio();
            }

            if (listaGrabados[i].getClass().getName() == "com.mycompany.tic.Plano") {
                valorTotalGrabadosPlanos += listaGrabados[i].calcularPrecio();
            }
            
            

        }
        totalColeccion = valorTotalGrabados + valorTotalGrabadosRelieve + valorTotalGrabadosPlanos;

        System.out.println(Math.round(valorTotalGrabados));
        System.out.println(Math.round(valorTotalGrabadosRelieve));
        System.out.println(Math.round(valorTotalGrabadosPlanos));
        System.out.println(Math.round(totalColeccion));

    }
}
