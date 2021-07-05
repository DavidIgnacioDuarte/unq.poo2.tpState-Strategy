package unq.poo2.videoJuego;

public class EnPartidaDosJugadores extends EstadoJuego {

	public EnPartidaDosJugadores(MaquinaVideoJuegos maquina) {
		this.maquina = maquina;
	}

	@Override
	public void presionarInicio() {
		//No hace nada
		System.out.println("Partida En Progreso");

	}

	@Override
	public void insertarFicha() {
		// Devolver Ficha
		System.out.println("Partida En Progreso");

	}

	@Override
	public void finalizarJuego() {
		System.out.println("Partida finalizada");
		this.maquina.cambiarEstado(new EstadoInicial(this.maquina));
	}

}
