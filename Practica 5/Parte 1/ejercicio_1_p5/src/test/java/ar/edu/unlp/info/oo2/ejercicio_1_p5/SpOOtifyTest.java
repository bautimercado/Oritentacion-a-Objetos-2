package ar.edu.unlp.info.oo2.ejercicio_1_p5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpOOtifyTest {
	private SpOOtify musicPlayer;
	private Author soda, muse, charly;
	private User user1;
	private Song s1, s2, s3, s4, s5, s6, s7, s8, s9;
	
	@BeforeEach
	void setUp() {
		//Soda Stereo
		s1 = new Song("En la ciudad de la furia");
		s2 = new Song("Un millon de años luz");
		s3 = new Song("Hombre al agua");
		s4 = new Song("En remolinos");
		
		Album a1, a2, a3;
		a1 = new Album("Doble vida");
		a1.addSong(s1);
		
		a2 = new Album("Cancion animal");
		a2.addSong(s2);
		a2.addSong(s3);
		
		a3 = new Album("Dynamo");
		a3.addSong(s4);
		
		soda = new Author("Soda Stereo");
		
		soda.addAlbum(a1);
		soda.addAlbum(a2);
		soda.addAlbum(a3);
		
		//Muse
		s5 = new Song("Stockholm Syndrome");
		s6 = new Song("Space Dementia");
		s7 = new Song("Citizen Erased");
		
		Album a4, a5;
		a4 = new Album("Absolution");
		a4.addSong(s5);
		
		a5 = new Album("Origin of Simetry");
		a5.addSong(s6);
		a5.addSong(s7);
		
		muse = new Author("Muse");
		
		muse.addAlbum(a4);
		muse.addAlbum(a5);
		
		//Charly Garcia
		s8 = new Song("Los dinosaurios");
		s9 = new Song("Raros peinados nuevos");
		
		Album a6, a7;
		a6 = new Album("Clics modernos");
		a6.addSong(s8);
		
		a7 = new Album("Piano bar");
		a7.addSong(s9);
		
		charly = new Author("Charly Garcia");
		
		charly.addAlbum(a6);
		charly.addAlbum(a7);
		
		//SpOOtify
		musicPlayer = new SpOOtify();
		
		musicPlayer.addAuthor(charly);
		musicPlayer.addAuthor(soda);
		musicPlayer.addAuthor(muse);
		
		//User
		user1 = new User("I'm Vengeance");
		
		user1.addSongToMyMusic(s1);  //En la ciudad de la furia
		user1.addSongToMyMusic(s2);  //Un millon de años luz
		user1.addSongToMyMusic(s3);  //Hombre al agua
		user1.addSongToMyMusic(s5);  //Stockholm Syndrome
		user1.addSongToMyMusic(s6);  //Space Dementia
		user1.addSongToMyMusic(s8);  //Los dinosaurios
		user1.addSongToMyMusic(s9);  //Raros peinados nuevos
		
		//7 canciones en total
		
		musicPlayer.addUser(user1);
		
		
	}
	
	@Test
	void searchPerAuthorTest() {
		assertEquals(4, musicPlayer.searchSong("Soda Stereo").size());
		assertEquals(3, musicPlayer.searchSong("Muse").size());
		assertEquals(2, musicPlayer.searchSong("Charly Garcia").size());
		
		assertEquals(0, musicPlayer.searchSong("Foo Fighters").size());
	}
	
	@Test
	void searchPerAlbumTest() {
		assertEquals(1, musicPlayer.searchSong("Dynamo").size());
		assertEquals(2, musicPlayer.searchSong("Cancion Animal").size());
		assertEquals(1, musicPlayer.searchSong("Absolution").size());
		assertEquals(1, musicPlayer.searchSong("Piano bar").size());
		
		assertEquals(0, musicPlayer.searchSong("Sueño stereo").size());
		
	}
	
	@Test
	void searchPerTitleTest() {
		assertEquals(s1, musicPlayer.searchSong("ciudad").get(0));
		assertEquals(s6, musicPlayer.searchSong("space").get(0));
		assertEquals(s9, musicPlayer.searchSong("raros").get(0));
		
		assertEquals(0, musicPlayer.searchSong("Smells like teen spirit").size());
	}
	
	@Test
	void myMusicUserTest() {
		assertEquals(7, user1.getMyMusic().size());
		
		user1.removeSong(s1);
		user1.removeSong(s9);
		
		assertEquals(5, user1.getMyMusic().size());
		assertFalse(user1.getMyMusic().contains(s1));
		assertFalse(user1.getMyMusic().contains(s9));
		
		user1.addSongToMyMusic(new Song("November Rain"));
		assertEquals(6, user1.getMyMusic().size());
	}
}
