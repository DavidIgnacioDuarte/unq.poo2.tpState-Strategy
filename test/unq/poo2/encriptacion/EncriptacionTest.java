package unq.poo2.encriptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EncriptacionTest {

	
	EncriptadorNaive encriptador;
	EncriptacionVocales metodoVocales;
	EncriptacionNumeros metodoNumeros;

	
	@BeforeEach
	void setup() {
		
		encriptador = new EncriptadorNaive(null);
		
	}
	
	
	@Test
	void numerosTest() {
		//Setup
		metodoNumeros = new EncriptacionNumeros();
		encriptador.cambiarMetodoEncriptacion(metodoNumeros);

		//Excersice
		String textoEncriptado = encriptador.encriptar("casita");
		String textoDesencriptado = encriptador.desencriptar(textoEncriptado);
		
		//Verify
		assertEquals("3,1,20,9,21,1,", textoEncriptado);
		assertEquals("casita", textoDesencriptado);
	}
	
	
	@Test
	void vocalesTest() {
		
		//Setup
		metodoVocales = new EncriptacionVocales();
		encriptador.cambiarMetodoEncriptacion(metodoVocales);

		//Excersice
		String textoEncriptado = encriptador.encriptar("mantel");
		String textoDesencriptado = encriptador.desencriptar(textoEncriptado);
		
		//Verify
		assertEquals("mentil", textoEncriptado);
		assertEquals("mantel", textoDesencriptado);
	}


}
