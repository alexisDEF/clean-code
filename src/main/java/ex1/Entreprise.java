package ex1;

import java.util.Date;

/**
 * La classe Entreprise représente une entreprise avec ses attributs de base.
 */
public class Entreprise {

    /**
     * Le capital maximum autorisé pour l'entreprise.
     */
    public static final int capitalMax = 3000000;

    /**
     * Le numéro SIRET de l'entreprise.
     */
    public int Siret;

    /**
     * Le nom de l'entreprise.
     */
    public String Nom;

    /**
     * L'adresse de l'entreprise.
     */
    public String adresse;

    /**
     * La date de création de l'entreprise.
     */
    public Date date_Creation;

    /**
     * Cette méthode affiche le statut de l'entreprise.
     */
    @Deprecated
    public void Afficher_statut() {
        // Code pour afficher le statut de l'entreprise
    }
}
