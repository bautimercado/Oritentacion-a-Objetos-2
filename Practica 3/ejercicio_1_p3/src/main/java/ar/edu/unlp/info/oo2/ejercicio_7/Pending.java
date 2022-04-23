package ar.edu.unlp.info.oo2.ejercicio_7;

public class Pending extends Estado {
	
	public Pending() {
		super("Pending");
	}
	
	public void start(ToDoItem tarea) {
		tarea.setEstado(new InProgress());
	}
	
	
	
}
