package Pruebas;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import Clases.Registro;


class RegistroTest extends TestCase {
	
	Registro R;
	
	void SetupEscenario1() {
		R = new Registro();	
	}
	
	
	@Test
	void IngresarPersonaTest() {
		SetupEscenario1();
		//Casos donde se registran correctamente
		R.setTestDia(1);
		assertTrue(R.IngresarPersona("CC", 1121));
		assertTrue(R.IngresarPersona("PP", 1121));
		assertTrue(R.IngresarPersona("CE", 1121));		
		R.setTestDia(2);
		assertTrue(R.IngresarPersona("CC", 1131));
		assertTrue(R.IngresarPersona("PP", 1131));
		assertTrue(R.IngresarPersona("CE", 1131));
		
		//Casos donde no se registran correctamente
		R.setTestDia(1);
		assertFalse(R.IngresarPersona("CC", 1131));
		assertFalse(R.IngresarPersona("PP", 1131));
		assertFalse(R.IngresarPersona("CE", 1131));		
		R.setTestDia(2);
		assertFalse(R.IngresarPersona("CC", 1121));
		assertFalse(R.IngresarPersona("PP", 1121));
		assertFalse(R.IngresarPersona("CE", 1121));
		
		//Casos donde no se registran correctamente por ser menor de edad
		R.setTestDia(1);
		assertFalse(R.IngresarPersona("TI", 1121));
		R.setTestDia(2);
		assertFalse(R.IngresarPersona("TI", 1131));		

	}

}
