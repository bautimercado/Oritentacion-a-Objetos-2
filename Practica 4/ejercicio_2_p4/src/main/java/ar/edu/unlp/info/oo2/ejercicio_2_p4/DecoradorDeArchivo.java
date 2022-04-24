package ar.edu.unlp.info.oo2.ejercicio_2_p4;

import java.time.LocalDate;

public abstract class DecoradorDeArchivo implements FileOO2 {
	protected FileOO2 component;
	
	/*
	 * Cada decorador implementará el metodo imprimir de forma distinta según su tipo
	 * por ejemplo, el decorador nombre le pedirá a su componente que retorne su nombre
	 */
	public abstract String imprimir(); 
	
	public String prettyPrint() {
		if (this.component.prettyPrint() != null) 					//caso base
			return this.imprimir()+" - "+this.component.prettyPrint();
		return this.imprimir();       			//en caso de que su componente sea Archivo, directamente devuelve el dato de interes.
	
	}
	
	public String getNombre() {
		return this.component.getNombre();
	}
	
	public String getExtension() {
		return this.component.getExtension();
	}
	
	public Double getTamanio() {
		return this.component.getTamanio();
	}
	
	public LocalDate getFechaDeCreacion() {
		return this.component.getFechaDeCreacion();
	}
	
	public LocalDate getFechaDeModificacion() {
		return this.component.getFechaDeModificacion();
	}
	
	public String getPermisos() {
		return this.component.getPermisos();
	}
	
	public void setComponent(FileOO2 component) {
		this.component = component;
	}
	
}
