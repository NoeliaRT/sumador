package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Cristian
 *
 */
public class TestAsumar {

	/**
	 * Prueba para comprobar m�todo sumativo
	 */	
	@Test
	 public void testsumativo() {
        ASumar sumo  = new ASumar();
        String resultado = sumo.sumativo("5");
        assertEquals("5 = 5",resultado );
        
	}
	
	/**
	 * Prueba para comprobar m�todo negativo
	 */
	@Test
	 public void testnegativo() {
       ASumar sumo  = new ASumar();
       String resultado = sumo.negativo("-54");
       assertEquals("negativo, siempre negativo", resultado );
       
	}
	
	/**
	 * Prueba para comprobar m�todo SumaDigitos
	 */
	@Test
	 public void testSumaDigitos() {
      ASumar sumo  = new ASumar();
      int resultado = sumo.SumaDigitos("57894564");
      assertEquals(48, resultado );
      
	}
}
