package servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import modelo.Categoria;

/**
 * Interface remota responsável pelos serviços relacionados à entidade Categoria.
 *
 * Esta interface define as operações CRUD e consultas adicionais relacionadas às categorias
 */
public interface ServicoCategoria extends Remote {

    /**
     * Retorna a lista completa de categorias cadastradas.
     *
     * @return Lista de categorias.
     * @throws RemoteException Se ocorrer erro de comunicação RMI.
     */
    ArrayList<Categoria> listarCategorias() throws RemoteException;

    // Busca uma categoria pelo seu ID.
    Categoria buscarCategoria(int id) throws RemoteException;

    // Insere uma nova categoria no banco de dados.
    boolean inserirCategoria(Categoria c) throws RemoteException;

    // Atualiza os dados de uma categoria existente.
    boolean atualizarCategoria(Categoria c) throws RemoteException;

    // Remove uma categoria do banco de dados.
    boolean deletarCategoria(int id) throws RemoteException;

    // Retorna a quantidade de produtos associados a uma categoria.
    int contarProdutosNaCategoria(int idCategoria) throws RemoteException;
}
