package expresionesRegulares;

import utiles.*;

/**
 * Implementa un programa que permita comprobar cada uno de estos datos mediante
 * expresiones regulares: a. Dirección MAC b. Dirección IP c. Correo electrónico
 * d. Código postal e. Número de cuenta corriente f. DNI Para ello, solicita al
 * usuario tres entradas distintas, dejando claro el patrón que vas a utilizar.
 * 
 * @author Nieves Borrero
 *
 */

public class TestExpresionesRegulares {
	public static void main(String[] args) {
		Menu menu = new Menu("Datos:", new String[] { "Direccion MAC",
				"Direccion IP", "Correo electronico", "codigo postal",
				"cuenta", "DNI", "salir" });
		int opcion;
		do {
			switch (opcion = menu.gestionar()) {
			case 1:
				mac();
				break;
			case 2:
				ip();
				break;
			case 3:
				email();
				break;
			case 4:
				codPostal();
				break;
			case 5:
				cuenta();
				break;
			case 6:
				dni();
				break;
			case 7:
				System.out.println("Hastra otra");
				break;
			}
		} while (opcion < menu.getSalir());
	}

	private static void mac() {
		for (int i = 0; i < 3; i++) {
			if (ExpresionRegular.MAC.isFound(Teclado
					.leerCadena(ExpresionRegular.MAC.getMessage())))
				System.out.println("ok");
			else
				System.out.println("La dirección NO es correcta.");
		}

	}

	private static void ip() {
		for (int i = 0; i < 3; i++) {
			if (ExpresionRegular.IP.isFound(Teclado
					.leerCadena(ExpresionRegular.IP.getMessage())))
				System.out.println("ok");
			else
				System.out.println("La dirección NO es correcta.");
		}
	}

	private static void email() {
		for (int i = 0; i < 3; i++) {
			if (ExpresionRegular.EMAIL.isFound(Teclado
					.leerCadena(ExpresionRegular.EMAIL.getMessage())))
				System.out.println("ok");
			else
			System.out.println("La dirección NO es correcta.");
		}
	}

	private static void codPostal() {
		for (int i = 0; i < 3; i++) {
			if (ExpresionRegular.CODPOSTAL.isFound(Teclado
					.leerCadena(ExpresionRegular.CODPOSTAL.getMessage())))
				System.out.println("ok");
			else
				System.out.println("El codigo postal NO es correcto.");
		}
	}

	private static void cuenta() {
		for (int i = 0; i < 3; i++) {
			if (ExpresionRegular.CUENTA.isFound(Teclado
					.leerCadena(ExpresionRegular.CUENTA.getMessage())))
				System.out.println("ok");
			else
				System.out.println("El numero de cuenta NO es correcto.");
		}
	}

	private static void dni() {
		for (int i = 0; i < 3; i++) {
			if (ExpresionRegular.DNI.isFound(Teclado
					.leerCadena(ExpresionRegular.DNI.getMessage())))
				System.out.println("ok");
			else
				System.out.println("El numero de DNI NO es correcto.");

		}

	}
}
