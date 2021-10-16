package Clases;
import java.time.LocalDate;
import java.util.ArrayList;

import Excepciones.ExcepcionCedula;
import Excepciones.ExcepcionEdad;

public class Registro {

	ArrayList<Persona> Ingresados = new ArrayList<Persona>();
	int Conteo = 0;
	int testDia = -1;
	

	boolean esPar(int x) {
		return x % 2 == 0;
	}

	boolean esImpar(int x) {
		return x % 2 != 0;
	}
	
	public int getConteo() {
		return Conteo;
	}
	
	public void setTestDia(int dia) {
		testDia = dia;
	}

	public boolean IngresarPersona(String id_tipo, int id_numero) {

		try {

			int dia = testDia>0? testDia: LocalDate.now().getDayOfMonth();
			String numero = Integer.toString(id_numero);
			int penultimo = 0;
			if (numero.length() > 1) {
				penultimo = Integer.parseInt("" + numero.charAt(numero.length() - 2));
			}

			if (id_tipo.toUpperCase().equals("TI") == true) {
				throw new ExcepcionEdad("Excepcion: Por tarjeta identidad, tipo="+id_tipo);
			}

			if (((esPar(penultimo) && esImpar(dia)) || (esImpar(penultimo) && esPar(dia))) == false) {
				throw new ExcepcionCedula("Excepción: Cedula no admitida [dia=" + dia+",cedula="+id_numero+",penultimo="+penultimo+"]");
			}

			Conteo++;
			Ingresados.add(new Persona(id_tipo, id_numero));
			return true;

		} catch (ExcepcionCedula | ExcepcionEdad e) {
			Conteo++;
			System.out.println(e.getMessage());
			return false;
		}

	}

}
