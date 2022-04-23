package ar.edu.unlp.info.oo2.ejercicio_3;

import java.util.List;
import java.util.ArrayList;

public class MediaPlayer {
	private List<Media> media;
	
	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}

	public List<Media> getMedia() {
		return this.media;
	}

	public void addMedia(Media media) {
		this.media.add(media);
	}
	
	public void playAll() {
		this.media.forEach(m -> m.play());
	}
	
}
