package Controlador;

import java.util.HashMap;

/**
 *
 * @author Nestor Moreno - Daniel Sánchez
 */
public class Calculadora {
    HashMap operaciones = new HashMap();
    
    public Calculadora(){
        Operacion sumar = new Suma();
        Operacion restar = new Resta();
        Operacion multiplicar = new Multiplicacion();
        Operacion division = new Division();
        
        operaciones.put("+", sumar);
        operaciones.put("-", restar);
        operaciones.put("*", multiplicar);
        operaciones.put("/", division);
    }
    
    /**
     * Método encargado de realizar la operación solicitada a partir del operador recibido
     * @param operador Tipo de operación que se realizará
     * @param numero1 Primer número
     * @param numero2 Segundo Número
     * @return Retorno de la operación realizada
     */
    public float operar(String operador, float numero1, float numero2)
    {        
        Operacion calculo = (Operacion)(operaciones.get(operador));   
        return calculo.operar(numero1, numero2);
    }
}
