/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Nestorm
 */
public class Coseno implements OperacionUnitaria {

    @Override
    public float operar(float numero1) {
        return (float) Math.cos(numero1);
    }
    
}
