package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_1;

public class EmpleadoPlanta extends Empleado {
	private int cantHijos;
	
	public EmpleadoPlanta(String nombre, String apellido) {
		super(nombre, apellido);
		this.cantHijos = 0;
	}
	
	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	protected double calcularBonus() {
		return (this.cantHijos * 2000);
	}
}
