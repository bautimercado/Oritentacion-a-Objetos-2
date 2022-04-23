package ar.edu.unlp.info.oo2.ejercicio_7;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.Duration;

public class ToDoItem {
	private String name;
	private Estado estado;
	private List<String> comentarios;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaFin;
	
	public ToDoItem(String name) {
		this.name = name;
		this.estado = new Pending();
		this.comentarios = new ArrayList<String>();
		this.fechaInicio = null;
		this.fechaFin = null;
	}
	
	public void start() {
		this.estado.start(this);
		this.fechaInicio = LocalDateTime.now();
	}
	
	public void togglePaused() {
		this.estado.togglePaused(this);
	}
	
	public void finish() {
		this.estado.finish(this);
		this.fechaFin = LocalDateTime.now();
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void addComentario(String comentario) {
		if (this.fechaFin == null)	
			this.comentarios.add(comentario);
	}
	
	public Duration workedTime() {
		if (this.fechaInicio == null)
			throw new RuntimeException("Can't return the worked time because its state is Pending");
		else
			if (this.fechaFin == null)
				return Duration.between(this.fechaInicio, LocalDateTime.now());
			else
				return Duration.between(this.fechaInicio, this.fechaFin);
	}
	
	public Estado getEstado() {
		return this.estado;
	}
	
	public List<String> getComentarios(){
		return this.comentarios;
	}
}
