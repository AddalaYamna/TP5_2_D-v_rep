package metier;
import java.io.Serializable;
import java.util.Date;

// La classe Compte représente un compte bancaire
// Elle implémente l'interface Serializable pour être utilisée avec RMI
public class Compte implements Serializable {
    private int code; // Code du compte
    private double solde; // Solde du compte
    private Date dateCreation; // Date de création du compte

    // Constructeur de la classe Compte
    public Compte(int code, double solde, Date dateCreation) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
    }

    // Getters et Setters pour les attributs du compte
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}
