/*
 * AUTOR: ABEL JORNET MOLERO
 * ULTIMA MODIFICACION: 24/01/2022
 */

import java.util.Random;

public class Password {

	// DEFINIMOS ATRIBUTOS DE CLASE
	private int longitud;

	private String contrase�a;

	// CONSTRUCTORES
	public Password() {

		this.longitud = 8;
		this.contrase�a = "admin123";
	}

	public Password(int longitud) {

		this.longitud = longitud;
		this.contrase�a = randomPassword(longitud);
	}

	// METODO PROPIO
	private String randomPassword(int longitud) {
		// FALTA GENERAR METODO RANDOM DE CARACTERES
		String pass = "";
		Random rnd = new Random();
		for (int i = 0; i < longitud; i++) {
			pass += (char) (rnd.nextInt(91) + 65);
		}

		return pass;
	}

	// GETTERS & SETTERS
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	// METODO TOSTRING()
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
}
