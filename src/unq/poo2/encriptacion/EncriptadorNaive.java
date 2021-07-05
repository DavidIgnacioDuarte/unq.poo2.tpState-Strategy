package unq.poo2.encriptacion;

public class EncriptadorNaive {
	
	MetodoEncriptacion metodoEncriptacion;
	
	public EncriptadorNaive(MetodoEncriptacion metodoEncriptacion) {
		this.metodoEncriptacion = metodoEncriptacion;
	}	
	
	public String encriptar(String mensaje) {
		return this.metodoEncriptacion.encriptar(mensaje);		
	}
	
	public String desencriptar(String mensaje) {
		return this.metodoEncriptacion.desencriptar(mensaje);		
	}
	
	public void cambiarMetodoEncriptacion(MetodoEncriptacion nuevoMetodoEncriptacion){
		this.metodoEncriptacion = nuevoMetodoEncriptacion;
	}
}
