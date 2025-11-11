package servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import modelo.Movimentacao;

public interface ServicoMovimentacao extends Remote {

    ArrayList<Movimentacao> listarMovimentacoes() throws RemoteException;

    boolean inserirMovimentacao(Movimentacao m) throws RemoteException;

    boolean atualizarMovimentacao(Movimentacao m) throws RemoteException;

    boolean deletarMovimentacao(int id) throws RemoteException;

    Movimentacao buscarPorId(int id) throws RemoteException;
}
