package ar.edu.unlp.info.oo2.ejercicio_7;

public class InProgress extends Estado {
	
	public InProgress() {
		super("InProgress");
	}
	
	public void togglePaused(ToDoItem tarea) {
		tarea.setEstado(new Paused());
	}
	
	public void finish(ToDoItem tarea) {
		tarea.setEstado(new Finished());
	}

}
