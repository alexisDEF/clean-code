package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new CaissePetitsObjets());
        caisses.add(new CaisseMoyensObjets());
        caisses.add(new CaisseGrandsObjets());
    }

    public void addItem(Item item) {
        //TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
        for (Caisse caisse : caisses)
            if(caisse.accepteItem(item))
            {
                caisse.ajouterItem(item);
            }
    }

    public int taille() {

        int total = 0;
        for (Caisse caisse : caisses) {
            total += caisse.nbItems();
        }
        return total;
    }
}
