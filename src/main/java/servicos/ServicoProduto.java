package servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import modelo.Produto;

/**
 * Interface remota responsável pelos serviços relacionados à entidade Produto.
 *
 * Esta interface define as operações CRUD e consultas adicionais relacionadas aos Produtos
 */
public interface ServicoProduto extends Remote {

    // Lista todos os produtos cadastrados.
    ArrayList<Produto> listarProdutos() throws RemoteException;

    // Insere um novo produto
    boolean inserirProduto(Produto p) throws RemoteException;

    // Atualiza um produto existente.
    boolean atualizarProduto(Produto p) throws RemoteException;

    // Remove um produto pelo ID.
    boolean deletarProduto(int id) throws RemoteException;

    // Busca um produto pelo ID.
    Produto buscarPorId(int id) throws RemoteException;

    // Busca um produto pelo nome.
    Produto buscarPorNome(String nome) throws RemoteException;
}
