/*
 * AUTOR: ABEL JORNET MOLERO
 * ULTIMA MODIFICACION: 24/01/2022
 */

import java.util.Random;

public class Password {

	// DEFINIMOS ATRIBUTOS DE CLASE
	private int longitud;

	private String contraseña;

	// CONSTRUCTORES
	public Password() {

		this.longitud = 8;
		this.contraseña = "admin123";
	}

	public Password(int longitud) {

		this.longitud = longitud;
		this.contraseña = randomPassword(longitud);
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	// METODO TOSTRING()
	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
}
