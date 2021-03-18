package ual.hmis.sesion05.ejercicio3;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



class Ejercicio3Test {

	@ParameterizedTest 
	@CsvSource({"5, *****",
				"2, *****",
				"12, ************",
				"25, ************"
				})
	
	void testPassword(int n, String asterics) {
		Ejercicio3 c = new Ejercicio3();
		assertEquals(asterics, c.IntToAsterisc(n));				
	}
	

}
