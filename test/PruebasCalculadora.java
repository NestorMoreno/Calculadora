import Controlador.Operacion;
import Controlador.Suma;
import Controlador.Resta;
import Controlador.Multiplicacion;
import Controlador.Division;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Nestor Moreno - Daniel Sánchez
 */
public class PruebasCalculadora {
    
    Operacion operacion;
            
    public PruebasCalculadora() {
    }

    @Test
    public void Sumar() throws ArithmeticException{
        operacion = new Suma();
        operacion.operar(999999999, 99999999);
    }
    
    @Test
    public void DivisionPorCero() throws ArithmeticException{
        operacion = new Division();
        operacion.operar(999999999, 0);
    }

}
