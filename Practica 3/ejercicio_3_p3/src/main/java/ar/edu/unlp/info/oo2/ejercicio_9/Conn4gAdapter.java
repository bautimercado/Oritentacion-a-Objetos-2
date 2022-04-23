package ar.edu.unlp.info.oo2.ejercicio_9;

public class Conn4gAdapter implements Connection {
	private Conn4g adaptee;
	
	public Conn4gAdapter() {
		this.adaptee = new Conn4g();
	}
	
	public String sendData(String data, int crc) {
		return adaptee.transmit(data, crc);
	}

	public String pict() {
		return this.adaptee.getSymb();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adaptee == null) ? 0 : adaptee.hashCode());
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
		Conn4gAdapter other = (Conn4gAdapter) obj;
		if (adaptee == null) {
			if (other.adaptee != null)
				return false;
		} else if (!adaptee.equals(other.adaptee))
			return false;
		return true;
	}
	
	
	
}
