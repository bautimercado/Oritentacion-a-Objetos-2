package ar.edu.unlp.info.oo2.ejercicio_2_p4;

public class DecoradorTamanio extends DecoradorDeArchivo {

	@Override
	public String imprimir() {
		return this.component.getTamanio().toString();
	}

}
