package unq.poo2.videoJuego;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaquinaVideoJuegosTest {

	MaquinaVideoJuegos m;
	
	
	@BeforeEach
	void setUp() {
		
		m = new MaquinaVideoJuegos();
		
	}


	@Test
	void testEstadosActualesInicioUnoDos() {
		
		//Excersice

		EstadoJuego inicial =  m.getEstadoActual();

		m.presionarInicio();
		
		EstadoJuego esperandoMonedas = m.getEstadoActual();
		
		m.insertarFicha();
		m.presionarInicio();
	
		EstadoJuego enJuegoUnJugador = m.getEstadoActual();
		
		m.finalizarJuego();

		EstadoJuego finDelJuego = m.getEstadoActual();

		m.presionarInicio();
		m.insertarFicha();
		m.insertarFicha();
		m.presionarInicio();

		EstadoJuego enJuegoDosJugadores = m.getEstadoActual();

		//Verify
		assertTrue(inicial instanceof EstadoInicial);
		assertTrue(esperandoMonedas instanceof EsperandoInicio);
		assertTrue(enJuegoUnJugador instanceof EnPartidaUnJugador);
		assertTrue(enJuegoDosJugadores instanceof EnPartidaDosJugadores);
		assertTrue(finDelJuego instanceof EstadoInicial);
		
	}
	
	
	@Test
	void testComportamientoEnJuego() {
		
		//Estos no deberian ser tomados en cuenta en EstadoInicial.
		m.insertarFicha();
		m.finalizarJuego();
		
		//Verifico que no haya cambio de estado.
		EstadoJuego inicial =  m.getEstadoActual();
		
		//Cambio de estado
		m.presionarInicio();

		//Estos no deberian ser tomados en cuenta en estado EsperandoInicio.
		m.finalizarJuego();
		m.presionarInicio(); //Como no se insertaron monedas, muestra mensaje en pantalla.
				
		//Verifico que no haya cambio de estado.
		EstadoJuego esperandoMonedas = m.getEstadoActual();

		//Cambio de estado
		m.insertarFicha();
		m.presionarInicio();

		//Estos no deberian ser tomados en cuenta en estado EnPartidaUnJugador.
		m.presionarInicio();
		m.insertarFicha();

		//Verifico que no haya cambio de estado.
		EstadoJuego enJuegoUnJugador = m.getEstadoActual();
		
		
		//NUEVA MÁQUINA

		MaquinaVideoJuegos n = new MaquinaVideoJuegos();

		//Pongo la maquina en estado EnPartidaDosJugadores.
		n.presionarInicio();
		n.insertarFicha();
		n.insertarFicha();
		n.presionarInicio();

		//Estos no deberian ser tomados en cuenta en estado EnPartidaDosJugadores.
		n.presionarInicio();
		n.insertarFicha();
		
		//Verifico que no haya cambio de estado.
		EstadoJuego enJuegoDosJugadores = n.getEstadoActual();
		
		assertTrue(inicial instanceof EstadoInicial);
		assertTrue(esperandoMonedas instanceof EsperandoInicio);
		assertTrue(enJuegoUnJugador instanceof EnPartidaUnJugador);
		assertTrue(enJuegoDosJugadores instanceof EnPartidaDosJugadores);

	}

}
