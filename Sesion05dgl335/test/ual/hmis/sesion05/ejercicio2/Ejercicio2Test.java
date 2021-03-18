package ual.hmis.sesion05.ejercicio2;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



class Ejercicio2Test {

	@ParameterizedTest 
	@CsvSource({"AAA, '123', false",
				"NombreDeUsuarioExtremadamenteLargo, '1234', false",
				"Usuario, '1234567891011121314151617181910', false",
				"user, pass11, false",
				"user23, pass, false",
				"user, pass, true",
				})
	
	void testPassword(String user, String pass, boolean result) {
		Ejercicio2 c = new Ejercicio2();
		assertEquals(result, c.login(user, pass));		
	}
	 
	@Test
	void testNullData() {
		Ejercicio2 c = new Ejercicio2();

		assertFalse(c.login(null, "1234"));
		assertFalse(c.login("david", null));

	}

}
