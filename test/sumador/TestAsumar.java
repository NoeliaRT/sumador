package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Noelia
 *
 */
public class TestAsumar {

	/**
	 * Prueba para comprobar que el número es de una cifra
	 */	
	@Test
	 public void testUnaCifra() {
        ASumar sumo  = new ASumar();
        String resultado = sumo.sumativo("5");
        assertEquals("5 = 5",resultado );
        
	}
	
	/**
	 * Prueba para comprobar si es negativo
	 */
	@Test
	 public void testnegativo() {
       ASumar sumo  = new ASumar();
       String resultado = sumo.sumativo("-54");
       assertEquals("negativo, siempre negativo", resultado );
       
	}
	
	/**
	 * Prueba para comprobar método SumaDigitos
	 */
	@Test
	 public void testSumaDigitos() {
      ASumar sumo  = new ASumar();
      int resultado = sumo.SumaDigitos("57894564");
      assertEquals(48, resultado );
      
	}
}
