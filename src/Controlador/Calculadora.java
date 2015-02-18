package Controlador;

import java.util.HashMap;

/**
 *
 * @author Nestor Moreno - Daniel Sánchez
 */
public class Calculadora {
    HashMap operaciones = new HashMap();
    
    public Calculadora(){        
        operaciones.put("+", new Suma());
        operaciones.put("-", new Resta());
        operaciones.put("*", new Multiplicacion());
        operaciones.put("/", new Division());
        operaciones.put("sen", new Seno());
        operaciones.put("cos", new Coseno());
        operaciones.put("tan", new Tangente());
        operaciones.put("sqr", new RaizCuadrada());
        operaciones.put("^", new Potencia());
    }
    
    
    /**
     * Método encargado de realizar la operación unitaria solicitada a partir del operador recibido
     * @param operador Tipo de operación que se realizará
     * @param numero1 Primer número
     * @return Retorno de la operación realizada
     */
    public float operar(String operador, float numero1)
    {        
        OperacionUnitaria calculo = (OperacionUnitaria)(operaciones.get(operador));   
        return calculo.operar(numero1);
    }
    
    /**
     * Método encargado de realizar la operación binaria solicitada a partir del operador recibido
     * @param operador Tipo de operación que se realizará
     * @param numero1 Primer número
     * @param numero2 Segundo Número
     * @return Retorno de la operación realizada
     */
    public float operar(String operador, float numero1, float numero2)
    {        
        OperacionBinaria calculo = (OperacionBinaria)(operaciones.get(operador));   
        return calculo.operar(numero1, numero2);
    }
}
