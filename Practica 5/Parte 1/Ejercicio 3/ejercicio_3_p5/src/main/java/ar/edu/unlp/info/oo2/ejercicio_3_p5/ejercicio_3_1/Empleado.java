package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_1;

public abstract class Empleado {
	private String nombre, apellido;
	private double sueldoBasico;
	
	public Empleado(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasico = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	protected abstract double calcularBonus();
	
	public double calcularSueldo() {
		return this.sueldoBasico + this.calcularBonus() - (this.sueldoBasico * 0.13);
	}
	
}
