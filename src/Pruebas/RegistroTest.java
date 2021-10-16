package Pruebas;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import Clases.Registro;


class RegistroTest extends TestCase {
	
	Registro R;
	
	
	void SetupEscenario() {
		R = new Registro();	
	}	
	
	
	@Test
	void IngresarPersonaTest() {
		//Casos donde se registran correctamente
		SetupEscenario();
		R.setDiaImpar();
		assertTrue(R.IngresarPersona("CC", 1121));
		assertTrue(R.IngresarPersona("PP", 1121));
		assertTrue(R.IngresarPersona("CE", 1121));		
		R.setDiaPar();
		assertTrue(R.IngresarPersona("CC", 1131));
		assertTrue(R.IngresarPersona("PP", 1131));
		assertTrue(R.IngresarPersona("CE", 1131));
		assertEquals(R.getConteo(), 6);
		
		//Casos donde no se registran correctamente
		SetupEscenario();
		R.setDiaImpar();
		assertFalse(R.IngresarPersona("CC", 1131));
		assertFalse(R.IngresarPersona("PP", 1131));
		assertFalse(R.IngresarPersona("CE", 1131));		
		R.setDiaPar();;
		assertFalse(R.IngresarPersona("CC", 1121));
		assertFalse(R.IngresarPersona("PP", 1121));
		assertFalse(R.IngresarPersona("CE", 1121));
		assertEquals(R.getConteo(), 6);
		
		//Casos donde no se registran correctamente por ser menor de edad
		SetupEscenario();
		R.setDiaImpar();
		assertFalse(R.IngresarPersona("TI", 1121));
		R.setDiaPar();
		assertFalse(R.IngresarPersona("TI", 1131));
		assertEquals(R.getConteo(), 2);

	}

}
