package sumador;

/**
 * @author Noelia
 * 
 */
public class ASumar {
	
	ASumar(){
		
	}

	 /**
	 * Metodo sumativo que comprueba si el n�mero es de 1 d�gito
	 * @param cadena
	 * @return String 
	 **/
	
	public String sumativo (String cadena) {
	        String numero = cadena;
	        String resultado= "";
	        if (numero.length() == 1) {
	        	resultado = numero + " = " + numero;
	           
	        } 
	    return resultado;
	}
}
