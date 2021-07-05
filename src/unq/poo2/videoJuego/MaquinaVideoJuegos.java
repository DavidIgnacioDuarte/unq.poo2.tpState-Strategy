package unq.poo2.videoJuego;

public class MaquinaVideoJuegos {

	EstadoJuego estadoActual;
	
	
	public MaquinaVideoJuegos() {
		this.estadoActual = new EstadoInicial(this);
	}
	
	public EstadoJuego getEstadoActual() {
		return this.estadoActual;
	}
	
	public void presionarInicio() {
		this.estadoActual.presionarInicio();
	}
	
	public void insertarFicha() {
		this.estadoActual.insertarFicha();
	}
	
	public void finalizarJuego() {
		this.estadoActual.finalizarJuego();
	}
	
	void cambiarEstado(EstadoJuego nuevoEstado) {
		this.estadoActual = nuevoEstado;
	}
	
}
