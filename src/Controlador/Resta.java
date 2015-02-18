package Controlador;

/**
 *
 * @author Nestor Moreno - Daniel Sánchez
 */
public class Resta implements OperacionBinaria{
    
    @Override
    public float operar(float numero1, float numero2) {
        float res = (numero1 - numero2);
        return res;
    }
    
}
