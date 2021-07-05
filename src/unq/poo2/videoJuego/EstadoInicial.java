package unq.poo2.videoJuego;

public class EstadoInicial extends EstadoJuego {

	public EstadoInicial(MaquinaVideoJuegos maquina) {
		this.maquina = maquina;
	}
	
	@Override
	public void presionarInicio() {
		System.out.println("Ingresar monedas");
		this.maquina.cambiarEstado(new EsperandoInicio(this.maquina));
		
	}

	@Override
	public void insertarFicha() {
		System.out.println("Presionar Inicio");
		
	}

	@Override
	public void finalizarJuego() {
		System.out.println("No hay partida en progreso");
		
	}

}
