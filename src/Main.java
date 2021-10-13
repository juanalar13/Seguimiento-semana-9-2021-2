import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner explorador = new Scanner(System.in);
		Registro R = new Registro();
		
		System.out.println("Mi Barrio Te Quiere");
		
		System.out.println("Opciones:");
		System.out.println("[1] Ingresar ingreso de una persona");
		System.out.println("[2] intentos de ingreso");
		System.out.println("[3] Salir");
		
		
		
		while(true) {
			
			try {
				
				System.out.print("Opcion: ");
				int opcion = explorador.nextInt();
				
				if(opcion == 1) {
					
					String tipo = "";
					int numero = 0;
					System.out.print("Tipo de cedula: ");
					tipo = explorador.next();
					System.out.print("Numero de cedula: ");
					numero = explorador.nextInt();			 
					
					if(R.IngresarPersona(tipo, numero)) {
						System.out.println("Ingreso exitoso");
					}else {
						System.out.println("Ingreso no exitoso");
					}								
				}
				
				if(opcion == 2) {
					System.out.println("Intentos de ingreso = " + R.Conteo);
				}
				
				if(opcion == 3) {
					System.out.println("Salida!");
					break;
				}
				
				
			}catch (InputMismatchException inputMismatchException){
				
				System.out.println("Ingreso un valor en un formato erroneo!");
				explorador.nextLine();
			}
			
			
		}
		
		explorador.close();

		

	}
	

}
