package InventoryManager;

import java.util.ArrayList;

public class Inventory {
	
private static final ArrayList<Product> products = new ArrayList<>();

public void addProduct(Product product)
{
	products.add(product);
}

public Product[] getProducts()
{
	return products.stream().toArray(Product[]::new);
}
}
