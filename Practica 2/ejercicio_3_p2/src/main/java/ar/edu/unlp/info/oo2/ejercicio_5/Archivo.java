package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;

public abstract class Archivo {
	private String nombre;
	private LocalDate fechaDeCreacion;
	
	public Archivo(String nombre, LocalDate fechaDeCreacion) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
	}
	
	public abstract int tamanioTotalOcupado();
	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public Archivo orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
