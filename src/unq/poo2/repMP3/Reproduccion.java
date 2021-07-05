package unq.poo2.repMP3;

public class Reproduccion implements Estado {

	
	
	public void play(ReproductorMP3 reproductor, Song cancion) throws Exception {
		throw new Exception("Ya hay un audio en reproduccion");
	}

	
	public void pause(ReproductorMP3 reproductor) throws Exception {
		reproductor.nuevoEstado(new Pausa());
	}


	public void stop(ReproductorMP3 reproductor) throws Exception {
		reproductor.nuevoEstado(new Seleccion());
	}

}
