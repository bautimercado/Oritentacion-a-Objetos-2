package ar.edu.unlp.info.oo2.ejercicio_3;

public class VideoStreamAdapter implements Media {
	private VideoStream videoStream;
	
	public VideoStreamAdapter(VideoStream videoStream) {
		this.videoStream = new VideoStream();
	}
	
	public void play() {
		this.videoStream.reproduce();
	}

}
