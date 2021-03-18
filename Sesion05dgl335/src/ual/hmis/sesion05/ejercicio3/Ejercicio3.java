package ual.hmis.sesion05.ejercicio3;

public class Ejercicio3 {

	public String IntToAsterisc(int n) {
		if(n<=5) n=5;
		if(n>=12)n=12;
		String asterics =  "";
		for(int i = 0; i < n; i++) {
			asterics += "*";
		}
		
		return asterics;
	}
}
