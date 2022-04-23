package ar.edu.unlp.info.oo2.ejercicio_7;

public abstract class Estado {
	private String nombre;
	
	public Estado(String nombre) {
		this.nombre = nombre;
	}
	
	public void start(ToDoItem tarea) {
		
	}
	
	public void togglePaused(ToDoItem tarea) {
		throw new RuntimeException("ToDoItem can't paused because its state is "+ this.nombre);
	}
	
	public void finish(ToDoItem tarea) {
		
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
