package ar.edu.unlp.info.oo2.ejercicio_2_p4;

public class FileManager {
	private Archivo archivo;
	private DecoradorDeArchivo decorador;
	
	public FileManager(Archivo archivo) {
		this.archivo = archivo;
		this.decorador = null;
	}
	
	public void agregarAspectoAMostrar(DecoradorDeArchivo decorador) {
		if (this.decorador == null) {
			this.decorador = decorador;
			this.decorador.setComponent(this.archivo);
		} else {
			DecoradorDeArchivo aux = this.decorador;
			decorador.setComponent(aux);
			this.decorador = decorador;
		}
	}
	
	public String prettyPrint() {
		return decorador.prettyPrint();
	}

}
