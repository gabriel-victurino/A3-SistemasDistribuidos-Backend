package servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import modelo.Categoria;

public interface ServicoCategoria extends Remote {

    ArrayList<Categoria> listarCategorias() throws RemoteException;

    Categoria buscarCategoria(int id) throws RemoteException;

    boolean inserirCategoria(Categoria c) throws RemoteException;

    boolean atualizarCategoria(Categoria c) throws RemoteException;

    boolean deletarCategoria(int id) throws RemoteException;
}
