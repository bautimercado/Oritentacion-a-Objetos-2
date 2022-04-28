package ar.edu.unlp.info.oo2.ejercicio_1_p5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
	private String title;
	private List<Song> songs;
	
	public Album(String title) {
		this.title = title;
		this.songs = new ArrayList<Song>();
	}
	
	public String getString() {
		return this.title;
	}

	public void addSong(Song s) {
		this.songs.add(s);
	}
	
	public List<Song> getSongs() {
		return this.songs;
	}
	
	private boolean equalsOrContains(String str) {
		return ((this.title.toLowerCase().equals(str) || (this.title.toLowerCase().contains(str)) ? true : false));
	}
	
	public List<Song> search(String str){
		if (this.equalsOrContains(str))
			return this.getSongs();
		return this.songs.stream()
				.filter(s -> s.equalsOrContains(str))
				.collect(Collectors.toList());
				
	}
	
}
