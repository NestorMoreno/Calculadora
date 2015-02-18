package Vista;

import Controlador.AnalizadorSintactico;
import Controlador.Calculadora;

/**
 *
 * @author Nestor Moreno - Daniel Sánchez
 */
public class Principal {
    
    public static void main(String[] args) {
        // Objeto que contiene la lógica de la Calculadora en el paquete Controlador
        Calculadora calculadora = new Calculadora();
        
        //Inicialmente los números van quemados para realizar pruebas 
        float numero1 = 2;
        float numero2 = 3;
        float resultado;
        
        //TODO: Se está trabajando en el Analizador sintáctico
        //AnalizadorSintactico.main(args);
        
        //Pruebas funcionales de los métodos unitarios
        resultado = calculadora.operar("sen", numero1);
        System.out.println("Sen: " + resultado);
        
        resultado = calculadora.operar("cos", numero1);
        System.out.println("Cos: " + resultado);
        
        resultado = calculadora.operar("tan", numero1);
        System.out.println("tan: " + resultado);
        
        resultado = calculadora.operar("sqr", numero1);
        System.out.println("Raíz cuadrada: " + resultado);
                
        //Pruebas funcionales de los métodos binarios
        resultado = calculadora.operar("+", numero1, numero2);
        System.out.println("La suma es: " + resultado);
        
        resultado = calculadora.operar("-", numero1, numero2);
        System.out.println("La resta es: " + resultado);
        
        resultado = calculadora.operar("*", numero1, numero2);
        System.out.println("La multiplicación es: " + resultado);
        
        resultado = calculadora.operar("/", numero1, numero2);
        System.out.println("La división es: " + resultado);
        
        resultado = calculadora.operar("^", numero1, numero2);
        System.out.println("Potencia: " + resultado);
        
    }
    
}
