package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	private SortedSet<String> guia = new TreeSet<String>();
	
	public boolean existeNumero(String numero) {
		return this.guia.contains(numero);
	}
	
	public boolean addNumero(String numero) {
		this.guia.add(numero);
		return true;
	}
	
	public String obtenerUltimoYRemoverNumero() {
		String num = this.guia.last();
		this.guia.remove(num);
		return num;
	}
	
	public SortedSet<String> getGuia() {
		return this.guia;
	}
	
}
