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
public class Potencia implements OperacionBinaria {

    @Override
    public float operar(float numero1, float numero2) {
        return (float) Math.pow(numero1, numero2);
    }
    
}
