package ar.edu.unlp.info.oo2.ejercicio_3_p5.ejercicio_3_5;

import java.text.MessageFormat;

public class Supermercado {
	public void notificarPedido(long nroPedido, Cliente cliente) {
	     String notificacion = MessageFormat.format("Estimado cdliente, se le informa que hemos recibido su pedido con número {0}, "
	     		+ "el cual será enviado a la dirección {1}", new Object[] { nroPedido, cliente.getDireccionFormateada() });

	     // lo imprimimos en pantalla, podría ser un mail, SMS, etc..
	    System.out.println(notificacion);
	  }

}
