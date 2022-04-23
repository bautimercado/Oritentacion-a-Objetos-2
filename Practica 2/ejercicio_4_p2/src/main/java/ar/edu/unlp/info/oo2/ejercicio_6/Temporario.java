package ar.edu.unlp.info.oo2.ejercicio_6;

public class Temporario extends Empleado {
	private int horasTrabajadas;
	private boolean casado;
	private int cantHijos;
	
	public Temporario(int horasTrabajadas, boolean casado, int cantHijos) {
		this.horasTrabajadas = horasTrabajadas;
		this.casado = casado;
		this.cantHijos = cantHijos;
	}
	
	public double sueldoBasico() {
		return 20000d + (this.horasTrabajadas * 300d);
	}
	
	public double adicional() {
		double aux = 0;
		if (this.casado)
			aux += 5000d;
		if (this.cantHijos > 0)
			aux = aux + (2000d * this.cantHijos);
		return aux;
	}
	
}
