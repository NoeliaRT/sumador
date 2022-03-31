package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Cristian
 *
 */
public class TestAsumar {

	/**
	 * Prueba para comprobar n�mero de 1 cifra
	 */	
	@Test
	 public void testUnaCifra() {
        ASumar sumo  = new ASumar();
        String resultado = sumo.sumativo("5");
        assertEquals("5 = 5",resultado );
        
	}
}
