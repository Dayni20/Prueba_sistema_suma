package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import pruebasuma.PruebaSuma;

/**
 *
 * @author Luis Changoluisa
 */
public class TestSuma {
    
    public TestSuma() {
    }
    @Test
    public void probarSuma(){
        PruebaSuma suma=new PruebaSuma(3, 2);
        int resultado=suma.calcularSuma();
        assertEquals(3+2, 5);
        
    }
}
