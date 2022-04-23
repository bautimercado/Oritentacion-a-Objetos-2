package ar.edu.unlp.info.oo2.ejercicio_9;

import java.util.zip.CRC32;

public class CRC_32Calculator implements CRC_Algorithm{
	
	public long crcFor(String data) {
		CRC32 crc = new CRC32();
		//String datos = "un mensaje";
		crc.update(data.getBytes());
		long result = crc.getValue();
		return result;
	}
}
