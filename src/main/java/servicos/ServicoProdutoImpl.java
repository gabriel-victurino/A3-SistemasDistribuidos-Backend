package servicos;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import dao.ProdutoDAO;
import modelo.Produto;


public class ServicoProdutoImpl extends UnicastRemoteObject implements ServicoProduto {

    private ProdutoDAO dao = new ProdutoDAO();

    public ServicoProdutoImpl() throws RemoteException {
        super();
    }

    @Override
    public ArrayList<Produto> listarProdutos() throws RemoteException {
        return dao.getMinhaLista();
    }

    @Override
    public boolean inserirProduto(Produto p) throws RemoteException {
        return dao.insertProdutoBD(p);
    }

    @Override
    public boolean atualizarProduto(Produto p) throws RemoteException {
        return dao.updateProdutoBD(p);
    }

    @Override
    public boolean deletarProduto(int id) throws RemoteException {
        return dao.deleteProdutoBD(id);
    }

    @Override
    public Produto buscarPorId(int id) throws RemoteException {
        return dao.carregaProduto(id);
    }

    @Override
    public Produto buscarPorNome(String nome) throws RemoteException {
        return dao.getProdutoPorNome(nome);
    }
}
