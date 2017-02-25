package expresionesRegulares;

import utiles.Teclado;

/**
 * Diseña una aplicación en Java que reconozca una contraseña robusta (tantas
 * veces como el usuario quiera). Según las directivas de nivel de dominio de
 * Microsoft, para que una contraseña sea considerada segura, ha de cumplir una
 * serie de instrucciones: a. La contraseña tendrá una longitud de al menos seis
 * caracteres. b. La contraseña contendrá caracteres de tres de las cuatro
 * categorías siguientes: i. Caracteres en mayúsculas (A–Z) ii. Caracteres en
 * minúsculas (a–z) iii. Base de 10 dígitos (0–9) iv. Caracteres no
 * alfanuméricos (por ejemplo: !, $, #, o %)
 * 
 * @author Nieves Borrero
 *
 */
public class ContraseniaRobusta {
	public static void main(String[] args) {
		do {
			if (ExpresionRegular.CONTRASENIA_ROBUSTA.isFound(Teclado
					.leerCadena(ExpresionRegular.CONTRASENIA_ROBUSTA
							.getMessage())))
				System.out.println("La contraseña es robusta");
			else
				System.out.println("La contraseña NO es robusta");

		} while (Teclado.deseaContinuar("Desea probar de nuevo?"));
	}
}
