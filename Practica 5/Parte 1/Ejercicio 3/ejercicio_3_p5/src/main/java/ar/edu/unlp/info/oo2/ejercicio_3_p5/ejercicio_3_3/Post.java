package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_3;

import java.time.LocalDateTime;

public class Post {
	private String texto;
	private LocalDateTime fecha;
	private Usuario usuario;

	public Post(String texto, Usuario usuario) {
		this.texto = texto;
		this.usuario = usuario;
		this.fecha = LocalDateTime.now();
	}
	
	public LocalDateTime getFecha() {
		return this.fecha;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
}
