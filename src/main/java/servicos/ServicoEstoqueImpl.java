package servicos;

import java.rmi.RemoteException;
import servicos.ServicoEstoque;

public class ServicoEstoqueImpl implements ServicoEstoque {

    private String mensagem;

    public ServicoEstoqueImpl() throws RemoteException {
        this("Inicial");
    }

    public ServicoEstoqueImpl(String mensagem) throws RemoteException {
        setMensagem(mensagem);
    }

    public String getMensagem() throws RemoteException {
        return mensagem;
    }

    public void setMensagem(String mensagem) throws RemoteException {
        this.mensagem = mensagem;
    }
}
