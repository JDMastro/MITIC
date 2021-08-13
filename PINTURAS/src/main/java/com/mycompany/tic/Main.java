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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*Grabado[] grabados = new Grabado[5];
        grabados[0] = new Grabado(60, true, 1000.0);
        grabados[1] = new Relieve(65, true, 1000.0, true);
        grabados[2] = new Plano(66, true, 80.0, "SERIGRAFIA");
        grabados[3] = new Plano(90, true, 180.0, "MONOPATIA");
        grabados[4] = new Grabado();
        ValorTotal respuesta = new ValorTotal(grabados);
        respuesta.mostrarTotales();*/
        
        Grabado[] grabados = new Grabado[4];
        grabados[0] = new Grabado();
        grabados[1] = new Grabado(80, false, 3000.0);
        grabados[2] = new Relieve(90, false, 2000.0, false);
        grabados[3] = new Plano(35, true, 90.0, "LITOGRAFIA");
        ValorTotal respuesta = new ValorTotal(grabados);
        respuesta.mostrarTotales();
        
    }
    
}
