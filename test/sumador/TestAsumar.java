package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Cristian
 *
 */
public class TestAsumar {

	/**
	 * Prueba para comprobar método sumativo
	 */	
	@Test
	 public void testsumativo() {
        ASumar sumo  = new ASumar();
        String resultado = sumo.sumativo("5");
        assertEquals("5 = 5",resultado );
        
	}
	
	/**
	 * Prueba para comprobar método negativo
	 */
	@Test
	 public void testnegativo() {
       ASumar sumo  = new ASumar();
       String resultado = sumo.negativo("-54");
       assertEquals("negativo, siempre negativo", resultado );
       
	}
}
