// MenuProgram.java
public class MenuProgram {
    public static void main(String[] args) {
        // Step 1: Create individual menu items (Leaves)
        MenuItem classicBurger = new MenuItem("Classic Burger", 250.00);
        MenuItem largeFries = new MenuItem("Large Fries", 85.00);
        MenuItem rootBeer = new MenuItem("Root Beer", 60.00);
        MenuItem vanillaSundae = new MenuItem("Vanilla Sundae", 45.00);

        // Step 2: Create sub-composite (Barkada Solo Meal) and add items
        MenuCategory barkadaSoloMeal = new MenuCategory("Barkada Solo Meal");
        barkadaSoloMeal.add(classicBurger);
        barkadaSoloMeal.add(largeFries);
        barkadaSoloMeal.add(rootBeer);
        barkadaSoloMeal.add(vanillaSundae);   // Added here to match the exact expected output

        // Step 4: Create top-level composite (Main Menu) and add the sub-composite
        MenuCategory mainMenu = new MenuCategory("Main Menu");
        mainMenu.add(barkadaSoloMeal);

        // Step 5: Test - Print the entire menu hierarchy and get total price
        mainMenu.print();
        System.out.println("====================");
        System.out.println("Total Menu Value: ₱" + String.format("%.2f", mainMenu.getPrice()));
    }
}
