/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author E200
 */
public class Suma implements Operacion {

    @Override
    public float operar(float numero1, float numero2)throws ArithmeticException{
        float res = (numero1 + numero2);
        return res;
    }
    
}
