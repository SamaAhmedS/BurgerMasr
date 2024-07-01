import food.MenuesDB;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        MenuesDB db = new MenuesDB();     
        // Display Menus
        System.out.println("Sandwich Menu:");
        System.out.println(db.getMenuOfSandwiches());

        System.out.println("Extras Menu:");
        System.out.println(db.getMenuOfExtras());
    }
}

