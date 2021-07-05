package unq.poo2.repMP3;

public class Song {

	
	public void play() {
		
	}
	
	public void pause() {
		
	}
	
	public void stop() {
	
	}
	
	public boolean enReproduccion(ReproductorMP3 rep) {
		return rep.getCancionActual() == this;
	}
	
}
