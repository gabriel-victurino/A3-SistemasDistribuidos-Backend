package principal;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import servicos.ServicoCategoria;
import servicos.ServicoCategoriaImpl;
import servicos.ServicoProduto;
import servicos.ServicoProdutoImpl;
import servicos.ServicoMovimentacao;
import servicos.ServicoMovimentacaoImpl;

public class ServidorRMI {

    public static void main(String[] args) {
        try {
            // Cria a instância dos serviços
            ServicoCategoria servicoCategoria = new ServicoCategoriaImpl();
            ServicoProduto servicoProduto = new ServicoProdutoImpl();
            ServicoMovimentacao servicoMovimentacao = new ServicoMovimentacaoImpl();

            // Referência para rmiregistry na porta 1099
            Registry registro = LocateRegistry.createRegistry(1099);

            // Registra cada serviço com um nome
            registro.rebind("ServicoCategoria", servicoCategoria);
            registro.rebind("ServicoProduto", servicoProduto);
            registro.rebind("ServicoMovimentacao", servicoMovimentacao);

            System.out.println("Servidor RMI no ar.");
            System.out.println("Serviços disponíveis:");
            System.out.println(" - ServicoCategoria");
            System.out.println(" - ServicoProduto");
            System.out.println(" - ServicoMovimentacao");

        } catch (Exception e) {
            System.out.println("Erro ao iniciar o servidor RMI: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
