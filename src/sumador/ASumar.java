package sumador;

/**
 * @author Noelia
 * 
 */
public class ASumar {
	
	ASumar(){
		
	}

	 /**
	 * Metodo sumativo que comprueba si el número es de 1 dígito
	 * @param cadena
	 * @return String 
	 */
	
	public String sumativo (String cadena) {
	        String numero = cadena;
	        String resultado= "";
	        if (numero.length() == 1) {
	        	resultado = numero + " = " + numero;
	           System.out.println(resultado);
	        } 
	    return resultado;
	}

	/**
	 * Metodo que comprueba si un número es negativo
	 * @param cadena
	 * @return String
	 */
	public String negativo(String cadena) {
		 String numero = cadena;		 
	     String resultado= "";
	     char menor='-';			
		if (numero.charAt(0)==menor) { 		 
		  resultado= "negativo, siempre negativo";
		  System.out.println(resultado);
		}
		return resultado;
	}
	
	
	

/**
 * @param args
 */
public static void main(String[] args) {
	
	 ASumar numero  = new ASumar();
	
	  numero.sumativo("5");
	  numero.negativo("-54");
	  
	  
}

}
