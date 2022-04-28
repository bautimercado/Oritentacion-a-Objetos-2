package ar.edu.unlp.info.oo2.ejercicio_1_p5;

public class Song {
	private String title;
	
	public Song(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}

	public boolean equalsOrContains(String str) {
		return ((this.title.toLowerCase().equals(str) || (this.title.toLowerCase().contains(str)) ? true : false));
	}
	
	public Song search(String str) {
		if (this.equalsOrContains(str))
			return this;
		return null;
	}
}
