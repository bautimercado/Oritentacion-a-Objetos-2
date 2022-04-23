package ar.edu.unlp.info.oo2.ejercicio_7;

public class Paused extends Estado {
	
	public Paused() {
		super("Paused");
	}
	
	public void togglePaused(ToDoItem tarea) {
		tarea.setEstado(new InProgress());
	}
	
	public void finish(ToDoItem tarea) {
		tarea.setEstado(new Finished());
	}
}
