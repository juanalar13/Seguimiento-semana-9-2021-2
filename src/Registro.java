import java.util.ArrayList;
import java.io.IOException;
import java.time.LocalDate;

public class Registro {
	
	ArrayList<Persona> Ingresados = new ArrayList<Persona>();
	int Conteo;
	
	boolean esPar(int x) {
		return x%2==0;
	}
	boolean esImpar(int x) {
		return x%2!=0;
	}
	
	boolean IngresarPersona(String id_tipo, int id_numero) {
		
		try {
			
			int dia = LocalDate.now().getDayOfMonth();
			String numero = Integer.toString(id_numero);
			int penultimo = 0;
			if(numero.length() > 1) {
				penultimo = Integer.parseInt("" + numero.charAt(numero.length()-2));
			}
			
			if(id_tipo.toUpperCase().equals("TI") == true) {
				throw new ExcepcionEdad();
			}
			
			if( ( (esPar(penultimo) && esImpar(dia)) || (esImpar(penultimo) && esPar(dia)) ) == false ) {
				throw new ExcepcionCedula();
			}				
			
			Conteo++;
			Ingresados.add(new Persona(id_tipo, id_numero));
			return true;
			
		}catch(ExcepcionCedula | ExcepcionEdad e) {
			Conteo++;
			System.out.println(e.getMessage());
			return false;
		}	
		
	}
	
	

}
