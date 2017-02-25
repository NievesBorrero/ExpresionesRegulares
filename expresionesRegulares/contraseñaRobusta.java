package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utiles.Teclado;

/**
 *  Diseña una aplicación en Java que reconozca una contraseña robusta (tantas veces como el usuario quiera). Según las directivas 
 *  de nivel de dominio de Microsoft, para que una contraseña sea considerada segura, ha de cumplir una serie de instrucciones: 
 *  a. La contraseña tendrá una longitud de al menos seis caracteres. 
 *  b. La contraseña contendrá caracteres de tres de las cuatro categorías siguientes: 
 *  i. Caracteres en mayúsculas (A–Z) 
 *  ii. Caracteres en minúsculas (a–z) 
 *  iii. Base de 10 dígitos (0–9) 
 *  iv. Caracteres no alfanuméricos (por ejemplo: !, $, #, o %) 
 *  
 * @author Nieves Borrero
 *
 */
public class contraseñaRobusta {
	public static void main(String[]args){
		do{
		Pattern pattern = Pattern
				.compile("^(?=.*\\d)(?=.*\\W)(?=.*[a-z])(?=.*[A-Z]).{6,15}$"); // ?=.* da igual el orden
		// 6 grupos de 2 separados por :
		Matcher matcher = pattern
				.matcher(Teclado
						.leerCadena("Introduce una contraseña "));
		if (!matcher.find())
			System.out.println("La contraseña no es robusta");
		else
			System.out.println("La contraseña es robusta");
		
	}while(Teclado.deseaContinuar("Desea probar de nuevo?"));
	}
}
