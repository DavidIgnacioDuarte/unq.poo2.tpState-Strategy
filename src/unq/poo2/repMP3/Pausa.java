package unq.poo2.repMP3;

public class Pausa implements Estado {


	
	public void play(ReproductorMP3 reproductor, Song cancion) throws Exception {
		throw new Exception("Ya hay un audio en pausa");
	}


	public void pause(ReproductorMP3 reproductor) throws Exception {
		reproductor.nuevoEstado(new Seleccion());
	}


	public void stop(ReproductorMP3 reproductor) throws Exception {
		reproductor.nuevoEstado(new Seleccion());
	}

}
