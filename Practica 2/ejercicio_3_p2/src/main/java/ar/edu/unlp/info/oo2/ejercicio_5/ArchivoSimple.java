package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;

public class ArchivoSimple extends Archivo {
	private int tamanio;
	
	public ArchivoSimple(String nombre, LocalDate fechaDeCreacion, int tamanio) {
		super(nombre, fechaDeCreacion);
		this.tamanio = tamanio;
	}
	
	public int tamanioTotalOcupado() {
		return this.tamanio;
	}
}
