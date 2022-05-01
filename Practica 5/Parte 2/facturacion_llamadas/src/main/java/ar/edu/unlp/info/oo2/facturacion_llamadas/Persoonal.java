package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	private List<Persoona> personas = new ArrayList<Persoona>();
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	//private static double descuentoJur = 0.15;
	//private static double descuentoFis = 0;
	
	public boolean agregarTelefono(String numero) {
		return this.guiaTelefonica.addNumero(numero);
		 
	}

	
	public Persoona registrarUsuario(Persoona persona) {
		persona.setTelefono(this.guiaTelefonica.obtenerUltimoYRemoverNumero());
		//persona.setSistema(this);
		this.personas.add(persona);

		return persona;
		
	}
	
	public boolean eliminarUsuario(Persoona persona) {
		if (this.existeUsuario(persona)) {
			this.personas.remove(persona);
			this.guiaTelefonica.addNumero(persona.getTelefono());
			return true;
		}
		return false;
		
	}
	
	public Llamada registrarLlamada(Persoona emisor, Persoona remitente, TipoDeLlamada tipoDeLlamada, int duracion) {
		Llamada llamada = new Llamada(tipoDeLlamada, emisor.getTelefono(), remitente.getTelefono(), duracion);
		llamadas.add(llamada);
		emisor.addLlamada(llamada);
		return llamada;
		
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return this.personas.contains(persona);
	}
	
}
