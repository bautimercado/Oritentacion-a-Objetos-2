package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_1;

public class EmpleadoTemporario extends Empleado {
	private double horasTrabajadas;
	private int cantHijos;
	
	public EmpleadoTemporario(String nombre, String apellido) {
		super(nombre, apellido);
		this.horasTrabajadas = 0;
		this.cantHijos = 0;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	
	protected double calcularBonus() {
		return (this.horasTrabajadas * 500) + (this.cantHijos * 1000);
	}
	
	
}
