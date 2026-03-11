/**
 * Use Case 3
 * Centralized Room Inventory Management
 * Version 3.1
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Welcome to BookMyStay - Version 3.1");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display inventory
        inventory.displayInventory();

        // Example update
        System.out.println("\nUpdating Single Room availability...");

        inventory.updateAvailability("Single Room", 4);

        // Display updated inventory
        inventory.displayInventory();
    }
}