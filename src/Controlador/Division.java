package Controlador;

/**
 *
 * @author Nestor Moreno - Daniel Sánchez
 */
public class Division implements Operacion{

    @Override
    public float operar(float numero1, float numero2) {
        return (numero1 / numero2);
    }
    
}
