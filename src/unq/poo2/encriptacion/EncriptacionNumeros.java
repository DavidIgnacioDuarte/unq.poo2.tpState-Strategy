package unq.poo2.encriptacion;

public class EncriptacionNumeros implements MetodoEncriptacion {
	
	String abecedario;

	public EncriptacionNumeros() {
		this.abecedario = " abcdefghijklmnñopqrstuvwxyz";
	}
	
	@Override
	public String encriptar(String mensaje) {
		String mensajeEncriptado = "#";
		for (char c : mensaje.toCharArray()) {
			
			mensajeEncriptado = mensajeEncriptado + String.valueOf(abecedario.indexOf(c)) + ",";  
		}
		
		return mensajeEncriptado.substring(1);
	}

	@Override
	public String desencriptar(String mensaje) {
		
		String mensajeEncriptado = "#";
		String numeroADesencriptar = "#";
		
		for (char c : mensaje.toCharArray()) {
			
			if(c != ',') {
				numeroADesencriptar = numeroADesencriptar + c;
			} else {
				int index = Integer.parseInt(numeroADesencriptar.substring(1));
				mensajeEncriptado = mensajeEncriptado + abecedario.charAt(index);
				numeroADesencriptar = "#";
			}
			  
		}
		
		return mensajeEncriptado.substring(1);
	}

}
