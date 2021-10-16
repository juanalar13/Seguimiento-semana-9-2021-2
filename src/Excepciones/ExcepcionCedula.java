package Excepciones;

public class ExcepcionCedula extends Exception{
	
	public ExcepcionCedula() {
        super("Excepción: La cedula no es admitida");        
    }
	
	public ExcepcionCedula(String mensaje) {
        super(mensaje);        
    }
	

}
