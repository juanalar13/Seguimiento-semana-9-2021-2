package Excepciones;

public class ExcepcionEdad extends Exception{
	
	public ExcepcionEdad() {
        super("Excepci�n: No se puede ingresar con TI");
        
    }
	
	public ExcepcionEdad(String mensaje) {
        super(mensaje);
        
    }
	
}
