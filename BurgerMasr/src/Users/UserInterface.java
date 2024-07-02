package Users;
import javax.swing.text.View;

import food.MenuesDB;

public abstract class UserInterface {
    private MenuesDB db;
    public void viewMenue(){
        db = new MenuesDB();     
        // Display Menu
        System.out.println("Sandwich Menu:");
        System.out.println(db.getMenuOfSandwiches());
    }
    public void viewAdditions(){
        System.out.println("Extras Menu:");
        System.out.println(db.getMenuOfExtras());
    }
}
