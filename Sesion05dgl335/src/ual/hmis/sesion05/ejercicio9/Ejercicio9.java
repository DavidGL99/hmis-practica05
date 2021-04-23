package ual.hmis.sesion05.ejercicio9;


public class Ejercicio9 {

	public String listaCadenasOrdenadas(String s1, String s2) {
		String salida = "";

		for (int i = 0; i < s1.length(); i++) {
			if (s2.contains(s1.subSequence(i, i + 1)) && !(salida.contains(s1.subSequence(i, i + 1)))) {
				salida += s1.subSequence(i, i + 1);
			}
		}
		return salida;
	}
}
