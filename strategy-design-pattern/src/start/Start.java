package start;

 
import intefaces.Notificacao;
import model.Cliente; 
import notificacao.Sms;
import notificacao.WhatsApp;
import service.NotificacaoService;

public class Start {
	public static void main(String[] args) {			 
		NotificacaoService notificar = new NotificacaoService(); 
		notificar.enviar(new Cliente("João", "joao@gmail.com", "62983441187"), "Sua fatura se encontra com atraso superior a 15 dias.", new WhatsApp());		
	}
}
