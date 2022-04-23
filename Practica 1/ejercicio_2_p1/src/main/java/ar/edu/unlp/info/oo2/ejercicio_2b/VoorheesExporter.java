package ar.edu.unlp.info.oo2.ejercicio_2b;

import java.util.List;


public class VoorheesExporter implements Exporter {
	private Exporter exporter;
	
	public void setExporter(Exporter exporter) {
		this.exporter = exporter;
	}
	
	public String exportar(List<Socio> socios) {
		return exporter.exportar(socios);
	}

}
