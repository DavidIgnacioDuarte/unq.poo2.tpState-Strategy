package unq.poo2.encriptacion;

public class EncriptacionVocales implements MetodoEncriptacion {

	String vocales;
	
	public EncriptacionVocales() {
		this.vocales = "aeiou";
	}
	
	@Override
	public String encriptar(String mensaje) {
		String mensajeEncriptado = "#";
		for (char c : mensaje.toCharArray()) {
			if(vocales.indexOf(c) != -1) {
				c = this.encriptarVocal(c);
			}
			mensajeEncriptado = mensajeEncriptado + c;
		}
		
		return mensajeEncriptado.substring(1);
	}

	@Override
	public String desencriptar(String mensaje) {
		String mensajeEncriptado = "#";
		for (char c : mensaje.toCharArray()) {
			if(vocales.indexOf(c) != -1) {
				c = this.desencriptarVocal(c);
			}
			mensajeEncriptado = mensajeEncriptado + c;
		}
		
		return mensajeEncriptado.substring(1);
	}
	
	
	private char encriptarVocal(char vocal) {
		if (vocal == 'a') {
			return 'e';
		}
		if (vocal == 'e') {
			return 'i';
		}
		if (vocal == 'i') {
			return 'o';
		}
		if (vocal == 'o') {
			return 'u';
		}
		return 'a';
	}
	
	private char desencriptarVocal(char vocal) {
		if (vocal == 'a') {
			return 'u';
		}
		if (vocal == 'e') {
			return 'a';
		}
		if (vocal == 'i') {
			return 'e';
		}
		if (vocal == 'o') {
			return 'i';
		}
		return 'o';
	}

}
