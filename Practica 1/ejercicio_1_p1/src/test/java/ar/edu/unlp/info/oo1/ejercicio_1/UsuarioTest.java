package ar.edu.unlp.info.oo1.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.HashSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioTest {
	private Usuario usuario;
	
	@BeforeEach
	public void setUp() {
		usuario = new Usuario("Juan");
		
		usuario.tweetear("Java");
		usuario.tweetear("Python");
		usuario.tweetear("Javascript");
	}
	
	@Test
	public void testTweets() {
		assertEquals(usuario.getTweets().size(), 3);
		
		usuario.tweetear("Ruby");
		
		Tweet t1 = new Tweet("Ruby");
		
		assertEquals(usuario.getTweets().size(), 4);
		assertEquals(usuario.getTweets().get(3), t1);
	}
	
	@Test
	public void testRetweet() {
		Tweet t1 = new Tweet("Ruby");
		usuario.retweetear(t1);
		
		assertEquals(usuario.getTweets().size(), 4);
		assertEquals(t1, usuario.getTweets().get(3).getTweetOriginal());
	}
	
	@Test
	public void testTweetRango() {
		usuario.tweetear("");
		Tweet t1 = new Tweet(""); 
		
		assertEquals(usuario.getTweets().size(), 3);
		assertFalse(usuario.getTweets().contains(t1));
		
	}
	
}
