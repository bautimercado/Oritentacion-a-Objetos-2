package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;


public class Directorio extends Archivo {
	private List<Archivo> contenido;
	
	public Directorio(String nombre, LocalDate fechaDeCreacion) {
		super(nombre, fechaDeCreacion);
		this.contenido = new ArrayList<Archivo>();
	}
	
	public void agregar(Archivo a) {
		this.contenido.add(a);
	}
	
	public int tamanioTotalOcupado() {
		int tamanioContenido = this.contenido.stream()
				.mapToInt(a -> a.tamanioTotalOcupado())
				.sum();
		return tamanioContenido + 32;
	}
	
	


}
