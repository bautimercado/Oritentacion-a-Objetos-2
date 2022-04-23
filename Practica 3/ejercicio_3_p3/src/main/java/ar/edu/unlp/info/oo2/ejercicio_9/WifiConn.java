package ar.edu.unlp.info.oo2.ejercicio_9;

public class WifiConn implements Connection{
	private String pict;
	
	public WifiConn() {
		this.pict = "WIFI";
	}

	public String sendData(String data, int crc) {
		String aux = "Wifi "+data;
		return aux;
	}

	public String pict() {
		return this.pict;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pict == null) ? 0 : pict.hashCode());
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
		WifiConn other = (WifiConn) obj;
		if (pict == null) {
			if (other.pict != null)
				return false;
		} else if (!pict.equals(other.pict))
			return false;
		return true;
	}
	
	
}
