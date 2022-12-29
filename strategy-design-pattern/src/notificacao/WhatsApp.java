package notificacao;

import intefaces.Notificacao;
import model.Cliente;

public class WhatsApp implements Notificacao { 	
	public void notificar(Cliente cliente, String msg) {
		System.out.println("ENVIANDO WHATSAPP" + "\n Destino: " + cliente.getTelefone() + " msg:" + msg);
	}
}
