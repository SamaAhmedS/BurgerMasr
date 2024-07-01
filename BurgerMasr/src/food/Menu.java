package food;
import java.util.ArrayList;
public class Menu {
    private ArrayList<Item> items;
    public Menu(){
        items = new ArrayList<>();
    }
    public void addItem(Item item){
        items.add(item);
    }
    public boolean removeItem(String name){
        for (Item item : items) {
            if(item.getName().equals(name)){
                items.remove(item);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
