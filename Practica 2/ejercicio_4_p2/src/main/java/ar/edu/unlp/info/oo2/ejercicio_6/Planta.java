package ar.edu.unlp.info.oo2.ejercicio_6;

public class Planta extends Empleado {
	private boolean casado;
	private int cantHijos;
	private int antiguedad;
	
	public Planta(boolean casado, int cantHijos, int antiguedad) {
		this.casado = casado;
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
	}
	
	public double sueldoBasico() {
		return 50000d;
	}
	
	public double adicional() {
		double aux = 0;
		if (this.casado)
			aux += 5000;
		if (this.cantHijos > 0)
			aux = aux + (this.cantHijos * 2000d);
		if (this.antiguedad > 0)
			aux = aux + (this.antiguedad * 2000d);
		return aux;
	}
	

}
