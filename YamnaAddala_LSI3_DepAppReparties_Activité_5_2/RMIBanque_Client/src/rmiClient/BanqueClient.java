package rmiClient;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Date;

import rmiService.IBanque;
import metier.Compte;

public class BanqueClient {
    public static void main(String[] args) {
        try {
            // Localisation du registre RMI
            Registry registry = LocateRegistry.getRegistry("localhost", 1091); // Adresse et port du serveur RMI

            // Recherche du service bancaire enregistré avec le nom spécifique
            IBanque banqueService = (IBanque) registry.lookup("BanqueService");

            // Utilisation des méthodes du service bancaire
            // Exemple d'utilisation : création d'un compte
            Compte nouveauCompte = new Compte(123, 1000.0, new Date(0)); // Exemple de création d'un compte
            String message = banqueService.creerCompte(nouveauCompte);

            // Affichage du résultat de l'opération
            System.out.println(message);

            // Autres appels de méthodes du service bancaire ici

        } catch (Exception e) {
            System.err.println("Erreur du client : " + e.toString());
            e.printStackTrace();
        }
    }
}
