package ex5;

import java.util.ArrayList;
import java.util.List;

public class CaisseGrandsObjets implements Caisse {
    private List<Item> items;

    public CaisseGrandsObjets() {
        items = new ArrayList<>();
    }

    @Override
    public boolean accepteItem(Item item) {
        return item.getPoids() >= 20;
    }

    @Override
    public void ajouterItem(Item item) {
        items.add(item);
    }

    @Override
    public int nbItems() {
        return items.size();
    }
}
