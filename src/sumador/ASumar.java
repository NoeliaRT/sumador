package sumador;

/**
 * @author Noelia
 * 
 */
public class ASumar {
	
	ASumar(){
		
	}

	 /**
	 * Método que comprueba el número y si es mayor de un digito y positivo 
	 * suma sus digitos con SumaDigitos()
	 * @param cadena
	 * @return String 
	 */
	
	public String sumativo (String cadena) {
	        String numero = cadena;
	        String resultado= "";
	        char menor='-';
	        if (numero.length() == 1 && numero.charAt(0)!= menor) {
	        	resultado = numero + " = " + numero;
	           System.out.println(resultado);	           
	        }else
	        	
	        	if (numero.charAt(0)==menor){
	        		resultado= "negativo, siempre negativo";
	      		  System.out.println(resultado);
	        	
	            }else SumaDigitos(numero);
	        
	    return resultado;
	}

	
	/**
	 * Método que suma cada dígito de un número positivo
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
