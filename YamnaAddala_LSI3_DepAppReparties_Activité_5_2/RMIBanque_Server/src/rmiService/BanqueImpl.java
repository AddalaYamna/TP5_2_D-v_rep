package rmiService;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import metier.Compte;

public class BanqueImpl extends UnicastRemoteObject implements IBanque {

    // Le constructeur public pour la classe BanqueImpl
    public BanqueImpl() throws RemoteException {
        super();
        // Autres initialisations ou logique nécessaire ici
    }

    // Implémentation des méthodes de l'interface IBanque
    @Override
    public String creerCompte(Compte c) throws RemoteException {
        // Logique pour créer un compte
        // Retourner un message de confirmation ou d'erreur
        return "Le compte a été créé avec succès!";
    }

    @Override
    public String getInfoCompte(int code) throws RemoteException {
        // Logique pour obtenir les informations du compte en utilisant le code
        // Retourner les informations du compte sous forme de String
        return "Informations du compte avec le code " + code;
    }
}
