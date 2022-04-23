package ar.edu.unlp.info.oo2.ejercicio_6;

public class Pasante extends Empleado {
	private int examenesRendidos;
	
	public Pasante(int examenesRendidos) {
		this.examenesRendidos = examenesRendidos;
	}
	
	public double sueldoBasico() {
		return 20000d;
	}
	
	public double adicional() {
		double aux = 0d;
		if (this.examenesRendidos > 0)
			aux = aux + (2000d * this.examenesRendidos);
		return aux;
	}
}
