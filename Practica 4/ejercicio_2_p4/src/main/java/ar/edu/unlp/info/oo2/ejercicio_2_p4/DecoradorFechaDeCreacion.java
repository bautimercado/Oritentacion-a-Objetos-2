package ar.edu.unlp.info.oo2.ejercicio_2_p4;

public class DecoradorFechaDeCreacion extends DecoradorDeArchivo {

	@Override
	public String imprimir() {
		return this.component.getFechaDeCreacion().toString();
	}

}
