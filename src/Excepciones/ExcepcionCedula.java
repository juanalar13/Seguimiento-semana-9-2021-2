package Excepciones;

public class ExcepcionCedula extends Exception{
	
	public ExcepcionCedula() {
        super("Excepci�n: La cedula no es admitida");        
    }
	
	public ExcepcionCedula(String mensaje) {
        super(mensaje);        
    }
	

}
