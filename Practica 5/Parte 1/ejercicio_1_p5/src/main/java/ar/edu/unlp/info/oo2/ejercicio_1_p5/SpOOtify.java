package ar.edu.unlp.info.oo2.ejercicio_1_p5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class SpOOtify {
	private List<User> users;
	private List<Author> authors;
	
	public SpOOtify() {
		this.users = new ArrayList<User>();
		this.authors = new ArrayList<Author>();
	}
	
	public void addUser(User u) {
		this.users.add(u);
	}
	
	public void addAuthor(Author a) {
		this.authors.add(a);
	}
	
	public List<Song> searchSong(String str) {
		return this.authors.stream()
				.flatMap(a -> a.search(str.toLowerCase()).stream()).collect(Collectors.toList());
	}

}
