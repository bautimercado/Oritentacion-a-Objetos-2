package ar.edu.unlp.info.oo2.ejercicio_1_p6;

import java.util.logging.*;



public class UpperCaseFormatter extends SimpleFormatter {
	@Override
	public String format(LogRecord arg0) {
		return super.format(arg0).toUpperCase();
	}

}
