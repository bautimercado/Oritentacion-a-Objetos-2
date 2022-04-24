package ar.edu.unlp.info.oo2.ejercicio_2_p4;

import java.time.LocalDate;

public class Archivo implements FileOO2 {
	private String nombre;
	private String extension;
	private Double tamanio;
	private LocalDate fechaDeCreacion;
	private LocalDate fechaDeModificacion;
	private String permisos;
	
	public Archivo(String nombre, String extension, Double tamanio, LocalDate fechaDeCreacion,
			LocalDate fechaDeModificacion, String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamanio = tamanio;
		this.fechaDeCreacion = fechaDeCreacion;
		this.fechaDeModificacion = fechaDeModificacion;
		this.permisos = permisos;
	}
	
	public String prettyPrint() {
		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}

	public LocalDate getFechaDeModificacion() {
		return fechaDeModificacion;
	}

	public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}
	
	
	
	
}
