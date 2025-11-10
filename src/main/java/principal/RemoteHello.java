
package principal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteHello extends Remote {

    public String getMensagem() throws RemoteException;

    public void setMensagem(String mensagem) throws RemoteException;
}
