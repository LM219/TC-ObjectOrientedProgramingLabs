package InventoryManager;

/**
 * Finish the InventoryManager Class in the InventoryManager Package,
 * which manages an inventory of products. Create a product class which has a price,
 * id, and quantity on hand. Then create an inventory class which keeps track of various
 * products and can sum up the inventory value.
 *
 * Note: Inventory and InventoryManager should not be the same class!!!
 */
public class InventoryManager {
	
	public static void main(String[] args)
	
	{
		Inventory inventory1 = new Inventory();
		Product Wine = new Product("wine", 10.00, 12);
		Product Tequilla = new Product("tequilla", 40.00, 2);
		inventory1.addProduct(Wine);
		inventory1.addProduct(Tequilla);
		
		inventory1.getProducts();
	}
	
}
