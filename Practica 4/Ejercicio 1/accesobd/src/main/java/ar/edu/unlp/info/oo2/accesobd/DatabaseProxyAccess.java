package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess {
	private String password;
	private boolean logged;
	private DatabaseAccess databaseAccess;
	
	public DatabaseProxyAccess(DatabaseAccess databaseAccess, String password) {
		super();
		this.databaseAccess = databaseAccess;
		this.password = password;
		this.logged = false;
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
		if (this.isLogged())
			return this.databaseAccess.insertNewRow(rowData);
		return -1;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString){
		if (this.isLogged())
			return this.databaseAccess.getSearchResults(queryString);
		return Collections.emptyList();
	}
	
	
}
