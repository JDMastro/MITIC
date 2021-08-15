/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorRequerimientos;
import Modelo.VO.Requerimiento_1Vo;
import Modelo.VO.Requerimiento_2Vo;
import Modelo.VO.Requerimiento_3Vo;
import Modelo.VO.Requerimiento_4Vo;
import Modelo.VO.Requerimiento_5Vo;
import java.util.ArrayList;

/**
 *
 * @author jdmlm
 */
public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {
        try {
            ArrayList<Requerimiento_1Vo> resultado_requerimiento1 = controlador.consultarRequerimiento1();
            resultado_requerimiento1.forEach(System.out::println);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento2() {
        try {
            ArrayList<Requerimiento_2Vo> resultado_requerimiento2 = controlador.consultarRequerimiento2();
            resultado_requerimiento2.forEach(System.out::println);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento3() {
        try {
            ArrayList<Requerimiento_3Vo> resultado_requerimiento3 = controlador.consultarRequerimiento3();
            resultado_requerimiento3.forEach(System.out::println);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento4() {
        try {
            ArrayList<Requerimiento_4Vo> resultado_requerimiento4 = controlador.consultarRequerimiento4();
            resultado_requerimiento4.forEach(System.out::println);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void requerimiento5() {
        try {
            ArrayList<Requerimiento_5Vo> resultado_requerimiento5 = controlador.consultarRequerimiento5();
            resultado_requerimiento5.forEach(System.out::println);
            // Su código
        } catch (Exception e) {
            System.err.println(e);
        }
    }

}
