package MInjecaoDependencia.servico;

import MInjecaoDependencia.modelo.Cliente;
import MInjecaoDependencia.notificacoes.Notificacao;
import MInjecaoDependencia.notificacoes.NotificacaoEmail;
import MInjecaoDependencia.notificacoes.NotificacaoSMS;

public class ClienteService {

    private Notificacao notificacao;

    //Dependencia de notificação.
    public ClienteService(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    public void cadastrar(Cliente cliente) {
        System.out.println("Cliente " + cliente.getNome() + " salvo com sucesso!");

        //Alto acoplamento.
        /**NotificacaoEmail notificacaoEmail = new NotificacaoEmail();
         notificacaoEmail.notificar(cliente);

         NotificacaoSMS notificacaoSMS = new NotificacaoSMS();
         notificacaoSMS.notificar(cliente);**/

        //Baixo acoplamento.
        this.notificacao.notificar(cliente);
    }

}
