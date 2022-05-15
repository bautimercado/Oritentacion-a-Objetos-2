package ar.edu.unlp.info.oo2.ejercicio_1_p6;

import java.util.logging.*;
import java.util.List;
import java.util.ArrayList;

public class FilterWordHandler extends ConsoleHandler {
	private List<String> words;
	
	public FilterWordHandler() {
		this.words = new ArrayList<String>();
	}
	
	public void addWord(String word) {
		this.words.add(word);
	}

	public void publish(LogRecord arg0) {
		words.stream()
			.filter(w -> arg0.getMessage().toLowerCase().contains(w.toLowerCase()))
			.forEach(w -> arg0.getMessage().toLowerCase().replace(w.toLowerCase(), "***"));
		super.publish(arg0);
	}
}
