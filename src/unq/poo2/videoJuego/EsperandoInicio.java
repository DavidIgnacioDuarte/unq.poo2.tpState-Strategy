package unq.poo2.videoJuego;

public class EsperandoInicio extends EstadoJuego {

	int fichasIngresadas;
	
	public EsperandoInicio(MaquinaVideoJuegos maquina) {
		this.maquina = maquina;
		this.fichasIngresadas = 0;
	}
	
	@Override
	public void presionarInicio() {
		if(this.fichasIngresadas == 0) {
			System.out.println("¡Ingrese alguna ficha!");
		}
		if(this.fichasIngresadas == 1) {
			this.maquina.cambiarEstado(new EnPartidaUnJugador(this.maquina));
		}
		if(this.fichasIngresadas == 2) {
			this.maquina.cambiarEstado(new EnPartidaDosJugadores(this.maquina));
		}
	}

	@Override
	public void insertarFicha() {
		if (this.fichasIngresadas < 2) {
			this.fichasIngresadas ++;
		}
		else {
			//devolver fichas
			System.out.println("Devuelve ficha. Sólo se admiten hasta 2 jugadores.");
		}
	}

	@Override
	public void finalizarJuego() {
		System.out.println("No hay partida en progreso");
		
	}

}
