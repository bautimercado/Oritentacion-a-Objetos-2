package ar.edu.unlp.info.oo1.ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

public class ServicioDeUsuarios {
	private Set<Usuario> usuarios;
	
	public ServicioDeUsuarios() {
		this.usuarios = new HashSet<Usuario>();
	}
	
	public void registrarUsuario(String screenName) {
		Usuario u = new Usuario(screenName);
		usuarios.add(u);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		if (this.usuarios.contains(usuario)) {
			usuario.eliminarTweets();
			usuarios.remove(usuario);
		}
	}
	
	public Set<Usuario> getUsuarios() {
		return this.usuarios;
	}
}
