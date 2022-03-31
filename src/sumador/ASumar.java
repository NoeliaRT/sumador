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
	 * Metodo que comprueba si un n�mero es negativo
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
