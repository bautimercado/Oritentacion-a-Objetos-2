package ar.edu.unlp.info.oo2.ejercicio_2_p4;

import java.time.LocalDate;

public interface FileOO2 {
	
	public String prettyPrint();
	
	public String getNombre();
	
	public String getExtension();
	
	public Double getTamanio();
	
	public LocalDate getFechaDeCreacion();
	
	public LocalDate getFechaDeModificacion();
	
	public String getPermisos();
}
