package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.List;
import java.util.ArrayList;

public class TopografiaComposite implements Topografia {
	private List<Topografia> componentes;
	
	public TopografiaComposite() {
		this.componentes = new ArrayList<Topografia>();
	}
	
	public void addComponente(Topografia topografia) {
		this.componentes.add(topografia);
	}
	
	public double proporcionDeAgua() {
		double cantAgua = this.componentes.stream()
				.mapToDouble(c -> c.proporcionDeAgua())
				.sum();
		return cantAgua/4f;

	}
	
	public double proporcionDeTierra() {
		double cantTierra = this.componentes.stream()
				.mapToDouble(c -> c.proporcionDeTierra())
				.sum();
		return cantTierra/4f;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((componentes == null) ? 0 : componentes.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TopografiaComposite other = (TopografiaComposite) obj;
		if (componentes == null) {
			if (other.componentes != null)
				return false;
		} else if (!componentes.equals(other.componentes))
			return false;
		if ((this.proporcionDeAgua() == other.proporcionDeAgua()) && (this.proporcionDeTierra() == other.proporcionDeTierra()))
			return true;
		return false;
		
	}
	
	
}
