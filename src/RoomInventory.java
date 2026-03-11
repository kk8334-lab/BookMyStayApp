import java.util.HashMap;
import java.util.Map;

/**
 * RoomInventory
 * Manages centralized room availability using HashMap
 * Version 3.0
 */
class RoomInventory {

    private HashMap<String, Integer> inventory;

    // Constructor initializes inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        inventory.put("Single Room", 5);
        inventory.put("Double Room", 3);
        inventory.put("Suite Room", 2);
    }

    // Method to display inventory
    public void displayInventory() {

        System.out.println("Current Room Inventory:");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " Available: " + entry.getValue());
        }
    }

    // Method to update availability
    public void updateAvailability(String roomType, int count) {
        inventory.put(roomType, count);
    }

    // Method to get availability
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }
}