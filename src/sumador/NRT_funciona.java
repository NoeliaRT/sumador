/**
 * 
 */
package sumador;

import java.util.Scanner;

/**
 * @author Noelia
 *
 */
public class NRT_funciona {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduzca un número: ");
		String numero=sc.nextLine();
		ASumar sumo = new ASumar();
		sumo.sumativo(numero);
	}

}
