package servicos;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import dao.CategoriaDAO;
import modelo.Categoria;

/**
 * Implementação remota de ServicoCategoria.
 *
 * Esta classe utiliza o CategoriaDAO para manipular os dados no banco, enquanto
 * expõe métodos acessíveis via RMI.
 */
public class ServicoCategoriaImpl extends UnicastRemoteObject implements ServicoCategoria {

    // DAO responsável pelas operações no banco de dados.
    private CategoriaDAO dao = new CategoriaDAO();

    /**
     * Construtor padrão necessário para exportação do objeto via RMI.
     *
     * @throws RemoteException Se ocorrer erro ao exportar o objeto.
     */
    public ServicoCategoriaImpl() throws RemoteException {
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
        int qtdProdutos = dao.contarProdutosNaCategoria(id);

        if (qtdProdutos > 0) {
            return false;
        }

        return dao.deletarCategoriaBD(id);
    }

    @Override
    public int contarProdutosNaCategoria(int idCategoria) throws RemoteException {
        return dao.contarProdutosNaCategoria(idCategoria);
    }

}
