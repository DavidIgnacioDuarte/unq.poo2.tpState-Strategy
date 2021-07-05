package unq.poo2.repMP3;

public class Seleccion implements Estado{
	
	
	public void play(ReproductorMP3 reproductor, Song cancion) throws Exception {
		reproductor.nuevoEstado(new Reproduccion());
	}


	public void pause(ReproductorMP3 reproductor) throws Exception {
		throw new Exception("No hay audio en reproduccion");
	}


	public void stop(ReproductorMP3 reproductor) throws Exception {
		throw new Exception("No hay audio en reproduccion");		
	}

}
