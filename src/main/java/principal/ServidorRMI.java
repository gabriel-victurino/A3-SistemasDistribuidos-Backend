package principal;

import servicos.ServicoEstoqueImpl;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import servicos.ServicoEstoque;

public class ServidorRMI {

    public static void main(String[] args) {
        try {
            String nomeServico = "mensagens"; // Nome do Server
            ServicoEstoque hello = new ServicoEstoqueImpl(); //Cria o objeto a ser servido
            //Cria o stub dinamicamente do objeto a ser servido
            ServicoEstoque stub = (ServicoEstoque) UnicastRemoteObject.exportObject(hello, 0);
            // Referência para rmiregistry na porta 1099
            Registry registro = LocateRegistry.getRegistry();
            registro.bind(nomeServico, stub); //Registra o stub no rmiregistry
            System.out.println("Servidor no ar. Nome do objeto servidor: \' mensagens\'");
        } catch (Exception e) {
            System.out.println("Exceção: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
