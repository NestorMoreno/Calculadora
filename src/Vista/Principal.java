package Vista;

import Controlador.AnalizadorSintactico;
import Controlador.Calculadora;

/**
 *
 * @author Nestor Moreno - Daniel Sánchez
 */
public class Principal {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        float numero1 = 999999999;
        float numero2 = 0;
        float resultado;
        
        //AnalizadorSintactico.main(archivoPrueba);
                    System.out.println("Ejecutado!");
        resultado = calculadora.operar("/", numero1, numero2);
        
        System.out.println("El resultado es: " + resultado);
    }
    
}
