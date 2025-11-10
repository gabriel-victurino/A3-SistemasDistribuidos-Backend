package principal;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {

    public static void main(String[] args) {
        try {
            String nomeServico = "mensagens"; // Este é o nome do serviço a ser localizado
            RemoteHello hello = new HelloImpl(); //Cria o objeto a ser servido
            //Cria o stub dinamicamente do objeto a ser servido
            RemoteHello stub = (RemoteHello) UnicastRemoteObject.exportObject(hello, 0);
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
