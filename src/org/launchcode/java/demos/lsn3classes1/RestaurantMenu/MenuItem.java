package org.launchcode.java.demos.lsn3classes1.RestaurantMenu;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean newToMenu;

    public MenuItem(String name, String description, double price, String category, boolean newToMenu) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.newToMenu = newToMenu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewToMenu() {
        return newToMenu;
    }

    public void setNewToMenu(boolean newToMenu) {
        this.newToMenu = newToMenu;
    }
}
