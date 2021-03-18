package ual.hmis.sesion05.ejercicio4;

public class Ejercicio4 {

	public String appendStrings(String p1, String p2) {
		String out = "";
		
		for(String c : p1.split("")) {
			if(p2.contains(c))
					out+=c;
		}
		return out;
	}
}
