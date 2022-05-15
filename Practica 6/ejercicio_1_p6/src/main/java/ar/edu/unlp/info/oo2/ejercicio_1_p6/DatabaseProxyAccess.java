package ar.edu.unlp.info.oo2.ejercicio_1_p6;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import java.util.logging.*;

public class DatabaseProxyAccess implements DatabaseAccess {
	private String password;
	private boolean logged;
	private DatabaseAccess databaseAccess;
	
	public DatabaseProxyAccess(DatabaseAccess databaseAccess, String password) {
		super();
		this.databaseAccess = databaseAccess;
		this.password = password;
		this.logged = false;
		
		this.createLoggers();
	}
	
	public void createLoggers() {
		//Logger para busquedas
		Logger.getLogger("Consulta").setLevel(Level.INFO);
		EmailHandler consultaHandler = new EmailHandler();
		consultaHandler.setFormatter(new JSONFormatter());
		Logger.getLogger("Consulta").addHandler(consultaHandler);
		
		
		//Logger para inserciones
		Logger.getLogger("Insercion").setLevel(Level.WARNING);
		ConsoleHandler insercionHandler = new ConsoleHandler();
		insercionHandler.setFormatter(new JSONFormatter());
		Logger.getLogger("Insercion").addHandler(insercionHandler);
		
		//Logger para acceso invalido
		Logger.getLogger("Acceso invalido").setLevel(Level.SEVERE);
		FilterWordHandler accesoInvalidoHandler = new FilterWordHandler();
		accesoInvalidoHandler.addWord("Acceso");
		accesoInvalidoHandler.setFormatter(new UpperCaseFormatter());
		Logger.getLogger("Acceso invalido").addHandler(accesoInvalidoHandler);
		
	}
	
	public void setLogged(boolean logged) {
		this.logged = logged;
	}
	
	public boolean isLogged() {
		return this.logged;
	}
	
	public boolean login(String password) {
		this.setLogged(((this.password.equals(password)) ? true : false));
		return this.isLogged();
	}
	
	@Override
	public int insertNewRow(List<String> rowData) {
		if (this.isLogged()) {
			Logger.getLogger("Insercion").log(Level.WARNING, "Insercion en la base de datos");
			return this.databaseAccess.insertNewRow(rowData);
		}
		Logger.getLogger("Acceso invalido").log(Level.SEVERE, "Acceso invalido a la base de datos");
		return -1;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString){
		if (this.isLogged()) {
			Logger.getLogger("Consulta").log(Level.INFO, "Busqueda en la base de datos");
			return this.databaseAccess.getSearchResults(queryString);
		}
		Logger.getLogger("Acceso invalido").log(Level.SEVERE, "Acceso invalido a la base de datos");
		return Collections.emptyList();
	}
	
	
}
