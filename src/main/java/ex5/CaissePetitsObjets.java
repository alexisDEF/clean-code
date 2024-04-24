package ex5;
import java.util.ArrayList;
import java.util.List;
public class CaissePetitsObjets implements Caisse {
    private List<Item> items;

    public CaissePetitsObjets() {
        items = new ArrayList<>();
    }

    @Override
    public boolean accepteItem(Item item) {
        return item.getPoids() < 5;
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
