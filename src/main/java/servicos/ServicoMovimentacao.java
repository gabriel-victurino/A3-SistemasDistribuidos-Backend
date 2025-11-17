package servicos;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import modelo.Movimentacao;

/**
 * Interface remota responsável pelos serviços relacionados à entidade Movimentação.
 *
 * Esta interface define as operações CRUD e consultas adicionais relacionadas às Movimentações
 */
public interface ServicoMovimentacao extends Remote {

    // Lista todas as movimentações cadastradas.
    ArrayList<Movimentacao> listarMovimentacoes() throws RemoteException;

    // Insere uma nova movimentação.
    boolean inserirMovimentacao(Movimentacao m) throws RemoteException;

    // Atualiza movimentação existente
    boolean atualizarMovimentacao(Movimentacao m) throws RemoteException;

    // Remove uma movimentação pelo ID.
    boolean deletarMovimentacao(int id) throws RemoteException;

    // Busca uma movimentação pelo ID.
    Movimentacao buscarPorId(int id) throws RemoteException;
}
