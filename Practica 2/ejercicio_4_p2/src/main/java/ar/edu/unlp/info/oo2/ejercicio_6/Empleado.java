package ar.edu.unlp.info.oo2.ejercicio_6;

public abstract class Empleado {
	
	public double sueldo() {
		return this.descuento();
	}
	
	public double descuento() {
		return (this.sueldoBasico()*0.87d) + (this.adicional()*0.95d);
	}
	
	public abstract double sueldoBasico();
	public abstract double adicional();
}
