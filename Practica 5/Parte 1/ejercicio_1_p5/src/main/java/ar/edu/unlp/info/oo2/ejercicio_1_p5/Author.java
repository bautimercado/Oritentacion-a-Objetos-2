package ar.edu.unlp.info.oo2.ejercicio_1_p5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Author {
	private String name;
	private List<Album> albums;
	
	public Author(String name) {
		this.name = name;
		this.albums = new ArrayList<Album>();
	}
	
	public String getString() {
		return this.name;
	}

	public void addAlbum(Album a) {
		this.albums.add(a);
	}
	
	private boolean equalsOrContains(String str) {
		return ((this.name.toLowerCase().equals(str) || (this.name.toLowerCase().contains(str)) ? true : false));
	}
	
	public List<Song> search(String str) {
		if (this.equalsOrContains(str)) {
			return this.albums.stream()
					.flatMap(a -> a.getSongs().stream()).collect(Collectors.toList());
		}
		return this.albums.stream()
				.flatMap(a -> a.search(str).stream()).collect(Collectors.toList());
		
	}
	
	
}
