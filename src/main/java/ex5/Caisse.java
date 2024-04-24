package ex5;

public interface Caisse {
    boolean accepteItem(Item item);
    void ajouterItem(Item item);
    int nbItems();
}
