package unq.poo2.repMP3;

public class ReproductorMP3 {

	
	private Estado estadoActual;
	private Song cancionActual;
	
	
	public Song getCancionActual() {
		return this.cancionActual;
	}
	
	public ReproductorMP3() {
		this.estadoActual = new Seleccion();
	}
	
	public void play() throws Exception {
		this.estadoActual.play(this);
	}
	public void pause() throws Exception {
		this.estadoActual.pause(this);
	}
	public void stop() throws Exception {
		this.estadoActual.pause(this);
	}
	public void nuevoEstado(Estado nuevoEstado) {
		this.estadoActual = nuevoEstado;
	}
	
}
