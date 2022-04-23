package ar.edu.unlp.info.oo1.ejercicio_1;

public class Tweet {
	private String texto;
	private Tweet retweetDe;
	
	public Tweet(String texto) {
		this.texto = texto;
		this.retweetDe = null;
	}
	
	public Tweet(Tweet tweetOriginal) {
		this.texto = tweetOriginal.getTexto();
		this.retweetDe = tweetOriginal;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((retweetDe == null) ? 0 : retweetDe.hashCode());
		result = prime * result + ((texto == null) ? 0 : texto.hashCode());
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
		Tweet other = (Tweet) obj;
		if (retweetDe == null) {
			if (other.retweetDe != null)
				return false;
		} else if (!retweetDe.equals(other.retweetDe))
			return false;
		if (texto == null) {
			if (other.texto != null)
				return false;
		} else if (!texto.equals(other.texto))
			return false;
		return true;
	}

	public Tweet getTweetOriginal() {
		return this.retweetDe;
	}
}
