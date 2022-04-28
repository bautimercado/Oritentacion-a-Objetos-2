package ar.edu.unlp.info.oo2.ejercicio_1_p5;

import java.util.List;
import java.util.ArrayList;

public class User {
	private String name;
	private List<Song> myMusic;
	
	public User(String name) {
		this.name = name;
		this.myMusic = new ArrayList<Song>();
	}
	
	public void addSongToMyMusic(Song s) {
		this.myMusic.add(s);
	}
	
	public void removeSong(Song s) {
		this.myMusic.remove(s);
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Song> getMyMusic() {
		return this.myMusic;
	}
}
