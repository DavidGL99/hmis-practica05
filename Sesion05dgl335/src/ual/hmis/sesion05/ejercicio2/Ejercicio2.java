package ual.hmis.sesion05.ejercicio2;

public class Ejercicio2 {

	public boolean login (String username, String password) {
		if(username==null||password==null) return false;
		if(username.length()>30||password.length()>30) return false;

		return compruebaLoginEnBD(username, password);
	}

	public boolean compruebaLoginEnBD(String username, String password) {
		if(username.equals("user") && password.equals("pass")) 
			return true;
		else 
			return false;
	} 
}
