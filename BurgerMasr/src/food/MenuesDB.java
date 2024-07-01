package food;
public class MenuesDB {
    private Menu menuOfSandwiches;
    private Menu menuOfExtras;
    public MenuesDB() {
        menuOfSandwiches = new Menu();
        menuOfExtras = new Menu();
    }

    public void addSandwich(Sandwich sandwich) {
        menuOfSandwiches.addItem(sandwich);
    }

    public void addExtra(Extra extra) {
        menuOfExtras.addItem(extra);
    }

    public Menu getMenuOfSandwiches() {
        return menuOfSandwiches;
    }

    public Menu getMenuOfExtras() {
        return menuOfExtras;
    }


    public void createDumyMenues(){
        addSandwich(new Sandwich("Beef Burger", 5.99, "White", new String[]{"Beef Patty", "Lettuce", "Tomato"}));
        addSandwich(new Sandwich("Chicken Burger", 4.99, "Whole Grain", new String[]{"Chicken Patty", "Lettuce", "Mayo"}));
        addSandwich(new Sandwich("Cheese Burger", 6.49, "Sesame", new String[]{"Beef Patty", "Cheese", "Lettuce", "Tomato"}));

        // Adding Extras
        addExtra(new Extra("Ketchup", 0.50, Type.Ketchup));
        addExtra(new Extra("Mayonnaise", 0.50, Type.Mayonnaise));
        addExtra(new Extra("Tomatoes", 0.75, Type.Tomatoes));
        addExtra(new Extra("Cheese", 1.00, Type.Cheese));

    }
}
