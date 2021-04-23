package ual.hmis.sesion05.ejercicio8;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import ual.hmis.sesion05.ejercicio3.Ejercicio3;

public class Ejercicio8Test {

	@ParameterizedTest 
	@CsvSource({"5, 4, 3400",
				"2, 2, 310",
				"3, 4, 1200"
				})
	
	void testVehiculo(int pasajeros, int ruedas, int peso) {
		Vehiculo v = new Vehiculo();
		v.setNumeroPasajeros(pasajeros);
		v.setNumeroRuedas(ruedas);
		v.setPesoConCarga(peso);
		
		
		assertEquals(pasajeros, v.getNumeroPasajeros());
		assertEquals(ruedas, v.getNumeroRuedas());
		assertEquals(peso, v.getPesoConCarga());		
	}
	
	
	@ParameterizedTest 
	@CsvSource({"5, false, 3400, 1000, true",
				"1, true, 310, 2000, false",
				
				})
	
	void testFerry(int maxVehiculos, boolean superadoMaxVehiculos, int peso, int maxPeso, boolean superadoMaxPeso) {
		Vehiculo v = new Vehiculo();
		v.setNumeroPasajeros(5);
		v.setNumeroRuedas(4);
		v.setPesoConCarga(1200);
		
		Vehiculo v2 = new Vehiculo();
		v2.setNumeroPasajeros(2);
		v2.setNumeroRuedas(2);
		v2.setPesoConCarga(200);
		
		Ferry f = new Ferry();
		f.setMaxVehiculos(maxVehiculos);
		f.setPesoMaxVehiculos(maxPeso);
		
		assertEquals(f.embarcarVehiculo(v), true);
		assertEquals(f.embarcarVehiculo(v2), true);

		assertEquals(2, f.getTotalVehiculos());
		assertEquals(superadoMaxVehiculos, f.superadoMaximoVehiculos()); 
		
		assertEquals(superadoMaxPeso, f.superadoMaximoPeso());
		assertEquals(f.Vacio(), false);
		
	}
	
	
	@Test
	void testVacio() {
		Ferry f = new Ferry();
		assertEquals(f.Vacio(), true);
	}
	
	
	@ParameterizedTest 
	@CsvSource({"10",
				"5",
				"1"
				})
	
	void testFerryPasajeros(int maxPasajeros) {
		
		Ferry f = new Ferry();		
		f.setMaxPasajeros(maxPasajeros);
		assertEquals(maxPasajeros, f.getMaxPasajeros());	
			
	}
	
		
}
