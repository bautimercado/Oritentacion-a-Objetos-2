package ar.edu.unlp.info.oo2.ejercicio_2b;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JacksonAdapter implements Exporter {
	private ObjectMapper om;
	
	public JacksonAdapter() {
		this.om = new ObjectMapper();
	}
	
	private String exportar (Socio socio) throws JsonProcessingException {
		String strSocio = om.writeValueAsString(socio);
		return ", " + strSocio;
	}
	
	public String exportar (List<Socio> socios) {
		if (socios.isEmpty())
			return "[]";
		else {
			String aux = "[";
			aux = aux + socios.forEach(s -> this.exportar(s));
		}
	}
}
