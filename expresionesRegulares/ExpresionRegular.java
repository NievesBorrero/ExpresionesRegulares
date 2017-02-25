package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ExpresionRegular {
	MAC ("^([0-9a-fA-F]{2}:){5}([0-9a-fA-F]{2})$","Introduce una dirección MAC (00:00:00:00:00:00) "),
	IP ("^(([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$", 
			"Introduce una dirección IP (0000.0000.0000.0000"),
	EMAIL ("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", 
			"Introduce un correo electronico (xxx@xxx.xxx"),
	CODPOSTAL ("^01[0-9]{2}[1-9]$|^[1-4][0-9]{4}$|^5[1-2][0-9]{3}$","Introduce un codigo postal (00000)"),
	CUENTA ("^([0-9]{4}[\\.\\s]){2}[0-9]{2}[\\.\\s]([0-9]{8})$", "Introduce un numero de cuenta: (0000.0000.00.00000000"),
	DNI ("^[0-9]{8}[-\\s]?[aA-zZ&&[^IÑOUiñou]]$","Introduce un dni: (00000000-X)"),
	CONTRASEÑA_ROBUSTA ("^(?=.*\\d)(?=.*\\W)(?=.*[a-z])(?=.*[A-Z]).{6,15}$", "Introduce una contraseña, te dire si es robusta");

	String expression;
	String message;
			
	ExpresionRegular(String expression, String message){
	this.expression = expression;
	this.message = message;
	}
	
	private String getExpression() {
		return expression;
	}

	 String getMessage() {
		return message;
	}
	
	/**
	 * Comprueba que se cumpla el patrón
	 * @param String (cadena de caracteres)
	 * @return true si se cumple, false si no se cumple
	 */

	private boolean check(String cadena) {

		Pattern pattern = Pattern.compile(getExpression());

		Matcher matcher = pattern.matcher(cadena);

		return matcher.find();

	}


	/**
	 * Accede al método anterior, pero nos aseguramos de que no se modifique la expresión.
	 * @param String (cadena de caracteres)
	 * @return true si se cumple, false si no se cumple
	 */

	boolean isFound(String cadena) {
		
		return check(cadena);

	}
}
