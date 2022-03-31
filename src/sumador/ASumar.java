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
	 * Método que suma cada dígito de un número
	 * @param primero
	 * @return int
	 */
	public int SumaDigitos(String primero) {
		int suma = 0;
        for (int i = 0; i < primero.length(); i++) {
            // Cadena de un dígito.
            String digito = primero.substring(i, i+1);
            suma = suma + Integer.parseInt(digito);  //Conversión de caracter a entero
            if (i==primero.length()-1) {
            	 System.out.print(digito);
            }else
            System.out.print(digito+ "+");
        }
            System.out.println("="+suma);
        return suma;
	}
	
	
	


}
