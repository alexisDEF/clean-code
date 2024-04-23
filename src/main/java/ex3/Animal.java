package ex3;

public class Animal {
    private String nom;
    private String type;
    private String comportement;

    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter for nom
     *
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter for type
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Getter for comportement
     *
     * @return the comportement
     */
    public String getComportement() {
        return comportement;
    }
}
