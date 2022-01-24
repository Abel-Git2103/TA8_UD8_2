/*
 * AUTOR: ABEL JORNET MOLERO
 * ULTIMA MODIFICACION: 24/01/2022
 */

public class MainPasswordAPP {

	public static void main(String[] args) {
		
		Password pass1 = new Password();
		Password pass2 = new Password(10);
	
		System.out.println(pass1.toString());
		System.out.println(pass2.toString());

	}
}
