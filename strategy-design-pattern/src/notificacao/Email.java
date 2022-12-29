package notificacao;

import intefaces.Notificacao;
import model.Cliente;

public class Email implements Notificacao {
	
	@Override
	public void notificar(Cliente cliente, String msg) {
		System.out.println("ENVIANDO EMAIL" + "\n Destino: " + cliente.getTelefone() + " msg:" + msg);
	}
}
