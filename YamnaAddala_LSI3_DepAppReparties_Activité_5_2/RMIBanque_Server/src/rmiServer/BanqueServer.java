package rmiServer;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiService.BanqueImpl;
import rmiService.IBanque;

public class BanqueServer {
    public static void main(String[] args) {
        try {
            // Création et exportation du registre RMI sur le port spécifié (par exemple, 1099)
            Registry registry = LocateRegistry.createRegistry(1091);

            // Création d'une instance de l'implémentation du service bancaire
            IBanque banqueService = new BanqueImpl();

            // Liaison du service bancaire avec le registre RMI sous un nom spécifique
            registry.rebind("BanqueService", banqueService);

            // Affichage d'un message indiquant que le serveur est en écoute
            System.out.println("Serveur bancaire prêt.");

        } catch (Exception e) {
            System.err.println("Erreur du serveur : " + e.toString());
            e.printStackTrace();
        }
    }
}
