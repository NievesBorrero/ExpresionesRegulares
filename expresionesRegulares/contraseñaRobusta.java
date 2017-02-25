package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import utiles.Teclado;

/**
 *  Dise�a una aplicaci�n en Java que reconozca una contrase�a robusta (tantas veces como el usuario quiera). Seg�n las directivas 
 *  de nivel de dominio de Microsoft, para que una contrase�a sea considerada segura, ha de cumplir una serie de instrucciones: 
 *  a. La contrase�a tendr� una longitud de al menos seis caracteres. 
 *  b. La contrase�a contendr� caracteres de tres de las cuatro categor�as siguientes: 
 *  i. Caracteres en may�sculas (A�Z) 
 *  ii. Caracteres en min�sculas (a�z) 
 *  iii. Base de 10 d�gitos (0�9) 
 *  iv. Caracteres no alfanum�ricos (por ejemplo: !, $, #, o %) 
 *  
 * @author Nieves Borrero
 *
 */
public class contrase�aRobusta {
	public static void main(String[]args){
		do{
		Pattern pattern = Pattern
				.compile("^(?=.*\\d)(?=.*\\W)(?=.*[a-z])(?=.*[A-Z]).{6,15}$"); // ?=.* da igual el orden
		// 6 grupos de 2 separados por :
		Matcher matcher = pattern
				.matcher(Teclado
						.leerCadena("Introduce una contrase�a "));
		if (!matcher.find())
			System.out.println("La contrase�a no es robusta");
		else
			System.out.println("La contrase�a es robusta");
		
	}while(Teclado.deseaContinuar("Desea probar de nuevo?"));
	}
}
