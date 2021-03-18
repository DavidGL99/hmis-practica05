package ual.hmis.sesion05.ejercicio4;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



class Ejercicio4Test {
	@ParameterizedTest
	@CsvSource({"ABCDE, EFGH, E",
				"AUUUO, EEEAU, AUUU",
				"YYYY, AAAA, ''",
				"ABCDE, ABCDE, ABCDE",
				"EDBCA, EBDCJ, EDBC",
				"aAaY, AaAhh, aAa"
				})
	
	void testTransformar(String p1, String p2, String out) {
		Ejercicio4 c = new Ejercicio4();
		assertEquals(out, c.appendStrings(p1, p2));
	}

}
