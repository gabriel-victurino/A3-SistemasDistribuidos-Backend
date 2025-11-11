
package servicos;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import dao.CategoriaDAO;
import modelo.Categoria;


public class ServicoCategoriaImpl extends UnicastRemoteObject implements ServicoCategoria {

    private CategoriaDAO dao;

    public ServicoCategoriaImpl () throws RemoteException {
        dao = new CategoriaDAO();
    }

    @Override
    public ArrayList<Categoria> listarCategorias() throws RemoteException {
        return dao.getMinhaLista();
    }

    @Override
    public Categoria buscarCategoria(int id) throws RemoteException {
        return dao.carregaCategoria(id);
    }

    @Override
    public boolean inserirCategoria(Categoria c) throws RemoteException {
        return dao.insertCategoriaBD(c);
    }

    @Override
    public boolean atualizarCategoria(Categoria c) throws RemoteException {
        return dao.updateCategoriaBD(c);
    }

    @Override
    public boolean deletarCategoria(int id) throws RemoteException {
        return dao.deleteCategoriaBD(id);
    }
}
