package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_6;

import java.util.List;

public class Usuario {
	private String nombre, email;
	private int telefono;
	private List<Pelicula> peliculasCompradas;
	private Subscripcion subscripcion;
	
	public void setSubscripcion(Subscripcion subscripcion) {
		this.subscripcion = subscripcion;
	}
	
	public double calcularPrecioPelicula(Pelicula p) {
		return subscripcion.calcularPrecioPelicula(p);
	}
}
