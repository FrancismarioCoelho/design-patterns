package notificacao;

import intefaces.Notificacao;
import model.Cliente;

public class Sms implements Notificacao {
	
public void notificar(Cliente cliente, String msg) { 
			System.out.println("ENVIANDO SMS"+ "\n Destino: "+cliente.getTelefone() + " msg:"+msg);		 
	}
 
}
