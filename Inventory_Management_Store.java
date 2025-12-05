package Map_Assignment;
import java.util.*;
public class Inventory_Management_Store {
	 public static void main(String[] args) {
	        Map<String, Integer> inventory = new HashMap<>();

	        inventory.put("Apple", 50);
	        inventory.put("Banana", 30);
	        inventory.put("Milk", 10);
	        inventory.put("Bread", 0);

	        buyProduct(inventory, "Apple", 10);
	        buyProduct(inventory, "Milk", 12);
	        buyProduct(inventory, "Banana", 5);

	        restockProduct(inventory, "Milk", 20);
	        restockProduct(inventory, "Juice", 15);

	        queryProduct(inventory, "Apple");
	        queryProduct(inventory, "Milk");
	        queryProduct(inventory, "Chocolate");

	        printOutOfStock(inventory);
	    }

	    static void buyProduct(Map<String, Integer> inventory, String product, int qty) {
	        int current = inventory.getOrDefault(product, 0);
	        int updated = current - qty;
	        if (updated <= 0) {
	            inventory.put(product, 0);
	        } else {
	            inventory.put(product, updated);
	        }
	    }

	    static void restockProduct(Map<String, Integer> inventory, String product, int qty) {
	        int current = inventory.getOrDefault(product, 0);
	        inventory.put(product, current + qty);
	    }

	    static void queryProduct(Map<String, Integer> inventory, String product) {
	        if (inventory.containsKey(product)) {
	            int qty = inventory.get(product);
	            if (qty > 0) {
	                System.out.println(product + " remaining: " + qty);
	            } else {
	                System.out.println(product + " is out of stock");
	            }
	        } else {
	            System.out.println(product + " not stocked");
	        }
	    }

	    static void printOutOfStock(Map<String, Integer> inventory) {
	        System.out.println("Out of stock products:");
	        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
	            if (entry.getValue() <= 0) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }
	}


