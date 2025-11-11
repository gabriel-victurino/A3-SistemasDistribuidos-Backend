
package servicos;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import dao.MovimentacaoDAO;
import modelo.Movimentacao;

public class ServicoMovimentacaoImpl extends UnicastRemoteObject implements ServicoMovimentacao {

    private MovimentacaoDAO dao = new MovimentacaoDAO();

    public ServicoMovimentacaoImpl() throws RemoteException {
        super();
    }

    @Override
    public ArrayList<Movimentacao> listarMovimentacoes() throws RemoteException {
        return dao.getMinhaLista();
    }

    @Override
    public boolean inserirMovimentacao(Movimentacao m) throws RemoteException {
        return dao.insertMovimentacaoBD(m);
    }

    @Override
    public boolean atualizarMovimentacao(Movimentacao m) throws RemoteException {
        return dao.updateMovimentacaoBD(m);
    }

    @Override
    public boolean deletarMovimentacao(int id) throws RemoteException {
        return dao.deleteMovimentacaoBD(id);
    }

    @Override
    public Movimentacao buscarPorId(int id) throws RemoteException {
        return dao.carregaMovimentacao(id);
    }
}
