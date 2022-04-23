package ar.edu.unlp.info.oo2.ejercicio_4;

public class TopografiaDePantano implements Topografia {
	
	public double proporcionDeAgua() {
		return 0.7f;
	}
	
	public double proporcionDeTierra() {
		return 0.3f;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		return true;
	}
}
