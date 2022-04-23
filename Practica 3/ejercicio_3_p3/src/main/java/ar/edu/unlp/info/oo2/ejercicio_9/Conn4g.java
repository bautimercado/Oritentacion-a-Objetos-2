package ar.edu.unlp.info.oo2.ejercicio_9;

public class Conn4g {
	private String symb;
	
	public Conn4g() {
		this.symb = "4G";
	}
	
	public String transmit(String data, int crc) {
		return "4g "+data;
	}
	
	public String getSymb() {
		return this.symb;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symb == null) ? 0 : symb.hashCode());
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
		Conn4g other = (Conn4g) obj;
		if (symb == null) {
			if (other.symb != null)
				return false;
		} else if (!symb.equals(other.symb))
			return false;
		return true;
	}
	
	

}
