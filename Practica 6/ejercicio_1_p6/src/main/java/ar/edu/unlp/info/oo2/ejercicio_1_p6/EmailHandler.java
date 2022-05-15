package ar.edu.unlp.info.oo2.ejercicio_1_p6;

import java.util.Properties;
import java.util.logging.*;
import java.time.LocalDateTime;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class EmailHandler extends StreamHandler {

	@Override
	public void close(){
		// TODO Auto-generated method stub
		super.flush();
		
	}

	@Override
	public void publish(LogRecord arg0) {
		// TODO Auto-generated method stub
		String str = arg0.getMessage();
		str = LocalDateTime.now().toString()+" "+Package.class+"/n"+arg0.getLevel()+": "+arg0.getMessage()+"/n";
		
		try {
			String from = "example@logger.com";
			String to = "destination@mail.com";

			// credenciales
			String username = "7c498582e98a07"; // Completar con su username de mailtrap
			String password = "662be6055d2e16"; // Completar con su password de mailtrap
			
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");				 
			Session session = Session.getInstance(props,
				new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		            	return new PasswordAuthentication(username, password);
		            }
			});

		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(from, "Java logging mail"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject(str);
		    message.setText(arg0.getMessage());
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
		
		
	}

}
