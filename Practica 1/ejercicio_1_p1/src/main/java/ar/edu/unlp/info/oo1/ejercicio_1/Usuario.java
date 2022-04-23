package ar.edu.unlp.info.oo1.ejercicio_1;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		this.tweets = new ArrayList<Tweet>();
	}
	
	public void tweetear(String texto) {
		if (this.calcularRango(texto)) {
			Tweet t = new Tweet(texto);
			this.tweets.add(t);
		}
	}
	
	private boolean calcularRango(String texto) {
		if ((texto.length() >= 1) && (texto.length() <= 140))
			return true;
		else
			return false;
	}
	
	public void retweetear(Tweet tweetOriginal) {
		Tweet t = new Tweet(tweetOriginal);
		this.tweets.add(t);
	}
	
	public void eliminarTweets() {
		this.tweets.clear();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((screenName == null) ? 0 : screenName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (screenName == null) {
			if (other.screenName != null)
				return false;
		} else if (!screenName.equals(other.screenName))
			return false;
		return true;
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
}
