package principal;

import java.rmi.RemoteException;

public class HelloImpl implements RemoteHello {

    private String mensagem;

    public HelloImpl() throws RemoteException {
        this("Inicial");
    }

    public HelloImpl(String mensagem) throws RemoteException {
        setMensagem(mensagem);
    }

    public String getMensagem() throws RemoteException {
        return mensagem;
    }

    public void setMensagem(String mensagem) throws RemoteException {
        this.mensagem = mensagem;
    }
}
