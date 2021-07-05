package unq.poo2.repMP3;

public interface Estado {
	
	public void play(ReproductorMP3 reproductor, Song cancion) throws Exception;
	public void pause(ReproductorMP3 reproductor) throws Exception;
	public void stop(ReproductorMP3 reproductor) throws Exception;

}
