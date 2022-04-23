package ar.edu.unlp.info.oo2.ejercicio_9;

public class Dispositivo {
	private CRC_Algorithm crcCalculator;
	private Display display;
	private Ringer ringer;
	private Connection connection;
	
	public Dispositivo() {
		this.display = new Display();
		this.ringer = new Ringer();
	}
	
	public String sendOperation(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, (int)crc);
	}
	
	public void configurarCRC(CRC_Algorithm crc) {
		this.crcCalculator = crc;
	}
	
	public void cambiarConexion(Connection conn) {
		this.connection = conn;
		this.display.showBanner(conn.pict());
		this.ringer.ring();
	}
	
	public Display getDisplay() {
		return this.display;
	}
	
	public Ringer getRinger() {
		return this.ringer;
	}
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public CRC_Algorithm getCRC() {
		return this.crcCalculator;
	}
	
}
