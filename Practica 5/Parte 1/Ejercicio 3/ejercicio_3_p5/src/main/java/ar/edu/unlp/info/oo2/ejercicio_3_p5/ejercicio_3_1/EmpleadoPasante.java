package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_1;

public class EmpleadoPasante extends Empleado {
	
	public EmpleadoPasante(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	protected double calcularBonus() {
		return 0;
	}
}
