package ar.edu.unlp.info.oo2.ejercicio_2b;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter implements Exporter {
	
	private JSONObject exportar(Socio socio) {
		JSONObject object = new JSONObject();
		
		object.put("nombre", socio.getNombre());
		object.put("email", socio.getEmail());
		object.put("legajo", socio.getLegajo());
		
		return object;
	}

	public String exportar(List<Socio> socios) {
		if (socios.isEmpty())
			return "[]";
		else {
			JSONArray array = new JSONArray();
			socios.forEach(socio -> {array.add(this.exportar(socio));});
			return array.toJSONString();
		}
	}
}
