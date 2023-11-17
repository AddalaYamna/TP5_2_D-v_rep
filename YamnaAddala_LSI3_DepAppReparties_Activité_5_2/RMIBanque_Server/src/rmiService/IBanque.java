package rmiService;
import java.rmi.Remote;
import java.rmi.RemoteException;

import metier.Compte;

// L'interface IBanque définit les méthodes disponibles pour le service bancaire via RMI
public interface IBanque extends Remote {
    // Méthode pour créer un compte bancaire et retourner un message de confirmation
    String creerCompte(Compte c) throws RemoteException;

    // Méthode pour obtenir les informations d'un compte en utilisant son code
    String getInfoCompte(int code) throws RemoteException;
}
