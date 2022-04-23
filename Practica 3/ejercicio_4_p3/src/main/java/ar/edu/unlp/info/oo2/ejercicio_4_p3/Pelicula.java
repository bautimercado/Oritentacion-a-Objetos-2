package ar.edu.unlp.info.oo2.ejercicio_4_p3;

import java.util.List;
import java.util.ArrayList;

public class Pelicula {
	private String nombre;
	private double puntaje;
	private int anioDeEstreno;
	private List<Pelicula> similares;
	
	public Pelicula(String nombre, double puntaje, int anioDeEstreno) {
		this.nombre = nombre;
		this.puntaje = puntaje;
		this.anioDeEstreno = anioDeEstreno;
		this.similares = new ArrayList<Pelicula>();
	}
	
	public void addSimilitud(Pelicula pelicula) {
		this.similares.add(pelicula);
	}
	
	public List<Pelicula> getSimilares() {
		return this.similares;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}
	
	public int getAnioDeEstreno() {
		return this.anioDeEstreno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anioDeEstreno;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(puntaje);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((similares == null) ? 0 : similares.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (anioDeEstreno != other.anioDeEstreno)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(puntaje) != Double.doubleToLongBits(other.puntaje))
			return false;
		if (similares == null) {
			if (other.similares != null)
				return false;
		} else if (!similares.equals(other.similares))
			return false;
		return true;
	}
	
	
}
