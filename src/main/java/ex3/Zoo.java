package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nom;
    private List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<Animal>();
    }

    public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
        Animal animal = new Animal(nomAnimal, typeAnimal, comportement);
        this.animaux.add(animal);
    }

    public void afficherListeAnimaux() {
        for (Animal animal : this.animaux) {
            System.out.println(animal.getNom() + " " + animal.getType() + " " + animal.getComportement());
        }
    }

    public int taille() {
        return animaux.size();
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
     * Setter
     *
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
