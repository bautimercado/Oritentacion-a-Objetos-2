package ar.edu.unlp.info.oo2.ejercicio_1_p6;

import java.util.logging.*;

public class JSONFormatter extends Formatter {
	
	@Override
	public String format(LogRecord arg0) {
		return "{ message: "+arg0.getMessage()+", level: "+arg0.getLevel()+" }";
	}

}
