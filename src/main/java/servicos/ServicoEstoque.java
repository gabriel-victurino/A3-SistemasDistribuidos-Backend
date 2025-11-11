package servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicoEstoque extends Remote {

    public String getMensagem() throws RemoteException;

    public void setMensagem(String mensagem) throws RemoteException;
}
