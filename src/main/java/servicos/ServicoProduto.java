package servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import modelo.Produto;

public interface ServicoProduto extends Remote {

    ArrayList<Produto> listarProdutos() throws RemoteException;

    boolean inserirProduto(Produto p) throws RemoteException;

    boolean atualizarProduto(Produto p) throws RemoteException;

    boolean deletarProduto(int id) throws RemoteException;

    Produto buscarPorId(int id) throws RemoteException;

    Produto buscarPorNome(String nome) throws RemoteException;
}
