package service;

import intefaces.Notificacao;
import model.Cliente;

public class NotificacaoService {
	
	public void enviar(Cliente cliente, String msg, Notificacao notificacao) {
		notificacao.notificar(cliente, msg);
	}
	
}
